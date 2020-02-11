package attender.oparkReceiptNew.vehiclelist.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import attender.oparkCard.R;
import attender.oparkReceiptNew.vehiclelist.fragment.WheelerCheckOutFragment;
import attender.oparkReceiptNew.vehiclelist.model.VehicleModelDetails;




public class FourFragmentOutAdapter extends RecyclerView.Adapter<FourFragmentOutAdapter.ViewHolder>{
        private Context context;
    WheelerCheckOutFragment fourFragmentOut;
        private ArrayList<VehicleModelDetails> vehicleModelList = new ArrayList<>();

        public FourFragmentOutAdapter(WheelerCheckOutFragment fourFragmentOut, ArrayList<VehicleModelDetails> vehicleModelList) {
            this.fourFragmentOut = fourFragmentOut;
            this.vehicleModelList = vehicleModelList;
            context = fourFragmentOut.getContext();
        }
        @Override
        public FourFragmentOutAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_view_mange_vehicle, parent, false);
            return new FourFragmentOutAdapter.ViewHolder(view);
        }


        @Override
        public void onBindViewHolder(FourFragmentOutAdapter.ViewHolder holder, int position) {

            holder.bind(vehicleModelList.get(position));
        }

        @Override
        public int getItemCount() {
            return vehicleModelList.size();
        }
    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewVehicleName;
        private TextView mobileNumber, vehicleType;
        private TextView vehicleNoOut;
        private TextView checkdate, chkOut;


        public ViewHolder(View itemView) {
            super(itemView);
            textViewVehicleName = (TextView) itemView.findViewById(R.id.textViewVehicleName);
            mobileNumber = (TextView) itemView.findViewById(R.id.mobileNumber);
            vehicleNoOut = (TextView) itemView.findViewById(R.id.vehicleNo);
            checkdate = (TextView) itemView.findViewById(R.id.checkdate);
            chkOut = (TextView) itemView.findViewById(R.id.chkOut);
            vehicleType = (TextView) itemView.findViewById(R.id.vehicleType);
        }

        @SuppressLint("ResourceAsColor")
        public void bind(VehicleModelDetails vehicleModelDetails) {

            //   textViewVehicleName.setText("Parking Name :"+vehicleModelDetails.getParkingName());
            try {
                String m = vehicleModelDetails.getMobileNo();
                if ( m.equals("")) {
                                mobileNumber.setVisibility(View.GONE);
                            } else {
                                mobileNumber.setText("Mobile Number :  " + vehicleModelDetails.getMobileNo());
                                mobileNumber.setTextColor(R.color.colorPrimary);
                            }
            } catch (Exception e) {
                e.printStackTrace();
            }


            vehicleNoOut.setText("VehicleNo :  " + vehicleModelDetails.getVehicleNo());
            checkdate.setText("Check In Date :  " + vehicleModelDetails.getCheckInDateTime());
            chkOut.setText("Check Out :  " + vehicleModelDetails.getCheckOutDateTime());
            vehicleType.setText("Parking Type  :  " + vehicleModelDetails.getParkingType());


        }
    }


}
