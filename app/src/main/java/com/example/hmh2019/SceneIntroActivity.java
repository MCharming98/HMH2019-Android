package com.example.hmh2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SceneIntroActivity extends AppCompatActivity {

    public static String nextScene = "1";
    public static String childName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scene_intro);

        String next = "1";
        if(getIntent().hasExtra(nextScene)){
            next = getIntent().getStringExtra(this.nextScene);
        }

        if(getIntent().hasExtra(childName)){
            this.childName = getIntent().getStringExtra(this.childName);
        }
        Log.i(this.getClass().getSimpleName(), "Child name: " + this.childName);

        TextView scene1IntroText = findViewById(R.id.bus_intro_text);
        TextView scene2IntroText = findViewById(R.id.spelling_intro_text);
        TextView scene3IntroText = findViewById(R.id.hit_intro_text);
        TextView scene4IntroText = findViewById(R.id.lunch_intro_text);

        ImageButton scene1IntroBtn = findViewById(R.id.bus_intro_btn);
        ImageButton scene2IntroBtn = findViewById(R.id.spelling_intro_btn);
        ImageButton scene3IntroBtn = findViewById(R.id.hit_intro_btn);
        ImageButton scene4IntroBtn = findViewById(R.id.lunch_intro_btn);

        scene1IntroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardSceneChoiceActivity(1);
            }
        });

        scene2IntroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardSceneChoiceActivity(2);
            }
        });

        scene3IntroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardSceneChoiceActivity(3);
            }
        });

        scene4IntroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardSceneChoiceActivity(4);
            }
        });

        scene1IntroText.setVisibility(View.INVISIBLE);
        scene2IntroText.setVisibility(View.INVISIBLE);
        scene3IntroText.setVisibility(View.INVISIBLE);
        scene4IntroText.setVisibility(View.INVISIBLE);

        scene1IntroBtn.setVisibility(View.INVISIBLE);
        scene2IntroBtn.setVisibility(View.INVISIBLE);
        scene3IntroBtn.setVisibility(View.INVISIBLE);
        scene4IntroBtn.setVisibility(View.INVISIBLE);

        switch(next){
            default:
                scene1IntroText.setVisibility(View.VISIBLE);
                scene1IntroBtn.setVisibility(View.VISIBLE);
                break;
            case("2"):
                scene2IntroText.setVisibility(View.VISIBLE);
                scene2IntroBtn.setVisibility(View.VISIBLE);
                break;
            case("3"):
                scene3IntroText.setVisibility(View.VISIBLE);
                scene3IntroBtn.setVisibility(View.VISIBLE);
                break;
            case("4"):
                scene4IntroText.setVisibility(View.VISIBLE);
                scene4IntroBtn.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void forwardSceneChoiceActivity(int sceneNo){
        Intent choiceActivity;
        switch(sceneNo){
            default:
                choiceActivity = new Intent(this, Scene1Activity.class);
                choiceActivity.putExtra(Scene1Activity.childName, this.childName);
                break;
            case(2):
                choiceActivity = new Intent(this, Scene2Activity.class);
                choiceActivity.putExtra(Scene2Activity.childName, this.childName);
                break;
            case(3):
                choiceActivity = new Intent(this, Scene3Activity.class);
                choiceActivity.putExtra(Scene3Activity.childName, this.childName);
                break;
            case(4):
                choiceActivity = new Intent(this, Scene4Activity.class);
                choiceActivity.putExtra(Scene4Activity.childName, this.childName);
                break;
        }
        startActivity(choiceActivity);
    }

}
