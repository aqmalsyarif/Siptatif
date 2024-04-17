package com.aqmal.siptatif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Dospem extends AppCompatActivity {

    RecyclerView recycler_view;
    DospemAdapter adapter;

    ImageView stati;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dospem);
        stati=findViewById(R.id.statpenni);

        recycler_view=findViewById(R.id.recycler_view);
        setRecycler_view();

        stati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dospem.this, StatusPendaftaran.class);
                startActivity(intent);
            }
        });
    }

    private void setRecycler_view(){
        recycler_view.hasFixedSize();
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DospemAdapter(this,getList());
        recycler_view.setAdapter(adapter);
    }

    private List<DospemModel> getList (){
        List<DospemModel> dospem_list = new ArrayList<>();
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        dospem_list.add(new DospemModel("1","Budi", "1222","lk","Cloud Computing", "4", "Detail"));
        return dospem_list;
    }
}