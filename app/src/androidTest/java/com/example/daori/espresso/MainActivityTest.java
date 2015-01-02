package com.example.daori.espresso;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by daori on 1/2/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        getActivity();
    }

    public void testMainActivityShouldHaveLabelHelloWorldTest(){
        onView(withId(R.id.hello_world)).check(matches(withText(R.string.hello_world)));
    }

    public void testButtonShouldDisavbleWhenUsernameAndPassowrdEmpty(){
        //TODO: Belum diimplementasi
//        onView(withId(R.id.username)).check(withText(""));
//        onView(withId(R.id.password)).check(withText(""));
//        onView(withId(R.id.button_login)).check(ViewAssertions.matches(ViewMatchers.isClickable()));
    }

}
