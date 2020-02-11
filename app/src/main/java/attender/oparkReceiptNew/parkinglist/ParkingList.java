package attender.oparkReceiptNew.parkinglist;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import attender.oparkReceiptNew.MainActivity;
import attender.oparkCard.R;
import attender.oparkReceiptNew.base.AppConstants;
import attender.oparkReceiptNew.base.AppController;
import attender.oparkReceiptNew.parkinglist.adapter.ParkingAdapter;
import attender.oparkReceiptNew.parkinglist.model.GateList;
import attender.oparkReceiptNew.parkinglist.model.ParkingListMoel;
import attender.oparkReceiptNew.subscription.model.CustomRequest;
import attender.oparkReceiptNew.base.ClickListener;
import attender.oparkReceiptNew.base.DividerItemDecoration;
import attender.oparkReceiptNew.base.RecyclerTouchListener;

import static attender.oparkReceiptNew.base.AppConstants.NoIternetConnection;

public class ParkingList extends AppCompatActivity {
    private static final String TAG = "ParkingList";
    RecyclerView recyclerViewParkingList;
    ParkingAdapter parkingAdapter;
    ArrayList<ParkingListMoel> parkinglList = new ArrayList<>();
    ArrayList<GateList> list = new ArrayList<>();
    String vendorId, agentId, userRole, userName, userContactNo, vendorName, park, parkingId, getparkingType;
    private Toolbar toolBar;
    private TextView textToolHeader;
    String parkingTypelist;
    SharedPreferences sharedpref;
    SharedPreferences.Editor ed;
    AlertDialog dialog;
    String GateId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_list);

        init();

        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
        vendorId = sharedpref.getString("vendorId", "");
        userRole = sharedpref.getString("userRole", "");
        userName = sharedpref.getString("userName", "");
        userContactNo = sharedpref.getString("userContactNo", "");
        vendorName = sharedpref.getString("vendorName", "");
        agentId = sharedpref.getString("agentId", "");
        GateId = sharedpref.getString("GateId", "");

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (AppConstants.isInternetAvailable(ParkingList.this)) {
            getDetails(vendorId);
        } else {
            NoIternetConnection(ParkingList.this);  WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(true);
        }


    }

    public void init() {


        recyclerViewParkingList = (RecyclerView) findViewById(R.id.recyclerViewParkingList);

        toolBar = (Toolbar) findViewById(R.id.toolBar);
        toolBar.setTitle("");
        textToolHeader = (TextView) toolBar.findViewById(R.id.toolbar_title);
        textToolHeader.setText("Select Parking");
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        recyclerViewParkingList.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewParkingList.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable
                .horizontal_divider_gray)));

        recyclerViewParkingList.addOnItemTouchListener(new RecyclerTouchListener(ParkingList.this, recyclerViewParkingList, new ClickListener() {
            @Override
            public void onClick(View view, final int position) {

//                Toast.makeText(CarInActivity.this, vehicleModelList.get(position).getTransactionId(), Toast.LENGTH_SHORT).show();
                try {
                    park = parkinglList.get(position).getParkingType();
                    parkingId = parkinglList.get(position).getParkingID();
                    getparkingType = parkinglList.get(position).getParkingType();
                    for (int i = 0; i < parkinglList.size(); i++) {
                        Log.e(TAG, "onClick:parkinglList==getParkingID " + parkinglList.get(i).getParkingID());
                        ;
                        Log.e(TAG, "onClick:parkinglList== " + parkinglList.get(i).getParkingType());
                        ;
                    }
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("getParkingID", parkinglList.get(position).getParkingID());
                    ed.putString("getParkingName", parkinglList.get(position).getParkingName());
                    ed.putString("getParkingType", parkinglList.get(position).getParkingType());
                    ed.putString("getParkingID", parkinglList.get(position).getParkingID());
                    ed.apply();
                    ed.commit();
                    revenewSevice(parkinglList.get(position).getParkingID(), agentId, "",GateId);
                    // showGateType(GateId);
                    Intent intentSplash = new Intent(ParkingList.this, MainActivity.class);
                    startActivity(intentSplash);
                    finish();
                   // showVehicleType();
                    //showGateType();


                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }



    public static void setOnItemClick(int position) {

    }

    public void getDetails(String vendorId) {
        final ProgressDialog pDialog = new ProgressDialog(ParkingList.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
       /*http://staggingapi.opark.in/index.php/v1/parking/list?vendorId=1*/
        String urlData = AppConstants.BASEURL + "parking/list?vendorId=" + vendorId;
        Log.e(TAG, "getDetails: urlData==" + urlData);
        JsonObjectRequest request = new JsonObjectRequest(urlData, null, new com.android.volley.Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject json) {
                parkinglList.clear();

                try {
                    System.out.println("JSON RETURN " + json.toString());


                    String data = String.valueOf(json.get("data"));
                    String message = String.valueOf(json.get("message"));
                    int status = json.getInt("status");
                    int detail = json.getInt("detail");

                    if (status == 0) {

                        final JSONArray arrayObj = new JSONArray(data);


                        //   Toast.makeText(DetailActivity.this, message, Toast.LENGTH_SHORT).show();

                        for (int i = 0; i < arrayObj.length(); i++) {

                            JSONObject jsonObject = arrayObj.getJSONObject(i);

//                            parkingIdlist = jsonObject.getString("parkingId");
                            //                           parkingNamelist = jsonObject.getString("parkingName");
                            parkingTypelist = jsonObject.getString("parkingType");

                            ParkingListMoel parkinglListModel = new ParkingListMoel();

                            parkinglListModel.setParkingID(jsonObject.getString("parkingId"));
                            parkinglListModel.setParkingName(jsonObject.getString("parkingName"));
                            parkinglListModel.setParkingType(jsonObject.getString("parkingType"));

                            parkinglList.add(parkinglListModel);
                        }
                        parkingAdapter = new ParkingAdapter(ParkingList.this, ParkingList.this, parkinglList);
                        recyclerViewParkingList.setAdapter(parkingAdapter);
                        parkingAdapter.notifyDataSetChanged();


                        pDialog.dismiss();


                    } else {
                        Toast.makeText(ParkingList.this, message, Toast.LENGTH_SHORT).show();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/list?vendorId=");
                    Log.d("NullPointerException", e + "");
                    Toast.makeText(ParkingList.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/list?vendorId=");
                    Log.d("JSONException", e + "");
                    Toast.makeText(ParkingList.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        },

                new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Response error", error + "");
                        sendError(error.toString(), "parking/list?vendorId=");
                        Toast.makeText(ParkingList.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                        pDialog.dismiss();
                    }
                });

        request.setRetryPolicy(new DefaultRetryPolicy(
                50000,
                3,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        AppController.getInstance().getRequestQueue().add(request);

    }

    public void revenewSevice(final String parkingId, final String agentId, String parkingType, String GateId) {

        final ProgressDialog pDialog = new ProgressDialog(ParkingList.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //  pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        /*/*http://staggingapi.opark.in/index.php/v1/user/track?parkingId=1&agentId=3*/

        String urlData = AppConstants.BASEURL + "user/track?parkingId=" + parkingId + "&vendorId=" + vendorId + "&parkingType=" + parkingType + "&agentId=" + agentId + "&gateId=" + GateId;
        Log.e(TAG, "revenewSevice: urlData" + urlData);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse:==== " + response.toString());
                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

//                    if (status == 0) {
//
//                        JSONObject availableresponce = response.getJSONObject("data");
//
////                        pDialog.dismiss();
//
//
//                    } else {
//                        Toast.makeText(ParkingList.this, message, Toast.LENGTH_SHORT).show();
//                    }
                    //  pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "user/track?parkingId=");
                    Log.d("NullPointerException", e + "");
                    Toast.makeText(ParkingList.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    //pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "user/track?parkingId=");
                    Toast.makeText(ParkingList.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    Log.d("JSONException", e + "");
                    //  pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //Toast.makeText(ParkingList.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("Response error", error + "");
                // Toast.makeText(ParkingList.this, "Server Error...", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "user/track?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);

    }

    RadioGroup radioGate;



    private void sendError(String e, String apiName) {

        //https://opark.in/O_par_aPi/gwaliorStg/index.php/v3/error/add
        String url = AppConstants.BASEURL + AppConstants.APIERROR;
        Map<String, String> parameterData = new HashMap<>();
        parameterData.put(("error"), e.toString());
        parameterData.put(("apiName"), apiName);

        if (AppConstants.isInternetAvailable(ParkingList.this)) {
            send(url, parameterData);
        } else {
            NoIternetConnection(ParkingList.this);  WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wifi.setWifiEnabled(true);
        }
    }

    private void send(String url, Map<String, String> parameterData) {
        try {

            Response.Listener<JSONObject> reponseListener = new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject jsonObject) {
                    processJsonObject(jsonObject);

                }
            };
            Response.ErrorListener errorListener = new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    if (volleyError instanceof NetworkError) {
                        sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. Network Error !",
                                Toast.LENGTH_SHORT).show();
                    } else if (volleyError instanceof ServerError) {
                        sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. Server error!",
                                Toast.LENGTH_SHORT).show();
                    } else if (volleyError instanceof AuthFailureError) {
                        sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. AuthFailureError error!",
                                Toast.LENGTH_SHORT).show();
                    } else if (volleyError instanceof ParseError) {
                        sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. Parse Error !",
                                Toast.LENGTH_SHORT).show();
                    } else if (volleyError instanceof NoConnectionError) {
                        sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. No Connection Error !",
                                Toast.LENGTH_SHORT).show();
                    } else if (volleyError instanceof TimeoutError) {
                        sendError(volleyError.toString() + "\n TimeoutError", "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. Timeout Error!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        sendError(volleyError.toString() + "\n NetworkError", "parking/pass_add");
                        Toast.makeText(ParkingList.this,
                                "Oops. Network Error !",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            };
            CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, url, parameterData, reponseListener, errorListener);
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(jsObjRequest);
        } catch (Exception e) {
            Log.e("RESPONSE ERROR", e.toString());
            VolleyLog.d("RESPONSE ERROR", e.toString());
        }
    }

    private void processJsonObject(JSONObject response) {
        if (response != null) {
            Log.d("Response", response + "");

            try {
                String data = String.valueOf(response.get("data"));
                String message = String.valueOf(response.get("message"));
                int status = response.getInt("status");
                // String responce = json.getJSONArray("RESPONSE");
            } catch (NullPointerException e) {
                e.printStackTrace();
                // pDialog.dismiss();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
