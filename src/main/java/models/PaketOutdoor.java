/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class PaketOutdoor extends PaketFoto {
    private int biayaLokasi;

    public PaketOutdoor(String namaPaket, int harga, int biayaLokasi) {
        super(namaPaket, harga);
        this.biayaLokasi = biayaLokasi;
    }

    public double getBiayaLokasi(){
        return biayaLokasi; 
    }
    
    @Override
    public int hitungTotalHarga(){
        return harga + biayaLokasi;
    }
}
