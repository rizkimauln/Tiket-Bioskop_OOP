package model;

public class DetailPenjualan {
    private String idDetailPenjualan;
    private Penjualan penjualan;
    private Film tiketfilm;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;
    private String tempatDuduk;

    public String getIdDetailPenjualan() {
        return idDetailPenjualan;
    }

    public void setIdDetailPenjualan(String idDetailPenjualan) {
        this.idDetailPenjualan = idDetailPenjualan;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public Film getTiketFilm() {
        return tiketfilm;
    }

    public void setTiketFilm(Film tiketfilm) {
        this.tiketfilm = tiketfilm;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int i) {
        this.hargaJual = i;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public String setTempatDuduk() {
        return tempatDuduk;
    }

    public void setTempatDuduk(String tempatDuduk) {
        this.tempatDuduk = tempatDuduk;
    }

}
