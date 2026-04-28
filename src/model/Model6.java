package model;

public class Model6 {
    private String nama;
    private int layanan;
    private String item;
    private int jumlah;
    private int total;

    public Model6(String nama, int layanan, String item, int jumlah, int total) {
        this.nama = nama;
        this.layanan = layanan;
        this.item = item;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getNama() {
        return nama;
    }

    public int getLayanan() {
        return layanan;
    }

    public String getItem() {
        return item;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotal() {
        return total;
    }
}