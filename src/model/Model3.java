package model;

public class Model3 {

    public static double hitungOngkir(double totalBerat, int hargaPerKg) {
        return totalBerat * hargaPerKg;
    }

    public static double applyDiskon(double total, double totalBerat) {
        if (totalBerat > 10) {
            return total * 0.9;
        }
        return total;
    }

    public static String getPromo(double totalBerat, String kategori) {
        StringBuilder promo = new StringBuilder();

        if (totalBerat > 10) {
            promo.append("Diskon 10%");
        }

        if (kategori.equalsIgnoreCase("Luar Pulau")) {
            if (promo.length() > 0) {
                promo.append(" + ");
            }
            promo.append("Asuransi Gratis");
        }

        if (promo.length() == 0) {
            return "Tidak ada promo";
        }

        return promo.toString();
    }
}