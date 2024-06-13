package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Film;
import model.DetailPenjualan;
import model.customerservice;
import model.Penjualan;

public class ControlBioskop {
    HashMap<String, Film> films = new HashMap();
    ArrayList<Penjualan> penjualans = new ArrayList<>();
    HashMap<String, customerservice> penjuals = new HashMap();
    private String kembalian;

    public void setUp() {
        Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();
        Film film5 = new Film();
        film1.setNamaFilm("Film Siksa Neraka").setIdFilm("1").setHargaTiket(25000).setStudio("02").setWaktu("13.00")
                .setIsAvailable(true);
        film2.setNamaFilm("Film 13 Bom Di Jakarta").setIdFilm("2").setHargaTiket(25000).setStudio("03")
                .setWaktu("15.30").setIsAvailable(true);
        film3.setNamaFilm("Film Layangan Putus The Movie ").setIdFilm("3").setHargaTiket(25000).setStudio("05")
                .setWaktu("17.00").setIsAvailable(true);
        film4.setNamaFilm("Film Jatuh Cinta Seperti Di FIlm-Film").setIdFilm("4").setHargaTiket(25000).setStudio("01")
                .setWaktu("18.30").setIsAvailable(true);
        film5.setNamaFilm("Film Panggonan WIngit").setIdFilm("5").setHargaTiket(25000).setStudio("04").setWaktu("19.10")
                .setIsAvailable(true);

        films.put(film1.getIdFilm(), film1);
        films.put(film2.getIdFilm(), film2);
        films.put(film3.getIdFilm(), film3);
        films.put(film4.getIdFilm(), film4);
        films.put(film5.getIdFilm(), film5);

        customerservice penjual1 = new customerservice();
        customerservice penjual2 = new customerservice();
        penjual1.setIdPenjual("01").setAlamat("Bandung").setEmail("muhammad.ridwan@gmail.com").setNama("Ridwan");
        penjual2.setIdPenjual("02").setAlamat("Bandung").setEmail("sarah.niril.yakin@gmail.com").setNama("Sarah");
        penjuals.put(penjual1.getIdPenjual(), penjual1);
        penjuals.put(penjual2.getIdPenjual(), penjual2);
    }

    public void lihatDaftarFilm() {
        System.out.println();
        System.out.println("==== Daftar Film Yang tersedia ====");
        for (Map.Entry<String, Film> barang : films.entrySet()) {
            String key = barang.getKey();
            Film tBarang = barang.getValue();
            if (tBarang.isAvailable()) {
                System.out.println("Kode Film \t\t :" + key);
                System.out.println("Nama Film\t\t :" + tBarang.getNamaFilm());
                System.out.println("Harga Tiket\t\t :" + tBarang.getHargaTiket());
                System.out.println();
            }

        }
    }

    public Film getBarang(String idTiket) {
        return films.get(idTiket);
    }

    public customerservice getPenjual(String idPenjual) {
        return penjuals.get(idPenjual);
    }

    public void belanja() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailPenjualan> tDetilPenjualans = new ArrayList<>();
        int increment = 0;
        String lanjut = "";

        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan Masukan Kode Film\t: ");
                String kodeBarang = input.readLine();
                System.out.print("Jumlah Tiket Yang Akan DI Beli\t: ");
                int jumlah = Integer.valueOf(input.readLine());

                for (int i = 0; i < jumlah; i++) {
                    System.out.println("\n");
                    System.out.println("       PILIHAN TEMPAT DUDUK");
                    System.out.println("---------------------------------");
                    System.out.println("A1\tA2\tA3\tA4\tA5");
                    System.out.println("B1\tB2\tB3\tB4\tB5");
                    System.out.println("C1\tC2\tC3\tC4\tC5");
                    System.out.println("D1\tD2\tD3\tD4\tD5");
                    System.out.println("E1\tE2\tE3\tE4\tE5");
                    System.out.println("---------------------------------");

                    System.out.print("Pilih Tempat Duduk Untuk Tiket Ke-" + (i + 1) + ": ");
                    String tempatDuduk = input.readLine();

                    DetailPenjualan dp = new DetailPenjualan();
                    Film tBarang = getBarang(kodeBarang);
                    dp.setIdDetailPenjualan("dp" + increment);
                    dp.setTiketFilm(tBarang);
                    dp.setHargaJual(tBarang.getHargaTiket());
                    dp.setJumlahBeli(1);
                    dp.setSubTotal(tBarang.getHargaTiket());
                    dp.setTempatDuduk(tempatDuduk);
                    tDetilPenjualans.add(dp);
                }

