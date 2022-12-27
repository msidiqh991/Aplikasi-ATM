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
}
