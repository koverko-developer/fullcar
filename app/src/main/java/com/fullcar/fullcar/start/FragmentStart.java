package com.fullcar.fullcar.start;

import android.support.v4.app.Fragment;

import com.fullcar.fullcar.R;

public class FragmentStart extends Fragment {

    int position = 0;
    String[] text_arr = new String[]{
            getResources().getString(R.string.hello_app),
            getResources().getString(R.string.start_create_ride),
            getResources().getString(R.string.start_schedule_ride),
            getResources().getString(R.string.start_share),
            getResources().getString(R.string.start_write_in_profile)
    };



}
