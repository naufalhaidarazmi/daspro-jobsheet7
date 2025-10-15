import java.util.Scanner;
public class kafedowhile23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti;
        String namapelanggan; 
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaroti = 20000;
        int totalharga;
        

        do {
            System.out.println("masukkan nama pelanggan:  (ketik 'batal' untuk keluar)");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi");
            kopi = sc.nextInt();
            System.out.println("jumlah teh");
            teh = sc.nextInt();
            System.out.println("jumlah roti");
            roti = sc.nextInt();
            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("total yang harus dibayar " + totalharga);
            sc.nextLine(); 
            
        } while (true);

        System.out.println("semua transaksi selesai");

        sc.close();

    }
    
    
}
