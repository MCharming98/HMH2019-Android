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
import Kid;

public class Parent {
    ArrayList<Kid> kidArrayList; //The initial list should be empty and we are adding kid to the arraylist when a kid complete his/her test
    public Parent(){
        ArrayList<Kid> kidArrayList = new ArrayList<Kid>();
    }
    public Boolean exist_kid(kidArrayList){
        return len(kidArrayList) != 0
    }
    public static String display_kids_no(ArrayList<Kid> kidArrayList, Boolean exist_kid){
        if exist_kid {
            return null
        }
        else{
            String result = 'There is no report now please paly the game with your child!';
            return result;
        }
    } // return a string when there are no kids record in this device
    public static ArraryList<String> display_kids_no(ArrayList<Kid> kidArrayList, Boolean exist_kid) {
        ArraryList<String> result = new ArrayList<String>()
        if exist_kid{
            for kid in kidArrayList {
                name = 'the_profile_of_' + kid.name; //grammar check needed
                result.append(name)
            }
            return result
        }
        return null
    }
    public static String read_file(Kid kid){
        String kid_name = kid.name;
        String file_name = 'the_profile_of_' + kid_name;
        try{
            FileInputStream fis = openFileInput(file_name, Context.MODE_PRIVATE);
            BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(fis)));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            String output = sb.toString();
            return output;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }//Not sure if it works, test cases needed.

    public static String display_result(String output){
        return output;
    }
}
