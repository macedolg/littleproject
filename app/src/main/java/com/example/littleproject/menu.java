package com.example.littleproject;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class menu extends AppCompatActivity {

    ImageView imageButton1;
    ImageView imageButton2;
    ImageView imageButton3;
    ImageView imageButton4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ActivityCompat.requestPermissions(menu.this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 1);


        imageButton1 = findViewById(R.id.imgbtn_info);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), info.class);
                startActivity(intent);
            }
        });

        imageButton2 = findViewById(R.id.imgbtn_sensor);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), sensor.class);
                startActivity(intent);
            }
        });

        imageButton3 = findViewById(R.id.imgbtn_colaboradores);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), colaboradores.class);
                startActivity(intent);
            }
        });

        imageButton4 = findViewById(R.id.imgbtn_loc);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), loc.class);
                startActivity(intent);
            }
        });




    }
}