package com.example.hmh2019;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_kids);

        Button doneBtn = findViewById(R.id.done_btn);
        Button backBtn = findViewById(R.id.back_btn);
        final EditText kid_name = findViewById(R.id.kid_name);

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String kidName = kid_name.getText().toString();
               if(kidName.equals("")){
                   Toast.makeText(getApplicationContext(),"Please enter your name!",Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(getApplicationContext(),"Hi, "+ kidName + "!",Toast.LENGTH_SHORT).show();
                   SharedPreferences.Editor editor = getSharedPreferences("parent", MODE_PRIVATE).edit();
                   editor.putString(kidName, kidName);
                   editor.commit();
                   //startGame(kidName);
               }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainActivity();
            }
        });
    }

    private void backToMainActivity(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    /*
    private void startGame(String name){
        Intent game = new Intent(this, GameActivity.class);
        game.putExtra("name", name);
    }
    */
}
