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
import com.example.hmh2019.Kid;

public class Parent {
    ArrayList<String> kidArrayList; //The initial list should be empty and we are adding kid to the arraylist when a kid complete his/her test

    public Parent(){
        ArrayList<String> kidArrayList = new ArrayList<String>(); //As a kid completes the test, it will be added to this arraylist
    }
    public static void kid_register
    public static Boolean exist_kid(kidArrayList){
        return len(kidArrayList) != 0
    }
    public static String display_kids_no(ArrayList<String> kidArrayList, Boolean exist_kid){
        if exist_kid {
            return null

    public Boolean exist_kid(ArrayList kidArrayList){
        return kidArrayList.size() != 0;
    }

    public static String display_kids_no(ArrayList<String> kidArrayList, Boolean exist_kid){
        if (exist_kid(kidArrayList)) {
            return null;
        }
        else{
            String result = "There is no report now please paly the game with your child!";
            return result;
        }
    } // return a string when there are no kids record in this device
    public static ArraryList<String> display_kids_yes(ArrayList<String> kidArrayList, Boolean exist_kid) {
        ArraryList<String> result = new ArrayList<String>()
        if (exist_kid(kidArrayList)){
            for (String kid : kidArrayList) {
                String profile_name;
                profile_name = 'the_profile_of_' + kid; //grammar check needed, checked, hopefully no grammar error
                result.add(profile_name)
    public static ArrayList<String> display_kids_yes(ArrayList<String> kidArrayList, Boolean exist_kid) {
        ArrayList<String> result = new ArrayList<String>();
        if (exist_kid(kidArrayList)){
            for(String kid : kidArrayList){
                String name = "the_profile_of_" + kid; //grammar check needed
                result.append(name)
            }
            return result
        }
        return null
    }

    public static String display_result(String output){
        return output;
    }
}
