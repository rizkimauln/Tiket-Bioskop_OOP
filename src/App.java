import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import controller.ControlBioskop;
import model.Film;
import model.customerservice;

public class App {
    public static void main(String[] args) throws Exception {
        ControlBioskop controller = new ControlBioskop();
        controller.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu\t\t\t: ");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    controller.lihatDaftarFilm();
                    break;
                case "2":
                    controller.belanja();
                    break;
                case "3":
                    controller.tampilkanLaporanPenjualan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("\n");
        System.out.println("Buah Selasih Buah Pepaya");
        System.out.println("Terima Kasih Jangan Lupa Datang Lagi Ya");
        System.out.println("\n");

    }

    public static void tampilkanMenu() {
        System.out.println("\n");
        System.out.println("                SELAMAT DATANG              ");
        System.out.println("      DI BIOSKOP CINEMA XXI BANDUNG         ");
        System.out.println("============================================");
        System.out.println("Silahkan Pilih Menu:");
        System.out.println("1. Lihat Daftar Film");
        System.out.println("2. Pesan Tiket");
        System.out.println("3. Cetak Tiket");
        System.out.println("4. Keluar");
        System.out.println("--------------------------------------------");
    }
}
