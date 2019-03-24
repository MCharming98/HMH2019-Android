package com.example.hmh2019;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Map;


public class ChildProfileActivity extends AppCompatActivity {

    public static final String CHILD = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_child_profile);
        String childName = getIntent().getStringExtra(CHILD);
        Log.i(this.getClass().getSimpleName(), "Profile of " + childName);

        Map<String, String> answers = getAnswer(childName);
        Kid kid = new Kid(childName);
        kid.doing_test_school_bus(answers.get("bus"));
        kid.doing_test_spelling_game(answers.get("spelling"));
        //kid.doing_test_lunch(answers.get("lunch"));
    }


    private Map<String, String> getAnswer(String childName){
        Map<String, String> answers = new HashMap<String, String>();
        SharedPreferences prefs = getSharedPreferences(childName, MODE_PRIVATE);

        String busAns = prefs.getString("bus", null);
        String spellingAns = prefs.getString("spelling", null);
        //String lunchAns = prefs.getString("lunch", null);
        answers.put("bus", busAns);
        answers.put("spelling", spellingAns);
        //answers.put("lunch", lunchAns);

        return answers;
    }
}
