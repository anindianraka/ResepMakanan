package com.example.user.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResepRendangActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_rendang);
        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("Judul"));

        TextView langkah = (TextView)findViewById(R.id.tv_langkah);
        ImageView gambar = (ImageView)findViewById(R.id.img_resepdua);

        gambar.setImageResource(intent.getIntExtra("Gambar",0));
        langkah.setText(intent.getStringExtra("Langkah"));

    }

}
