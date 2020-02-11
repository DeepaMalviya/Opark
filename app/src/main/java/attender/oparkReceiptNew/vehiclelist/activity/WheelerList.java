package attender.oparkReceiptNew.vehiclelist.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import attender.oparkCard.R;
import attender.oparkReceiptNew.MainActivity;
import attender.oparkReceiptNew.base.AppConstants;
import attender.oparkReceiptNew.base.AppController;
import attender.oparkReceiptNew.base.DimensionUtil;
import attender.oparkReceiptNew.booking.ParkingModel;
import attender.oparkReceiptNew.vehiclelist.adapter.WheelerAdapter;

import static attender.oparkReceiptNew.base.AppConstants.NoIternetConnection;

public class WheelerList extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "WheelerList";
    private TabLayout tabLayout;
    private TextView textToolHeader;
    private ViewPager viewPager;
    private int statusBarHeight;
    private int normalWindowHeight;
    private int windowHeight;
    private RelativeLayout relativeLayoutHeader;
    WheelerAdapter WheelerListAdapter;
    private Toolbar toolBar;
    private int[] tabTitle = {R.string.service_station, R.string.review};
    public static ArrayList<String> queryImageList = new ArrayList<String>();
    SharedPreferences sharedpref;
    String[] parkings;
    private RadioGroup radiogroupAAA;
    SharedPreferences.Editor ed;
    String    LastParkingTYpe,SelectedParkingType, parkingType12;
    List<ParkingModel> parkingModels = new ArrayList<>();
    int getParkingID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheeler_list);
        init();


    }

    private void init() {


        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = getResources().getDimensionPixelSize(resourceId);
        }

        final TypedArray styledAttributes = WheelerList.this.getTheme().obtainStyledAttributes(
                new int[]{android.R.attr.actionBarSize}
        );
        normalWindowHeight = DimensionUtil.getScreenHeight(WheelerList.this);
        windowHeight = (normalWindowHeight - statusBarHeight) / 3;

