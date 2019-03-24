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
import android.widget.ImageButton;

public class Scene4Activity extends AppCompatActivity {

    public static String childName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scene4);

        this.childName = getIntent().getStringExtra(this.childName);
        Log.i(this.getClass().getSimpleName(), "Child name: " + this.childName);

        ImageButton btn_lunch_choiceA = findViewById(R.id.lunch_choice_a);
        ImageButton btn_lunch_choiceB = findViewById(R.id.lunch_choice_b);
        ImageButton btn_lunch_choiceC = findViewById(R.id.lunch_choice_c);
        ImageButton btn_lunch_choiceD = findViewById(R.id.lunch_choice_d);

        btn_lunch_choiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("a");
                forwardToFinishActivity();
            }
        });

        btn_lunch_choiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("b");
                forwardToFinishActivity();
            }
        });

        btn_lunch_choiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("c");
                forwardToFinishActivity();
            }
        });

        btn_lunch_choiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("d");
                forwardToFinishActivity();
            }
        });
    }


    private void storeAnswer(String choice){
        SharedPreferences.Editor editor = getSharedPreferences(this.childName, MODE_PRIVATE).edit();
        editor.putString("lunch", choice);
        editor.commit();
        Log.i(this.getClass().getSimpleName(), "Stored lunch choice: " + choice);
    }

    private void forwardToFinishActivity(){
        Intent end = new Intent(this, FinishActivity.class);
        startActivity(end);
    }
}
