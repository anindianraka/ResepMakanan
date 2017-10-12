package com.example.user.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 29/09/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {

    private Context context;
    private ArrayList<Resep>resep;

    public ResepAdapter(Context context, ArrayList<Resep> resep) {
        this.context = context;
        this.resep = resep;
    }


    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_makanan,parent,false);
                return new ResepViewHolder(view);
    }
    public class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView namaResep;
        TextView deskripsiResep;
        ImageView gambarResep;
        RelativeLayout relativeLayout;
        public ResepViewHolder(View itemView){
            super(itemView);
            deskripsiResep=(TextView) itemView.findViewById(R.id.tv_deskripsi_resep);
            namaResep=(TextView)itemView.findViewById(R.id.tv_namaresep);
            gambarResep=(ImageView)itemView.findViewById(R.id.img_resep);
            relativeLayout=(RelativeLayout)itemView.findViewById(R.id.ll_parent);
        }
    }
    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
        holder.namaResep.setText(resep.get(position).getJudulResep());
        holder.deskripsiResep.setText(resep.get(position).getDeskripsiResep());
        holder.gambarResep.setImageResource(resep.get(position).getGambarResep());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ResepRendangActivity.class);
                intent.putExtra("Judul",resep.get(position).getJudulResep());
                intent.putExtra("Langkah",resep.get(position).getLangkahResep());
                intent.putExtra("Gambar",resep.get(position).getGambarResep());
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return resep.size();
    }


}
