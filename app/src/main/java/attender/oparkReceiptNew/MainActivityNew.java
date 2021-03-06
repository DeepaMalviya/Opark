/*
package attender.oparkReceiptNew;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.IntentCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import attender.oparkCard.R;
import attender.oparkReceiptNew.apkservices.MyService;
import attender.oparkReceiptNew.base.AppConstants;
import attender.oparkReceiptNew.base.AppController;
import attender.oparkReceiptNew.booking.AvailableSlotModel;
import attender.oparkReceiptNew.booking.CheckInModel;
import attender.oparkReceiptNew.booking.CheckOutModel;
import attender.oparkReceiptNew.booking.FourWheeler;
import attender.oparkReceiptNew.booking.ParkingModel;
import attender.oparkReceiptNew.booking.PatientVehicleWheeler;
import attender.oparkReceiptNew.booking.QRScanPrint;
import attender.oparkReceiptNew.booking.ThreeWheeler;
import attender.oparkReceiptNew.booking.TwoWheeler;
import attender.oparkReceiptNew.login.Login;
import attender.oparkReceiptNew.parkinglist.model.GateList;
import attender.oparkReceiptNew.shiftreport.ShiftReportctivity;
import attender.oparkReceiptNew.subscription.activity.RemoveCardActivity;
import attender.oparkReceiptNew.subscription.activity.RenewCard;
import attender.oparkReceiptNew.subscription.activity.Subscription;
import attender.oparkReceiptNew.subscription.activity.Subscriptionctivity;
import attender.oparkReceiptNew.subscription.model.CustomRequest;
import attender.oparkReceiptNew.subscription.model.SubscriptionModel;
import attender.oparkReceiptNew.subscription.model.SubscriptionModelNew;
import attender.oparkReceiptNew.vehiclelist.activity.LossReceipt;
import attender.oparkReceiptNew.vehiclelist.activity.WheelerList;
import cn.weipass.pos.sdk.IPrint;
import cn.weipass.pos.sdk.Printer;
import cn.weipass.pos.sdk.ServiceManager;
import cn.weipass.pos.sdk.Weipos;
import cn.weipass.pos.sdk.impl.WeiposImpl;

import static attender.oparkReceiptNew.base.AppConstants.NoIternetConnection;

public class MainActivityNew extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private String android_id;
    Toolbar toolBar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    SharedPreferences sharedpref;
    String agentId = "", userRole = "", userName = "", userContactNo = "", vendorId = "", vendorName = "", parkingName = "", parkingType = "", parkingId = "", userType = "", SelectedVehicleType1, parkingType12 = "", subVehicleNo = "";
    String poweredBy = "", companyWebsite = "", parkingAddress = "", receiptHeading = "", printError = "", message1 = "";
    private TextView textToolHeader;
    ImageView toolBarUserAvatar1, toolBarUserAvatar2, toolBarUserAvatar3;
    private TextView tvAvailableSpots, nameHeader, headerEmail;
    private TextView tvTotalSpots, attenderName, parking_Name;
    private String mobileNumber = "";
    private String vehicleNumber = "";
    private String StateCode = "";
    private String CityCode = "";
    private String VehicleCode = "";
    private String vipvehicleNumber = "";
    LinearLayout normalUserVehicle*/
/*, linearTypeSelect*//*
, vipUserVehicle;
    private Button btnCheckIn;
    private Button btnCheckout;
    String[] parkings;
    String pType2 = "";
    String pType4 = "";
    String pType3 = "";
    String pType5 = "";
    private Button btnScanQRCodeCheckIn1;
    private Button btnScanQRCode, btnScanQRCodeCheckIn;
    ProgressDialog dialog;
    android.app.AlertDialog alertDialog;
    String userTypeData, SelectVehicleType1;
    String tagID = "", vipInfo = "";
    private int REQUEST_CODE_BLUETOOTH = 100;
    private int REQUEST_CODE_LOCATION = 101;
    private int REQUEST_CODE_STORAGE = 102;
    private RadioGroup radiogroupAAA, radioGroup, radioGroupType;
    private RadioButton normalUser, vipUser, onlineUser;
    private RadioButton TwoType, OtherType, FourType, ThreeType;
    EditText etMobileNo, etStateCode, etCityCode, etVehicleCode, etVehicleNumber, vipVehicleNumber, otpVehicleNumber, vipinfo;
    String getReceiptHeading, getParkingAddress, getCheckInDate, getVehicleNo, getParkingRate, getAdditionalParkingRate, barCode, getQrCode, ReceiptStaticText,
            getAgentName, getReceiptMobile, getPoweredBy, lastLine, getCompanyWebsite, getReceiptNo, getprintReceipt, onlineUserText;
    String getReceiptHeadingOut, getParkingAddressOut, getCheckInDateOut, getCheckOutDateOut, getVehicleNoOut, getPoweredByOut, getCompanyWebsiteOut, getReceiptNoOut,
            getduration, getDurationUnit, getCurrencySymbol, getGrandTotal, parkingType2, getParkingID, getParkingName;

    SharedPreferences.Editor ed;
    List<ParkingModel> parkingModels = new ArrayList<>();
    private boolean isDialogDisplayed = false;
    private boolean isWrite = false;
    private NfcAdapter mNfcAdapter;
    String[] pType = new String[3];
    private ServiceManager mServiceManager = null;
    Printer printer;
    MyService myService;
    InputFilter filter;
    String ParkingTyprInt, VehicleType1Int, parkingIdInt;
    String getName, GateId, Gate, getType, getID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printer = WeiposImpl.as().openPrinter();
        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
        parkingType12 = sharedpref.getString("VehicleType1", "");
        SelectedVehicleType1 = sharedpref.getString("SelectedVehicleType1", "");
        Gate = sharedpref.getString("Gate", "");
        GateId = sharedpref.getString("GateId", "");
     */
/*   Log.e(TAG, "onCreate:Gate " + Gate);
        Log.e(TAG, "onCreate:GateId " + GateId);
        Log.e(TAG, "onCreate:GateId " + parkingType12);
        Log.e(TAG, "onCreate:GateId SelectedVehicleType1  " + SelectedVehicleType1);
      *//*

        agentId = sharedpref.getString("agentId", "");
        userRole = sharedpref.getString("userRole", "");
        userName = sharedpref.getString("userName", "");
        userContactNo = sharedpref.getString("userContactNo", "");
        vendorId = sharedpref.getString("vendorId", "");
        vendorName = sharedpref.getString("vendorName", "");
        parkingName = sharedpref.getString("parkingName", "");
        parkingType = sharedpref.getString("getparkingType", "");
        parkingId = sharedpref.getString("parkingId", "");
        getParkingID = sharedpref.getString("getParkingID", "");
        getParkingName = sharedpref.getString("getParkingName", "");
        getID = sharedpref.getString("getID", "");
        getName = sharedpref.getString("getName", "");
        getType = sharedpref.getString("getType", "");
        //parkingVehicle = sharedpref.getString("parkingVehicle", "");
        parkingType12 = sharedpref.getString("VehicleType1", "");
       */
/* Log.e(TAG, "onCreate: parkingType12--===========-" + parkingType12);
        Log.e(TAG, "onCreate: parkingType--==============-" + parkingType);
        Log.e(TAG, "onCreate: getParkingID--==============-" + getParkingID);
*//*

        String parkingType = sharedpref.getString("getParkingType", "");
        parkings = parkingType.split(",");
        ParkingListApiCall(getParkingID);

        findViews();
        initSdk();
        initNFC();
        // updateWheeler();

        if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler,other")) {
            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);
        }
        if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler")) {

            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);
        }

        if (parkingType.equals("2Wheeler,4Wheeler")) {

            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);

        }
        if (parkingType.equals("4Wheeler")) {
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);
        }
        if (parkingType.equals("2Wheeler")) {
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_sub).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(true);

        }
        if (parkingType.equals("other")) {
            navigationView.getMenu().findItem(R.id.nav_threewheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_twowheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_LossReceipt).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_remove).setVisible(true);
            navigationView.getMenu().findItem(R.id.nav_fourwheeler).setVisible(false);
            navigationView.getMenu().findItem(R.id.nav_carInActivityTwo).setVisible(false);
            navigationView.getMenu().findItem(R.id.towvhicle).setVisible(false);

        }


    }

    private void addRadioButtons(int length) {
        radiogroupAAA = findViewById(R.id.radiogroupAAA);

        Log.e(TAG, "addRadioButtons: ");
        radiogroupAAA.setOrientation(LinearLayout.HORIZONTAL);
        radiogroupAAA.setGravity(Gravity.CENTER);

        for (int i = 0; i < length; i++) {

            RadioButton rdbtn = new RadioButton(this);
            rdbtn.setId(parkingModels.get(i).getId());
            rdbtn.setText(parkingModels.get(i).getName());
            rdbtn.setChecked(true);
            rdbtn.setTextColor(getResources().getColor(R.color.colorPrimary));
            rdbtn.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    getResources().getDimension(R.dimen._14sdp));
            rdbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    updateToolBar(parkingModels);
                    // updateWheeler(parkingModels);

                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("SelectVehicleType1", "" + ((RadioButton) v).getText() + "");
                    ed.apply();
                    ed.commit();
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                    SelectVehicleType1 = sharedpref.getString("SelectVehicleType1", "");
                    if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
                        availableSlotSevice(parkingId, SelectVehicleType1, agentId);
                    } else {
                        NoIternetConnection(MainActivityNew.this);
                    }

                    // Log.e(TAG, "onClick: ===========99999999999================"+VehicleType1 );
                    Log.e(TAG, " Name " + ((RadioButton) v).getText() + " Id is " + v.getId());
                }
            });

            radiogroupAAA.addView(rdbtn);
        }
    }

    private void updatescreenData(int length) {

        if (length == 3) {
            {


                pType2 = parkings[0];
                pType4 = parkings[1];
                pType3 = parkings[2];
                for (int i = 0; i < parkings.length; i++) {
                    Log.e(TAG, "showVehicleType:parkings[ " + i + " ] " + parkings[i]);

                }

                TwoType.setText(pType2);
                FourType.setText(pType4);
                ThreeType.setText(pType3);
                ed.commit();


                final String finalPType = pType2;
                final String finalPType1 = pType4;
                radioGroupType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        radioGroupType.check(checkedId);

                        if (checkedId == R.id.twowheeler) {
                            FourType.setChecked(false);
                            ThreeType.setChecked(false);
                            TwoType.setChecked(true);

                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                            ed = sharedpref.edit();
                            ed.putString("VehicleType1", parkings[0]);
                            //   ed.putString("VehicleType2", parkings[1]);
                            ed.apply();
                            ed.commit();
                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                            String VehicleType1 = sharedpref.getString("VehicleType1", "");
                            String getParkingID = sharedpref.getString("getParkingID", "");
                            String GateId = sharedpref.getString("GateId", "");


                        } else if (checkedId == R.id.threeewheeler) {
                            ThreeType.setChecked(true);
                            TwoType.setChecked(false);
                            FourType.setChecked(false);
                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                            ed = sharedpref.edit();
                            ed.putString("VehicleType1", parkings[2]);
                            //   ed.putString("VehicleType2", parkings[1]);
                            ed.apply();
                            ed.commit();
                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                            String VehicleType1 = sharedpref.getString("VehicleType1", "");
                            String getParkingID = sharedpref.getString("getParkingID", "");
                            String GateId = sharedpref.getString("GateId", "");


                        } else {
                            FourType.setChecked(true);
                            ThreeType.setChecked(false);
                            TwoType.setChecked(false);

                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                            ed = sharedpref.edit();
                            ed.putString("VehicleType1", parkings[1]);
                            // ed.putString("VehicleType2", parkings[1]);
                            ed.apply();
                            ed.commit();
                            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                            String VehicleType1 = sharedpref.getString("VehicleType1", "");
                            String getParkingID = sharedpref.getString("getParkingID", "");
                            String GateId = sharedpref.getString("GateId", "");


                        }
                    }
                });


            }
        } else if (length == 1) {
            OtherType.setVisibility(View.GONE);
            //  TwoType.setChecked(true);
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            ed = sharedpref.edit();
            ed.putString("VehicleType1", parkings[0]);
            ed.apply();
            ed.commit();
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

            String VehicleType1 = sharedpref.getString("VehicleType1", "");
            String getParkingID = sharedpref.getString("getParkingID", "");
            String GateIdd = sharedpref.getString("GateId", "");

        } else if (length == 2) {
            OtherType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            pType2 = parkings[0];
            pType4 = parkings[1];
            for (int i = 0; i < parkings.length; i++) {
                Log.e(TAG, "showVehicleType:parkings[ " + i + " ] " + parkings[i]);

            }
            //  TwoType.setChecked(true);
            TwoType.setText(pType2);
            FourType.setText(pType4);


            final String finalPType = pType2;
            final String finalPType1 = pType4;
            radioGroupType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    radioGroupType.check(checkedId);

                    if (checkedId == R.id.twowheeler) {
                        FourType.setChecked(false);
                        TwoType.setChecked(true);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[0]);
                        //   ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");

                    } else {
                        FourType.setChecked(true);
                        TwoType.setChecked(false);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[1]);
                        // ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");
                        //  showGateType(GateId);

                    }
                }
            });


        } else if (length == 4) {

            // ThreeType.setVisibility(View.GONE);
            pType2 = parkings[0];
            pType4 = parkings[1];
            pType3 = parkings[2];
            pType5 = parkings[3];
            for (int i = 0; i < parkings.length; i++) {
                Log.e(TAG, "showVehicleType:parkings[ " + i + " ] " + parkings[i]);

            }
            //  TwoType.setChecked(true);
            TwoType.setText(pType2);
            FourType.setText(pType4);
            ThreeType.setText(pType3);
            OtherType.setText(pType5);


            final String finalPType2 = pType2;
            final String finalPType1 = pType4;
            final String finalPType3 = pType3;
            final String finalPType5 = pType5;
            radioGroupType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    radioGroupType.check(checkedId);

                    if (checkedId == R.id.twowheeler) {
                        FourType.setChecked(false);
                        ThreeType.setChecked(false);
                        OtherType.setChecked(false);
                        TwoType.setChecked(true);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[0]);
                        //   ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");

                    } else if (checkedId == R.id.threeewheeler) {
                        TwoType.setChecked(false);
                        FourType.setChecked(false);
                        OtherType.setChecked(false);

                        ThreeType.setChecked(true);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[2]);
                        //   ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");

                    } else if (checkedId == R.id.OtherType) {
                        OtherType.setChecked(true);
                        ThreeType.setChecked(false);
                        FourType.setChecked(false);
                        TwoType.setChecked(false);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[3]);
                        //   ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");

                    } else {
                        OtherType.setChecked(false);
                        FourType.setChecked(true);
                        TwoType.setChecked(false);
                        ThreeType.setChecked(false);
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("VehicleType1", parkings[1]);
                        // ed.putString("VehicleType2", parkings[1]);
                        ed.apply();
                        ed.commit();
                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                        String VehicleType1 = sharedpref.getString("VehicleType1", "");
                        String getParkingID = sharedpref.getString("getParkingID", "");
                        String GateIdd = sharedpref.getString("GateId", "");

                    }
                }
            });


        }
    }

    private void updateWheeler(List<ParkingModel> parkingModels) {
        for (int i = 0; i < parkingModels.size(); i++) {
            if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler,other")) {
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.VISIBLE);
            }
        }

        if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler,other")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.VISIBLE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.VISIBLE);
        } else if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.VISIBLE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
        } else if (parkingType.equals("2Wheeler,4Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
        } else if (parkingType.equals("4Wheeler")) {
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);

        } else if (parkingType.equals("4Wheeler")) {
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);

        } else if (parkingType.equals("other")) {
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.VISIBLE);

        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);


        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);
            TwoType.setVisibility(View.GONE);
        } else if (parkingType.equals("4Wheeler")) {
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);

        }

    }

    private void getIntentDataFromParkingList() {

    }

    @Override
    protected void onResume() {
        super.onResume();

        initSdk();
        IntentFilter tagDetected = new IntentFilter(NfcAdapter.ACTION_TAG_DISCOVERED);
        IntentFilter ndefDetected = new IntentFilter(NfcAdapter.ACTION_NDEF_DISCOVERED);
        IntentFilter techDetected = new IntentFilter(NfcAdapter.ACTION_TECH_DISCOVERED);
        IntentFilter[] nfcIntentFilter = new IntentFilter[]{techDetected, tagDetected, ndefDetected};

        PendingIntent pendingIntent = PendingIntent.getActivity(
                this, 0, new Intent(this, getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
        if (mNfcAdapter != null)
            mNfcAdapter.enableForegroundDispatch(this, pendingIntent, nfcIntentFilter, null);

        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
            Log.e(TAG, "onResume: parkingType12---------" + parkingType12);
            Log.e(TAG, "onResume: parkingType-----------" + parkingType);
            availableSlotSevice(parkingId, parkingType12, agentId);

        } else {
            NoIternetConnection(MainActivityNew.this);
        }
      */