//        relativeLayoutHeader = (RelativeLayout) findViewById(R.id.relativeLayoutHeader);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, windowHeight);
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
//        relativeLayoutHeader.setLayoutParams(params);
        toolBar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);

        getSupportActionBar().setTitle("");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolBar = (Toolbar) findViewById(R.id.toolBar);
        toolBar.setTitle("");
        textToolHeader = (TextView) toolBar.findViewById(R.id.toolbar_title);
        textToolHeader.setText("Vehicle List");
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

        String parkingType = sharedpref.getString("getParkingType", "");
        SelectedParkingType = sharedpref.getString("SelectVehicleType1", "");
        getParkingID = Integer.parseInt(sharedpref.getString("getParkingID", ""));

        if (AppConstants.isInternetAvailable(WheelerList.this)) {
            ParkingListApiCall(String.valueOf(getParkingID));

        } else {
            NoIternetConnection(WheelerList.this);
        }

    }

    public void ParkingListApiCall(final String parkingId) {
        Log.e(TAG, "ParkingListApiCall: ");
        final ProgressDialog pDialog = new ProgressDialog(WheelerList.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        parkingModels.clear();
        String urlData = AppConstants.BASEURL + "parking/type_list?parkingId=" + parkingId;
        Log.e(TAG, "ParkingListApiCall: urlData ---- " + urlData+ parkingId);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "ParkingListApiCall onResponse: " + response.toString());
                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {

                        final JSONArray arrayObj = new JSONArray(data);
                        for (int i = 0; i < arrayObj.length(); i++) {

                            JSONObject jsonObject = arrayObj.getJSONObject(i);
                            ParkingModel availableSlotModel = new ParkingModel();
                            availableSlotModel.setId(jsonObject.getInt("id"));
                            availableSlotModel.setName(jsonObject.getString("name"));
                            parkingModels.add(availableSlotModel);
                        }
                        for (int i = 0; i < parkingModels.size(); i++) {
                            Log.e(TAG, "onCreate:-- " + parkingModels.get(i).getName());
                              LastParkingTYpe = parkingModels.get(i).getName();
                        }
                        Log.e(TAG, "onResponse:LastParkingTYpe=== "+LastParkingTYpe);
                        loadViewPager(viewPager, LastParkingTYpe, getParkingID);

                        addRadioButtons(parkingModels.size());


                        pDialog.dismiss();


                    } else {
                        Toast.makeText(WheelerList.this, message, Toast.LENGTH_SHORT).show();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    Toast.makeText(WheelerList.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(WheelerList.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                // Toast.makeText(WheelerList.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(WheelerList.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;

            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);

    }

    private void addRadioButtons(int length) {
        radiogroupAAA = findViewById(R.id.radiogroupAAAA);

        Log.e(TAG, "addRadioButtons: ");
        Log.e(TAG, "addRadioButtons: ");
        radiogroupAAA.setOrientation(LinearLayout.HORIZONTAL);
        radiogroupAAA.setGravity(Gravity.CENTER);

        for (int i = 0; i < length; i++) {

            RadioButton rdbtn = new RadioButton(this);
            rdbtn.setId(parkingModels.get(i).getId());
            rdbtn.setText("" + parkingModels.get(i).getName());
            // loadViewPager(viewPager, parkingModels.get(i).getName(), getParkingID);
            rdbtn.setChecked(true);
            rdbtn.setTextColor(getResources().getColor(R.color.colorPrimary));
            rdbtn.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    getResources().getDimension(R.dimen._14sdp));
            rdbtn.setOnClickListener(this);
            radiogroupAAA.addView(rdbtn);
        }
    }

    private void loadViewPager(ViewPager viewPager, String parkingType12, int ParkingTypeId) {
        Log.e(TAG, "loadViewPager:parkingType12 "+parkingType12 );

        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
        ed = sharedpref.edit();
        ed.putString("parking", parkingType12);
        ed.apply();
        ed.commit();
        WheelerListAdapter = new WheelerAdapter(getSupportFragmentManager(),
                WheelerList.this, parkingType12, ParkingTypeId);

        viewPager.setAdapter(WheelerListAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setCustomView(prepareTabView(i));
        }
    }

    private View prepareTabView(int pos) {

        View view = getLayoutInflater().inflate(R.layout.layout_view_custom, null);

        TextView textViewTitle = (TextView) view.findViewById(R.id.textViewTitle);

        textViewTitle.setText(tabTitle[pos]);


        return view;
    }

    @Override
    public void onClick(View v) {
        Log.e(TAG, "onClick: " + ((RadioButton) v).getText());
        String SelectedParkingType = "" + ((RadioButton) v).getText();
        loadViewPager(viewPager, SelectedParkingType, getParkingID);
       /* if (SelectedParkingType.equals("2Wheeler")) {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            ed = sharedpref.edit();
            ed.putString("SelectVehicleType1", SelectedParkingType);
            ed.apply();
            ed.commit();

        } else if (SelectedParkingType.equals("3Wheeler")) {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            ed = sharedpref.edit();
            ed.putString("SelectVehicleType1", SelectedParkingType);
            ed.apply();
            ed.commit();
            if (AppConstants.isInternetAvailable(WheelerList.this)) {
                loadViewPager(viewPager, SelectedParkingType, getParkingID);

            } else {
                NoIternetConnection(WheelerList.this);
            }
        } else {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            ed = sharedpref.edit();
            ed.putString("SelectVehicleType1", SelectedParkingType);
            ed.apply();
            ed.commit();
            if (AppConstants.isInternetAvailable(WheelerList.this)) {
                loadViewPager(viewPager, SelectedParkingType, getParkingID);

            } else {
                NoIternetConnection(WheelerList.this);
            }
        }*/

    }

   /* private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }*/
}
