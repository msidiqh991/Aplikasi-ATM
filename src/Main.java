import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kartu card = new Kartu();
        Bank bx = new Bank();

            // Login system
            System.out.println("\n --- MyFunds Main Menu --- ");
            System.out.println(" ============================ ");
            System.out.print(" Masukkan username : ");
            card.setNamaPengguna(input.next());
            System.out.print(" Masukkan Password : ");
            card.setPassword(input.nextInt());

        do {
            // Display menu
            if (card.getPassword() == 123) {
                System.out.println("\n Selamat datang, " + card.getNamaPengguna());
                System.out.println(" -------< MENU ATM >-------");
                System.out.println(" [1] Cek Saldo ");
                System.out.println(" [2] Tarik Uang ");
                System.out.println(" [3] Transfer ");
                System.out.println(" [4] Exit ");
                System.out.println("--------------------------");
                System.out.print("Pilihanmu --> ");

                int decision2 = input.nextInt();
                switch (decision2) {
                    case 1:
                        System.out.println("\n Saldo anda adalah Rp." + card.getSaldo());
                        System.out.println(" ---------------------------------");
                        break;
                    case 2:
                        System.out.println(" Masukkan No.rekening : ");
                        bx.setNoRekNasabah(input.nextDouble());
                        System.out.println(" Masukan Nominal Uang Yang Ingin diambil - ");
                        System.out.print(" Rp. ");
                        bx.jmlAmbil = input.nextInt();
                        // Pengolahan
                        bx.tarikDana[bx.temp2] = bx.jmlAmbil;
                        bx.temp2++;
                        bx.isi = card.Saldo;
                        bx.isi -= bx.jmlAmbil;
                        if (bx.isi <= 50000) {
                            System.out.println("Saldo Minimal Rp.50000");
                        } else {
                            card.Saldo -= bx.jmlAmbil;
                            System.out.println("Saldo Anda adalah Rp. " + card.Saldo);
                        }
                        System.out.println("=======================================");
                        break;
                    case 3:
                        do {

                        } while (decision2 != 2);
                        break;
                    case 4:

                        break;

                    default:
                        break;
                    }
                } else {
                    System.out.println("\n Terdapat kesalahan, Silahkan mengulangi!");
                    exit(1);
                }
        } while (true);
    }
}