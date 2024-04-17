package com.aqmal.siptatif;

public class StatPenModel {
    String tanggal;
    String judul;
    String status;
    String aksi;

    public StatPenModel(String tanggal, String judul, String status, String aksi) {
        this.tanggal = tanggal;
        this.judul = judul;
        this.status = status;
        this.aksi = aksi;
    }


    public String getTanggal() {
        return tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public String getStatus() {
        return status;
    }

    public String getAksi() {
        return aksi;
    }

}
