package model;

public class customerservice extends Akun {
    private String idPenjual;

    public customerservice setIdPenjual(String idPenjual) {
        this.idPenjual = idPenjual;
        return this;
    }

    public String getIdPenjual() {
        return idPenjual;
    }
}
