import java.util.Scanner;

public class Bank implements OperatingSystem {
    protected double NoRekNasabah, NoRekTujuan;
    protected int temp = 0, temp2 = 0;
    protected int jmlAmbil, isi;
    int[] tambahSaldo = new int[20], tarikDana = new int[20];


    public double getNoRekNasabah() {
        return NoRekNasabah;
    }
    public void setNoRekNasabah(double noRekNasabah) {
        NoRekNasabah = noRekNasabah;
    }

    public double getNoRekTujuan() {
        return NoRekTujuan;
    }
    public void setNoRekTujuan(double noRekTujuan) {
        NoRekTujuan = noRekTujuan;
    }

    @Override
    public void withdrawalCash() {
        Scanner in = new Scanner(System.in);
        Kartu x = new Kartu();

        System.out.println(" Masukkan No.rekening : ");
        setNoRekNasabah(in.nextDouble());
        System.out.println(" Masukan Nominal Uang Yang Ingin diambil - ");
        System.out.print(" Rp. ");
        jmlAmbil = in.nextInt();
        // Pengolahan
        tarikDana[temp2] = jmlAmbil;
        temp2++;
        isi = x.Saldo;
        isi -= jmlAmbil;
        if (isi <= 50000) {
            System.out.println("Saldo Minimal Rp.50000");
        } else {
            x.Saldo -= jmlAmbil;
            System.out.println("Saldo Anda adalah Rp. " + x.Saldo);
        }
        System.out.println("===================================");
    }

    @Override
    public int JumlahPenarikanUang() {
        return 0;
    }
}
