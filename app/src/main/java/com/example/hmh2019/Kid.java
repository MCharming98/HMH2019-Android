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
    Boolean good;
    public Kid(String input){
        name = input;
        result = input; //The result starts with the name of our kid
        output_file = "the_profile_of_" + input; //The name of the output file should be the_profile_of_ben for exmaple, the name after _ is the input
        social_health = 'Social Health';
        emotional_health = 'Emotional Health';
        emotional_intelligence = 'Emotional Intelligence';
        good = True;
    }
    
    public void doing_test_spelling_game(String input){
        if (input == 'c'){
            kid.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = 'In the Spelling Game scenario,' + kid.name + 's choice of c) I wait for a very long time until the teacher assigns me a partner may imply an experience of peer rejection, relational bullying.';
            kid.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = 'In the Spelling Game scenario,' + kid.name + 's choice of c) I wait for a very long time until the teacher assigns me a partner may imply an experience of loneliness.';
            kid.social_health += evaluation_social;
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }
        if (input == 'd'){
            kid.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = 'In the Spelling Game scenario,' + kid.name + 's choice of d) I prefer working by myself so leave me alone may imply an experience of peer rejection, relational bullying.';
            kid.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = 'In the Spelling Game scenario,' + kid.name + 's choice of d) I prefer working by myself so leave me alone may imply an experience of loneliness.';
            kid.social_health += evaluation_social;
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }

    }
    public void doing_test_school_bus(String input){
        if (input == 'b'){
            kid.social_health += System.getProperty("line.separator");
            String evaluation_social = 'In the School Bus scenario,' + kid.name + 's choice of b) I sit by myself silently along the way may imply an experience of peer rejection';
            kid.social_health += evaluation_social;
            kid.good = False;
        }
        if (input == 'd'){
            kid.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = 'In the School Bus scenario,' + kid.name + 's choice of d) I want to sit in a seat but I am rejected may imply an experience of peer rejection.';
            kid.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = 'In the School Bus scenario,' + kid.name + 's choice of d) I want to sit in a seat but I am rejected may imply an experience of loneliness.';
            kid.social_health += evaluation_social;
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }
    }
    public void doing_test_hit(String input){
        if (input == 'b'){
            kid.social_health += System.getProperty("line.separator");
            kid.emotional_intelligence += System.getProperty("line.separator");
            String evaluation_social = 'In the hit scenario,' + kid.name + 's choice of b) I will find him and hit him in the back may imply an experience of irritability and moodiness';
            String evaluation_emotial_intelligence = 'In the hit scenario,' + kid.name + 's choice of b) I will find him and hit him in the back may imply a lack of emotional self-control';
            kid.social_health += evaluation_social;
            kid.emotional_intelligence += evaluation_emotial_intelligence;
            kid.good = False;
        }
        if (input == 'c'){
            kid.social_health += System.getProperty("line.separator");
            String evaluation_social = 'In the hit scenario,' + kid.name + 's choice of c) he does that intentionally may imply an experience of peer rejection and hostile attribution bias';
            kid.social_health += evaluation_social;
            kid.good = False;
        }
        if (input == 'd'){
            kid.social_health += System.getProperty("line.separator");
            kid.emotional_health += System.getProperty("line.separator");
            String evaluation_emotional = 'In the hit scenario,' + kid.name + 's choice of b)I hate him but I will just keep silent may imply an experience of low self-esteem';
            String evaluation_social = 'In the hit scenario,' + kid.name + 's choice of b)I hate him but I will just keep silent may imply an experience of peer rejection';
            kid.social_health += evaluation_social;
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }
    }
    public void doing_test_snack(String input){
        if (input == 'c'){
            kid.social_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_social = 'In the Snack Distribution scenario,' + kid.name + 's choice of c) she doesn’t like me may imply an experience of hostile attribution bias.';
            kid.emotional_health += System.getProperty("line.separator"); //seperate the line
            String evaluation_emotional = 'In the snack Distribution scenario,' + kid.name + 's choice of c) she doesn’t like me may imply an experience of low self-esteem.';
            kid.social_health += evaluation_social;
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }
        if (input == 'd'){
            kid.emotional_health += System.getProperty("line.separator");
            String evaluation_emotional = 'In the snack Distribution scenario,' + kid.name + 's choice of d) I did something wrong so she doesn’t want to give me that may imply an experience of low self-esteem.';
            kid.emotional_health += evaluation_emotional;
            kid.good = False;
        }
    }
    public void doing_test_lunch(String input){
        if (input == 'd' | input == 'b'){
            kid.emotional_intelligence += System.getProperty("line.separator");
            String evaluation_emotial_intelligence = 'In the lunch scenario' + kid.name + 's choice may imply an experience of low empathy.';
            kid.emotional_intelligence += evaluation_emotial_intelligence;
            kid.good = False;
        }
    }
    public void finish(){
        if (kid.good == True){
            kid.result = 'No problems detected, keep recording!';
        }
        else{
            kid.result += kid.social_health;
            kid.result += System.getProperty("line.separator");
            kid.result += kid.emotional_health;
            kid.result += System.getProperty("line.separator");
            kid.result += kid.emotional_intelligence;
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