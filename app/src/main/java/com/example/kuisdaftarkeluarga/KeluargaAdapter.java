package com.example.kuisdaftarkeluarga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder>
{

    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList)
    {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeluargaAdapter.KeluargaViewHolder holder, int position)
    {
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.txtttl.setText(dataList.get(position).getTtl());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtStatus,txtttl;
        private ImageView srcGambar;

        public KeluargaViewHolder(@NonNull View itemView) {
            super(itemView);
            srcGambar =(ImageView)itemView.findViewById(R.id.gambar);
            txtNama = (TextView) itemView.findViewById(R.id.tv_nama);
            txtStatus = (TextView) itemView.findViewById(R.id.tv_status);
            txtttl = (TextView) itemView.findViewById(R.id.tv_ttl);

        }
    }
}