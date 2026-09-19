/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Scanner;

public class ValidasiInput {
    
    //Validasi Input Int
    public static int inputAngka(String pesan) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pesan);
        while (!scanner.hasNextInt()) {
            System.out.println("Input harus angka bulat!");
            scanner.next();
            System.out.print(pesan);
        }
        int hasil = scanner.nextInt();
        return hasil;
    }
    
    //Validasi Input String
    public static String inputTeks(String pesan) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pesan);
        String input = scanner.nextLine();
        while (input.isEmpty()) {
            System.out.println("Input tidak boleh kosong!");
            System.out.print(pesan);
            input = scanner.nextLine();
        }
        return input;
    }
    
    //Validasi Input ID Unik
    public static String inputIdUnik(String pesan, BookingService service) {
    String id = "";
    boolean sudahAda = false;
    do {
        id = inputTeks(pesan);
        sudahAda = service.isIdExist(id);
        if (sudahAda) {
            System.out.println("ID Sudah Digunakan! Silakan gunakan ID lain.");
        }
    } while (sudahAda);
    return id;
    }

}
