package model;

public class Model1 {
    private String kode;
    private String nama;
    private int ongkir;
    private String kategori;

    public Model1(String kode, String nama, int ongkir, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.ongkir = ongkir;
        this.kategori = kategori;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getOngkir() {
        return ongkir;
    }

    public String getKategori() {
        return kategori;
    }
}