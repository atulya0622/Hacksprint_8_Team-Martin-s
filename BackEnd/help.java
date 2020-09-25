package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class help extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        btn= findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();                  //calls the openActivity2() method
                Toast.makeText(help.this,"Your issue has been registered.",Toast.LENGTH_SHORT).show();    //popup to show the issue confirmation
            }
        });
    }


    //method to reset the help screen
    public void openActivity2(){
        Intent intent=new Intent(this,MainScreenActivity.class);
        startActivity(intent);
    }
}