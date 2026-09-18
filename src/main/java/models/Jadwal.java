/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Jadwal {
    private String tanggal;
    private String jam;

    public Jadwal(String tanggal, String jam) {
        this.tanggal = tanggal;
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public String getInfoJadwal() {
        return tanggal + " (Jam: " + jam + ")";
    }
}
