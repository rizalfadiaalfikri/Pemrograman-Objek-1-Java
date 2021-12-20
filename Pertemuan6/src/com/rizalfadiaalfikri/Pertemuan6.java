/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.math3.stat.StatUtils;

/**
 *
 * @author ASUS
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner keyboard = new Scanner(System.in);
    public static String nama,nim,kelas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====================================");
        System.out.println("Aplikasi Perhitungan Nilai Mahasiswa");
        System.out.println("====================================");
        
        fungsiInputData();
    }
    
    public static void fungsiInputData() {
        double nilai_absen = 0;
        double nilai_tugas = 0;
        double nilai_uts = 0;
        double nilai_uas = 0;
        
        System.out.print("NIM : ");
        nim = keyboard.nextLine();
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("Kelas : ");
        kelas = keyboard.nextLine();
        System.out.print("Nilai Absen : ");
        nilai_absen = Double.parseDouble(keyboard.nextLine());
        System.out.print("Nilai Tugas : ");
        nilai_tugas = Double.parseDouble(keyboard.nextLine());
        System.out.print("Nilai UTS : ");
        nilai_uts = Double.parseDouble(keyboard.nextLine());
        System.out.print("Nilai UAS : ");
        nilai_uas = Double.parseDouble(keyboard.nextLine());
        
        double nilai_rata = funsgiHitungRata(nilai_absen,nilai_tugas,nilai_uts,nilai_uas);
        double nilai_akhir = funsgiHitungData(nilai_absen,nilai_tugas,nilai_uts,nilai_uas);
        fungsiTampilData(nilai_rata,nilai_akhir);
    }
    
    
    public static double funsgiHitungRata(double nilai_absen,double nilai_tugas, double nilai_uts,double nilai_uas) {
        double nilai_rata = 0;
        double data[] = {nilai_absen,nilai_tugas,nilai_uts,nilai_uas};
        nilai_rata = StatUtils.mean(data);
        return nilai_rata;
    }
    
    public static double funsgiHitungData(double nilai_absen, double nilai_tugas,double nilai_uts,double nilai_uas) {
        double nilai_akhir = 0;
        nilai_akhir = (0.1 * nilai_absen) + (0.2 * nilai_tugas) + (0.3 * nilai_uts) + (0.4 * nilai_uas);
        return nilai_akhir;
    }
    
    public static void fungsiTampilData(double nilai_rata,double nilai_akhir) {
        String nilai_huruf = "";
        
        if(nilai_akhir >= 80 && nilai_akhir <= 100) {
            nilai_huruf = "A";
        } else if(nilai_akhir >= 70 && nilai_akhir <= 79) {
            nilai_huruf = "B";
        } else if(nilai_akhir >= 60 && nilai_akhir <= 69) {
            nilai_huruf = "C";
        } else if(nilai_akhir >= 50 && nilai_akhir <= 59) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
        
        try {
            System.out.println("Mohon tunggu, proses perhitungan sedang berlangsung.....");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Logger.getLogger(Pertemuan6.class.getName()).log(Level.SEVERE,null,e);
        }
        
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Laporan Nilai Mahasiswa");
        System.out.println("=======================");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai Rata - Rata : " + nilai_rata);
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("Nilai Huruf : " + nilai_huruf);
    }
    
}
