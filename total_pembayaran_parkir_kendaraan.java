import java.util.Scanner;

public class total_pembayaran_parkir_kendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        System.out.println("=== PROGRAM PARKIR KENDARAAN ===");
        System.out.println("Tarif: Mobil Rp3000/jam, Motor Rp2000/jam");
        System.out.println("Jika durasi > 5 jam, tarif tetap Rp12500\n");

        do {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; 
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue; 
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) { 
                    total += durasi * 3000;
                } else if (jenis == 2) { 
                    total += durasi * 2000;
                }
            }

            System.out.println("Subtotal saat ini: Rp" + total + "\n");

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp" + total);
        System.out.println("Terima kasih!");

        sc.close();
    }
}

