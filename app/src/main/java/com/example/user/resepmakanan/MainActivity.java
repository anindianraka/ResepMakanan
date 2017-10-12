package com.example.user.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String [] judulResep,deskripsiResep,langkahResep;
    ImageView gambarResep;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*deskripsiResep = (TextView) findViewById(R.id.tv_deskripsi_resep);
        namaResep = (TextView)findViewById(R.id.tv_namaresep);
        gambarResep=(ImageView)findViewById(R.id.img_resep);
        langkahResep=(TextView)findViewById(R.id.tv_langkah);*/



        recyclerView = (RecyclerView)findViewById(R.id.rv_resep);

        LinearLayoutManager linierLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linierLayoutManager);

        judulResep=getResources().getStringArray(R.array.JudulResep);
        deskripsiResep=getResources().getStringArray(R.array.PenjelasanResep);
        langkahResep=getResources().getStringArray(R.array.LangkahResep);
        int[] gambarResep={R.drawable.rendang,R.drawable.nasgor,R.drawable.nasduk,R.drawable.ayam};

        ArrayList<Resep>resepArrayList=new ArrayList<>();

        for(int i=0;i<judulResep.length;i++){
            Resep resep = new Resep (judulResep[i],gambarResep[i],deskripsiResep[i],langkahResep[i]);
            resepArrayList.add(resep);
        }
        ResepAdapter resepAdapter = new ResepAdapter(this,resepArrayList);
        recyclerView.setAdapter(resepAdapter);
    }
}
