package com.example.daori.espresso;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by daori on 1/7/15.
 */
public class NewActivityTest extends ActivityInstrumentationTestCase2<NewActivity>{

    private NewActivity activity;

    public NewActivityTest(Class<NewActivity> activityClass) {
        super(activityClass);
    }

    @Override
    public void setUp() {
        activity = getActivity();
    }
}
