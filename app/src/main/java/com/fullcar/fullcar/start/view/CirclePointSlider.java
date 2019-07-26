package com.fullcar.fullcar.start.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

import com.fullcar.fullcar.R;

public class CirclePointSlider extends RelativeLayout {

    private static String TAG = CirclePointSlider.class.getName();

    public CirclePointSlider(Context context) {
        super(context);
        init();
    }

    private void init() {
        Log.d(TAG, "init start");
        inflate(getContext(), R.layout.circle_point_slider, this);
    }
}
