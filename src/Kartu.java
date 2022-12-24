public class Kartu extends Bank {
    public String NamaPengguna = "Muhammad Sidiq";
    public int pin;
    protected int AccesKey = 140803;

    public void AksesMasuk(){
        if(pin == AccesKey){
            Bankmenu();
        } else {
            System.out.println("Terdapat kesalahan, Silahkan mengulangi!");
        }
    }

    public String getNamaPengguna() {
        return NamaPengguna;
    }

    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}
