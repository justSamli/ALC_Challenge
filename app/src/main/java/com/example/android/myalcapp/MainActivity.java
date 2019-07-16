package com.example.android.myalcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set View to display Main Activity page
        setContentView(R.layout.activity_main);

        /**
        * Set Buttons to display separate activities when clicked.
        * @about_button button to show ALC About web page (WebView content)
        * @profile_button to display My Profile in a separate activity
        */

        Button about_button = (Button) findViewById(R.id.alc_about);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alc_page = new Intent(MainActivity.this, AboutALC.class);
                startActivity(alc_page);
            }
        });

        Button profile_button = (Button) findViewById(R.id.profile);
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent my_profile = new Intent(MainActivity.this, MyProfile.class);
                startActivity(my_profile);
            }
        });
    }

}
