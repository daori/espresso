package com.example.daori.espresso;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.example.daori.espresso.R.id.button_login;


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

    public void testClickButtonWithResultText(){
        String text = "daori";
        onView(withId(R.id.username)).perform(typeText(text));
        onView(withId(R.id.password)).perform(typeText("password"));
        onView(withId(R.id.button_login)).perform(click());
        onView(withId(R.id.result)).check(ViewAssertions.matches(withText(text)));
    }

}
