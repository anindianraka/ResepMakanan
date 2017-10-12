package com.example.user.resepmakanan;

/**
 * Created by user on 29/09/2017.
 */

public class Resep {

    private  String deskripsiResep;
    private int gambarResep;
    private  String judulResep;
    private String langkahResep;

    public Resep(String judulResep,int gambarResep,String deskripsiResep,  String langkahResep) {
        this.deskripsiResep = deskripsiResep;
        this.gambarResep = gambarResep;
        this.judulResep = judulResep;
        this.langkahResep = langkahResep;
    }
    public String getDeskripsiResep () {
        return deskripsiResep;
    }

    public int getGambarResep() {
        return gambarResep;
    }

    public String getJudulResep() {
        return judulResep;
    }

    public String getLangkahResep() {
        return langkahResep;
    }
}
