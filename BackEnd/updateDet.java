package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class updateDet extends AppCompatActivity {

    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_det);

    }

    //Redirects to Main Screen  
    public void updateActivity(View view){
        Intent intent = new Intent(this,MainScreenActivity.class) ;
        startActivity(intent);
    }

}
