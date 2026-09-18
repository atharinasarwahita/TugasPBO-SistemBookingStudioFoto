/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import models.Booking;
import java.util.ArrayList;

public class BookingService {
    private ArrayList<Booking> daftarBooking = new ArrayList<>();

    public void tambahBooking(Booking booking) {
        daftarBooking.add(booking);
    }
    
    public boolean isIdExist(String idBooking) {
    for (Booking b : daftarBooking) {
        if (b.getIdBooking().equalsIgnoreCase(idBooking)) {
            return true;
        }
    }
    return false;
    }

    public void tampilkanInfoBooking() {
        if (daftarBooking.isEmpty()) {
            System.out.println("\nBelum ada data booking.");
            return;
        }

        System.out.println("\n================ DAFTAR BOOKING STUDIO ==================");
        for (Booking b : daftarBooking) {
            System.out.println("ID Booking  : " + b.getIdBooking());
            System.out.println("Pembooking  : " + b.getCustomer().getNama() + " (" + b.getCustomer().getNoTelepon() + ")");
            System.out.println("Jadwal Sesi : " + b.getJadwal().getInfoJadwal());
            System.out.println("Paket Foto  : " + b.getPaketFoto().getNamaPaket());
            System.out.println("Total Bayar : Rp" + b.getTotalBayar());
            System.out.println("---------------------------------------------------------");
        }
    }
}
