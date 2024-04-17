package com.aqmal.siptatif;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatPenAdapter  extends RecyclerView.Adapter<StatPenAdapter.ViewHolder> {
    Context context;
    List<StatPenModel> statpen_list;

    public StatPenAdapter(Context context, List<StatPenModel> statpen_list){
        this.context=context;
        this.statpen_list= statpen_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout_statpen, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatPenAdapter.ViewHolder holder, int position) {
        if (statpen_list != null && statpen_list.size()>0){
            StatPenModel model = statpen_list.get(position);
            holder.tanggalstat_tv.setText(model.getTanggal());
            holder.judul_stat_tv.setText(model.getJudul());
            holder.statusstat_tv.setText(model.getStatus());
            holder.aksistat_tv.setText(model.getAksi());

            holder.aksistat_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        String status = statpen_list.get(position).getStatus();
                        if (status.equals("Diterima")){
                            Intent intent = new Intent(context, DetailDiterima.class);
                            context.startActivity(intent);
                        } else if (status.equals("Ditolak")) {
                            Intent intent = new Intent(context, DetailDitolak.class);
                            context.startActivity(intent);
                            
                        }
                    }
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return statpen_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tanggalstat_tv, judul_stat_tv, statusstat_tv, aksistat_tv;

        public ViewHolder (@NonNull View itemView){
            super(itemView);
            tanggalstat_tv= itemView.findViewById(R.id.tanggalstat_tv);
            judul_stat_tv = itemView.findViewById(R.id.judulstat_tv);
            statusstat_tv = itemView.findViewById(R.id.statusstat_tv);
            aksistat_tv = itemView.findViewById(R.id.aksistat_tv);

        }
    }
}
