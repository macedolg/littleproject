package com.example.littleproject;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class sensor extends AppCompatActivity {

    TextView txtsupino;
    ImageView img_supino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        txtsupino = findViewById(R.id.txtvw_supino1);
        img_supino = findViewById(R.id.imgvw_supino1);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor proximity_supino = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        if(proximity_supino == null){
            Toast.makeText(this, "Sensor não está disponivel", Toast.LENGTH_LONG).show();
            finish();
        }
        SensorEventListener proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent.values[0] < proximity_supino.getMaximumRange()) {
                    img_supino.setImageResource(R.drawable.r2);
                    txtsupino.setText("VOCÊ FEZ O FRANGO CRESCER!!!");
                } else {
                    txtsupino.setText("Aproxime para levantar o supino");
                    img_supino.setImageResource(R.drawable.r1);
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        sensorManager.registerListener(proximitySensorListener, proximity_supino, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();



    }
}

