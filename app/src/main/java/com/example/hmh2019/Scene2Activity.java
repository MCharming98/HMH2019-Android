package com.example.hmh2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Scene2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scene2);

        ImageButton btn_spelling_choiceA = findViewById(R.id.imageButton);
        ImageButton btn_spelling_choiceB = findViewById(R.id.imageButton2);
        ImageButton btn_spelling_choiceC = findViewById(R.id.imageButton3);
        ImageButton btn_spelling_choiceD = findViewById(R.id.imageButton4);

        btn_spelling_choiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardToSceneIntro();
            }
        });

        btn_spelling_choiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardToSceneIntro();
            }
        });

        btn_spelling_choiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardToSceneIntro();
            }
        });

        btn_spelling_choiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardToSceneIntro();
            }
        });
    }

    private void forwardToSceneIntro(){
        Intent intro = new Intent(this, SceneIntroActivity.class);
        intro.putExtra(SceneIntroActivity.nextScene, "3");
        startActivity(intro);
    }

}
