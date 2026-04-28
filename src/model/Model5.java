package model;

import java.util.HashMap;
import java.util.Map;

public class Model5 {

    private static Map<Integer, Integer> hargaSouvenir = new HashMap<>();
    private static Map<Integer, String> namaSouvenir = new HashMap<>();

    static {
        hargaSouvenir.put(1, 10000);
        hargaSouvenir.put(2, 10000);
        hargaSouvenir.put(3, 15000);
        hargaSouvenir.put(4, 50000);
        hargaSouvenir.put(5, 100000);
        hargaSouvenir.put(6, 120000);
        hargaSouvenir.put(7, 5000);

        namaSouvenir.put(1, "Pin");
        namaSouvenir.put(2, "Gantungan Kunci");
        namaSouvenir.put(3, "Stiker");
        namaSouvenir.put(4, "Tote Bag");
        namaSouvenir.put(5, "Jam");
        namaSouvenir.put(6, "Tumbler");
        namaSouvenir.put(7, "Pulpen");
    }

    public static int getHargaSouvenir(int pilihan) {
        return hargaSouvenir.getOrDefault(pilihan, -1);
    }

    public static String getNamaSouvenir(int pilihan) {
        return namaSouvenir.getOrDefault(pilihan, "Tidak valid");
    }

    public static int hitungSouvenir(int pilihan, int jumlah) {
        int harga = getHargaSouvenir(pilihan);
        if (harga == -1) return -1;
        return harga * jumlah;
    }

    public static int hitungSelempang(int jumlah) {
        return 100000 * jumlah;
    }

    public static int hitungPrint(int jumlah) {
        return 1000 * jumlah;
    }

    public static int hitungMinuman(int jumlah) {
        return 20000 * jumlah;
    }
}