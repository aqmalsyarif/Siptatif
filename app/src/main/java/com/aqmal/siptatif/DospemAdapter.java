package com.aqmal.siptatif;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DospemAdapter extends RecyclerView.Adapter<DospemAdapter.ViewHolder> {
    Context context;

    List<DospemModel>  dospem_list;

    public DospemAdapter(Context context, List<DospemModel> dospem_list){
        this.context = context;
        this.dospem_list = dospem_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout_dospem, parent, false);
        return new ViewHolder (view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (dospem_list != null && dospem_list.size()>0){
            DospemModel model = dospem_list.get(position);
            holder.no_tv.setText(model.getNo());
            holder.nama_tv.setText(model.getNama());
            holder.nidn_tv.setText(model.getNidn());
            holder.jk_tv.setText(model.getJk());
            holder.keahlian_tv.setText(model.getKeahlian());
            holder.kuota_tv.setText(model.getKuota());
            holder.aksi_tv.setText(model.getAksi());
        }

    }

    @Override
    public int getItemCount() {
        return dospem_list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView no_tv, nama_tv, nidn_tv, jk_tv, keahlian_tv, kuota_tv, aksi_tv;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            no_tv = itemView.findViewById(R.id.no_tv);
            nama_tv = itemView.findViewById(R.id.nama_tv);
            nidn_tv = itemView.findViewById(R.id.nidn_tv);
            jk_tv = itemView.findViewById(R.id.jk_tv);
            keahlian_tv = itemView.findViewById(R.id.keahlian_tv);
            kuota_tv = itemView.findViewById(R.id.kuota_tv);
            aksi_tv = itemView.findViewById(R.id.aksi_tv);
        }
    }
}
