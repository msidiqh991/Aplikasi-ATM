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
    public double withdrawalCash() {
        return 0;
    }
    @Override
    public int JumlahPenarikanUang() {
        return 0;
    }
}
