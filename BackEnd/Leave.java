package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Leave extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText fromDate, toDate, reason;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);
        btn= findViewById(R.id.Submit);
        btn.setOnClickListener(this);

        fromDate = findViewById(R.id.fromdate) ;
        toDate = findViewById(R.id.toDate) ;
        reason = findViewById(R.id.Rea) ;

    }

    @Override
    public void onClick(View v) {

        String fDate,tDate,rea;

        fDate = fromDate.getText().toString() ;
        tDate = toDate.getText().toString();
        rea = reason.getText().toString();

        if(fDate.isEmpty()){
            fromDate.setError("Please enter a From date");
        }

        else if(tDate.isEmpty()){
            toDate.setError("Please enter a To date");
        }
        else if(rea.isEmpty()){
            reason.setError("Please enter a Valid Reason");
        }
        else{

            openActivity2();                  //calls the openActivity2() method
            Toast.makeText(Leave.this,"Your leave request has been submitted.",Toast.LENGTH_SHORT).show();

        }



    }
    //method to reset the leave application screen
    public void openActivity2(){
        Intent intent=new Intent(this,MainScreenActivity.class);
        startActivity(intent);
    }
}