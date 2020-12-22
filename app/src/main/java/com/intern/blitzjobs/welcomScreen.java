package com.intern.blitzjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomScreen extends AppCompatActivity {
    Button loginBtn,signinBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_screen);
        loginBtn = findViewById(R.id.login_button);
        signinBtn = findViewById(R.id.signin_button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(welcomScreen.this,signin.class);
                welcomScreen.this.startActivity(intent);
            }
        });

        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(welcomScreen.this,loginPage.class);
                welcomScreen.this.startActivity(intent);
            }
        });

    }
}