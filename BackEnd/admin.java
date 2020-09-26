package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }


    public void openEmpLogin(View view){
        Intent intent4 = new Intent(this,MainActivity.class) ;
        startActivity(intent4);
    }

    public void openAdmLogin(View view){
        Intent intent5 = new Intent(this,admin.class) ;
        startActivity(intent5);
    }
}