/*  if (InternetConnection.checkConnection(MainActivity.this)) {
            Log.e(TAG, "onResume: InternetConnection.checkConnection" );
            availableSlotSevice(parkingId, parkingType12, agentId);
        } else {
            Toast.makeText(MainActivity.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();

        }*//*


        try {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            userTypeData = sharedpref.getString("userType", "");

            if (userTypeData.equals("Normal")) {
                normalUser.setChecked(true);
                vipUser.setChecked(false);
                userType = "Normal";
                vipinfo.setVisibility(View.GONE);
            } else {
                vipUser.setChecked(true);
                normalUser.setChecked(false);
                userType = "VIP";
                vipinfo.setVisibility(View.VISIBLE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userType.equals("Normal")) {
            btnScanQRCode.setVisibility(View.VISIBLE);
            btnCheckIn.setVisibility(View.VISIBLE);
            btnCheckout.setVisibility(View.VISIBLE);
        }


    }

    public void url() {

        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=1&parkingType=2W*//*

        */
/*http://staggingapi.opark.in/index.php/v1/user/inventory?parkingId=1&parkingType=2W*//*

        */
/*http://staggingapi.opark.in/index.php/v1/parking/checkin?parkingId=1&parkingType=4Wheeler&vehicleNo=6678&agentId=3&mode=Normal&userdata=9993289838*//*

    }

    private void initSdk() {

        mServiceManager = WeiposImpl.as().openServiceManager();
        WeiposImpl.as().init(MainActivityNew.this, new Weipos.OnInitListener() {

            @Override
            public void onInitOk() {
                // TODO Auto-generated method stub

                mServiceManager = WeiposImpl.as().openServiceManager();

                try {
                    printer = WeiposImpl.as().openPrinter();
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }

            @Override
            public void onError(String message) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onDestroy() {
                // TODO Auto-generated method stub

            }
        });

    }

    private void findViews() {
        // getGateApi();
        toolBar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("");

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        textToolHeader = (TextView) findViewById(R.id.toolbar_title);
        toolBarUserAvatar1 = toolBar.findViewById(R.id.toolBarUserAvatar1);
        toolBarUserAvatar2 = toolBar.findViewById(R.id.toolBarUserAvatar2);
        toolBarUserAvatar3 = toolBar.findViewById(R.id.toolBarUserAvatar3);

        // getType = "2W,4W,3W";
       // updateToolBar();


        NavigationMenuView navMenuView = (NavigationMenuView) navigationView.getChildAt(0);
        navMenuView.addItemDecoration(new DividerItemDecoration(MainActivityNew.this, DividerItemDecoration.VERTICAL));

        etMobileNo = (EditText) findViewById(R.id.etMobileNo);
        btnCheckIn = (Button) findViewById(R.id.btnCheckIn);
        btnCheckIn = (Button) findViewById(R.id.btnCheckIn);
        btnScanQRCodeCheckIn1 = (Button) findViewById(R.id.btnScanQRCodeCheckIn1);
        btnCheckout = (Button) findViewById(R.id.btnCheckout);
        btnScanQRCode = (Button) findViewById(R.id.btnScanQRCode);
        btnScanQRCodeCheckIn = (Button) findViewById(R.id.btnScanQRCodeCheckIn);
        attenderName = (TextView) findViewById(R.id.attenderName);
        parking_Name = (TextView) findViewById(R.id.parking_Name);

        normalUserVehicle = (LinearLayout) findViewById(R.id.normalUserVehicle);
        vipUserVehicle = (LinearLayout) findViewById(R.id.vipUserVehicle);
        // linearTypeSelect = (LinearLayout) findViewById(R.id.linearTypeSelect);
        // linearTypeSelect.setVisibility(View.VISIBLE);

        tvTotalSpots = (TextView) findViewById(R.id.tvTotalSpots);
        tvAvailableSpots = (TextView) findViewById(R.id.tvAvailableSpots);
        otpVehicleNumber = (EditText) findViewById(R.id.otpVehicleNumber);
        vipinfo = (EditText) findViewById(R.id.vipinfo);


        normalUser = (RadioButton) findViewById(R.id.normalUser);
        vipUser = (RadioButton) findViewById(R.id.vipUser);
        onlineUser = (RadioButton) findViewById(R.id.onlineUser);

        TwoType = (RadioButton) findViewById(R.id.TwoType);
        ThreeType = (RadioButton) findViewById(R.id.ThreeType);
        FourType = (RadioButton) findViewById(R.id.FourType);
        OtherType = (RadioButton) findViewById(R.id.OtherType);

        etStateCode = (EditText) findViewById(R.id.etStateCode);
        etCityCode = (EditText) findViewById(R.id.etCityCode);
        etVehicleCode = (EditText) findViewById(R.id.etVehicleCode);
        etVehicleNumber = (EditText) findViewById(R.id.etVehicleNumber);
        vipVehicleNumber = (EditText) findViewById(R.id.vipVehicleNumber);

       */
/* etStateCode.setEnabled(false);
        etCityCode.setEnabled(false);
        etVehicleCode.setEnabled(false);
        etVehicleNumber.setEnabled(false);
        vipVehicleNumber.setEnabled(false);
        etMobileNo.setEnabled(false);
*//*

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroupType = (RadioGroup) findViewById(R.id.radioGroupType);
        radioGroup.setVisibility(View.VISIBLE);
        etMobileNo.setVisibility(View.VISIBLE);

        attenderName.setText(userName);
        parking_Name.setText(getParkingName);

        View hraderView = navigationView.getHeaderView(0);
        nameHeader = (TextView) hraderView.findViewById(R.id.nameHeader);
        headerEmail = (TextView) hraderView.findViewById(R.id.headerEmail);
        nameHeader.setText(userName);
        //  headerEmail.setText(userName + ".@gmail.com");

        etVehicleNumber.requestFocus();

        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {

        } else {
            NoIternetConnection(MainActivityNew.this);
        }


        setListener();

    }

    ArrayList<GateList> list = new ArrayList<>();
    Intent intent;

    @Override
    protected void onRestart() {
        super.onRestart();
        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {

        } else {
            NoIternetConnection(MainActivityNew.this);
        }

    }

    private void getGateApi() {
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        */
/*http://staggingapi.opark.in/index.php/v1/parking/list?vendorId=1*//*

        */
/*http://opark.in/O_par_aPi/nfc/index.php/v1/parking/gate_list*//*

        String urlData = AppConstants.BASEURL + "parking/gate_list";
        Log.e(TAG, "getGateApi: urlData==" + urlData);
        JsonObjectRequest request = new JsonObjectRequest(urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject json) {
                list.clear();

                try {
                    System.out.println("JSON RETURN " + json.toString());
                    Log.e(TAG, "JSON RETURN===========: " + json.toString());

                    String data = String.valueOf(json.get("data"));
                    String message = String.valueOf(json.get("message"));
                    int status = json.getInt("status");
                    //int detail = json.getInt("detail");

                    if (status == 0) {

                        final JSONArray arrayObj = new JSONArray(data);


                        //Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                        for (int i = 0; i < arrayObj.length(); i++) {

                            JSONObject jsonObject = arrayObj.getJSONObject(i);
                            GateList gateList = new GateList();
                            gateList.setGateName(jsonObject.getString("gateName"));
                            gateList.setGateId(jsonObject.getString("gateId"));
                            Log.e(TAG, "onResponse: " + jsonObject.getString("gateName"));
                            Log.e(TAG, "onResponse: " + jsonObject.getString("gateId"));
                            list.add(gateList);
                        }
                        Log.e(TAG, "onResponse: ====" + list.size());

                        pDialog.dismiss();


                    } else {
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Response error", error + "");
                        Toast.makeText(MainActivityNew.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                        pDialog.dismiss();
                    }
                });

        request.setRetryPolicy(new DefaultRetryPolicy(
                50000,
                3,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        AppController.getInstance().getRequestQueue().add(request);
    }

    private void setListener() {

        btnCheckIn.setOnClickListener(this);
        btnCheckout.setOnClickListener(this);
        btnScanQRCode.setOnClickListener(this);
        btnScanQRCodeCheckIn.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("WrongConstant")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {


                    case R.id.nav_twowheeler:
                        intent = new Intent(MainActivityNew.this, TwoWheeler.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        return true;
                    case R.id.nav_gate:

                        LayoutInflater inflater = getLayoutInflater();
                        final View alertLayout = inflater.inflate(R.layout.layout_custom_dialog_gate, null);
                        android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(MainActivityNew.this);
                        alert.setTitle("Select Gate No");
                        alert.setView(alertLayout);
                        alert.setCancelable(false);
                        final android.app.AlertDialog dialog;
                        dialog = alert.create();
                        if (dialog != null) {
                            dialog.show();
                        }

                        final Button btnSubmit = (Button) alertLayout.findViewById(R.id.btnSubmit);
                        final Button btnCancel = (Button) alertLayout.findViewById(R.id.btnCancel);

                        final RadioButton Gate1 = (RadioButton) alertLayout.findViewById(R.id.Gate1);
                        final RadioButton Gate2 = (RadioButton) alertLayout.findViewById(R.id.Gate2);
                        final RadioButton Gate3 = (RadioButton) alertLayout.findViewById(R.id.Gate3);
                        final RadioButton Gate4 = (RadioButton) alertLayout.findViewById(R.id.Gate4);
                        final RadioGroup radioGate = (RadioGroup) alertLayout.findViewById(R.id.radioGate);

                        radioGate.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                radioGate.check(checkedId);

                                if (checkedId == R.id.Gate1) {
                                    GateId = "Gate1";
                                    Gate1.setChecked(true);
                                    Gate2.setChecked(false);
                                    Gate3.setChecked(false);
                                    Gate4.setChecked(false);

                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                                    ed = sharedpref.edit();
                                    ed.putString("Gate", GateId);
                                    ed.putString("GateId", list.get(0).getGateId());
                                    //   ed.putString("VehicleType2", parkings[1]);
                                    ed.apply();
                                    ed.commit();
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                                    String VehicleType1 = sharedpref.getString("VehicleType1", "");
                                    String getParkingID = sharedpref.getString("getParkingID", "");
                                    String Gate = sharedpref.getString("Gate", "");
                                    String GateId = sharedpref.getString("GateId", "");

                                } else if (checkedId == R.id.Gate2) {
                                    GateId = "Gate2";
                                    Gate1.setChecked(false);
                                    Gate2.setChecked(true);
                                    Gate3.setChecked(false);
                                    Gate4.setChecked(false);
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                                    ed = sharedpref.edit();
                                    ed.putString("Gate", GateId);
                                    ed.putString("GateId", list.get(1).getGateId());

                                    //   ed.putString("VehicleType2", parkings[1]);
                                    ed.apply();
                                    ed.commit();
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                                    String VehicleType1 = sharedpref.getString("VehicleType1", "");
                                    String getParkingID = sharedpref.getString("getParkingID", "");
                                    String Gate = sharedpref.getString("Gate", "");
                                    String GateId = sharedpref.getString("GateId", "");

                                } else if (checkedId == R.id.Gate3) {
                                    GateId = "Gate3";

                                    Gate1.setChecked(false);
                                    Gate2.setChecked(false);
                                    Gate3.setChecked(true);
                                    Gate4.setChecked(false);
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                                    ed = sharedpref.edit();
                                    ed.putString("Gate", GateId);
                                    ed.putString("GateId", list.get(2).getGateId());

                                    // ed.putString("VehicleType2", parkings[1]);
                                    ed.apply();
                                    ed.commit();
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                                    String VehicleType1 = sharedpref.getString("VehicleType1", "");
                                    String getParkingID = sharedpref.getString("getParkingID", "");
                                    String Gate = sharedpref.getString("Gate", "");
                                    String GateId = sharedpref.getString("GateId", "");

                                } else if (checkedId == R.id.Gate4) {
                                    GateId = "Gate4";

                                    Gate1.setChecked(false);
                                    Gate2.setChecked(false);
                                    Gate3.setChecked(false);
                                    Gate4.setChecked(true);

                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                                    ed = sharedpref.edit();
                                    ed.putString("Gate", GateId);
                                    ed.putString("GateId", list.get(3).getGateId());

                                    // ed.putString("VehicleType2", parkings[1]);
                                    ed.apply();
                                    ed.commit();
                                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

                                    String VehicleType1 = sharedpref.getString("VehicleType1", "");
                                    String getParkingID = sharedpref.getString("getParkingID", "");
                                    String Gate = sharedpref.getString("Gate", "");
                                    String GateId = sharedpref.getString("GateId", "");

                                } else {
                                    Toast.makeText(MainActivityNew.this, "Please Select Gate No", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                        btnCancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (dialog.isShowing()) {
                                    dialog.cancel();
                                }
                            }
                        });
                        btnSubmit.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                if (sharedpref.getString("VehicleType1", "").equals("")) {
                                    Toast.makeText(MainActivityNew.this, "Please select Vehicle type", Toast.LENGTH_SHORT).show();
                                } else if (sharedpref.getString("GateId", "").equals("")) {
                                    Toast.makeText(MainActivityNew.this, "Please select Gate ", Toast.LENGTH_SHORT).show();

                                } else {
                                    Intent intentSplash = new Intent(MainActivityNew.this, MainActivityNew.class);
                                    startActivity(intentSplash);
                                    finish();
                                }
                            }
                        });
                        if (list.size() == 4) {
                            String Gate11 = list.get(0).getGateName();
                            String Gate12 = list.get(1).getGateName();
                            String Gate13 = list.get(2).getGateName();
                            String Gate14 = list.get(3).getGateName();
                            Gate1.setText(Gate11);
                            Gate2.setText(Gate12);
                            Gate3.setText(Gate13);
                            Gate4.setText(Gate14);


                        }
                        return true;
                    case R.id.nav_PatientVehicle:
                        intent = new Intent(MainActivityNew.this, PatientVehicleWheeler.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        return true;
                  */
/*  case R.id.nav_reprint:
                        intent = new Intent(MainActivity.this, ReprintActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        return true;*//*

                    case R.id.nav_threewheeler:
                        intent = new Intent(MainActivityNew.this, ThreeWheeler.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        return true;

                    case R.id.nav_fourwheeler:
                        intent = new Intent(MainActivityNew.this, FourWheeler.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        return true;
//                    case R.id.nav_receiptLoss:
//                        Intent intentLossReceipt = new Intent(MainActivity.this, ReceiptLoss.class);
//                        intentLossReceipt.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|IntentCompat.FLAG_ACTIVITY_CLEAR_TASK)
                    case R.id.nav_LossReceipt:
                        intent = new Intent(MainActivityNew.this, LossReceipt.class);
                        // intentloaa.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.nav_shiftreport:

                        intent = new Intent(MainActivityNew.this, ShiftReportctivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.nav_carInActivityTwo:
                        intent = new Intent(MainActivityNew.this, WheelerList.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                   */
