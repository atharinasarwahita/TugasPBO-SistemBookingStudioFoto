/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import models.*;
import service.BookingService;
import service.ValidasiInput;

public class Main {

    public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        
        PaketStudio studio1 = new PaketStudio("Paket Family", 150000, 0);
        PaketStudio studio2 = new PaketStudio("Paket Graduation", 200000, 0);

        PaketOutdoor outdoor1 = new PaketOutdoor("Prewedding Nature", 500000, 200000);
        PaketOutdoor outdoor2 = new PaketOutdoor("Buku Tahunan", 750000, 300000);

        PaketStudio[] katalogStudio = {studio1, studio2};
        PaketOutdoor[] katalogOutdoor = {outdoor1, outdoor2};
        
        //Data Dummy untuk menampilkan menu 2
        Customer customerd = new Customer("Atha Rina", "081234567890");
        Jadwal jadwald = new Jadwal("2026-09-25", "14:00");
        PaketStudio paketd = new PaketStudio("Paket Graduation", 200000, 0);
        paketd.setKapasitasOrang(8);

        Booking bookingDummy = new Booking("BK01", customerd, jadwald, paketd);
        bookingService.tambahBooking(bookingDummy);
        
        int pilihan = 0;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN BOOKING STUDIO FOTO ===");
            System.out.println("1. Tambah Booking");
            System.out.println("2. Lihat Daftar Booking");
            System.out.println("3. Keluar");

            pilihan = ValidasiInput.inputAngka("Pilih menu (1-3): ");

            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n--- DATA BOOKING ---");
                    String idBooking = ValidasiInput.inputIdUnik("ID Booking (misal BK01): ",bookingService);

                    System.out.println("\n--- DATA PEMBOOKING ---");
                    String nama = ValidasiInput.inputTeks("Nama Pembooking: ");
                    String noHp = ValidasiInput.inputTeks("No HP: ");
                    Customer customer = new Customer(nama, noHp);

                    System.out.println("\n--- JADWAL SESI ---");
                    String tanggal = ValidasiInput.inputTeks("Tanggal (YYYY-MM-DD): ");
                    String jam = ValidasiInput.inputTeks("Jam Sesi (HH:MM): ");
                    Jadwal jadwal = new Jadwal(tanggal, jam);

                    System.out.println("\n--- PILIH PAKET FOTO ---");
                    System.out.println("1. Paket Studio");
                    System.out.println("2. Paket Outdoor");
                    int tipe = 0;
                    while (true) {
                        tipe = ValidasiInput.inputAngka("Pilih jenis paket (1-2): ");
                        if (tipe == 1 || tipe == 2) {
                            break;
                        }
                        System.out.println("Pilihan tidak valid! Masukkan angka 1 atau 2.");
                    }

                    PaketFoto paketPilihan = null;

                    if (tipe == 1) {
                    System.out.println("\n--- PAKET STUDIO ---");
                    System.out.println("1. " + studio1.getNamaPaket() + " (Rp" + studio1.getHarga() + ")");
                    System.out.println("2. " + studio2.getNamaPaket() + " (Rp" + studio2.getHarga() + ")");

                    int pilPaket = 0;
                    while (true) {
                        pilPaket = ValidasiInput.inputAngka("Pilih nomor paket (1-2): ");
                        if (pilPaket == 1 || pilPaket == 2) {
                            break;
                        }
                        System.out.println("Nomor paket tidak valid! Pilih 1 atau 2.");
                    }

                    PaketStudio paketDipilih = katalogStudio[pilPaket - 1];
                    int jumlahOrang = ValidasiInput.inputAngka("Masukkan Jumlah Orang: ");
                    paketDipilih.setKapasitasOrang(jumlahOrang);
                    paketPilihan = paketDipilih;

                } else {
                    System.out.println("\n--- PAKET OUTDOOR ---");
                    System.out.println("1. " + outdoor1.getNamaPaket() + " (Rp" + outdoor1.getHarga() + ")");
                    System.out.println("2. " + outdoor2.getNamaPaket() + " (Rp" + outdoor2.getHarga() + ")");

                    int pilPaket = 0;
                    while (true) {
                        pilPaket = ValidasiInput.inputAngka("Pilih nomor paket (1-2): ");
                        if (pilPaket == 1 || pilPaket == 2) {
                            break;
                        }
                        System.out.println("Nomor paket tidak valid! Pilih 1 atau 2.");
                    }

                    paketPilihan = katalogOutdoor[pilPaket - 1];
                }

                    Booking bookingBaru = new Booking(idBooking, customer, jadwal, paketPilihan);
                    bookingService.tambahBooking(bookingBaru);
                    System.out.println("\n-----------------------------------------");
                    System.out.println("Transaksi booking kamu berhasil disimpan!");
                    System.out.println("-----------------------------------------");
                    bookingBaru.tampilkanInvoice();
                }
                case 2 -> bookingService.tampilkanInfoBooking();
                case 3 -> System.out.println("Terimakasih sudah menggunakan sistem ini!.");
                default -> System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 3);
    }
}