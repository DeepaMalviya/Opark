package attender.oparkReceiptNew.vehiclelist.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import attender.oparkCard.R;
import attender.oparkReceiptNew.vehiclelist.fragment.WheelerCheckInFragment;
import attender.oparkReceiptNew.vehiclelist.fragment.WheelerCheckOutFragment;

/**
 * Created by Daffodil on 7/6/2018.
 */

public class WheelerAdapter extends FragmentPagerAdapter{
    private static final String TAG = "FourWheelerAdapter";
    int ParkingTypeId;
        private Context context;
    String parkingType12;
        public WheelerAdapter(FragmentManager fm, Context context, String parkingType12, int ParkingTypeId) {
            super(fm);
            this.context = context;
            this.parkingType12 = parkingType12;
            this.ParkingTypeId = ParkingTypeId;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position == 0) {
                Log.e(TAG, "getItem: parkingType12"+parkingType12 );

                 fragment = new WheelerCheckInFragment(parkingType12,ParkingTypeId);
            } else if (position == 1) {
                fragment = new WheelerCheckOutFragment(parkingType12,ParkingTypeId);
            }
            return fragment;
        }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = context.getString(R.string.service_station);
        } else if (position == 1) {
            title = context.getString(R.string.review);
        }
        return title;
    }
}
