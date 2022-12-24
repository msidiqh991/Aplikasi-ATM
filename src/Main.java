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



    }
}