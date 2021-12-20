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
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    
    // cara penamaan variable --> huruf kecil semua,tanpa spasi, spasi di ganti dengan undersccore _
    // variable angka_satu
    // cara penamaan fungsi/method --> camelcase, huruf kecil,tanpa spasi,huruf pertama tiap kata di buat kapital
    // fungsiAngkaSatu()
    // cara penamaan class --> cammelcase, semua huruf pertama tiap kaat dibuat kapital
    
    public static int angka1 = 7;
    public static double angka2 = 3.14;
    public static boolean kondisi = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ini contoh text");
        String text1 = "ini contoh text 1";
        String text2 = "ini contoh text 2";
        String text3 = "ini contoh text 3";
        System.out.println(text1);
        System.out.print(text2);
        System.out.print(text3);
        System.out.println("");
        System.out.println("");
        
        fungsiPrintMessage();
        fungsiArtimatika();
        fungsiClassData();
        
    }
    public static void fungsiPrintMessage() {
        System.out.println("ini contoh text 4");
        System.out.println("ini integer " + angka1);
        System.out.println("ini double " + angka2);
        System.out.println("ini boolean " + kondisi);
        System.out.println("");
    }
    
    public static void fungsiArtimatika() {
        double hasilPenjumlahan = angka1 + angka2;
        double hasilPengurangan = angka1 - angka2;
        double hasilPerkalian = angka1 * angka2;
        double hasilPembagian = angka1 / angka2;
        double hasilSisaBagi = angka1 % angka2;
        boolean hasilLawan = !kondisi;
        
        System.out.println("Hasil Penjumlahan " + angka1 + " dan " + angka2 + " = " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan " + angka1 + " dan " + angka2 + " = " + hasilPengurangan);
        System.out.println("Hasil Perkalian " + angka1 + " dan " + angka2 + " = " + hasilPerkalian);
        System.out.println("Hasil Pembagian " + angka1 + " dan " + angka2 + " = " + hasilPembagian);
        System.out.println("Hasil Sisa bagi " + angka1 + " dan " + angka2 + " = " + hasilSisaBagi);
        System.out.println("Hasil Lawan " + kondisi + " = " + hasilLawan);
        System.out.println("");
    }
    
    public static void fungsiClassData() {
       ClassData class_data = new ClassData();
       String dapatkanString = class_data.dapatkanString();
       int dapatkanInteger = class_data.dapatkanInt();
       
        System.out.println("ini string dari class data : " + dapatkanString);
        System.out.println("ini integer dari class data : " + dapatkanInteger);
    }
    
}
