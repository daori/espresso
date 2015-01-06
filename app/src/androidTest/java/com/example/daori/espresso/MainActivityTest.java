package com.example.daori.espresso;

import android.test.ActivityInstrumentationTestCase2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by daori on 1/2/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private String input;
    private String inputUsername;

    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        activity = getActivity();
    }

    public void testMainActivityShouldHaveLabelHelloWorldTest(){
        onView(withId(R.id.hello_world)).check(matches(withText(R.string.hello_world)));
    }

    @Given("^I open application$")
    public void i_open_application() throws Throwable {
        activity = getActivity();
    }

    @Given("^I input text on username \"(.*?)\"$")
    public void i_input_text_on_username(String arg1) throws Throwable {
        onView(withId(R.id.username)).perform(typeText(arg1));
    }

    @Given("^I input text on password \"(.*?)\"$")
    public void i_input_text_on_password(String arg1) throws Throwable {
        onView(withId(R.id.password)).perform(typeText(arg1));
    }

    @When("^I click button login$")
    public void i_click_button_login() throws Throwable {
        onView(withId(R.id.button_login)).perform(click());
    }

    @Then("^I should see label with \"(.*?)\" text$")
    public void i_should_see_label_with_text(String arg1) throws Throwable {
        onView(withId(R.id.result)).check(matches(withText(arg1)));
    }

    @And("^I adding additional value$")
    public void I_adding_additional_value() throws Throwable {
        onView(withId(R.id.radioButton)).perform(click());
        onView(withId(R.id.radioButton2)).perform(click());
        onView(withId(R.id.radioButton)).perform(click());
        onView(withId(R.id.checkbox1)).perform(click());
        onView(withId(R.id.checkbox2)).perform(click());
        onView(withId(R.id.checkbox3)).perform(click());
        onView(withId(R.id.switch1)).perform(click());
    }
}
