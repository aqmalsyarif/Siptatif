package com.aqmal.siptatif;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PendaftaranMahasiswa extends AppCompatActivity {

    private Button batal;

    private Button kirim;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran_mahasiswa);

        batal = findViewById(R.id.buttonBatal);
        kirim = findViewById(R.id.buttonKirimFile);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PendaftaranMahasiswa.this, Pendaftaran.class);
                startActivity(intent);
                Toast.makeText(PendaftaranMahasiswa.this,"Berhasil Dikirim", Toast.LENGTH_SHORT).show();
            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button buttonBukFil = findViewById(R.id.BukFil);
        buttonBukFil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                startActivityForResult(intent, 1);
            }
        });
    }
}