package com.example.daori.espresso;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends ActionBarActivity {

    public static final String USERNAME_FIELD = "usernameField";
    public static final String PASSWORD_FIELD ="passwordField";
    private static final String RADIO_FIELD_2 = "radioField2";
    private static final String RADIO_FIELD_1 = "radioField2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void callNewActivity(View view){
        Intent intent = new Intent(this, NewActivity.class);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton);

        intent.putExtra(USERNAME_FIELD, username.getText().toString());
        intent.putExtra(PASSWORD_FIELD, password.getText().toString());
        intent.putExtra(RADIO_FIELD_1, radioButton1.getText().toString());
        intent.putExtra(RADIO_FIELD_2, radioButton1.getText().toString());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