/* case R.id.nav_carInActivityThree:
                        intent = new Intent(MainActivity.this, ThreeWheelerList.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;*//*

                 */
/*   case R.id.nav_carOutActivityFour:
                        intent = new Intent(MainActivity.this, FourWheelerList.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;*//*

                 */
/*   case R.id.nav_PatientVehicle_List:
                        intent = new Intent(MainActivity.this, PatientVehicleWheelerList.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;*//*


                    case R.id.nav_sub:
                        intent = new Intent(MainActivityNew.this, Subscription.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;

                    case R.id.nav_renew:
                        intent = new Intent(MainActivityNew.this, RenewCard.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.nav_remove:
                        intent = new Intent(MainActivityNew.this, RemoveCardActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;

                    case R.id.nav_detail:
                        intent = new Intent(MainActivityNew.this, Subscriptionctivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.nav_download:
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivityNew.this);
                        builder1.setMessage("Are you sure you want to Update?").setIcon(R.drawable.oparklogonew).setTitle("Opark")
                                .setCancelable(false)
                                .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {

                                        // startService(new Intent(MainActivity.this, MyService.class));
                                        new DownloadNewVersion().execute();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert1 = builder1.create();
                        alert1.show();


                        break;
                    case R.id.nav_logout:
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityNew.this);
                        builder.setMessage("Are you sure you want to Logout?").setIcon(R.drawable.oparklogonew).setTitle("Opark")
                                .setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        logOut(agentId, parkingId);
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert11 = builder.create();
                        alert11.show();
                }
                return true;
            }

        });
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar,
                R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        actionBarDrawerToggle.syncState();


        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        etMobileNo.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (etMobileNo.getText().toString().length() == 10)     //size as per your requirement
                {
                    etMobileNo.requestFocus();
                    etMobileNo.setSelection(etMobileNo.getText().length());
                    AppConstants.hideKeyboard(MainActivityNew.this, etMobileNo);
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        etStateCode.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (etStateCode.getText().toString().length() == 2)     //size as per your requirement
                {
                    etCityCode.requestFocus();
                    etStateCode.setSelection(etStateCode.getText().length());

                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        etCityCode.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (etCityCode.getText().toString().length() == 2)     //size as per your requirement
                {
                    etVehicleCode.requestFocus();
                    etCityCode.setSelection(etCityCode.getText().length());

                }
                if (etCityCode.getText().toString().length() == 0)     //size as per your requirement
                {
                    etCityCode.setSelection(etCityCode.getText().length());
                    etStateCode.requestFocus();

                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        etVehicleCode.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (etVehicleCode.getText().toString().length() == 2)     //size as per your requirement
                {
                    etVehicleCode.setSelection(etVehicleCode.getText().length());
                    etVehicleNumber.requestFocus();

                }
                if (etVehicleCode.getText().toString().length() == 0)     //size as per your requirement
                {
                    etVehicleCode.setSelection(etVehicleCode.getText().length());
                    etCityCode.requestFocus();

                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        etVehicleNumber.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (etVehicleNumber.getText().toString().length() == 4)     //size as per your requirement
                {
                    etVehicleNumber.setSelection(etVehicleNumber.getText().length());
                    AppConstants.hideKeyboard(MainActivityNew.this, etVehicleNumber);

                }
                if (etVehicleNumber.getText().toString().length() == 0)     //size as per your requirement
                {
                    etVehicleNumber.setSelection(etVehicleNumber.getText().length());
                    etVehicleCode.requestFocus();
                    //AppConstants.hideKeyboard(MainActivity.this, etVehicleNumber);

                }

            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });
        otpVehicleNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (otpVehicleNumber.getText().toString().length() == 4) {
                    otpVehicleNumber.setSelection(etVehicleNumber.getText().length());
                    AppConstants.hideKeyboard(MainActivityNew.this, otpVehicleNumber);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        vipVehicleNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (vipVehicleNumber.getText().toString().length() == 10)     //size as per your requirement
                {
                    vipVehicleNumber.setSelection(vipVehicleNumber.getText().length());
                    vipVehicleNumber.requestFocus();
                    AppConstants.hideKeyboard(MainActivityNew.this, etVehicleNumber);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        try {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            userTypeData = sharedpref.getString("userType", "");

            if (userTypeData.equals("Normal")) {
                normalUser.setChecked(true);
                vipUser.setChecked(false);
                userType = "Normal";
                vipinfo.setVisibility(View.GONE);
            } else {
                vipUser.setChecked(true);
                normalUser.setChecked(false);
                userType = "VIP";
                vipinfo.setVisibility(View.VISIBLE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO: 12/4/2019
        //  btnScanQRCode.setVisibility(View.GONE);
        userType = "Normal";
        if (userType.equals("Normal")) {
            btnScanQRCode.setVisibility(View.VISIBLE);
            btnCheckIn.setVisibility(View.VISIBLE);
            btnCheckout.setVisibility(View.VISIBLE);
        }
        userTypeData = "Normal";
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.normalUser) {
                    normalUser.setChecked(true);
                    userType = "Normal";
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("userType", userType);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();

                    userTypeData = sharedpref.getString("userType", "");
                    Log.e(TAG, "id: userTypeData" + userTypeData);

                    vipVehicleNumber.setVisibility(View.GONE);
                    otpVehicleNumber.setVisibility(View.GONE);
                    vipinfo.setVisibility(View.GONE);
                    btnScanQRCodeCheckIn.setVisibility(View.GONE);
                    normalUserVehicle.setVisibility(View.VISIBLE);
                    etMobileNo.setVisibility(View.VISIBLE);
                    btnCheckIn.setVisibility(View.VISIBLE);
                    btnCheckout.setVisibility(View.VISIBLE);
                    btnScanQRCode.setVisibility(View.VISIBLE);

                }

                if (checkedId == R.id.vipUser) {
                    vipUser.setChecked(true);
                    userType = "VIP";
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("userType", userType);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();
                    userTypeData = sharedpref.getString("userType", "");
                    Log.e(TAG, "id: userTypeData" + userTypeData);

                    vipVehicleNumber.setVisibility(View.GONE);
                    otpVehicleNumber.setVisibility(View.GONE);
                    btnScanQRCodeCheckIn.setVisibility(View.GONE);
                    normalUserVehicle.setVisibility(View.VISIBLE);
                    vipinfo.setVisibility(View.VISIBLE);
                    etMobileNo.setVisibility(View.VISIBLE);
                    btnCheckIn.setVisibility(View.VISIBLE);
                    btnCheckout.setVisibility(View.VISIBLE);
                    btnScanQRCode.setVisibility(View.VISIBLE);

//                    vipVehicleNumber.setVisibility(View.VISIBLE);
//                    normalUserVehicle.setVisibility(View.GONE);
//                    otpVehicleNumber.setVisibility(View.GONE);
//                    btnScanQRCodeCheckIn.setVisibility(View.GONE);
//                    vipVehicleNumber.setHint("Enter Vehicle no.");
//                    vipVehicleNumber.setText("");
//                    etMobileNo.setVisibility(View.GONE);
//                    btnCheckIn.setVisibility(View.VISIBLE);
//                    btnCheckout.setVisibility(View.VISIBLE);
//                    btnScanQRCode.setVisibility(View.VISIBLE);


                }

                if (checkedId == R.id.onlineUser) {
                    onlineUser.setChecked(true);
                    normalUserVehicle.setVisibility(View.GONE);
                    etMobileNo.setVisibility(View.GONE);
                    vipVehicleNumber.setVisibility(View.GONE);
                    vipinfo.setVisibility(View.GONE);
                    otpVehicleNumber.setVisibility(View.VISIBLE);
                    vipVehicleNumber.setText("");
                    otpVehicleNumber.setHint("Enter OTP");
                    userType = "Online";
                    btnCheckIn.setVisibility(View.VISIBLE);
                    btnCheckout.setVisibility(View.VISIBLE);
                    btnScanQRCodeCheckIn.setVisibility(View.GONE);
                    btnScanQRCode.setVisibility(View.VISIBLE);
                }
            }
        });
        if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler,other")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.VISIBLE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.VISIBLE);
            if (parkingType12.equals("4Wheeler")) {
                FourType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.VISIBLE);
            } else if (parkingType12.equals("3Wheeler")) {
                ThreeType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.VISIBLE);

            } else if (parkingType12.equals("other")) {
                OtherType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.VISIBLE);

            } else {
                TwoType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.VISIBLE);

            }
        } else if (parkingType.equals("2Wheeler,4Wheeler,3Wheeler")) {
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.VISIBLE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
            if (parkingType12.equals("4Wheeler")) {
                FourType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.GONE);
            } else if (parkingType12.equals("3Wheeler")) {
                ThreeType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.GONE);

            } else {
                TwoType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.VISIBLE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.GONE);

            }
        } else if (parkingType.equals("2Wheeler,4Wheeler")) {

            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
            if (parkingType12.equals("4Wheeler")) {
                FourType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.GONE);
                FourType.setVisibility(View.VISIBLE);
                OtherType.setVisibility(View.GONE);
            } else {
                TwoType.setChecked(true);
                TwoType.setVisibility(View.VISIBLE);
                ThreeType.setVisibility(View.GONE);
                FourType.setVisibility(View.GONE);
                OtherType.setVisibility(View.GONE);

            }
        } else if (parkingType.equals("4Wheeler")) {
            FourType.setChecked(true);
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);
        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setChecked(true);
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);

        } else if (parkingType.equals("4Wheeler")) {
            FourType.setChecked(true);
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);

        } else if (parkingType.equals("other")) {
            OtherType.setChecked(true);
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.VISIBLE);

        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setChecked(true);
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);


        } else if (parkingType.equals("2Wheeler")) {
            TwoType.setChecked(true);
            TwoType.setVisibility(View.VISIBLE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.GONE);
            OtherType.setVisibility(View.GONE);
            TwoType.setVisibility(View.GONE);
        } else if (parkingType.equals("4Wheeler")) {
            FourType.setChecked(true);
            TwoType.setVisibility(View.GONE);
            ThreeType.setVisibility(View.GONE);
            FourType.setVisibility(View.VISIBLE);
            OtherType.setVisibility(View.GONE);

        }
        */
/*if (parkingType12.equals("2Wheeler")) {
            TwoType.setChecked(true);
        } else if (parkingType12.equals("3Wheeler")) {
            ThreeType.setChecked(true);
        } else if (parkingType12.equals("4Wheeler")) {
            FourType.setChecked(true);

        } else {
            OtherType.setChecked(true);

        }*//*

        radioGroupType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.TwoType) {

                    TwoType.setChecked(true);
                    parkingType12 = "2Wheeler";
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("VehicleType1", parkingType12);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();

                    parkingType12 = sharedpref.getString("VehicleType1", "");
                    Log.e(TAG, "id: parkingType12" + parkingType12);

                    updateToolBar();
                    availableSlotSevice(parkingId, parkingType12, agentId);

                } else if (checkedId == R.id.ThreeType) {
                    ThreeType.setChecked(true);
                    parkingType12 = "3Wheeler";

                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("VehicleType1", parkingType12);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();

                    parkingType12 = sharedpref.getString("VehicleType1", "");
                    Log.e(TAG, "id: parkingType12" + parkingType12);
                    updateToolBar();
                    availableSlotSevice(parkingId, parkingType12, agentId);

                } else if (checkedId == R.id.FourType) {
                    FourType.setChecked(true);
                    parkingType12 = "4Wheeler";
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("VehicleType1", parkingType12);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();

                    parkingType12 = sharedpref.getString("VehicleType1", "");
                    Log.e(TAG, "id: parkingType12" + parkingType12);
                    updateToolBar();
                    availableSlotSevice(parkingId, parkingType12, agentId);

                } else
                    */
/*if (checkedId == R.id.OtherType) *//*
 {
                    OtherType.setChecked(true);
                    parkingType12 = "other";
                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("VehicleType1", parkingType12);
                    // ed.putString("VehicleType1", Type12);
                    //   ed.putString("VehicleType2", Type12[1]);
                    ed.apply();
                    ed.commit();

                    parkingType12 = sharedpref.getString("VehicleType1", "");
                    Log.e(TAG, "id: parkingType12" + parkingType12);
                    updateToolBar();
                    availableSlotSevice(parkingId, parkingType12, agentId);

                }
            }
        });


    }

    private void updateToolBar() {

        parkingType12 = sharedpref.getString("VehicleType1", "");
        String Gate = sharedpref.getString("Gate", "");

        if (parkingType12.equals("2Wheeler")) {
            textToolHeader.setVisibility(View.VISIBLE);
            toolBarUserAvatar1.setVisibility(View.VISIBLE);

            //textToolHeader.setText("" + Gate);
            toolBarUserAvatar1.setImageResource(R.mipmap.twobike);
        } else if (parkingType12.equals("3Wheeler")) {
            textToolHeader.setVisibility(View.VISIBLE);
            // textToolHeader.setText("" + Gate);
            toolBarUserAvatar1.setVisibility(View.VISIBLE);

            toolBarUserAvatar1.setImageResource(R.drawable.ic_tuk_tuk);
        } else if (parkingType12.equals("other")) {
            textToolHeader.setVisibility(View.VISIBLE);
            // textToolHeader.setText("" + Gate);
            toolBarUserAvatar1.setVisibility(View.VISIBLE);

            toolBarUserAvatar1.setImageResource(R.drawable.ic_ambulance);
        } else {
            textToolHeader.setVisibility(View.VISIBLE);
            //  textToolHeader.setText("" + Gate);
            toolBarUserAvatar1.setVisibility(View.VISIBLE);
            // textToolHeader.setText("Four Wheeler");
            toolBarUserAvatar1.setImageResource(R.drawable.car_trip);
        }
    }

    private void updateToolBar(List<ParkingModel> parkingModels) {
        for (int i = 0; i < parkingModels.size(); i++) {
            if (parkingModels.get(i).getName().equals("2Wheeler")) {
                textToolHeader.setVisibility(View.VISIBLE);
                toolBarUserAvatar1.setVisibility(View.VISIBLE);

                //textToolHeader.setText("" + Gate);
                toolBarUserAvatar1.setImageResource(R.mipmap.twobike);
            } else if (parkingModels.get(i).getName().equals("3Wheeler")) {
                textToolHeader.setVisibility(View.VISIBLE);
                // textToolHeader.setText("" + Gate);
                toolBarUserAvatar1.setVisibility(View.VISIBLE);

                toolBarUserAvatar1.setImageResource(R.drawable.ic_tuk_tuk);
            } else if (parkingModels.get(i).getName().equals("other")) {
                textToolHeader.setVisibility(View.VISIBLE);
                // textToolHeader.setText("" + Gate);
                toolBarUserAvatar1.setVisibility(View.VISIBLE);

                toolBarUserAvatar1.setImageResource(R.drawable.ic_ambulance);
            } else {
                textToolHeader.setVisibility(View.VISIBLE);
                //  textToolHeader.setText("" + Gate);
                toolBarUserAvatar1.setVisibility(View.VISIBLE);
                // textToolHeader.setText("Four Wheeler");
                toolBarUserAvatar1.setImageResource(R.drawable.car_trip);
            }
        }

    }

    public void numericType() {
        filter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; ++i) {
                    if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(source.charAt(i))).matches()) {
                        return "";
                    }
                }

                return null;
            }
        };


    }

    public void type() {
        filter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; ++i) {
                    if (!Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890]*").matcher(String.valueOf(source.charAt(i))).matches()) {
                        return "";
                    }
                }

                return null;
            }
        };
        vipVehicleNumber.setFilters(new InputFilter[]{filter, new InputFilter.LengthFilter(10)});
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {

        AppConstants.hideKeyboard(MainActivityNew.this, v);

        if (v == btnCheckIn) {
            if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
                validate();
            } else {
                NoIternetConnection(MainActivityNew.this);
            }

        } else if (v == btnCheckout) {
            if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
                validate1();
            } else {
                NoIternetConnection(MainActivityNew.this);
            }

        } else if (ContextCompat.checkSelfPermission(MainActivityNew.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, 100);
        } else if (v == btnScanQRCode) {
            if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
                moveToQrScan();
            } else {
                NoIternetConnection(MainActivityNew.this);
            }


        } else if (v == btnScanQRCodeCheckIn) {
            if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
                moveToQrScan();
            } else {
                NoIternetConnection(MainActivityNew.this);

            }

        }*/
