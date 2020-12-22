package com.intern.blitzjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buildingProfile extends AppCompatActivity {

    Button stu,work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_profile);


        stu = findViewById(R.id.btn_stu);
        work = findViewById(R.id.btn_work);

        stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buildingProfile.this,educationDetail.class);
                buildingProfile.this.startActivity(intent);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buildingProfile.this,educationDetail.class);
                buildingProfile.this.startActivity(intent);
            }
        });

    }
}