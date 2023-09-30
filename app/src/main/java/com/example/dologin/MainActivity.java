package com.example.dologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username=(TextView) findViewById(R.id.username);
        TextView password=(TextView) findViewById(R.id.password);
        MaterialButton button=(MaterialButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //considering username as ABCD and password as 1234
            public void onClick(View view) {
                if(username.getText().toString().equals("ABCD") && password.getText().toString().equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "WELCOME\n"+"" +
                            "LOGGED IN SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "WRONG PASSWORD/USERNAME\n" +
                            " COULDN'T LOGIN", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}