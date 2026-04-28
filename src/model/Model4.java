package model;

public class Model4 {

    public static int getIndexKategori(String kode) {
        if (kode.equalsIgnoreCase("A")) return 0;
        if (kode.equalsIgnoreCase("B")) return 1;
        if (kode.equalsIgnoreCase("C")) return 2;
        if (kode.equalsIgnoreCase("D")) return 3;
        return -1;
    }

    public static int hitungTotal(int[] data, int kategori) {
        int total = 0;

        for (int i = 0; i < data.length; i++) {
            if (i % 4 == kategori) {
                total += data[i];
            }
        }

        return total;
    }
}