                System.out.print("Belanja Kembali (Y/N)?\t\t: ");
                lanjut = input.readLine();

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("        BERIKUT DAFTAR PESANAN ANDA         ");
            tampilkanDaftarBelanjaan(tDetilPenjualans);
            System.out.println("TOTAL\t\t\t\t:" + hitungTotalBelanja(tDetilPenjualans));

            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n");
            System.out.print("Konfirmasi pembelian (Y/N)?\t: ");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();

            if (konfirm.equalsIgnoreCase("y")) {
                System.out.print("Masukan Jumlah Uang\t\t: ");
                int jumlahUang = Integer.valueOf(input.readLine());

                int totalBelanja = hitungTotalBelanja(tDetilPenjualans);
                int kembalian = jumlahUang - totalBelanja;

                if (kembalian >= 0) {
                    System.out.println("Kembalian\t\t\t: " + kembalian);

                    Penjualan penjualan = new Penjualan();
                    penjualan.setDetilPenjualans(tDetilPenjualans)
                            .setPenjual(getPenjual("01"))
                            .setTanggal(LocalDate.now())
                            .setTotal(totalBelanja)
                            .setJumlahUang(jumlahUang)
                            .setKembalian(kembalian);

                    penjualans.add(penjualan);
                } else {
                    System.out.println("Jumlah uang tunai kurang, Pembelian dibatalkan.");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarBelanjaan(ArrayList<DetailPenjualan> dp) {
        for (DetailPenjualan detilPenjualan : dp) {
            System.out.println("Nama Barang\t\t\t:" + detilPenjualan.getTiketFilm().getNamaFilm());
            System.out.println("Harga\t\t\t\t:" + detilPenjualan.getHargaJual());
            System.out.println("Jumlah\t\t\t\t:" + detilPenjualan.getJumlahBeli());
            System.out.println("--------------------------------------------");
        }
    }

    public int hitungTotalBelanja(ArrayList<DetailPenjualan> dp) {
        int total = 0;
        for (DetailPenjualan detilPenjualan : dp) {
            total += detilPenjualan.getSubTotal();
        }
        return total;
    }

    public void tampilkanLaporanPenjualan() {
        for (Penjualan penjualan : penjualans) {
            System.err.println();
            ArrayList<DetailPenjualan> detilPenjualans = penjualan.getDetilPenjualans();

            for (DetailPenjualan dp : detilPenjualans) {
                System.out.println("                  TIKET                     ");
                System.out.println("        BIOSKOP CINEMA XXI BANDUNG          ");
                System.out.println("============================================");
                System.out.println("Tanggal\t\t\t\t: " + penjualan.getTanggal());
                System.out.println("Waktu Tayang\t\t\t: " + dp.getTiketFilm().getWaktu());
                System.out.println("Customer Service\t\t: " + penjualan.getPenjual().getNama());
                System.out.println("============================================");
                System.out.println("Film\t\t: " + dp.getTiketFilm().getNamaFilm());
                System.out.println("Studio\t\t: " + dp.getTiketFilm().getStudio());
                System.out.println("Tempat Duduk\t: " + dp.setTempatDuduk());
                System.out.println("Harga\t\t: " + dp.getHargaJual());
                System.out.println("Subtotal\t: " + dp.getSubTotal());
                System.out.println("--------------------------------------------");
            }
        }
    }

}