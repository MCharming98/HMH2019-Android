package com.example.hmh2019;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.Map;


public class ChildProfileActivity extends AppCompatActivity {

    public static final String CHILD = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_child_profile);
        String childName = getIntent().getStringExtra(CHILD);
        Log.i(this.getClass().getSimpleName(), "Profile of " + childName);

    }


    private Map<String, String> getProfile(String childName){
        SharedPreferences prefs = getSharedPreferences(childName, MODE_PRIVATE);
        //prefs.getInt();
        return null;
    }
}
