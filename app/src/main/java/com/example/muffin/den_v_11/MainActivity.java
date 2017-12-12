package com.example.muffin.den_v_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.rollbar.android.Rollbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rollbar.init(this, "83f38980c70e45129e90006000678718", "development");




        Rollbar rollbar = Rollbar.instance();
        rollbar.error(new Exception("This is a test error"));


    }
}
