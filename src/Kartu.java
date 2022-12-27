public class Kartu extends Bank {
    public String NamaPengguna;
    public int password;
    int TabunganAwal = 500000;

    public int getSaldo() {
        return TabunganAwal;
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
}
