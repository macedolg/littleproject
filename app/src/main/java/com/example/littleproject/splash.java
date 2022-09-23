package com.example.littleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class splash extends AppCompatActivity {

    private final Timer timer = new Timer();
    TimerTask TimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


            TimerTask = new TimerTask(){
                @Override
                public void run(){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            gotoMainActivity();
                        }
                    });

                }
            };

            timer.schedule(TimerTask, 4000);

        }
        private void gotoMainActivity() {
            Intent intent = new Intent (getApplicationContext(), menu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

    }


