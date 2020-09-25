package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

    }

    //Redirects to Main Screen
    public void updateActivity(View view){
        Intent intent = new Intent(this,MainScreenActivity.class) ;
        startActivity(intent);
    }

    //Redirects to Update details Screen
    public void openUpdateActivity(View view) {
        Intent intent3 = new Intent(this,updateDet.class) ;
        startActivity(intent3);
    }
}
