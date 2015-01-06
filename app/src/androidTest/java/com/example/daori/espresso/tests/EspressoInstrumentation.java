package com.example.daori.espresso.tests;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberInstrumentationCore;
import gherkin.formatter.model.Feature;

/**
 * Created by daori on 1/6/15.
 */
@CucumberOptions(features = "features", glue = "com.example.daori.espresso")

public class EspressoInstrumentation extends AndroidJUnitRunner{
    private CucumberInstrumentationCore helper = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        helper.create(arguments);
        super.onCreate(arguments);
    }

    @Override
    public void onStart() {
        helper.start();
    }
}
