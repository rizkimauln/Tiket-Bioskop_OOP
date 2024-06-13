package model;

public class Akun {
    private String nama;
    private String email;
    private String alamat;

    public Akun setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Akun setAlamat(String alamat) {
        this.alamat = alamat;
        return this;
    }

    public String getAlamat() {
        return alamat;
    }
}
