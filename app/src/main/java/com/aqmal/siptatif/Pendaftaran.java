package com.aqmal.siptatif;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Pendaftaran extends AppCompatActivity {


    RecyclerView recycler_view;
    DataAdapter adapter;
    Button pendaftaranMhs;

    ImageView dospem;


    @SuppressLint("MissingInflatedId")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        recycler_view = findViewById(R.id.recycler_view);
        pendaftaranMhs = findViewById(R.id.PendaftaranMahasiswa);
        dospem = findViewById(R.id.Dospemic);

        setRecyclerView();

        dospem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pendaftaran.this,Dospem.class);
                startActivity(intent);
            }
        });


        pendaftaranMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pendaftaran.this,PendaftaranMahasiswa.class);
                startActivity(intent);
            }
        });
    }


    private void setRecyclerView() {
        recycler_view.hasFixedSize();
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DataAdapter(this, getList());
        recycler_view.setAdapter(adapter);
    }

    private List<DataPendaftaranModel>getList(){
        List<DataPendaftaranModel> pendaftaran_list = new ArrayList<>();
        pendaftaran_list.add(new DataPendaftaranModel("1 April 2024", "Perancangan Contoh", "diproses"));
        pendaftaran_list.add(new DataPendaftaranModel("1 April 2024", "Perancangan Contoh dua", "diproses"));
        pendaftaran_list.add(new DataPendaftaranModel("3 April 2024", "Perancangan Contoh ni", "diproses"));
        pendaftaran_list.add(new DataPendaftaranModel("5 April 2024", "Perancangan Contoh lagi", "Menunggu"));
        pendaftaran_list.add(new DataPendaftaranModel("5 April 2024", "Perancangan Contohnya", "Menunggu"));
        return pendaftaran_list;
    }
}