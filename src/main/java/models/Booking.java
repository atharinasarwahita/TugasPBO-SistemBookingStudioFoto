/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Booking {
    private String idBooking;
    private Customer customer;
    private Jadwal jadwal;
    private PaketFoto paketFoto;

    public Booking(String idBooking, Customer customer, Jadwal jadwal, PaketFoto paketFoto) {
        this.idBooking = idBooking;
        this.customer = customer;
        this.jadwal = jadwal;
        this.paketFoto = paketFoto;
    }

    public String getIdBooking(){
        return idBooking;
    }
    
    public Customer getCustomer(){ 
        return customer; 
    }
    
    public Jadwal getJadwal(){
        return jadwal; 
    }
    
    public PaketFoto getPaketFoto(){ 
        return paketFoto; 
    }

    public int getTotalBayar(){
        return paketFoto.hitungTotalHarga();
    }
    
    public void tampilkanInvoice() {
    System.out.println("\n==========================================");
    System.out.println("            INVOICE BOOKING STUDIO        ");
    System.out.println("==========================================");
    System.out.println("ID Booking     : " + idBooking);
    System.out.println("Nama Pembooking: " + customer.getNama());
    System.out.println("No HP          : " + customer.getNoTelepon());
    System.out.println("Jadwal Sesi    : " + jadwal.getTanggal() + " | Jam: " + jadwal.getJam());
    System.out.println("------------------------------------------");
    System.out.println("Paket Foto     : " + paketFoto.getNamaPaket());
    System.out.println("Harga          : Rp" + paketFoto.getHarga());

    paketFoto.tampilkanRincian();

    System.out.println("------------------------------------------");
    System.out.println("TOTAL BAYAR    : Rp" + paketFoto.hitungTotalHarga());
    System.out.println("==========================================");
    }
}
