package driver;

import java.util.*;
import model.*;

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Model6> riwayat = new ArrayList<>();

        while (true) {
            System.out.println("Nama:");
            String nama = sc.nextLine().trim();

            if (nama.equalsIgnoreCase("END")) break;

            if (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong\n");
                continue;
            }

            System.out.println("Menu:");
            System.out.println("1. Layanan Souvenir");
            System.out.println("2. Layanan Selempang Wisuda");
            System.out.println("3. Jasa Print");

            int layanan;
            try {
                layanan = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Input layanan tidak valid\n");
                continue;
            }

            String item = "";
            int jumlah = 0;
            int total = 0;

            if (layanan == 1) {
                System.out.println("Pilih Souvenir:");
                System.out.println("1. Pin (10000)");
                System.out.println("2. Gantungan Kunci (10000)");
                System.out.println("3. Stiker (15000)");
                System.out.println("4. Tote Bag (50000)");
                System.out.println("5. Jam (100000)");
                System.out.println("6. Tumbler (120000)");
                System.out.println("7. Pulpen (5000)");

                int pilihan;
                try {
                    pilihan = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Pilihan tidak valid\n");
                    continue;
                }

                System.out.println("Jumlah:");
                try {
                    jumlah = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Jumlah tidak valid\n");
                    continue;
                }

                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0\n");
                    continue;
                }

                int harga = Model5.getHargaSouvenir(pilihan);
                if (harga == -1) {
                    System.out.println("Souvenir tidak valid\n");
                    continue;
                }

                item = Model5.getNamaSouvenir(pilihan);
                total = Model5.hitungSouvenir(pilihan, jumlah);

            } else if (layanan == 2) {
                System.out.println("Jumlah selempang:");

                try {
                    jumlah = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Jumlah tidak valid\n");
                    continue;
                }

                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0\n");
                    continue;
                }

                item = "Selempang Wisuda";
                total = Model5.hitungSelempang(jumlah);

            } else if (layanan == 3) {
                System.out.println("Jumlah lembar print:");

                try {
                    jumlah = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Jumlah tidak valid\n");
                    continue;
                }

                if (jumlah <= 0) {
                    System.out.println("Jumlah harus lebih dari 0\n");
                    continue;
                }

                item = "Print";
                total = Model5.hitungPrint(jumlah);

            } else {
                System.out.println("Layanan tidak valid\n");
                continue;
            }

            riwayat.add(new Model6(nama, layanan, item, jumlah, total));
            System.out.println("Transaksi berhasil disimpan\n");
        }

        System.out.println("Riwayat Transaksi");
        int grandTotal = 0;

        for (Model6 data : riwayat) {
            System.out.println(
                data.getNama() + "|" +
                data.getLayanan() + "|" +
                data.getItem() + "|" +
                data.getJumlah() + "|" +
                data.getTotal()
            );
            grandTotal += data.getTotal();
        }

        System.out.println("Total keseluruhan: " + grandTotal);

        sc.close();
    }
}