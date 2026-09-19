/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Customer {
    private String nama;
    private String noHp;

    public Customer(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }
    
    public String getNama(){ 
        return nama; 
    }
    
    public String getNoHp(){
        return noHp; 
    }
}