/*else {
            moveToQrScan();
        }*//*

    }

    private void NoInternetConnection() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("No internet Connection");
        builder.setMessage("Please turn on internet connection to continue");
      */
/*  builder.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });*//*

        builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (AppConstants.isInternetAvailable(MainActivityNew.this)) {

                } else {
                    NoInternetConnection();

                }


            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void moveToQrScan() {
        try {
            Intent qrintent = new Intent(MainActivityNew.this, QRScanPrint.class);
            qrintent.putExtra("userType", userType);
            qrintent.putExtra("Acticityclass", "MainActicity");
            qrintent.putExtra("Wheeler", parkingType12);


            startActivity(qrintent);
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    private void validate() {

        mobileNumber = etMobileNo.getText().toString();
        StateCode = etStateCode.getText().toString();
        CityCode = etCityCode.getText().toString();
        VehicleCode = etVehicleCode.getText().toString();
        vehicleNumber = etVehicleNumber.getText().toString();
        vipvehicleNumber = vipVehicleNumber.getText().toString();
        vipInfo = vipinfo.getText().toString();
        //  otp_VehicleNumber = otpVehicleNumber.getText().toString();
        Log.e(TAG, "validate: tagID        " + tagID);
        if (userType.equals("VIP")) {
            if (AppConstants.isBlank(vipvehicleNumber)) {
                chechIn();
//                vipVehicleNumber.requestFocus();
//                Toast.makeText(MainActivity.this, "Enter Vehicle number required", Toast.LENGTH_SHORT).show();
            } else {
                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                } else {
                    if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                        Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                    } */
/*else if (tagID.equals("")) {
                        Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                    }*//*
 else {
                        apiCall();
                    }
                }

            }
        } else {
            if (userType.equals("Online")) {
                //apiCall();
                if (AppConstants.isBlank(otpVehicleNumber.getText().toString())) {
                    otpVehicleNumber.requestFocus();
                    Toast.makeText(MainActivityNew.this, "Enter OTP required", Toast.LENGTH_SHORT).show();
                } else {
                    if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                        Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                    } */
/*else if (tagID.equals("")) {
                        Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                    } *//*
 else {
                        apiCall();
                    }
                }
            } else {
                chechIn();
            }
        }
    }

    public void chechIn() {
       */
/* if (AppConstants.isBlank(tagID)) {
            showAlert("Please scan card");
            // etVehicleNumber.requestFocus();
        } else*//*

        if (AppConstants.isBlank(vehicleNumber)) {
            showAlert("Valid vehicle number required");
            etVehicleNumber.requestFocus();
        } else if (etVehicleNumber.getText().toString().length() < 4) {
            AppConstants.showToast(MainActivityNew.this, "Vehicle number should be 4 digit");
            etVehicleNumber.requestFocus();
        } else {
            if (!AppConstants.isBlank(mobileNumber) || !AppConstants.isBlank(StateCode) || !AppConstants.isBlank(CityCode) || !AppConstants.isBlank(VehicleCode)) {
                if (etMobileNo.getText().toString().length() > 0) {
                    if (etMobileNo.getText().toString().length() < 10) {
                        showAlert("Mobile number should be 10 digits");
                        etMobileNo.requestFocus();
                    } else {
                        if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                            Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                        } */
/*else if (tagID.equals("")) {
                            Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                        } *//*
 else {
                            apiCall();
                        }
                    }
                } else {
                    if (etStateCode.getText().toString().length() > 0) {
                        if (etStateCode.getText().toString().length() < 2) {
                            showAlert("State Code should be 2 letters");
                            etStateCode.requestFocus();
                        } else {
                            if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                            } */
/*else if (tagID.equals("")) {
                                Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                            } *//*
 else {
                                apiCall();
                            }
                        }
                    } else {
                        if (etCityCode.getText().toString().length() > 0) {
                            if (etCityCode.getText().toString().length() < 2) {
                                showAlert("CityCode Code should be 2 digits");
                                etCityCode.requestFocus();
                            } else {
                                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                } */
/*else if (tagID.equals("")) {
                                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                }*//*
 else {
                                    apiCall();
                                }
                            }
                        } else {
                            if (etVehicleCode.getText().toString().length() > 0) {
                                if (etVehicleCode.getText().toString().length() < 2) {
                                    showAlert("Vehicle Code should be 2 digits");
                                    etVehicleCode.requestFocus();
                                } else {
                                    if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                        Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                    }*/
/* else if (tagID.equals("")) {
                                        Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                    }*//*
 else {
                                        apiCall();
                                    }
                                }
                            } else {
                                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                } */
/*else if (tagID.equals("")) {
                                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                }*//*
 else {
                                    apiCall();
                                }
                            }
                        }
                    }
                }
            } else {
                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                } */
/*else if (tagID.equals("")) {
                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                } *//*
 else {
                    apiCall();
                }
            }
        }
    }

    private void validate1() {

        mobileNumber = etMobileNo.getText().toString();
        StateCode = etStateCode.getText().toString();
        CityCode = etCityCode.getText().toString();
        VehicleCode = etVehicleCode.getText().toString();
        vehicleNumber = etVehicleNumber.getText().toString();
        vipvehicleNumber = vipVehicleNumber.getText().toString();
        vipInfo = vipinfo.getText().toString();
        // otp_VehicleNumber = otpVehicleNumber.getText().toString();

        if (userType.equals("VIP")) {
            if (AppConstants.isBlank(vipvehicleNumber)) {
                chechOut();
//                vipVehicleNumber.requestFocus();
//                Toast.makeText(MainActivity.this, "Enter Vehicle number required", Toast.LENGTH_SHORT).show();
            } else {
                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                } */
/*else if (tagID.equals("")) {
                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                }*//*
 else {
                    apiCallCheckOut();
                }

            }
        } else {
            if (userType.equals("Online")) {
                //apiCallCheckOut();
                if (AppConstants.isBlank(otpVehicleNumber.getText().toString())) {
                    otpVehicleNumber.requestFocus();
                    Toast.makeText(MainActivityNew.this, "Enter OTP required", Toast.LENGTH_SHORT).show();
                } else {
                    if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                        Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                    }*/
/* else if (tagID.equals("")) {
                        Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                    }*//*
 else {
                        apiCallCheckOut();
                    }

                }
            } else {
                chechOut();
            }
        }
    }

    public void chechOut() {
        if (AppConstants.isBlank(vehicleNumber)) {
            showAlert("Valid vehicle number required");
            etVehicleNumber.requestFocus();
        } else if (etVehicleNumber.getText().toString().length() < 4) {
            AppConstants.showToast(MainActivityNew.this, "Vehicle number should be 4 digit");
            etVehicleNumber.requestFocus();
        } else {
            if (!AppConstants.isBlank(mobileNumber) || !AppConstants.isBlank(StateCode) || !AppConstants.isBlank(CityCode) || !AppConstants.isBlank(VehicleCode)) {
                if (etMobileNo.getText().toString().length() > 0) {
                    if (etMobileNo.getText().toString().length() < 10) {
                        showAlert("Mobile number should be 10 digits");
                        etMobileNo.requestFocus();
                    } else {
                        if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                            Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                        }*/
/* else if (tagID.equals("")) {
                            Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                        }*//*
 else {
                            apiCallCheckOut();
                        }

                    }
                } else {
                    if (etStateCode.getText().toString().length() > 0) {
                        if (etStateCode.getText().toString().length() < 2) {
                            showAlert("State Code should be 2 letters");
                            etStateCode.requestFocus();
                        } else {
                            if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                            }*/
/* else if (tagID.equals("")) {
                                Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                            } *//*
 else {
                                apiCallCheckOut();
                            }

                        }
                    } else {
                        if (etCityCode.getText().toString().length() > 0) {
                            if (etCityCode.getText().toString().length() < 2) {
                                showAlert("CityCode Code should be 2 digits");
                                etCityCode.requestFocus();
                            } else {
                                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                } */
/*else if (tagID.equals("")) {
                                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                } *//*
 else {
                                    apiCallCheckOut();
                                }

                            }
                        } else {
                            if (etVehicleCode.getText().toString().length() > 0) {
                                if (etVehicleCode.getText().toString().length() < 2) {
                                    showAlert("Vehicle Code should be 2 digits");
                                    etVehicleCode.requestFocus();
                                } else {
                                    if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                        Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                    } */
/*else if (tagID.equals("")) {
                                        Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                    }*//*
 else {
                                        apiCallCheckOut();
                                    }

                                }
                            } else {
                                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                                } */
/*else if (tagID.equals("")) {
                                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                                } *//*
 else {
                                    apiCallCheckOut();
                                }

                            }
                        }
                    }
                }
            } else {
                if (parkingType12.equals("2Wheeler,4Wheeler,3Wheeler")) {
                    Toast.makeText(this, "Please select any wheeler type!", Toast.LENGTH_SHORT).show();
                } */
/*else if (tagID.equals("")) {
                    Toast.makeText(this, "Please Scan card!", Toast.LENGTH_SHORT).show();

                } *//*
 else {
                    apiCallCheckOut();
                }

            }
        }
    }

    private void apiCall() {
        String vehicleNo;
        if (userType.equals("VIP")) {
            vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            // vehicleNo = vipvehicleNumber;
        } else {
            if (userType.equals("Online")) {
                // vehicleNo = vipvehicleNumber;
                vehicleNo = otpVehicleNumber.getText().toString();
                // vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            } else {
                vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            }
            // vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
        }

        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
            if (userType.equals("VIP")) {
                if (!vipinfo.getText().toString().equals("")) {
                    //vehicleCheckIn(parkingId, parkingType12, vehicleNo, agentId, userType, mobileNumber, tagID, vipInfo);
                    */
/* String urlData = AppConstants.BASEURL + "parking/checkin?parkingId=" + parkingId + "&parkingType=" + parkingType + "&vehicleNo=" + vehicleNo + "&agentId="
                + agentId + "&mode=" + mode + "&userdata=" + userdata + "&cardNo=" + cardNo + "&vipInfo=" + vipInfo;
*//*

                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    parkingType12 = sharedpref.getString("VehicleType1", "");

                    String url = AppConstants.BASEURL + "parking/checkin";
                    Map<String, String> parameterData = new HashMap<>();
                    parameterData.put(("parkingId"), getParkingID);
                    parameterData.put(("parkingType"), parkingType12);
                    parameterData.put(("vehicleNo"), vehicleNo);
                    parameterData.put(("agentId"), agentId);
                    parameterData.put(("mode"), userType);
                    parameterData.put(("userdata"), mobileNumber);
                    parameterData.put(("cardNo"), tagID);
                    parameterData.put(("vipInfo"), vipInfo);
                    parameterData.put(("gateId"), GateId);

                    vehicleCheckInServices(url, parameterData);
                    Log.e(TAG, "apiCall:url-- " + url);
                    Log.e(TAG, "apiCall:parameterData- " + parameterData);
                } else {
                    Toast.makeText(MainActivityNew.this, "Enter VIP Info", Toast.LENGTH_SHORT).show();
                    vipinfo.requestFocus();
                }
            } else {
                sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                parkingType12 = sharedpref.getString("VehicleType1", "");

                String url = AppConstants.BASEURL + "parking/checkin";
                Map<String, String> parameterData = new HashMap<>();
                parameterData.put(("parkingId"), getParkingID);
                parameterData.put(("parkingType"), parkingType12);
                parameterData.put(("vehicleNo"), vehicleNo);
                parameterData.put(("agentId"), agentId);
                parameterData.put(("mode"), userType);
                parameterData.put(("userdata"), mobileNumber);
                parameterData.put(("cardNo"), tagID);
                parameterData.put(("vipInfo"), vipInfo);
                parameterData.put(("gateId"), GateId);
                vehicleCheckInServices(url, parameterData);
                Log.e(TAG, "apiCall:url-- " + url);
                Log.e(TAG, "apiCall:parameterData- " + parameterData);
                //   vehicleCheckIn(parkingId, parkingType12, vehicleNo, agentId, userType, mobileNumber, tagID, vipInfo);
            }
        } else {
            NoIternetConnection(MainActivityNew.this);
        }
    }

    private void apiCallCheckOut() {

        String vehicleNo;
        if (userType.equals("VIP")) {
            vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            // vehicleNo = vipvehicleNumber;
        } else {
            if (userType.equals("Online")) {
                vehicleNo = otpVehicleNumber.getText().toString();
            } else {
                vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            }
            //vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
        }

        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
            parkingType12 = sharedpref.getString("VehicleType1", "");
            // String vehicleNo = StateCode + CityCode + VehicleCode + vehicleNumber;
            //    vehicleCheckOut(getParkingID, parkingType12, vehicleNo, agentId, userType, mobileNumber, tagID, vipInfo);
            vehicleCheckOutt(getParkingID, agentId, vehicleNo, userType, GateId, tagID);
        } else {
            NoIternetConnection(MainActivityNew.this);
        }
    }

    private void showAlert(String message) {
        AppConstants.showToast(MainActivityNew.this, message);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();

        }
    }

    public void availableSlotSevice(final String parkingId, final String parkingType, final String agentId) {
        Log.e(TAG, "availableSlotSevice: ");
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=1&parkingType=2W*//*

        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=2&parkingType=2Wheeler&agentId=9*//*


        String urlData = AppConstants.BASEURL + "parking/inventory?parkingId=" + parkingId + "&parkingType=" + parkingType + "&agentId=" + agentId;
        Log.e(TAG, "availableSlotSevice: urlData ---- " + urlData);
        Log.e(TAG, "availableSlotSevice: parkingType ---- " + parkingType);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse: " + response.toString());
                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {

                        JSONObject availableresponce = response.getJSONObject("data");

                        // JSONObject loginresponce = response.getJSONObject("data");

                        AvailableSlotModel availableSlotModel = new AvailableSlotModel();
                        availableSlotModel.setParkingId(availableresponce.getString("parkingId"));
                        availableSlotModel.setParkingType(availableresponce.getString("parkingType"));
                        availableSlotModel.setBookedSlots(availableresponce.getString("bookedSlots"));
                        availableSlotModel.setAvailableSlots(availableresponce.getString("availableSlots"));

                       */
