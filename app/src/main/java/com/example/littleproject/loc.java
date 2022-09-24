package com.example.littleproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class loc extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loc);

        button = findViewById(R.id.btn_maps);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri loc_acad= Uri.parse("geo:0,0?q=Vitoria");
                Intent intent_loc = new Intent(Intent.ACTION_VIEW, loc_acad);
                startActivity(intent_loc);
            }
        });

    }
}