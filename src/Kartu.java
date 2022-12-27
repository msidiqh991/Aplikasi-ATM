public class Kartu extends Bank {
    public String NamaPengguna;
    public int password;
    int Saldo = 500000;

    public int getSaldo() {
        return Saldo;
    }

    public String getNamaPengguna() {
        return NamaPengguna;
    }
    public void setNamaPengguna(String namaPengguna) {
        NamaPengguna = namaPengguna;
    }

    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public double withdrawalCash() {
        // Pengolahan
        tarikDana[temp2] = jmlAmbil;
        temp2++;
        isi = Saldo;
        isi -= jmlAmbil;
        if (isi <= 50000) {
            System.out.println("Saldo Minimal Rp.50000");
        } else {
            Saldo -= jmlAmbil;
            System.out.println("Saldo Anda adalah Rp. " + Saldo);
        }
        System.out.println("=================================================");
        return 0;
    }
}
