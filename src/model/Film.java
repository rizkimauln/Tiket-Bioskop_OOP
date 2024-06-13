package model;

public class Film {
    private String idFilm;
    private String namaFilm;
    private String studio;
    private String waktu;
    private int hargaTiket;
    private boolean isAvailable;

    public Film setIdFilm(String idFilm) {
        this.idFilm = idFilm;
        return this;
    }

    public Film setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
        return this;
    }

    public Film setStudio(String studio) {
        this.studio = studio;
        return this;
    }

    public Film setWaktu(String waktu) {
        this.waktu = waktu;
        return this;
    }

    public Film setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
        return this;
    }

    public Film setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public String getStudio() {
        return studio;
    }

    public String getWaktu() {
        return waktu;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
