package com.example.bloatkiller;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //https://gist.github.com/dominicthomas/7694379#file-android-launch-another-app
        // works if we know the name of the main activity, even if not a launcher
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("com.android.settings", "com.android.settings.Settings$ManageApplicationsActivity");
        startActivity(intent);
        finish();
    }
}