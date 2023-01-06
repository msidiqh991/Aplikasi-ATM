import java.util.Scanner;
public class Bank implements OperatingSystem {
    protected double NoRekNasabah, NoRekTujuan;
    protected int temp = 0, temp2 = 0;
    protected int jmlAmbil, isi, updatedSaldo;
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

    public void getUpdatedSaldo() {
        Kartu x = new Kartu();
        x.Saldo += jmlAmbil;
        System.out.println("\n Saldo anda adalah Rp." + x.Saldo);
        System.out.println(" ---------------------------------");
    }

    @Override
    public void withdrawalCash() {
        Scanner in = new Scanner(System.in);
        Kartu x = new Kartu();

        try {
            System.out.print(" Masukkan No.rekening : ");
            setNoRekNasabah(in.nextDouble());
            System.out.println(" Masukan Nominal Uang Yang Ingin diambil - ");
            System.out.print(" Rp. ");
            jmlAmbil = in.nextInt();
            // Process
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void TransferCash() {
        Scanner in = new Scanner(System.in);
        Kartu x = new Kartu();

        try {
            System.out.print(" Masukkan No.rekening Nasabah : ");
            setNoRekNasabah(in.nextDouble());
            System.out.print(" Masukkan No.rekening Tujuan : ");
            setNoRekTujuan(in.nextDouble());
            System.out.println(" Masukan Nominal yang ingin ditransfer - ");
            System.out.print(" Rp. ");
            jmlAmbil = in.nextInt();
            // Process
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
        } catch(Exception o){
            System.out.println(" Ada kesalahan pada input program, Silahkan mengulangi !");
        }
    }

    @Override
    public void IncomeCash() {
        Scanner in = new Scanner(System.in);
        Kartu x = new Kartu();

        try {
            System.out.print(" Masukkan No.rekening Nasabah : ");
            setNoRekNasabah(in.nextDouble());
            System.out.println(" Masukkan Nominal yang ingin ditambahkan - ");
            System.out.print(" Rp. ");
            jmlAmbil = in.nextInt();
            // Process
            x.Saldo += jmlAmbil;
            System.out.println(" Total saldo anda adalah Rp." + x.Saldo);
        } catch (Exception o){
            System.out.println(" Ada kesalahan pada input program, Silahkan mengulangi !");
        }
    }
}
