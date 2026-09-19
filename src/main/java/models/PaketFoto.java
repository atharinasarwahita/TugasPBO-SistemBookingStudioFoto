/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class PaketFoto {
    protected String namaPaket;
    protected int harga;

    public PaketFoto(String namaPaket, int harga) {
        this.namaPaket = namaPaket;
        this.harga = harga;
    }
    
    public String getNamaPaket(){ 
        return namaPaket; 
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int hitungTotalHarga() {
        return harga;
    }
    
    public void tampilkanInfoPaketFoto(){
        System.out.println("Nama Paket : " + namaPaket);
        System.out.println("Harga Paket: " + harga);
    }
    
    public void tampilkanRincian() {

    }
}
