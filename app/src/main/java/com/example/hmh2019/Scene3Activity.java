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

public class Scene3Activity extends AppCompatActivity {

    public static String childName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scene3);

        this.childName = getIntent().getStringExtra(this.childName);
        Log.i(this.getClass().getSimpleName(), "Child name: " + this.childName);

        ImageButton btn_hit_choiceA = findViewById(R.id.hit_choice_a);
        ImageButton btn_hit_choiceB = findViewById(R.id.hit_choice_b);
        ImageButton btn_hit_choiceC = findViewById(R.id.hit_choice_c);
        ImageButton btn_hit_choiceD = findViewById(R.id.hit_choice_d);

        btn_hit_choiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("a");
                forwardToSceneIntro();
            }
        });

        btn_hit_choiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("b");
                forwardToSceneIntro();
            }
        });

        btn_hit_choiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("c");
                forwardToSceneIntro();
            }
        });

        btn_hit_choiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAnswer("d");
                forwardToSceneIntro();
            }
        });
    }

    private void storeAnswer(String choice){
        SharedPreferences.Editor editor = getSharedPreferences(this.childName, MODE_PRIVATE).edit();
        editor.putString("hit", choice);
        editor.commit();

        Log.i(this.getClass().getSimpleName(), "Stored hit choice: " + choice);
    }

    private void forwardToSceneIntro(){
        Intent intro = new Intent(this, SceneIntroActivity.class);
        intro.putExtra(SceneIntroActivity.nextScene, "4");
        startActivity(intro);
    }
}
