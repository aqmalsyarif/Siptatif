package com.aqmal.siptatif;

public class DataPendaftaranModel {
    String tanggal;
    String judul;
    String status;

    public DataPendaftaranModel(String tanggal, String judul, String status) {
        this.tanggal = tanggal;
        this.judul = judul;
        this.status = status;
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
}