/* if (parkingType.equals("2W")){
                            tvAvailableSpots.setText(availableresponce.getString("availableSlots"));
                            tvTotalSpots.setText(availableresponce.getString("bookedSlots"));
                        }*//*

                        tvAvailableSpots.setText(availableresponce.getString("availableSlots"));
                        tvTotalSpots.setText(availableresponce.getString("bookedSlots"));


                        pDialog.dismiss();


                    } else {
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/inventory?parkingId=");
                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/inventory?parkingId=");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                // Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;

                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");
                    Log.e(TAG, "onErrorResponse:---------------============== " + error.toString());
                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);

    }

    public void ParkingListApiCall(final String parkingId) {
        Log.e(TAG, "ParkingListApiCall: ");
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=1&parkingType=2W*//*

        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=2&parkingType=2Wheeler&agentId=9*//*


        String urlData = AppConstants.BASEURL + "parking/type_list?parkingId=" + parkingId;
        Log.e(TAG, "ParkingListApiCall: urlData ---- " + urlData);
        Log.e(TAG, "ParkingListApiCall: parkingType ---- " + parkingId);
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


                        //   Toast.makeText(DetailActivity.this, message, Toast.LENGTH_SHORT).show();

                        for (int i = 0; i < arrayObj.length(); i++) {

                            JSONObject jsonObject = arrayObj.getJSONObject(i);


                            ParkingModel availableSlotModel = new ParkingModel();
                            availableSlotModel.setId(jsonObject.getInt("id"));
                            availableSlotModel.setName(jsonObject.getString("name"));
                            Log.e(TAG, "onResponse:ParkingListApiCall name=== " + jsonObject.getString("name"));
                            parkingModels.add(availableSlotModel);

                        }
                        for (int i = 1; i < parkingModels.size(); i++) {
                            Log.e(TAG, "onCreate:-- " + parkingModels.get(i).getName());
                        }
                        Log.e(TAG, "showVehicleType:parkings.length " + parkingModels.size());

                        addRadioButtons(parkingModels.size());
                        // JSONObject loginresponce = response.getJSONObject("data");


                        pDialog.dismiss();


                    } else {
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/inventory?parkingId=");
                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/inventory?parkingId=");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                // Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;

                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");
                    Log.e(TAG, "onErrorResponse:---------------============== " + error.toString());
                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wifi.setWifiEnabled(true);
                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/inventory?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);

    }

    public void logOut(String AgentId, String parkingId) {
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);


        */
/*http://api.parkoye.com/index.php/parking/transaction_detail?userdata&parkingId=4&agentId=111&transactionId=389&vehicleNo=DL11CZ7000&mode=Normal*//*


        String urlData = AppConstants.BASEURL + "user/logout?userId=" + AgentId + "&parkingId=" + parkingId;

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                urlData, null, new Response.Listener<JSONObject>() {

            @SuppressLint("WrongConstant")
            @Override
            public void onResponse(JSONObject response) {
                //  Log.d(TAG, response.toString());

                try {
                    // Parsing json object response
                    // response will be a json object
                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");


                    if (status == 0) {

                        JSONObject loginresponce = response.getJSONObject("data");

                        String userId = loginresponce.getString("userId");
                        String isLogOut = loginresponce.getString("isLogOut");

                        getSharedPreferences("opark", Context.MODE_PRIVATE).edit().remove("userContactNo").
                                remove("agentId").remove("userRole").remove("userName").remove("vendorId").remove("parkingName").remove("userId").remove("getParkingID").
                                remove("vendorName").remove("getparkingType").remove("parkingId").remove("vendorName").remove("VehicleType1").remove("tagID").commit();

                        Intent logout_intent1 = new Intent(MainActivityNew.this, Login.class);
                        logout_intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(logout_intent1);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                    }
                    pDialog.dismiss();

                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "user/logout?userId=");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                    // Toast.makeText(context, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
//                pDialog.dismiss();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //  Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                // Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "user/logout?userId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                }
                // hide the progress dialog
                //      pDialog.dismiss();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);


    }

    public void vehicleCheckInServices(String url, final Map<String, String> params) {

        // pDialog.setProgressDrawable(getResources().getDrawable(R.drawable.rinion));
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        try {

            Response.Listener<JSONObject> reponseListener = new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject jsonObject) {
                    processJsonObjectCheckIn(jsonObject);
                    pDialog.dismiss();
                }
            };
            Response.ErrorListener errorListener = new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    Log.e("RESPONSE ERROR", volleyError.toString());

                    // Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getActivity(), "error==>  " + volleyError.toString(), Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                    if (volleyError instanceof NetworkError) {
                       */
/* sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. Network Error !",
                                Toast.LENGTH_SHORT).show();*//*

                    } else if (volleyError instanceof ServerError) {
                       */
/* sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. Server error!",
                                Toast.LENGTH_SHORT).show();*//*

                    } else if (volleyError instanceof AuthFailureError) {
                      */
/*  sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. AuthFailureError error!",
                                Toast.LENGTH_SHORT).show();*//*

                    } else if (volleyError instanceof ParseError) {
                       */
/* sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. Parse Error !",
                                Toast.LENGTH_SHORT).show();*//*

                    } else if (volleyError instanceof NoConnectionError) {
                       */
/* sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. No Connection Error !",
                                Toast.LENGTH_SHORT).show();*//*

                    } else if (volleyError instanceof TimeoutError) {
                       */
/* sendError(volleyError.toString(), "parking/pass_add");
                        Toast.makeText(MainActivity.this,
                                "Oops. Timeout Error!",
                                Toast.LENGTH_SHORT).show();*//*

                    }

                }
            };
            CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, url, params, reponseListener, errorListener);
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(jsObjRequest);
        } catch (Exception e) {
            Log.e("RESPONSE ERROR", e.toString());
            VolleyLog.d("RESPONSE ERROR", e.toString());
            sendError(e.toString(), "parking/pass_add");
            pDialog.dismiss();
        }
    }

    private void processJsonObjectCheckIn(JSONObject response) {

        if (response != null) {
            Log.e(TAG, "----=====Response--======" + response);

            try {
                String data = String.valueOf(response.get("data"));
                String message = String.valueOf(response.get("message"));
                int status = response.getInt("status");
                // String responce = json.getJSONArray("RESPONSE");
                Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show();
                if (status == 0) {
                    updateToolBar();
                  */
/*  etStateCode.setEnabled(false);
                    etCityCode.setEnabled(false);
                    etVehicleCode.setEnabled(false);
                    etVehicleNumber.setEnabled(false);
                    vipVehicleNumber.setEnabled(false);
                    etMobileNo.setEnabled(false);

                    etStateCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    etCityCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    etVehicleCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    etMobileNo.setBackgroundColor(getResources().getColor(R.color.light_grey));
                    btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                    btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));*//*
*/
/* etStateCode.setFocusable(false);
                    etCityCode.setFocusable(false);
                    etVehicleCode.setFocusable(false);
                    etVehicleNumber.setFocusable(false);
                    vipVehicleNumber.setFocusable(false);*//*

                    etVehicleNumber.setText("");
                    JSONObject checkINresponce = response.getJSONObject("data");
                    CheckInModel checkInModel = new CheckInModel();
                    tagID = "";
                    checkInModel.setReceiptHeading(checkINresponce.getString("receiptHeading"));
                    checkInModel.setParkingAddress(checkINresponce.getString("parkingAddress"));
                    checkInModel.setUserContactNo(checkINresponce.getString("userContactNo"));
                    checkInModel.setCheckInDate(checkINresponce.getString("checkInDate"));
                    checkInModel.setAgentId(checkINresponce.getString("agentId"));
                    checkInModel.setAvailableSlots(checkINresponce.getString("availableSlots"));
                    checkInModel.setParkingId(checkINresponce.getString("parkingId"));
                    checkInModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                    checkInModel.setParkingRate(checkINresponce.getString("parkingRate"));
                    checkInModel.setAdditionalParkingRate(checkINresponce.getString("additionalParkingRate"));
                    checkInModel.setMode(checkINresponce.getString("mode"));
                    checkInModel.setReceiptStaticText(checkINresponce.getString("receiptStaticText"));
                    checkInModel.setReceiptEmail(checkINresponce.getString("receiptEmail"));
                    checkInModel.setReceiptMobile(checkINresponce.getString("receiptMobile"));
                    checkInModel.setReceiptWebsite(checkINresponce.getString("receiptWebsite"));
                    checkInModel.setOnlineUserText(checkINresponce.getString("onlineUserText"));
                    //checkInModel.setBarcode(checkINresponce.getString("barcode"));
                    checkInModel.setResponseType(checkINresponce.getString("responseType"));
                    checkInModel.setParkingType(checkINresponce.getString("parkingType"));
                    checkInModel.setCompanyWebsite(checkINresponce.getString("companyWebsite"));
                    checkInModel.setPoweredBy(checkINresponce.getString("poweredBy"));
                    checkInModel.setReceiptNo(checkINresponce.getString("receiptNo"));
                    checkInModel.setQrCode(checkINresponce.getString("barCode"));
                    checkInModel.setAgentName(checkINresponce.getString("agentName"));
                    checkInModel.setCardNo(checkINresponce.getString("cardNo"));
                    checkInModel.setLastLine(checkINresponce.getString("lastLine"));

                    //  Toast.makeText(MainActivity.this, "Parking Done!" + message, Toast.LENGTH_SHORT).show();


                    getReceiptHeading = checkInModel.getReceiptHeading();
                    getParkingAddress = checkInModel.getParkingAddress();
                    getCheckInDate = checkInModel.getCheckInDate();
                    getVehicleNo = checkInModel.getVehicleNo();
                    getParkingRate = checkInModel.getParkingRate();
                    getAdditionalParkingRate = checkInModel.getAdditionalParkingRate();
                    getQrCode = checkInModel.getQrCode();
                    getAgentName = checkInModel.getAgentName();
                    getReceiptMobile = checkInModel.getReceiptMobile();
                    getPoweredBy = checkInModel.getPoweredBy();
                    getCompanyWebsite = checkInModel.getCompanyWebsite();
                    getReceiptNo = checkInModel.getReceiptNo();
                    ReceiptStaticText = checkInModel.getReceiptStaticText();
                    barCode = checkInModel.getQrCode();
                    onlineUserText = checkInModel.getOnlineUserText();
                    lastLine = checkInModel.getLastLine();
                    String cardNo = checkInModel.getCardNo();
                    String mobile = checkInModel.getUserContactNo();

                    SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = storeAllValues.edit();
                    editor.putString("parkingPrint", "checkInModel");
                    editor.apply();
                    editor.commit();


                    sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                    ed = sharedpref.edit();
                    ed.putString("mobile", mobile);


                    ed.apply();
                    ed.commit();

                    if (cardNo.equals("")) {
                        printReceipt();
                    } else {
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                        etStateCode.setText("");
                        etCityCode.setText("");
                        etVehicleCode.setText("");
                        //etVehicleNumber.setText("");
                        vipVehicleNumber.setText("");
                        otpVehicleNumber.setText("");
                        etMobileNo.setText("");
                        vipinfo.setText("");
                        tagID = "";
                        availableSlotSevice(parkingId, parkingType12, agentId);

                    }
                    Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    // pDialog.dismiss();

                } else {
                    if (message.equals("Card already Used for " +
                            ". Checkout first and then use again !")) {
                        etStateCode.setText("");
                        etCityCode.setText("");
                        etVehicleCode.setText("");
                        //   etVehicleNumber.setText("");
                        vipVehicleNumber.setText("");
                        etMobileNo.setText("");
                        otpVehicleNumber.setText("");
                        vipinfo.setText("");
                        tagID = "";
                        availableSlotSevice(parkingId, parkingType12, agentId);
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    } else {
                        //Vehicle already parked !
                        etStateCode.setText("");
                        etCityCode.setText("");
                        etVehicleCode.setText("");
                        etVehicleNumber.setText("");
                        vipVehicleNumber.setText("");
                        etMobileNo.setText("");
                        otpVehicleNumber.setText("");
                        vipinfo.setText("");
                        tagID = "";
                        etVehicleNumber.requestFocus();
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                    }
                }


            } catch (NullPointerException e) {
               */
/* sendError(e.toString(), "parking/checkin?parkingId=");
                Toast.makeText(MainActivity.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                e.printStackTrace();*//*

                // pDialog.dismiss();
            } catch (JSONException e) {
               */
/* e.printStackTrace();
                sendError(e.toString(), "parking/checkin?parkingId=");
                Toast.makeText(MainActivity.this, "Technical Error...", Toast.LENGTH_SHORT).show();
               *//*
 // pDialog.dismiss();
            }
        }
    }

    public void vehicleCheckIn(final String parkingId, String parkingType, String vehicleNo, final String agentId, String mode, String userdata, String cardNo, String vipInfo) {
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        */
/*http://staggingapi.opark.in/index.php/v1/parking/inventory?parkingId=1&parkingType=2W*//*


        */
/*http://staggingapi.opark.in/index.php/v1/parking/checkin?parkingId=9&parkingType=4Wheeler&vehicleNo=1258&agentId=&mode=Normal&userdata=&cardNo=*//*


        String urlData = AppConstants.BASEURL + "parking/checkin?parkingId=" + parkingId + "&parkingType=" + parkingType + "&vehicleNo=" + vehicleNo + "&agentId="
                + agentId + "&mode=" + mode + "&userdata=" + userdata + "&cardNo=" + cardNo + "&vipInfo=" + vipInfo;

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());

                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {

                        JSONObject checkINresponce = response.getJSONObject("data");
                        CheckInModel checkInModel = new CheckInModel();

                        checkInModel.setReceiptHeading(checkINresponce.getString("receiptHeading"));
                        checkInModel.setParkingAddress(checkINresponce.getString("parkingAddress"));
                        checkInModel.setUserContactNo(checkINresponce.getString("userContactNo"));
                        checkInModel.setCheckInDate(checkINresponce.getString("checkInDate"));
                        checkInModel.setAgentId(checkINresponce.getString("agentId"));
                        checkInModel.setAvailableSlots(checkINresponce.getString("availableSlots"));
                        checkInModel.setParkingId(checkINresponce.getString("parkingId"));
                        checkInModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                        checkInModel.setParkingRate(checkINresponce.getString("parkingRate"));
                        checkInModel.setAdditionalParkingRate(checkINresponce.getString("additionalParkingRate"));
                        checkInModel.setMode(checkINresponce.getString("mode"));
                        checkInModel.setReceiptStaticText(checkINresponce.getString("receiptStaticText"));
                        checkInModel.setReceiptEmail(checkINresponce.getString("receiptEmail"));
                        checkInModel.setReceiptMobile(checkINresponce.getString("receiptMobile"));
                        checkInModel.setReceiptWebsite(checkINresponce.getString("receiptWebsite"));
                        checkInModel.setOnlineUserText(checkINresponce.getString("onlineUserText"));
                        //checkInModel.setBarcode(checkINresponce.getString("barcode"));
                        checkInModel.setResponseType(checkINresponce.getString("responseType"));
                        checkInModel.setParkingType(checkINresponce.getString("parkingType"));
                        checkInModel.setCompanyWebsite(checkINresponce.getString("companyWebsite"));
                        checkInModel.setPoweredBy(checkINresponce.getString("poweredBy"));
                        checkInModel.setReceiptNo(checkINresponce.getString("receiptNo"));
                        checkInModel.setQrCode(checkINresponce.getString("barCode"));
                        checkInModel.setAgentName(checkINresponce.getString("agentName"));
                        checkInModel.setCardNo(checkINresponce.getString("cardNo"));
                        checkInModel.setLastLine(checkINresponce.getString("lastLine"));

                        //  Toast.makeText(MainActivity.this, "Parking Done!" + message, Toast.LENGTH_SHORT).show();


                        getReceiptHeading = checkInModel.getReceiptHeading();
                        getParkingAddress = checkInModel.getParkingAddress();
                        getCheckInDate = checkInModel.getCheckInDate();
                        getVehicleNo = checkInModel.getVehicleNo();
                        getParkingRate = checkInModel.getParkingRate();
                        getAdditionalParkingRate = checkInModel.getAdditionalParkingRate();
                        getQrCode = checkInModel.getQrCode();
                        getAgentName = checkInModel.getAgentName();
                        getReceiptMobile = checkInModel.getReceiptMobile();
                        getPoweredBy = checkInModel.getPoweredBy();
                        getCompanyWebsite = checkInModel.getCompanyWebsite();
                        getReceiptNo = checkInModel.getReceiptNo();
                        ReceiptStaticText = checkInModel.getReceiptStaticText();
                        barCode = checkInModel.getQrCode();
                        onlineUserText = checkInModel.getOnlineUserText();
                        lastLine = checkInModel.getLastLine();
                        String cardNo = checkInModel.getCardNo();
                        String mobile = checkInModel.getUserContactNo();

                        SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = storeAllValues.edit();
                        editor.putString("parkingPrint", "checkInModel");
                        editor.apply();
                        editor.commit();


                        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        ed = sharedpref.edit();
                        ed.putString("mobile", mobile);


                        ed.apply();
                        ed.commit();

                        if (cardNo.equals("")) {
                            // printReceipt();
                        } else {
                            Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                            etStateCode.setText("");
                            etCityCode.setText("");
                            etVehicleCode.setText("");
                            etVehicleNumber.setText("");
                            vipVehicleNumber.setText("");
                            otpVehicleNumber.setText("");
                            etMobileNo.setText("");
                            vipinfo.setText("");
                            tagID = "";
                            availableSlotSevice(parkingId, parkingType12, agentId);

                        }
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                        pDialog.dismiss();


                    } else {
                        if (message.equals("Card already Used for Checkin. Checkout first and then use again !")) {
                            etStateCode.setText("");
                            etCityCode.setText("");
                            etVehicleCode.setText("");
                            etVehicleNumber.setText("");
                            vipVehicleNumber.setText("");
                            etMobileNo.setText("");
                            otpVehicleNumber.setText("");
                            vipinfo.setText("");
                            tagID = "";
                            availableSlotSevice(parkingId, parkingType12, agentId);
                            Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                        } else {
                            //Vehicle already parked !
                            etStateCode.setText("");
                            etCityCode.setText("");
                            etVehicleCode.setText("");
                            etVehicleNumber.setText("");
                            vipVehicleNumber.setText("");
                            etMobileNo.setText("");
                            otpVehicleNumber.setText("");
                            vipinfo.setText("");
                            tagID = "";
                            etVehicleNumber.requestFocus();
                            Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                        }

                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    Log.d("JSONException", e + "");

                    //Send Error in Server
                    sendError(e.toString(), "parking/checkin?parkingId=");

                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();

                    //Send Error in Server
                    sendError(e.toString(), "parking/checkin?parkingId=");

                    Log.d("NullPointerException", e + "");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());

                // Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();

                //Send Error in Server
                // hide the progress dialog
                Log.d("VolleyLog", error + "");
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/checkin?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }

    public void vehicleCheckOutt(String getParkingID, String agentId, String vehicleNo, String userType, String gateId, String tagID) {
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
        */
