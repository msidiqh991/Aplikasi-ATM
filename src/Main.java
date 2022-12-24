import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kartu card = new Kartu();
        Bank bx = new Bank();

        // Manual input system
        System.out.println("\n --- BANK KITA BERSAMA --- ");
        System.out.println(" ------------------------- ");
        System.out.print(" Input No.rekening : ");
        bx.setNoRekNasabah(input.nextDouble());
        System.out.print(" Input PIN : ");
        card.setPin(input.nextInt());

        // Display menu
        while (true){
            card.AksesMasuk();
            int decision = input.nextInt();
            switch (decision) {
                case 1:
                    System.out.println(" Saldo anda adalah Rp." + card.getSaldo());
                    System.out.println("-----------------------------------------");
                    break;
                case 2 :
                    do {

                    } while (decision != 2);
                    break;
                case 3 :
                    do{

                    } while (decision != 2);
                    break;
            }
        }


    }
}