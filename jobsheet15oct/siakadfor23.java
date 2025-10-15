package jobsheet15oct;

import java.util.Scanner;

public class siakadfor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaitertinggi = 0;
        double nilaiterendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = sc.nextDouble();

            if (nilai > nilaitertinggi) {
                nilaitertinggi = nilai;
            }

            if (nilai < nilaiterendah) {
                nilaiterendah = nilai;
            }

            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi adalah: " + nilaitertinggi);
        System.out.println("Nilai terendah adalah: " + nilaiterendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        sc.close();
    }
}