/*http://staggingapi.opark.in/index.php/v1/parking/checkout?parkingId=1&parkingType=4Wheeler&vehicleNo=6565&agentId=3&mode=Normal&userdata=9993289838*//*


        String urlData = AppConstants.BASEURL + "parking/checkout?parkingId=" + getParkingID + "&vehicleNo=" + vehicleNo + "&agentId="
                + agentId + "&userdata=" + mobileNumber + "&cardNo=" + tagID + "&gateId=" + GateId + "&mode=" + userType + "&parkingType=" + parkingType12;//("parkingType"), parkingType12
        Log.e(TAG, "vehicleCheckOut: urlData--==========" + urlData);
        Log.e(TAG, "vehicleCheckOut: urlData--==========" + mobileNumber);
        Log.e(TAG, "vehicleCheckOut: urlData--==========" + userType);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse: ====" + response.toString());

                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {
                      */
/*  etStateCode.setEnabled(false);
                        etCityCode.setEnabled(false);
                        etVehicleCode.setEnabled(false);
                        etVehicleNumber.setEnabled(false);
                        vipVehicleNumber.setEnabled(false);
                        etMobileNo.setEnabled(false);

                        etStateCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etCityCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etVehicleCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etMobileNo.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                        btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                     *//*
   // etStateCode.setFocusable(false);
                        updateToolBar();
                        Toast.makeText(MainActivityNew.this, "" + message, Toast.LENGTH_SHORT).show();
                        //  availableSlotSevice(parkingId, parkingType1234);
                        MainActivityNew.this.tagID = "";
                        JSONObject checkINresponce = response.getJSONObject("data");

                        CheckOutModel checkOutModel = new CheckOutModel();

                        String rh = checkINresponce.getString("receiptHeading");

                        checkOutModel.setReceiptHeading(checkINresponce.getString("receiptHeading"));
                        checkOutModel.setParkingAddress(checkINresponce.getString("parkingAddress"));
                        checkOutModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                        checkOutModel.setCheckInDate(checkINresponce.getString("checkInDate"));
                        checkOutModel.setCheckOutDate(checkINresponce.getString("checkOutDate"));
                        checkOutModel.setCheckInTime(checkINresponce.getString("checkInTime"));
                        checkOutModel.setCheckOutTime(checkINresponce.getString("checkOutTime"));
                        checkOutModel.setDuration(checkINresponce.getString("duration"));
                        checkOutModel.setDurationUnit(checkINresponce.getString("durationUnit"));
                        checkOutModel.setGrandTotal(checkINresponce.getString("grandTotal"));
                        checkOutModel.setCurrencySymbol(checkINresponce.getString("currencySymbol"));
                        checkOutModel.setUserContactNo(checkINresponce.getString("userContactNo"));
                        checkOutModel.setAgentId(checkINresponce.getString("agentId"));
                        checkOutModel.setAvailableSlots(checkINresponce.getString("availableSlots"));
                        checkOutModel.setParkingId(checkINresponce.getString("parkingId"));
                        checkOutModel.setParkingRate(checkINresponce.getString("parkingRate"));
                        checkOutModel.setTotal(checkINresponce.getString("total"));
                        checkOutModel.setMode(checkINresponce.getString("mode"));
                        checkOutModel.setOnlineUserText(checkINresponce.getString("onlineUserText"));
                        //  checkOutModel.setBarcode(checkINresponce.getString("barCode"));
                        checkOutModel.setResponseType(checkINresponce.getString("responseType"));
                        checkOutModel.setMinimumAmount(checkINresponce.getString("minimumAmount"));
                        checkOutModel.setParkingType(checkINresponce.getString("parkingType"));
                        checkOutModel.setCompanyWebsite(checkINresponce.getString("companyWebsite"));
                        checkOutModel.setPoweredBy(checkINresponce.getString("poweredBy"));
                        checkOutModel.setReceiptNo(checkINresponce.getString("receiptNo"));
                        checkOutModel.setCardNo(checkINresponce.getString("cardNo"));
                        checkOutModel.setPrintReceipt(checkINresponce.getString("printReceipt"));


                        String heading = checkOutModel.getReceiptHeading();
                        String cardNo = checkINresponce.getString("cardNo");

                        getReceiptHeadingOut = checkOutModel.getReceiptHeading();
                        getParkingAddressOut = checkOutModel.getParkingAddress();
                        getVehicleNoOut = checkOutModel.getVehicleNo();
                        getCheckInDateOut = checkOutModel.getCheckInDate();
                        getCheckOutDateOut = checkOutModel.getCheckOutDate();
                        getduration = checkOutModel.getDuration();
                        getDurationUnit = checkOutModel.getDurationUnit();
                        getCurrencySymbol = checkOutModel.getCurrencySymbol();
                        getGrandTotal = checkOutModel.getGrandTotal();
                        getPoweredByOut = checkOutModel.getPoweredBy();
                        getReceiptNoOut = checkOutModel.getReceiptNo();
                        getCompanyWebsiteOut = checkOutModel.getCompanyWebsite();
                        getprintReceipt = checkOutModel.getPrintReceipt();
                        onlineUserText = checkOutModel.getOnlineUserText();
                        Log.e(TAG, "onResponse: getprintReceipt " + getprintReceipt);
                        SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = storeAllValues.edit();

                        editor.putString("parkingPrint", "checkOUTModel");
                        editor.apply();
                        editor.commit();

                        if (getprintReceipt.equals("no")) {
                            //  printReceipt();
                            Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                            etStateCode.setText("");
                            etCityCode.setText("");
                            etVehicleCode.setText("");
                            etVehicleNumber.setText("");
                            vipVehicleNumber.setText("");
                            etMobileNo.setText("");
                            //linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            MainActivityNew.this.tagID = "";

                            availableSlotSevice(parkingId, parkingType12, MainActivityNew.this.agentId);
                        } else if (cardNo.equals("")) {
                            printReceipt();
                        } else if (getprintReceipt.equals("yes")) {
                            printReceipt();
                        } else {

                            if (getprintReceipt.equals("yes")) {
                                printReceipt();
                            } else {
                                Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                                etStateCode.setText("");
                                etCityCode.setText("");
                                etVehicleCode.setText("");
                                etVehicleNumber.setText("");
                                vipVehicleNumber.setText("");
                                etMobileNo.setText("");
                                //  linearTypeSelect.setVisibility(View.VISIBLE);
                                radioGroup.setVisibility(View.VISIBLE);
                                etMobileNo.setVisibility(View.VISIBLE);

                                MainActivityNew.this.tagID = "";
                                availableSlotSevice(parkingId, parkingType12, MainActivityNew.this.agentId);
                            }

                            //cleareText();
                        }
                        // printReceipt();
                        pDialog.dismiss();


                    } else {
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
                        etStateCode.setText("");
                        etCityCode.setText("");
                        etVehicleCode.setText("");
                        etVehicleNumber.setText("");
                        vipVehicleNumber.setText("");
                        etMobileNo.setText("");
                        // linearTypeSelect.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.VISIBLE);
                        etMobileNo.setVisibility(View.VISIBLE);

                        MainActivityNew.this.tagID = "";
                        //cleareText();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/checkout?parkingId=");
                    Log.d("NullPointerException", e + "");
                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    cleareText();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    cleareText();
                    sendError(e.toString(), "parking/checkout?parkingId=");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    Log.d("JSONException", e + "");
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                Log.d("Response error", error + "");
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }
*/
/*
public void vehicleCheckOut(final String parkingId, String parkingType, String vehicleNo, final String agentId, String mode, String userdata, String cardNo, String vipInfo) {
        final ProgressDialog pDialog = new ProgressDialog(MainActivity.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);
         *//*

    */
/*http://staggingapi.opark.in/index.php/v1/parking/checkout?parkingId=1&parkingType=4Wheeler&vehicleNo=6565&agentId=3&mode=Normal&userdata=9993289838*//*
*/
/*


        String urlData = AppConstants.BASEURL + "parking/checkout?parkingId=" + parkingId + "&parkingType=" + parkingType + "&vehicleNo=" + vehicleNo + "&agentId="
                + agentId + "&mode=" + mode + "&userdata=" + userdata + "&cardNo=" + cardNo + "&vipInfo=" + vipInfo + "&gateId=" + GateId;
        Log.e(TAG, "vehicleCheckOut: urlData--==========" + urlData);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse: ====" + response.toString());

                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {
                        etStateCode.setEnabled(false);
                        etCityCode.setEnabled(false);
                        etVehicleCode.setEnabled(false);
                        etVehicleNumber.setEnabled(false);
                        vipVehicleNumber.setEnabled(false);
                        etMobileNo.setEnabled(false);

                        etStateCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etCityCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etVehicleCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        etMobileNo.setBackgroundColor(getResources().getColor(R.color.light_grey));
                        btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                        btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                        // etStateCode.setFocusable(false);

                        Toast.makeText(MainActivity.this, "" + message, Toast.LENGTH_SHORT).show();
                        //  availableSlotSevice(parkingId, parkingType1234);
                        tagID = "";
                        JSONObject checkINresponce = response.getJSONObject("data");

                        CheckOutModel checkOutModel = new CheckOutModel();

                        String rh = checkINresponce.getString("receiptHeading");

                        checkOutModel.setReceiptHeading(checkINresponce.getString("receiptHeading"));
                        checkOutModel.setParkingAddress(checkINresponce.getString("parkingAddress"));
                        checkOutModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                        checkOutModel.setCheckInDate(checkINresponce.getString("checkInDate"));
                        checkOutModel.setCheckOutDate(checkINresponce.getString("checkOutDate"));
                        checkOutModel.setCheckInTime(checkINresponce.getString("checkInTime"));
                        checkOutModel.setCheckOutTime(checkINresponce.getString("checkOutTime"));
                        checkOutModel.setDuration(checkINresponce.getString("duration"));
                        checkOutModel.setDurationUnit(checkINresponce.getString("durationUnit"));
                        checkOutModel.setGrandTotal(checkINresponce.getString("grandTotal"));
                        checkOutModel.setCurrencySymbol(checkINresponce.getString("currencySymbol"));
                        checkOutModel.setUserContactNo(checkINresponce.getString("userContactNo"));
                        checkOutModel.setAgentId(checkINresponce.getString("agentId"));
                        checkOutModel.setAvailableSlots(checkINresponce.getString("availableSlots"));
                        checkOutModel.setParkingId(checkINresponce.getString("parkingId"));
                        checkOutModel.setParkingRate(checkINresponce.getString("parkingRate"));
                        checkOutModel.setTotal(checkINresponce.getString("total"));
                        checkOutModel.setMode(checkINresponce.getString("mode"));
                        checkOutModel.setOnlineUserText(checkINresponce.getString("onlineUserText"));
                        //  checkOutModel.setBarcode(checkINresponce.getString("barCode"));
                        checkOutModel.setResponseType(checkINresponce.getString("responseType"));
                        checkOutModel.setMinimumAmount(checkINresponce.getString("minimumAmount"));
                        checkOutModel.setParkingType(checkINresponce.getString("parkingType"));
                        checkOutModel.setCompanyWebsite(checkINresponce.getString("companyWebsite"));
                        checkOutModel.setPoweredBy(checkINresponce.getString("poweredBy"));
                        checkOutModel.setReceiptNo(checkINresponce.getString("receiptNo"));
                        checkOutModel.setCardNo(checkINresponce.getString("cardNo"));
                        checkOutModel.setPrintReceipt(checkINresponce.getString("printReceipt"));


                        String heading = checkOutModel.getReceiptHeading();
                        String cardNo = checkINresponce.getString("cardNo");

                        getReceiptHeadingOut = checkOutModel.getReceiptHeading();
                        getParkingAddressOut = checkOutModel.getParkingAddress();
                        getVehicleNoOut = checkOutModel.getVehicleNo();
                        getCheckInDateOut = checkOutModel.getCheckInDate();
                        getCheckOutDateOut = checkOutModel.getCheckOutDate();
                        getduration = checkOutModel.getDuration();
                        getDurationUnit = checkOutModel.getDurationUnit();
                        getCurrencySymbol = checkOutModel.getCurrencySymbol();
                        getGrandTotal = checkOutModel.getGrandTotal();
                        getPoweredByOut = checkOutModel.getPoweredBy();
                        getReceiptNoOut = checkOutModel.getReceiptNo();
                        getCompanyWebsiteOut = checkOutModel.getCompanyWebsite();
                        getprintReceipt = checkOutModel.getPrintReceipt();
                        onlineUserText = checkOutModel.getOnlineUserText();
                        Log.e(TAG, "onResponse: getprintReceipt " + getprintReceipt);
                        SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = storeAllValues.edit();

                        editor.putString("parkingPrint", "checkOUTModel");
                        editor.apply();
                        editor.commit();

                        if (getprintReceipt.equals("no")) {
                            //  printReceipt();
                            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                            etStateCode.setText("");
                            etCityCode.setText("");
                            etVehicleCode.setText("");
                            etVehicleNumber.setText("");
                            vipVehicleNumber.setText("");
                            etMobileNo.setText("");
                            tagID = "";

                            availableSlotSevice(parkingId, parkingType12, agentId);
                        } else if (cardNo.equals("")) {
                            printReceipt();
                        } else {

                            if (getprintReceipt.equals("yes")) {
                                printReceipt();
                            } else {
                                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                                etStateCode.setText("");
                                etCityCode.setText("");
                                etVehicleCode.setText("");
                                etVehicleNumber.setText("");
                                vipVehicleNumber.setText("");
                                etMobileNo.setText("");
                                tagID = "";
                                availableSlotSevice(parkingId, parkingType12, agentId);
                            }

                            //cleareText();
                        }

                        //printReceipt();
                        pDialog.dismiss();


                    } else {
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                        etStateCode.setText("");
                        etCityCode.setText("");
                        etVehicleCode.setText("");
                        etVehicleNumber.setText("");
                        vipVehicleNumber.setText("");
                        etMobileNo.setText("");
                        tagID = "";
                        //cleareText();
                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/checkout?parkingId=");
                    Log.d("NullPointerException", e + "");
                    Toast.makeText(MainActivity.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    cleareText();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    cleareText();
                    sendError(e.toString(), "parking/checkout?parkingId=");
                    Toast.makeText(MainActivity.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    Log.d("JSONException", e + "");
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                Log.d("Response error", error + "");
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/checkout?parkingId=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }
*//*


    public void cleareText() {
        etStateCode.setText("");
        etCityCode.setText("");
        etVehicleCode.setText("");
        etVehicleNumber.setText("");
        vipVehicleNumber.setText("");
        etMobileNo.setText("");
        otpVehicleNumber.setText("");
        vipinfo.setText("");
    }

    private void printReceipt() {
        if (printer == null) {
            Toast.makeText(MainActivityNew.this, "No Printer found", Toast.LENGTH_SHORT).show();
            return;
        }

        printer.setOnEventListener(new IPrint.OnEventListener() {

            @Override
            public void onEvent(final int what, String in) {
                // TODO Auto-generated method stub
                final String info = in;

                runOnUiThread(new Runnable() {
                    public void run() {
                        final String message = getPrintErrorInfo(what, info);
                        if (message == null || message.length() < 1) {
                            return;
                        }
                        Toast.makeText(MainActivityNew.this, message, Toast.LENGTH_SHORT).show();
//                        showResultInfo("Print Exception", "Error", message);
                    }
                });


            }
        });
        try {


            printNormal(MainActivityNew.this, printer);

        } catch (Exception e) {

        }

    }

    private String getPrintErrorInfo(int what, String info) {
        String message = "";
        switch (what) {
            case IPrint.EVENT_CONNECT_FAILD:
                message = "Printer Connetion Fail";
                break;
            case IPrint.EVENT_CONNECTED:

                break;
            case IPrint.EVENT_PAPER_JAM:
                message = "Paper Jam";
                break;
            case IPrint.EVENT_UNKNOW:
                message = "Unknow Error";
                break;
            case IPrint.EVENT_STATE_OK:

                break;
            case IPrint.EVENT_OK://

                break;
            case IPrint.EVENT_NO_PAPER:
                message = "No Paper Found";
                break;
            case IPrint.EVENT_HIGH_TEMP:
                message = "High Temp ";
                break;
            case IPrint.EVENT_PRINT_FAILD:
                message = "Print Fail";
                break;
        }

        return message;
    }

    public void printNormal(Context newEntryActivity, Printer printer) {
        sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

        String Gate = sharedpref.getString("Gate", "");
        Log.e(TAG, "printNormal: Gate======" + Gate);
        */
