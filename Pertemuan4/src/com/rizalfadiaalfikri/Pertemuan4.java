/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        fungsiInputMahasiswa();
//        fungsiInputAritmatika();
    }
    
    public static void fungsiInputMahasiswa() {
        String nama,kelas,alamat;
        int tahun_masuk;
        double usia;
        boolean sudah_vaksin;
        String pernah_covid1;
        boolean pernah_covid2 = false;
        
        System.out.println("====================");
        System.out.println("Input Data Mahasiswa");
        System.out.println("====================");
        
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("Kelas : ");
        kelas = keyboard.nextLine();
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();
        System.out.print("Tahun Masuk : ");
        tahun_masuk = Integer.parseInt(keyboard.nextLine());
        System.out.print("Usia : ");
        usia = Double.parseDouble(keyboard.next());
        System.out.print("Sudah Vaksin (true/false) : ");
        sudah_vaksin = Boolean.parseBoolean(keyboard.nextLine());
        System.out.print("Pernah Covid (y/t): ");
        pernah_covid1 = keyboard.nextLine();
        
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("Keas : " + kelas);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tahun Masuk : " + tahun_masuk);
        System.out.println("Usia : " + usia);
        System.out.println("Sudah Vaksin : " + sudah_vaksin);
        if(pernah_covid1.equals("y") || pernah_covid1.equals("Y")) {
            pernah_covid2 = true;
            System.out.println("Pernah Covid : " + pernah_covid2);
        } else if (pernah_covid1.equals("t") || pernah_covid1.equals("T")) {
            pernah_covid2 = false;
            System.out.println("Pernah Covid : " + pernah_covid2);
        } else {
            System.out.println("Inputan Salah");
        }
        System.out.println("");
    }
    public static void fungsiInputAritmatika() {
        double angka1,angka2,hasil;
        String fungsi;
        
        System.out.println("=====================");
        System.out.println("Input Data Aritmatika");
        System.out.println("=====================");
        
        System.out.print("Angka 1 : ");
        angka1 = Double.parseDouble(keyboard.nextLine());
        System.out.print("Angka 2 : ");
        angka2 = Double.parseDouble(keyboard.nextLine());
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. kali");
        System.out.println("4. Bagi");
        System.out.print("Pilih fungsi aritmatika : ");
        fungsi = keyboard.nextLine();
        
        if (fungsi.equals("1")) {
           hasil = angka1 + angka2;
           System.out.println("Hasil : " + angka1 + " Tambah " + angka2 + " = " + hasil);
        } else if (fungsi.equals("2")) {
           hasil = angka1 - angka2;
           System.out.println("Hasil : " + angka1 + " Kurang " + angka2 + " = " + hasil);
        } else if (fungsi.equals("3")) {
           hasil = angka1 * angka2;
           System.out.println("Hasil : " + angka1 + " Kali " + angka2 + " = " + hasil);
        } else if (fungsi.equals("4")) {
           hasil = angka1 / angka2;
           System.out.println("Hasil : " + angka1 + " Bagi " + angka2 + " = " + hasil);
        } else {
            System.out.println("Pilihan Fungsi Aritmatika Salah");
        }
        
    }
}
