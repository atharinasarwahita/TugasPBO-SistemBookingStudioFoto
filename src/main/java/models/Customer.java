/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Customer {
    private String nama;
    private String noTelepon;

    public Customer(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    
    public String getNama(){ 
        return nama; 
    }
    
    public String getNoTelepon(){
        return noTelepon; 
    }
}
