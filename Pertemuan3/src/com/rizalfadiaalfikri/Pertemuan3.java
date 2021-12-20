/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;

/**
 *
 * @author ASUS
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        fungsiIF();
          fungsiLOOP();
        ls
    }
    public static void fungsiIF() {
        System.out.println("-------------------");
        System.out.println("fungsi if / kondisi");
        System.out.println("-------------------");
        
        int angka = 2;
        System.out.println("angka = " + angka);
        if (angka < 10) {
            System.out.println("angka kurang dari 10");
        } else if (angka > 10) {
            System.out.println("angka lebih dari 10");
        } else {
            System.out.println("angka sama dengan 10");
        }
        
        System.out.println("");
        
        String hewan = "sapi";
        System.out.println("hewan = " + hewan);
        if (hewan.equals("sapi")) {
            System.out.println("teksnya sama dengan sapi");
        } else {
            System.out.println("teksnya bukan sapi");
        }
        
        System.out.println("");
        
        Boolean kondisi = true;
        System.out.println("kondisi = " + kondisi);
        if (kondisi == true) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }
    }
    
    public static void fungsiLOOP() {
        System.out.println("-------------------------");
        System.out.println("fungsi loop / pengulangan");
        System.out.println("-------------------------");
        
        for (int i = 1; i <= 9; i++ ) {
            System.out.println("pengulangan ke-" + i);
        }
        
        System.out.println("");
        
        for (int j = 20; j >=0; j--) {
            System.out.println("pengulangan ke-" + j);
        }
        
        System.out.println("");
        
        int angka = 13;
        int pangkat = 7;
        int hasil = 1;
        for (int k = 1; k < pangkat; k++) {
            hasil = hasil * angka;
        }
        System.out.println("hasil " + angka + " pangkat " + pangkat + " = " + hasil);
    }
}
