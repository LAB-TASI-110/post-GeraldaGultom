package driver;

import java.util.*;
import model.*;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Model1> dataKota = new HashMap<>();
        dataKota.put("MDN", new Model1("MDN", "Medan", 8000, "Dalam Pulau"));
        dataKota.put("BLG", new Model1("BLG", "Balige", 5000, "Dalam Pulau"));
        dataKota.put("JKT", new Model1("JKT", "Jakarta", 12000, "Luar Pulau"));
        dataKota.put("SBY", new Model1("SBY", "Surabaya", 13000, "Luar Pulau"));

        StringBuilder output = new StringBuilder();

        while (true) {
            String kode = sc.nextLine().trim();
            if (kode.equalsIgnoreCase("END")) break;

            if (!dataKota.containsKey(kode)) {
                output.append("Kode kota tidak valid\n\n");
                continue;
            }

            if (!sc.hasNextDouble()) {
                output.append("Input berat tidak valid\n\n");
                sc.nextLine();
                continue;
            }

            double beratButet = sc.nextDouble();
            sc.nextLine();

            if (beratButet <= 0) {
                output.append("Berat harus lebih dari 0\n\n");
                continue;
            }

            Model1 kota = dataKota.get(kode);
            Model2 berat = new Model2(beratButet);

            double totalBerat = berat.getTotalBerat();
            double ongkir = Model3.hitungOngkir(totalBerat, kota.getOngkir());
            double totalBayar = Model3.applyDiskon(ongkir, totalBerat);
            String promo = Model3.getPromo(totalBerat, kota.getKategori());

            output.append("Kota tujuan: ").append(kota.getNama()).append("\n");
            output.append("Berat paket Butet: ").append(berat.getBeratButet()).append("\n");
            output.append("Berat paket Ucok: ").append(berat.getBeratUcok()).append("\n");
            output.append("Total berat: ").append(totalBerat).append("\n");
            output.append("Total ongkos kirim: ").append(totalBayar).append("\n");
            output.append("Informasi promo: ").append(promo).append("\n\n");
        }

        System.out.print(output.toString());
        sc.close();
    }
}