/*sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);
        String parkingPrint = sharedpref.getString("parkingPrint", "");*//*


        SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);

        if (storeAllValues.getString("parkingPrint", "").equals("checkInModel")) {

            CheckInModel checkInModel = new CheckInModel();
            //checkInModel.getReceiptHeading();

            printer.printText("      " + getReceiptHeading, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText(getParkingAddress,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.ITALIC, Printer.Gravity.LEFT);

            printer.printText("---------------", Printer.FontFamily.SONG,
                    Printer.FontSize.EXTRALARGE, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText("     " + getCheckInDate,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.RIGHT);

            printer.printText("VNO. -  " + getVehicleNo,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText(getParkingRate,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText(getAdditionalParkingRate,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText(onlineUserText, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.LEFT);

            printer.printQrCode(barCode, 300, Printer.Gravity.CENTER);

            // printer.printBarCode(barCode,1,100,1);

            printer.printText("", Printer.FontFamily.SONG,
                    Printer.FontSize.SMALL, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            printer.printText("ATTENDANT - " + getAgentName + "\n", Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

           */
/* printer.printText(ReceiptStaticText + "\n", Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.LEFT);
*//*

            printer.printText("Helpline No:" + getReceiptMobile, Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText("          Powered By:-" + "\n" + getPoweredBy, Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText(getCompanyWebsite, Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);

            printer.printText("Receipt No. -  " + getReceiptNo, Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.CENTER);

            printer.printText(lastLine, Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.LEFT);


            printer.printText("\n", Printer.FontFamily.SONG,
                    Printer.FontSize.EXTRALARGE, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            availableSlotSevice(parkingId, parkingType12, agentId);
            cleareText();
        }
        if (storeAllValues.getString("parkingPrint", "").equals("checkOUTModel")) {
            // Toast.makeText(MainActivity.this, "Not Found", Toast.LENGTH_SHORT).show();

            printer.printText(getReceiptHeadingOut, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText(getParkingAddressOut,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.CENTER);

            printer.printText("--------------", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText(onlineUserText, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.LEFT);
//
            printer.printText("VNO.-" + getVehicleNoOut,
                    Printer.FontFamily.SONG, Printer.FontSize.LARGE,
                    Printer.FontStyle.BOLD, Printer.Gravity.RIGHT);

            printer.printText("", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            printer.printText("In-  " + getCheckInDateOut,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.RIGHT);
            printer.printText("Out- " + getCheckOutDateOut,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.RIGHT);

            printer.printText("", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            printer.printText(getduration + " " + getDurationUnit + " " + getCurrencySymbol + " " + String.valueOf(getGrandTotal),
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.LEFT);

            printer.printText("\n", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);
            printer.printText("Powered By:- " + getPoweredByOut,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.LEFT);

            printer.printText(getCompanyWebsiteOut, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            printer.printText("Receipt No. -  " + getReceiptNoOut,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.CENTER);

            printer.printText("\n", Printer.FontFamily.SONG,
                    Printer.FontSize.EXTRALARGE, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            availableSlotSevice(parkingId, parkingType12, agentId);
            cleareText();

        }
        if (storeAllValues.getString("parkingPrint", "").equals(printError)) {
//        }
//        if (printError.equals("yes")) {
            printer.printText(receiptHeading, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);
            printer.printText(parkingAddress,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.CENTER);
           */
/* printer.printText("GATE NO. -  " + Gate,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.BOLD, Printer.Gravity.CENTER);*//*

            printer.printText("--------------", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText(message1, Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.BOLD,
                    Printer.Gravity.CENTER);

            printer.printText("\n", Printer.FontFamily.SONG,
                    Printer.FontSize.MEDIUM, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            printer.printText(poweredBy,
                    Printer.FontFamily.SONG, Printer.FontSize.MEDIUM,
                    Printer.FontStyle.NORMAL, Printer.Gravity.CENTER);

            printer.printText("\n", Printer.FontFamily.SONG,
                    Printer.FontSize.EXTRALARGE, Printer.FontStyle.NORMAL,
                    Printer.Gravity.CENTER);

            cleareText();
        }


    }

    private void initNFC() {

        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mNfcAdapter != null)
            mNfcAdapter.disableForegroundDispatch(this);
    }

    public void id(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("android.nfc.extra.ID");
        Appendable stringBuilder = new StringBuilder(byteArrayExtra.length * 2);
        Formatter formatter = new Formatter(stringBuilder);
        for (int length = byteArrayExtra.length - 1; length > -1; length--) {
            formatter.format("%02X", new Object[]{Byte.valueOf(byteArrayExtra[length])});
        }

        tagID = stringBuilder.toString();
        // Toast.makeText(this, "" + tagID, Toast.LENGTH_SHORT).show();
        // TODO: 12/3/2019
        Log.e(TAG, "id:tagID=================" + tagID);
        AppConstants.setString(MainActivityNew.this, AppConstants.TAGID, tagID);

        Toast.makeText(this, tagID, Toast.LENGTH_SHORT).show();
        if (tagID.equals("")) {
            cleareText();
            //  linearTypeSelect.setVisibility(View.VISIBLE);

           */
/* btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
*//*

            Toast.makeText(this, "Card Not register", Toast.LENGTH_SHORT).show();
        } else {
            cleareText();
            sharedpref = getSharedPreferences("opark", Context.MODE_PRIVATE);

            userTypeData = sharedpref.getString("userType", "");
            Log.e(TAG, "id: userTypeData" + userTypeData);
            if (userTypeData.equals("Normal")) {
                normalUser.setChecked(true);
                vipUser.setChecked(false);
                userType = "Normal";
            } else {
                vipUser.setChecked(true);
                normalUser.setChecked(false);
                userType = "VIP";
                vipinfo.setVisibility(View.VISIBLE);
            }


            if (AppConstants.isNetworkAvailable(MainActivityNew.this)) {
               */
/* etStateCode.setEnabled(true);
                etCityCode.setEnabled(true);
                etVehicleCode.setEnabled(true);
                etVehicleNumber.setEnabled(true);
                vipVehicleNumber.setEnabled(true);
                etMobileNo.setEnabled(true);*//*

                updateToolBar();
               */
/* etStateCode.setBackgroundColor(getResources().getColor(R.color.white));
                etCityCode.setBackgroundColor(getResources().getColor(R.color.white));
                etVehicleCode.setBackgroundColor(getResources().getColor(R.color.white));
                etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                etMobileNo.setBackgroundColor(getResources().getColor(R.color.white));
                btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                btnCheckIn.setEnabled(false);
                btnCheckout.setEnabled(false);*//*

                //passDetailsCheckoutApi(tagID);
                nfcDetailForINOut(tagID);
            } else {
               */
/* etStateCode.setEnabled(false);
                etCityCode.setEnabled(false);
                etVehicleCode.setEnabled(false);
                etVehicleNumber.setEnabled(false);
                vipVehicleNumber.setEnabled(false);
                etMobileNo.setEnabled(false);*//*

                updateToolBar();
              */
/*  etStateCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                etCityCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                etVehicleCode.setBackgroundColor(getResources().getColor(R.color.light_grey));
                etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.light_grey));
                etMobileNo.setBackgroundColor(getResources().getColor(R.color.light_grey));
                btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                btnCheckIn.setEnabled(false);
                btnCheckout.setEnabled(false);
*//*

                Toast.makeText(MainActivityNew.this, "Internet Connection Required", Toast.LENGTH_SHORT).show();
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
            }


        }
        formatter.close();

    }

    boolean checkin;

    public void passDetailsCheckoutApi(String tagID) {
        Log.e(TAG, "passDetailsCheckoutApi: ");
        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);

        */
/*http://staggingapi.opark.in/index.php/v1/parking/pass_detail?cardNo=4BHH5678*//*

//cardNo=CARD578&parkingId=30&parkingType=2Wheeler
        String urlData = AppConstants.BASEURL + "parking/pass_detail?cardNo=" + tagID + "&parkingId=" + parkingId + "&parkingType=" + parkingType12;
        Log.e(TAG, "passDetailsCheckoutApi:urlData " + urlData);
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                Log.e(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse: passDetailsCheckoutApi==========" + response.toString());

                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");
                    //Toast.makeText(MainActivity.this, ""+message, Toast.LENGTH_SHORT).show();

                    if (status == 0) {
                        updateToolBar();
                        // toolBar.setTitle("");
                        etStateCode.setEnabled(true);
                        etCityCode.setEnabled(true);
                        etVehicleCode.setEnabled(true);
                        etVehicleNumber.setEnabled(true);
                        vipVehicleNumber.setEnabled(true);
                        etMobileNo.setEnabled(true);
                        etStateCode.setEnabled(true);

                        etStateCode.setBackgroundColor(getResources().getColor(R.color.white));
                        etCityCode.setBackgroundColor(getResources().getColor(R.color.white));
                        etVehicleCode.setBackgroundColor(getResources().getColor(R.color.white));
                        etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                        vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                        etMobileNo.setBackgroundColor(getResources().getColor(R.color.white));
                        // btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                        // btnCheckout.setBackground(getResources().getDrawable(R.drawable.gradientback));
                        //nfcDetailForINOut(tagID);
                        //    linearTypeSelect.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.VISIBLE);
                        etMobileNo.setVisibility(View.VISIBLE);
                        textToolHeader.setVisibility(View.VISIBLE);

                        // Toast.makeText(MainActivity.this, "" + message, Toast.LENGTH_SHORT).show();
                        JSONObject checkINresponce = response.getJSONObject("data");

                        SubscriptionModelNew subscriptionModel = new SubscriptionModelNew();

                        */
/*subscriptionModel.setCardNo(checkINresponce.getString("cardNo"));
                        subscriptionModel.setAgentId(checkINresponce.getString("agentId"));*//*

                        subscriptionModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                        subscriptionModel.setCardNo(checkINresponce.getString("cardNo"));
                        subscriptionModel.setCheckin(checkINresponce.getBoolean("checkin"));
                        subscriptionModel.setIsPass(checkINresponce.getString("isPass"));
                        subVehicleNo = subscriptionModel.getVehicleNo();
                        checkin = checkINresponce.getBoolean("checkin");
                        String isPass = subscriptionModel.getIsPass();
                        Log.e(TAG, "vehicleNo:=-------== " + checkINresponce.getString("vehicleNo"));
                        Log.e(TAG, "cardNo:==-----= " + checkINresponce.getString("cardNo"));
                        Log.e(TAG, "checkin:==-----= " + checkINresponce.getBoolean("checkin"));
                        Log.e(TAG, "isPass:==-----= " + checkINresponce.getString("isPass"));
                        Log.e(TAG, "checkin:==-----= " + checkin);
                        Log.e(TAG, "isPass:==-----= " + isPass);
                        //etVehicleNumber.setText(checkINresponce.getString("vehicleNo"));
                        if (checkin) {
                            etStateCode.setEnabled(true);
                            etCityCode.setEnabled(true);
                            etVehicleCode.setEnabled(true);
                            etVehicleNumber.setEnabled(true);
                            vipVehicleNumber.setEnabled(true);
                            etMobileNo.setEnabled(true);
                            etStateCode.setEnabled(true);
                            updateToolBar();
                            etStateCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etCityCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etVehicleCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                            vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                            etMobileNo.setBackgroundColor(getResources().getColor(R.color.white));

                            textToolHeader.setVisibility(View.VISIBLE);
                            Log.e(TAG, "onResponse: ==========" + checkin);
                            // linearTypeSelect.setVisibility(View.GONE);
                            // radioGroup.setVisibility(View.GONE);
                            // etMobileNo.setVisibility(View.GONE);
                            //btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            // btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            //   btnCheckIn.setEnabled(false);
                            // btnCheckout.setEnabled(true);

                        } else {
                            updateToolBar();
                            etStateCode.setEnabled(true);
                            etCityCode.setEnabled(true);
                            etVehicleCode.setEnabled(true);
                            etVehicleNumber.setEnabled(true);
                            vipVehicleNumber.setEnabled(true);
                            etMobileNo.setEnabled(true);
                            etStateCode.setEnabled(true);

                            etStateCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etCityCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etVehicleCode.setBackgroundColor(getResources().getColor(R.color.white));
                            etVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                            vipVehicleNumber.setBackgroundColor(getResources().getColor(R.color.white));
                            etMobileNo.setBackgroundColor(getResources().getColor(R.color.white));
                            //btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            // btnCheckout.setBackground(getResources().getDrawable(R.drawable.gradientback));

                            textToolHeader.setVisibility(View.VISIBLE);
                            //  linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            // btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            // btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            // btnCheckout.setEnabled(false);
                            btnCheckIn.setEnabled(true);
                            Log.e(TAG, "onResponse: ===============" + checkin);


                        }
                       */
