package com.example.hmh2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button kidsBtn = findViewById(R.id.btn_kids);
        Button parentsBtn = findViewById(R.id.btn_parents);

        kidsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startKidsActivity();
            }
        });

        parentsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startParentsActivity();
            }
        });
    }

    private void startKidsActivity(){
        Intent kidsIntent = new Intent(this, KidsActivity.class);
        startActivity(kidsIntent);
    }

    private void startParentsActivity(){
        Intent parentsIntent = new Intent(this, ParentsActivity.class);
        startActivity(parentsIntent);
    }
}
