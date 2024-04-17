package com.aqmal.siptatif;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.aqmal.siptatif.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ImageView buttonPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPendaftaran = findViewById(R.id.Pendaftaranic);

        buttonPendaftaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pendaftaran.class);
                startActivity(intent);
            }
        });
    }
}