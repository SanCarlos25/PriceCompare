package com.example.pricecompare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Create a new activity. Avoid changing this file and activity_main_xml.
    //Android app opens in this file so If you wish to run your work:
    //1. add a button widget on the activity main xml file
    //2. inflate your button widget ((button)R.id.button)
    //3. and link it to the work that your doing using the onClickListener.
    //4. DO NOT COMMIT THE CHANGES YOU MAKE IN THIS FILE INTO THE MAIN BRANCH(you can do it in your branch) AS THIS MEANS ALL OF US WILL BE WORKING
    //          IN THE SAME FILE, Which is likely to create a merge error
    //4. This files will remain unchanged in the main branch. By the end of this sprint, this file will be convertetd viewlist screen.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}