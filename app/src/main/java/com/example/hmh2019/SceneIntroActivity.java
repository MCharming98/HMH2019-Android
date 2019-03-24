package com.example.hmh2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SceneIntroActivity extends AppCompatActivity {

    public static String nextScene = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scene_intro);




        ImageButton scene2IntroBtn = findViewById(R.id.spelling_intro_btn);
        scene2IntroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardSceneChoiceActivity(2);
            }
        });
    }

    private void forwardSceneChoiceActivity(int sceneNo){
        Intent choiceActivity;
        switch(sceneNo){
            default:
                choiceActivity = new Intent(this, Scene1Activity.class);
                break;
            case(2):
                choiceActivity = new Intent(this, Scene2Activity.class);
                break;
            case(3):
                choiceActivity = new Intent(this, Scene3Activity.class);
                break;
            case(4):
                choiceActivity = new Intent(this, Scene4Activity.class);
                break;
        }
        startActivity(choiceActivity);
    }

}
