package com.aqmal.siptatif;

public class DospemModel {
    String no;
    String nama;
    String nidn;
    String jk;
    String keahlian;
    String kuota;
    String aksi;

    public DospemModel(String no, String nama, String nidn, String jk, String keahlian, String kuota, String aksi) {
        this.no = no;
        this.nama = nama;
        this.nidn = nidn;
        this.jk = jk;
        this.keahlian = keahlian;
        this.kuota = kuota;
        this.aksi = aksi;
    }

    public String getNo() {
        return no;
    }

    public String getNama() {
        return nama;
    }

    public String getNidn() {
        return nidn;
    }

    public String getJk() {
        return jk;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public String getKuota() {
        return kuota;
    }

    public String getAksi() {
        return aksi;
    }
}
