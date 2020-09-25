package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


    }



    //Method to Open Help Page
    public void openHelpActivity(View view){
        Intent intent = new Intent(this,help.class) ;
        startActivity(intent);
    }

    //Method to open Leave request page
    public void  openLeaveActivity(View view){
        Intent intent1 = new Intent(this,Leave.class) ;
        startActivity(intent1);
    }

    //Method to logout the current user
    public void openLogoutActivity(View view){
        Intent intent2 = new Intent(this, MainActivity.class) ;
        startActivity(intent2);
    }

    //Method to open Employee details page
    public void openUpdateActivity(View view){
        Intent intent3 = new Intent(this,details.class) ;
        startActivity(intent3);
    }



}

