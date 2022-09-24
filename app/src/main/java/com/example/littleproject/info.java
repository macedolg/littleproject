package com.example.littleproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class info extends AppCompatActivity {

    Button button1;
    Button button2;
    ImageView imagelogo;
    ImageView image1;
    ImageView image2;
    ImageView image3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        button1 = findViewById((R.id.btn_colaboradores));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        colaboradores.class);
                startActivity(intent);
            }
        });

        button2 = findViewById((R.id.btn_contatos));

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri cont = Uri.parse("tel:977353735");
                Intent intent = new Intent(Intent.ACTION_DIAL,cont);
                startActivity(intent);
            }
        });

        imagelogo = findViewById(R.id.imgvw_logo1);

        imagelogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);;
            }
        });

        image1 = findViewById((R.id.imgbtn_instagram));

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/")));
            }
        });

        image2 = findViewById((R.id.imgbtn_email));

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/")));
            }
        });

        image3 = findViewById((R.id.imgbtn_face));

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")));
            }
        });

    }
}