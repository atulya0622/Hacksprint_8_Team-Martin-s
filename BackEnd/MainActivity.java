package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText emailId, password;
    Button btnSignUp;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        emailId = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnSignUp = findViewById(R.id.button);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String email = emailId.getText().toString();
                String pwd = password.getText().toString();

                //checks if email field is filled
                if (email.isEmpty()) {
                    emailId.setError("Please Enter email id");
                    emailId.requestFocus();

                }

                //checks if password field is filled
                else if (pwd.isEmpty()) {
                    password.setError("Please Enter your Password");
                    password.requestFocus();


                }

                //checks if password length is greater than 8
                else if (pwd.length() < 8) {
                    password.setError("Password must be more than 7 characters");
                    password.requestFocus();


                }

                //start authentication of the entered fields
                else {
                    openMainActivity();
                }


            }
        });





    }




    //Opens up Main Page
    public void openMainActivity() {
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }

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


    public void openUpdateActivity(View view){
        Intent intent3 = new Intent(this,details.class) ;
        startActivity(intent3);
    }


}


