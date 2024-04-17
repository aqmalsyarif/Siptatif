package com.aqmal.siptatif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StatusPendaftaran extends AppCompatActivity {

    RecyclerView recyclerview;
    StatPenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_pendaftaran);

        recyclerview=findViewById(R.id.recycler_view);
        setRecyclerview();
    }
    private void setRecyclerview(){
        recyclerview.hasFixedSize();
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StatPenAdapter(this,getList());
        recyclerview.setAdapter(adapter);
    }
    private List<StatPenModel> getList (){
        List<StatPenModel> statpen_list = new ArrayList<>();
        statpen_list.add(new StatPenModel("12 juni 2024","Siptatif", "Diterima","detail"));
        statpen_list.add(new StatPenModel("12 juni 2024","Siptatif", "Ditolak","detail"));
        statpen_list.add(new StatPenModel("12 juni 2024","Siptatif", "Diterima","detail"));
        statpen_list.add(new StatPenModel("12 juni 2024","Siptatif", "Ditolak","detail"));

        return statpen_list;
    }
}