import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        int totalTiket = 0;
        double totalHarga = 0;
        double hargaTiket = 50000;
        String lanjut = "ya"; 

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.\n");
                continue;
            }

            double subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15 * subtotal;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * subtotal;
            }

            double totalBayar = subtotal - diskon;

            System.out.println("Subtotal: Rp" + subtotal);
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total bayar: Rp" + totalBayar);
            System.out.println();

            totalTiket += jumlahTiket;
            totalHarga += totalBayar;

            sc.nextLine();
            System.out.print("Apakah ada pelanggan lain? (ya/tidak): ");
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\n=== LAPORAN PENJUALAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp" + totalHarga);
        System.out.println("Program selesai.");

        sc.close();
    }
}
