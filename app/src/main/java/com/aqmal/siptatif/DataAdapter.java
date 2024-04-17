package com.aqmal.siptatif;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    Context context;
    List<DataPendaftaranModel> pendaftaran_list;

    public DataAdapter(Context context, List<DataPendaftaranModel> pendaftaran_list){
        this.context = context;
        this.pendaftaran_list = pendaftaran_list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (pendaftaran_list != null && pendaftaran_list.size() > 0){
            DataPendaftaranModel model = pendaftaran_list.get(position);
            holder.tanggal_tv.setText(model.getTanggal());
            holder.judul_tv.setText(model.getJudul());
            holder.status_tv.setText(model.getStatus());
        }

    }

    @Override
    public int getItemCount() {
        return pendaftaran_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tanggal_tv, judul_tv, status_tv;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            tanggal_tv = itemView.findViewById(R.id.tanggal_tv);
            judul_tv = itemView.findViewById(R.id.judul_tv);
            status_tv = itemView.findViewById(R.id.status_tv);
        }
    }
}
