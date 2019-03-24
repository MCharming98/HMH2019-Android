package com.example.hmh2019;

import java.util.ArrayList;

public class Parent {
    private ArrayList<String> kidArrayList; //The initial list should be empty and we are adding kid to the arraylist when a kid complete his/her test

    public Parent(String[] kidsArray) {
        kidArrayList = new ArrayList<String>(); //As a kid completes the test, it will be added to this arraylist
        for (String kid : kidsArray) {
            kidArrayList.add(kid);
        }
    }

    public Boolean exist_kid(){
        return this.kidArrayList.size() != 0;
    }

    /*
    public String display_kids_no(ArrayList<String> kidArrayList, Boolean exist_kid){
        if (exist_kid(kidArrayList)) {
            return null;
        }
        else{

    public static String display_kids_no(ArrayList<String> kidArrayList, Boolean exist_kid){
        if (exist_kid(kidArrayList)) {
            return null;
        }
        else{

    public static String display_kids_no(ArrayList<String> kidArrayList){
        if (kidArrayList.size()== 0) {
            String result = "There is no report now please play the game with your child!";
            return result;
        }
        else{
            return null;
        }
    }// return a string when there are no kids record in this device


    public static ArrayList<String> display_kids_yes(ArrayList<String> kidArrayList) {
        ArrayList<String> result = new ArrayList<String>();
        if (kidArrayList.size()== 0) {
            return null;
        }
        else {
            for (String kid : kidArrayList) {
                String profile_name;
                profile_name = "the_profile_of_" + kid; //grammar check needed, checked, hopefully no grammar error
                result.add(profile_name);
            }
            return result;
        }
    }
    */


    /*
    public static String read_file(Kid kid){
        String kid_name = kid.name;
        String file_name = "the_profile_of_" + kid_name;
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
    */
}
