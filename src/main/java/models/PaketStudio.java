/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class PaketStudio extends PaketFoto {
    private int kapasitasOrang;

    public PaketStudio(String namaPaket, int harga, int kapasitasOrang) {
        super(namaPaket, harga);
        this.kapasitasOrang = kapasitasOrang;
    }
    
    public void setKapasitasOrang(int kapasitasOrang) {
    this.kapasitasOrang = kapasitasOrang;
    }
    
    public int hitungBiayaEkstra() {
    if (kapasitasOrang > 5) {
        return (kapasitasOrang - 5) * 20000;
    }
    return 0;
    }

    @Override
    public int hitungTotalHarga() {
        return harga + hitungBiayaEkstra();
    }

    @Override
    public void tampilkanRincian() {
        System.out.println("Jumlah Orang   : " + kapasitasOrang + " orang");
        int extraBiaya = hitungBiayaEkstra();
        if (extraBiaya > 0) {
            int extraOrang = kapasitasOrang - 5;
            System.out.println("Biaya Ekstra   : Rp" + extraBiaya + " (" + extraOrang + " orang x Rp20.000)");
        } else {
            System.out.println("Biaya Ekstra   : Rp0 (Maks 5 orang gratis)");
        }
    }

    public int getKapasitasOrang(){ 
        return kapasitasOrang; 
    }
    
    public void tampilkanInfoPaketStudio(){
        System.out.println("Kapasitas Orang : " + kapasitasOrang);
        System.out.println("Total Harga : " + hitungTotalHarga());
    }
}