/* if (checkin) {
                            linearTypeSelect.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            etMobileNo.setVisibility(View.GONE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckIn.setEnabled(false);
                            btnCheckout.setEnabled(true);
                        } else {
                            Log.e(TAG, "onResponse: ==========" + checkin);
                            linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setEnabled(false);
                            btnCheckIn.setEnabled(true);

                            Log.e(TAG, "onResponse: ===============" + checkin);


                        }*//*

                        */
/*if (subVehicleNo.equals("")) {

                            linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setEnabled(false);
                            btnCheckIn.setEnabled(true);
                        } else {
                            linearTypeSelect.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            etMobileNo.setVisibility(View.GONE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckIn.setEnabled(false);
                            btnCheckout.setEnabled(true);
                        }*//*

                        String[] totalsubVehicleNo = subVehicleNo.toString().split(",");
                        //String[] totalsubVehicleNo = subVehicleNo.toString().split(" ");

                        try {
                            if (totalsubVehicleNo[0].equals(" ")) {
                                etStateCode.setText("");
                            } else {
                                String StateCode = totalsubVehicleNo[0];
                                etStateCode.setText(StateCode);
                            }


                            String vehicleNo1 = StateCode + CityCode + VehicleCode + vehicleNumber;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            if (totalsubVehicleNo[1].equals(" ")) {
                                etCityCode.setText("");
                            } else {
                                String StateCode = totalsubVehicleNo[1];
                                etCityCode.setText(StateCode);
                            }
                          */
/*  String CityCode = totalsubVehicleNo[1];

                            etCityCode.setText(CityCode);
*//*


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            if (totalsubVehicleNo[2].equals(" ")) {
                                etVehicleCode.setText("");
                            } else {
                                String VehicleCode = totalsubVehicleNo[2];
                                etVehicleCode.setText(VehicleCode);
                            }


                         */
/*   String VehicleCode = totalsubVehicleNo[2];

                            etVehicleCode.setText(VehicleCode);
*//*


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {

                            String vehicleNumber = totalsubVehicleNo[3];
                           */
/* if (checkin) {
                                linearTypeSelect.setVisibility(View.VISIBLE);
                                radioGroup.setVisibility(View.VISIBLE);
                                etMobileNo.setVisibility(View.VISIBLE);

                                btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                                btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                                btnCheckout.setEnabled(false);
                                btnCheckIn.setEnabled(true);
                            } else {
                                linearTypeSelect.setVisibility(View.GONE);
                                radioGroup.setVisibility(View.GONE);
                                etMobileNo.setVisibility(View.GONE);
                                btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                                btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                                btnCheckIn.setEnabled(false);
                                btnCheckout.setEnabled(true);
                            }*//*

                            etVehicleNumber.setText(vehicleNumber);


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        // vehicleCheckIn(parkingId, parkingType1234, vehicleNo1, agentId, userType, mobileNumber, subscriptionModel.getCardNo());

                        //    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                        pDialog.dismiss();


                    } else {
                        // linearTypeSelect.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.VISIBLE);
                        etMobileNo.setVisibility(View.VISIBLE);
                        updateToolBar();
                      */
/*  btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                        btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                        btnCheckout.setEnabled(false);
                        btnCheckIn.setEnabled(true);
                      *//*
 */
/* linearTypeSelect.setVisibility(View.VISIBLE);
                        radioGroup.setVisibility(View.VISIBLE);
                        etMobileNo.setVisibility(View.VISIBLE);

                        btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                        btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                        btnCheckout.setEnabled(false);
                        btnCheckIn.setEnabled(true);
                     *//*
   //cleareText();
                        //  Toast.makeText(MainActivity.this, "" + message, Toast.LENGTH_SHORT).show();

                       */
/* if (message1.equals("Card Not Exist !")) {

                            Toast.makeText(MainActivity.this, message1, Toast.LENGTH_SHORT).show();

                        } else {

                        }*//*



                    }
                    pDialog.dismiss();

                } catch (
                        NullPointerException e) {
                   */
/* e.printStackTrace();
                    sendError(e.toString(), "parking/pass_detail?cardNo=");
                    Toast.makeText(MainActivity.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();*//*

                } catch (
                        JSONException e) {
                 */
/*   e.printStackTrace();
                    sendError(e.toString(), "parking/pass_detail?cardNo=");
                    Toast.makeText(MainActivity.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();*//*

                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //   Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                // Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                   */
/* sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
*//*

                } else {
                   */
/* sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
*//*

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().

                addToRequestQueue(jsonObjReq);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);


        if (tag != null) {
            // Toast.makeText(this, getString(R.string.message_tag_detected), Toast.LENGTH_SHORT).show();
            Ndef ndef = Ndef.get(tag);


        }
        if (intent.getByteArrayExtra("android.nfc.extra.ID") != null) {
            Log.i("Foreground dispatch", "Discovered tag with intent: " + intent);

            id(intent);
        }
    }

    public void nfcDetailForINOut(String tagid) {
        // Toast.makeText(this, "tagid    " + tagid, Toast.LENGTH_SHORT).show();

        final ProgressDialog pDialog = new ProgressDialog(MainActivityNew.this);
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(true);
        pDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pDialog.show();
        pDialog.setContentView(R.layout.custom_progress_bar);

        */
/*http://staggingapi.opark.in/index.php/v1/parking/pass_detail?cardNo=4BHH5678*//*


        String urlData = AppConstants.BASEURL + "parking/pass_detail?cardNo=" + tagid;

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET, urlData, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                //Log.d(TAG, response.toString());
                try {
                    System.out.println("JSON RETURN " + response.toString());
                    Log.e(TAG, "onResponse:=nfcDetailForINOut========== " + response.toString());
                    String data = String.valueOf(response.get("data"));
                    String message = String.valueOf(response.get("message"));
                    int status = response.getInt("status");

                    if (status == 0) {

                        JSONObject checkINresponce = response.getJSONObject("data");

                        SubscriptionModel subscriptionModel = new SubscriptionModel();

                        */
/*subscriptionModel.setCardNo(checkINresponce.getString("cardNo"));
                        subscriptionModel.setAgentId(checkINresponce.getString("agentId"));*//*

                        subscriptionModel.setVehicleNo(checkINresponce.getString("vehicleNo"));
                        subscriptionModel.setCardNo(checkINresponce.getString("cardNo"));
                        subVehicleNo = subscriptionModel.getVehicleNo();
                      */
/*  if (checkin) {
                            Log.e(TAG, "onResponse: ==========" + checkin);
                            linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setEnabled(false);
                            btnCheckIn.setEnabled(true);
                        } else {
                            Log.e(TAG, "onResponse: ===============" + checkin);

                            linearTypeSelect.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            etMobileNo.setVisibility(View.GONE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckIn.setEnabled(false);
                            btnCheckout.setEnabled(true);
                        }*//*

                       */
/* if (subVehicleNo.equals("")) {
                            linearTypeSelect.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            etMobileNo.setVisibility(View.GONE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));


                        } else {
                            linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));


                        }*//*

                        String[] totalsubVehicleNo = subVehicleNo.toString().split(",");

                        String StateCode = totalsubVehicleNo[0];
                        String CityCode = totalsubVehicleNo[1];
                        String VehicleCode = totalsubVehicleNo[2];
                        String vehicleNumber = totalsubVehicleNo[3];
                      */
/*  if (vehicleNumber.equals("")) {
                            linearTypeSelect.setVisibility(View.VISIBLE);
                            radioGroup.setVisibility(View.VISIBLE);
                            etMobileNo.setVisibility(View.VISIBLE);

                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));

                        } else {
                            linearTypeSelect.setVisibility(View.GONE);
                            radioGroup.setVisibility(View.GONE);
                            etMobileNo.setVisibility(View.GONE);
                            btnCheckIn.setBackground(getResources().getDrawable(R.drawable.buttongradient_gray));
                            btnCheckout.setBackground(getResources().getDrawable(R.drawable.buttongradient));

                        }*//*

                        etStateCode.setText(StateCode);
                        etCityCode.setText(CityCode);
                        etVehicleCode.setText(VehicleCode);
                        etVehicleNumber.setText(vehicleNumber);


                        String vehicleNo1 = StateCode + CityCode + VehicleCode + vehicleNumber;

                        // vehicleCheckIn(parkingId, parkingType1234, vehicleNo1, agentId, userType, mobileNumber, subscriptionModel.getCardNo());

                        //    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                        pDialog.dismiss();


                    } else {

                        printError = String.valueOf(response.get("printError"));
                        message1 = String.valueOf(response.get("message"));
                        JSONObject checkINresponce = response.getJSONObject("data");

                        if (message1.equals("Card Not Exist !")) {

                            Toast.makeText(MainActivityNew.this, message1, Toast.LENGTH_SHORT).show();

                        } else {
                            SubscriptionModel subscriptionModel = new SubscriptionModel();

                            SharedPreferences storeAllValues = getSharedPreferences("opark", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = storeAllValues.edit();
                            editor.putString("parkingPrint", printError);
                            editor.apply();
                            editor.commit();

                            subscriptionModel.setReceiptHeading(checkINresponce.getString("receiptHeading"));
                            subscriptionModel.setParkingAddress(checkINresponce.getString("parkingAddress"));
                            subscriptionModel.setCompanyWebsite(checkINresponce.getString("companyWebsite"));
                            subscriptionModel.setPoweredBy(checkINresponce.getString("poweredBy"));
                            subscriptionModel.setCardNo(checkINresponce.getString("cardNo"));
                            tagID = "";

                            receiptHeading = subscriptionModel.getReceiptHeading();
                            parkingAddress = subscriptionModel.getParkingAddress();
                            companyWebsite = subscriptionModel.getCompanyWebsite();
                            poweredBy = subscriptionModel.getPoweredBy();
                            printReceipt();
                        }


                    }
                    pDialog.dismiss();

                } catch (NullPointerException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/pass_detail?cardNo=");
                    Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                    sendError(e.toString(), "parking/pass_detail?cardNo=");
                    Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                    pDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // VolleyLog.d(TAG, "Error: " + error.getMessage());
                //   Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                // Toast.makeText(MainActivity.this, "Server Error...", Toast.LENGTH_SHORT).show();
                // hide the progress dialog
                pDialog.dismiss();
                String message = null;
                if (error instanceof NetworkError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ServerError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "The server could not be found. Please try again after some time!!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof AuthFailureError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof NoConnectionError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof TimeoutError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Connection TimeOut! Please check your internet connection.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                } else if (error instanceof ParseError) {
                    sendError(error.toString(), "parking/pass_detail?cardNo=");

                    message = "Cannot connect to Internet...Please check your connection!";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);
    }

    class DownloadNewVersion extends AsyncTask<String, Integer, Boolean> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            dialog = new ProgressDialog(MainActivityNew.this);
            dialog.setCancelable(false);

            dialog.setMessage("Downloading...");

            dialog.setIndeterminate(true);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();

        }

        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);

            dialog.setIndeterminate(false);
            dialog.setMax(100);
            dialog.setProgress(progress[0]);
            String msg = "";
            if (progress[0] > 99) {

                msg = "Finishing... ";

            } else {

                msg = "Downloading... " + progress[0] + "%";
            }
            dialog.setMessage(msg);

        }

        @Override
        protected void onPostExecute(Boolean result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            dialog.dismiss();

            if (result) {

                Toast.makeText(getApplicationContext(), "Update Done",
                        Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(getApplicationContext(), "No updates availabel",
                        Toast.LENGTH_SHORT).show();

            }

        }


        @Override
        protected Boolean doInBackground(String... arg0) {
            Boolean flag = false;

            try {
                //https://opark.in/O_par_aPi/stg/apk/apkname.apk
                // https://opark.in/O_par_aPi/stg/apk/app-debug.apk

                //URL url = new URL("http://api.opark.in/apk/app-debug.apk"); //stg
                //URL url = new URL("https://opark.in/O_par_aPi/spg-nfc/apk/app-debug.apk"); //Live
                URL url = new URL("https://opark.in/O_par_aPi/gwalior-receipt/apk/app-debug.apk"); //Live


                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setRequestMethod("GET");
                c.setDoOutput(true);
                c.connect();

                String PATH = Environment.getExternalStorageDirectory() + "/Download/";
                File file = new File(PATH);
                file.mkdirs();

                File outputFile = new File(file, "app-debug.apk");

                if (outputFile.exists()) {
                    outputFile.delete();
                }


                InputStream is = c.getInputStream();

                int total_size = 1431692;//size of apk

                byte[] buffer = new byte[1024];
                int len1 = 0;
                int per = 0;
                int downloaded = 0;

                FileOutputStream fos = new FileOutputStream(outputFile);

                while ((len1 = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, len1);
                    downloaded += len1;
                    per = (int) (downloaded * 100 / total_size);
                    publishProgress(per);
                }
                fos.close();
                is.close();

                OpenNewVersion(PATH);

                flag = true;
            } catch (Exception e) {
                // Log.e(TAG, "Update Error: " + e.getMessage());
                flag = false;
            }
            return flag;


        }

    }

    void OpenNewVersion(String location) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(new File(location + "app-debug.apk")), "application/vnd.android.package-archive");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


//
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_CODE_BLUETOOTH) {
            for (int i = 0; i < permissions.length; i++) {
                if (permissions[i].equals(Manifest.permission.BLUETOOTH_ADMIN) && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    checkPermissions();
                    break;
                }
            }
        } else if (requestCode == REQUEST_CODE_STORAGE) {
            for (int i = 0; i < permissions.length; i++) {
                if (permissions[i].equals(Manifest.permission.WRITE_EXTERNAL_STORAGE) && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    checkPermissions();
                    break;
                }
            }
        } else if (requestCode == REQUEST_CODE_LOCATION) {
            for (int i = 0; i < permissions.length; i++) {
                if (permissions[i].equals(Manifest.permission.ACCESS_COARSE_LOCATION) && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    checkPermissions();
                    break;
                }
            }
        }
        switch (requestCode) {
            case 100:
                for (int i = 0; i < permissions.length; i++) {
                    if (permissions[i].equals(Manifest.permission.CAMERA) && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        moveToQrScan();
                        break;
                    }
                }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void checkPermissions() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, REQUEST_CODE_LOCATION);
        } else if (ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_ADMIN) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.BLUETOOTH_ADMIN}, REQUEST_CODE_BLUETOOTH);
        } else if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_STORAGE);
        } else {
            startActivity(new Intent(MainActivityNew.this, MainActivityNew.class));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.patmid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.Paytm:
                //  Toast.makeText(getApplicationContext(), "Item 1 Selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivityNew.this, TransationActivity.class);
                if (parkingType12.equals("4Wheeler")) {

                    intent.putExtra("parkingType", "4Wheeler");
                } else {
                    intent.putExtra("parkingType", "2Wheeler");

                }
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            default:
        }
        return super.onOptionsItemSelected(item);

    }

    private void sendError(String e, String apiName) {

        //https://opark.in/O_par_aPi/gwaliorStg/index.php/v3/error/add
        String url = AppConstants.BASEURL + AppConstants.APIERROR;
        Map<String, String> parameterData = new HashMap<>();
        parameterData.put(("error"), e.toString());
        parameterData.put(("apiName"), apiName);

        if (AppConstants.isInternetAvailable(MainActivityNew.this)) {
            send(url, parameterData);
            Log.e(TAG, "sendError:url " + url);
            Log.e(TAG, "sendError:parameterData " + parameterData);
        } else {
            NoIternetConnection(MainActivityNew.this);
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
                    Log.e("RESPONSE ERROR", volleyError.toString());
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
                Toast.makeText(MainActivityNew.this, "Unexpected Error...", Toast.LENGTH_SHORT).show();
                // Toast.makeText(RegisterUserActivity.this, "Nothing ", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
                // pDialog.dismiss();
            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(MainActivityNew.this, "Technical Error...", Toast.LENGTH_SHORT).show();
                // pDialog.dismiss();
            }
        }
    }


}

*/
