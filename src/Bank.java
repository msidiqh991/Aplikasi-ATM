public class Bank implements OperatingSystem {
    private double NoRekNasabah, NoRekTujuan;

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
    public double JumlahTransfer() {
        return 0;
    }
    @Override
    public int JumlahPenarikanUang() {
        return 0;
    }

    @Override
    public void Bankmenu() {
        System.out.println("-------= MENU ATM =-------");
        System.out.println(" [1] Cek Saldo ");
        System.out.println(" [2] Tarik Uang ");
        System.out.println(" [3] Transfer ");
        System.out.println(" [4] Exit ");
        System.out.println("--------------------------");
        System.out.println("Pilihanmu --> ");
    }
}
