package driver;

import java.util.Scanner;
import model.Model4;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Input tidak valid");
            return;
        }

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah data harus lebih dari 0");
            return;
        }

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Data stok tidak valid");
                return;
            }
            data[i] = sc.nextInt();
        }

        sc.nextLine();
        String kode = sc.nextLine().trim();

        int kategori = Model4.getIndexKategori(kode);

        if (kategori == -1) {
            System.out.println("Kode kategori tidak valid");
            return;
        }

        int hasil = Model4.hitungTotal(data, kategori);

        System.out.println(hasil);

        sc.close();
    }
}