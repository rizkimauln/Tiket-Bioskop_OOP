package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Penjualan {
    private String idPenjualan;
    private customerservice penjual;
    private int total;
    private int jumlahUang;
    private int kembalian;
    private LocalDate tanggal;
    private ArrayList<DetailPenjualan> detilPenjualans;

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public Penjualan setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
        return this;
    }

    public customerservice getPenjual() {
        return penjual;
    }

    public Penjualan setPenjual(customerservice penjual) {
        this.penjual = penjual;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Penjualan setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getJumlahUang() {
        return jumlahUang;
    }

    public Penjualan setJumlahUang(int jumlahUang) {
        this.jumlahUang = jumlahUang;
        return this;
    }

    public int getKembalian() {
        return kembalian;
    }

    public Penjualan setKembalian(int kembalian) {
        this.kembalian = kembalian;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public Penjualan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetailPenjualan> getDetilPenjualans() {
        return detilPenjualans;
    }

    public Penjualan setDetilPenjualans(ArrayList<DetailPenjualan> detilPenjualans) {
        this.detilPenjualans = detilPenjualans;
        return this;
    }

}
