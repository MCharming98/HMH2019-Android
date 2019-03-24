package com.example.hmh2019;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Kid{
    String name; //The input string is the kid's name
    String result; //The result of our test is stored as string
    String output_file;
    public Kid(String input){
        name = input;
        result = input; //The result starts with the name of our kid
        output_file = 'the_profile_of_' + input; //The name of the output file should be the_profile_of_ben for exmaple, the name after _ is the input
    }
    public void store_output(String output_file, String result){
        FileOutputStream fos = openFileOutput(output_file, Context.MODE_PRIVATE);
        fos.write(result.getBytes());
        fos.close();
    }
}
/* How to store the output by name
FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
fos.write(string.getBytes());
fos.close(); */