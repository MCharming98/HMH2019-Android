package com.example.hmh2019;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Map;
import java.util.Set;

public class ParentsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_parents);

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainActivity();
            }
        });

        String[] children = getChildren();

        Spinner childrenSpinner = findViewById(R.id.children_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, children);
        childrenSpinner.setAdapter(adapter);
        childrenSpinner.setOnItemSelectedListener(this);
    }

    private String[] getChildren(){
        SharedPreferences prefs = getSharedPreferences("parent", MODE_PRIVATE);
        String[] template = new String[0];
        String[] children = prefs.getAll().keySet().toArray(template);
        return children;

    }

    private void backToMainActivity(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        String child = parent.getItemAtPosition(pos).toString();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
