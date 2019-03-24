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
    String social_health;
    String emotional_health;
    String emotional_intelligence;
    String output_file;
    Boolean good; // When good is true, indicate no bad answers detected. So in the end, if good is true, the profile should be another sentence.
    public Kid(String input){
        name = input;
        result = input; //The result starts with the name of our kid
        output_file = "the_profile_of_" + input; //The name of the output file should be the_profile_of_ben for exmaple, the name after _ is the input
        social_health = "Social Health";
        emotional_health = "Emotional Health";
        emotional_intelligence = "Emotional Intelligence";
        good = true;
    }

    public void doing_test_spelling_game(String input){
        if (input == "c"){
            this.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = "In the Spelling Game scenario," + this.name + "'s choice of c) I wait for a very long time until the teacher assigns me a partner may imply an experience of peer rejection, relational bullying.";
            this.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = "In the Spelling Game scenario," + this.name + "'s choice of c) I wait for a very long time until the teacher assigns me a partner may imply an experience of loneliness.";
            this.social_health += evaluation_social;
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }
        if (input == "d"){
            this.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = "In the Spelling Game scenario," + this.name + "'s choice of d) I prefer working by myself so leave me alone may imply an experience of peer rejection, relational bullying.'";
            this.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = "In the Spelling Game scenario," + this.name + "'s choice of d) I prefer working by myself so leave me alone may imply an experience of loneliness.";
            this.social_health += evaluation_social;
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }

    }
    public void doing_test_school_bus(String input){
        if (input == "b"){
            this.social_health += System.getProperty("line.separator");
            String evaluation_social = "In the School Bus scenario," + this.name + "'s choice of b) I sit by myself silently along the way may imply an experience of peer rejection";
            this.social_health += evaluation_social;
            this.good = false;
        }
        if (input == "d"){
            this.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = "In the School Bus scenario," + this.name + "'s choice of d) I want to sit in a seat but I am rejected may imply an experience of peer rejection.";
            this.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = "In the School Bus scenario," + this.name + "'s choice of d) I want to sit in a seat but I am rejected may imply an experience of loneliness.";
            this.social_health += evaluation_social;
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }
    }
    public void doing_test_hit(String input){
        if (input == "b"){
            this.social_health += System.getProperty("line.separator");
            this.emotional_intelligence += System.getProperty("line.separator");
            String evaluation_social = "In the hit scenario," + this.name + "'s choice of b) I will find him and hit him in the back may imply an experience of irritability and moodiness";
            String evaluation_emotial_intelligence = "In the hit scenario," + this.name + "'s choice of b) I will find him and hit him in the back may imply a lack of emotional self-control";
            this.social_health += evaluation_social;
            this.emotional_intelligence += evaluation_emotial_intelligence;
            this.good = false;
        }
        if (input == "c"){
            this.social_health += System.getProperty("line.separator");
            String evaluation_social = "In the hit scenario," + this.name + "'s choice of c) he does that intentionally may imply an experience of peer rejection and hostile attribution bias'";
            this.social_health += evaluation_social;
            this.good = false;
        }
        if (input == "d"){
            this.social_health += System.getProperty("line.separator");
            this.emotional_health += System.getProperty("line.separator");
            String evaluation_emotional = "In the hit scenario," + this.name + "'s choice of b)I hate him but I will just keep silent may imply an experience of low self-esteem";
            String evaluation_social = "In the hit scenario," + this.name + "'s choice of b)I hate him but I will just keep silent may imply an experience of peer rejection";
            this.social_health += evaluation_social;
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }
    }
    public void doing_test_snack(String input){
        if (input == "c"){
            this.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = "In the Snack Distribution scenario," + this.name + "'s choice of c) she doesn’t like me may imply an experience of hostile attribution bias.";
            this.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = "In the snack Distribution scenario," + this.name + "'s choice of c) she doesn’t like me may imply an experience of low self-esteem.";
            this.social_health += evaluation_social;
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }
        if (input == "d"){
            this.emotional_health += System.getProperty("line.separator");
            String evaluation_emotional = "n the snack Distribution scenario," + this.name + "'s choice of d) I did something wrong so she doesn’t want to give me that may imply an experience of low self-esteem.";
            this.emotional_health += evaluation_emotional;
            this.good = false;
        }
    }
    public void doing_test_lunch(String input){
        if (input == "d" | input == "b"){
            this.emotional_intelligence += System.getProperty("line.separator");
            String evaluation_emotial_intelligence = "In the lunch scenario" + this.name + "'s choice may imply an experience of low empathy.";
            this.emotional_intelligence += evaluation_emotial_intelligence;
            this.good = false;
        }
    }
    public String finish(){
        if (this.good == true){
            this.result = "No problems detected, keep recording!";
            return this.result;
        }
        else{
            this.result += this.social_health;
            this.result += System.getProperty("line.separator");
            this.result += this.emotional_health;
            this.result += System.getProperty("line.separator");
            this.result += this.emotional_intelligence;
            return this.result;
        }
    }

    /*
    public void store_output(String output_file, String result){
        FileOutputStream fos = openFileOutput(output_file, Context.MODE_PRIVATE);
        fos.write(result.getBytes());
        fos.close();
    }
    */
}
/* How to store the output by name
FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
fos.write(string.getBytes());
fos.close(); */
// A line seperator
// rhyme = line1 + System.getProperty("line.separator") + line2;