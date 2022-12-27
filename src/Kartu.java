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
}
