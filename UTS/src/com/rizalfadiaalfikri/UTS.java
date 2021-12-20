/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner keyboard = new Scanner(System.in);
    public static String nama_pengirim,nama_penerima,nama_barang,alamat_penerima,no_telpon;
    
    public static double berat = 0;
    public static double jarak = 0;
    public static int jenis_pengiriman = 0;
    public static double harga_ongkir = 0;
    public static double pajak = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kirim_lagi;
        
        System.out.println("=======================================");
        System.out.println("Selamat Datang Di Aplikasi Kurir Barang");
        System.out.println("=======================================");
        System.out.println("");
        
        
        do {
            
            fungsiInputData();
            
            System.out.println("=================");
            System.out.print("Apakah Anda Ingin Mengirim Barang Lagi(y/n)? : ");
            kirim_lagi = keyboard.nextLine();
            System.out.println("=================");
            
        }while(kirim_lagi.equalsIgnoreCase("y"));
        System.out.println("Terimakasih Sudah Menggunakan Jasa Kami");
        
    }
    public static void fungsiInputData() {

        System.out.print("Nama Barang: ");
        nama_barang = keyboard.nextLine();
        System.out.print("Nama Pengirim: ");
        nama_pengirim = keyboard.nextLine();
        System.out.print("Nama Penerima: ");
        nama_penerima = keyboard.nextLine();
        System.out.print("Alamat Penerima: ");
        alamat_penerima = keyboard.nextLine();
        System.out.print("No Telpon Penerima: ");
        no_telpon = keyboard.nextLine();
        System.out.print("Berat Barang (Kg): ");
        berat = Double.parseDouble(keyboard.nextLine());
        System.out.print("Jarak(Km): ");
        jarak = Double.parseDouble(keyboard.nextLine());
        System.out.println("===================================");
        System.out.println("Jenis Pengiriman");
        System.out.println("1. Reguler | 2. Ekonomi | 3. Ekspress");
        System.out.print("Pilih [1-3] : ");
        jenis_pengiriman = Integer.parseInt(keyboard.nextLine());
        
        double harga_ongkir = fungsiHitungOngkir(berat,jarak,jenis_pengiriman);
        tampilData(harga_ongkir,jarak,berat,jenis_pengiriman);
    }
    
    public static double fungsiHitungOngkir(double berat,double jarak, int jenis_pengiriman) {
        double total_ongkir = 0;
        
        if (jenis_pengiriman == 1) {
            if (jarak > 0 && jarak <= 50) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 10000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 15000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 20000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 51 && jarak <= 100) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 15000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 20000;
                } else if (berat > 10.1 && berat <= 15) {
                    harga_ongkir = 25000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 101 && jarak <= 200) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 20000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 25000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 30000;
                } else {
                    harga_ongkir = 0;
                }
            }  else {
                System.out.println("Jarak Melebihi Batas");
            }
        } else if (jenis_pengiriman == 2) {
            if (jarak > 0 && jarak <= 50) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 12000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 17000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 22000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 51 && jarak <= 150) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 17000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 220000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 27000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 151 && jarak <= 200) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 22000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 27000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 32000;
                } else {
                    harga_ongkir = 0;
                }
            } else {
                System.out.println("Jarak Melebihi Batas");
            }
        } else if (jenis_pengiriman == 3) {
            if (jarak > 0 && jarak <= 50) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 17000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 22000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 27000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 51 && jarak <= 150) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 22000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 270000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 32000;
                } else {
                    harga_ongkir = 0;
                }
            } else if (jarak >= 151 && jarak <= 200) {
                if (berat > 0 && berat <= 5) {
                    harga_ongkir = 27000;
                } else if (berat > 5 && berat <= 10) {
                    harga_ongkir = 32000;
                } else if (berat > 10 && berat <= 15) {
                    harga_ongkir = 37000;
                } else {
                    harga_ongkir = 0;
                }
            } else {
                System.out.println("Jarak Melebihi Batas");
            }
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }
        pajak = harga_ongkir * 0.1;
        total_ongkir = harga_ongkir + pajak;
        return total_ongkir;  
   }
    
   public static void tampilData(double total_ongkir,double jarak,double berat,int jenis_pengiriman) {
       
       String ket_jenis_pengiriman;
       
       if (jenis_pengiriman == 1) {
           ket_jenis_pengiriman = "Reguler";
       } else if (jenis_pengiriman == 2) {
           ket_jenis_pengiriman = "Ekonomi";
       } else if (jenis_pengiriman == 3) {
           ket_jenis_pengiriman = "Ekspress";
       } else {
           ket_jenis_pengiriman = "Tidak Ada Jenis Pengirirman";
       }
       
       try {
            System.out.println("Mohon tunggu, proses perhitungan sedang berlangsung.....");
            Thread.sleep(3000);
       } catch (InterruptedException e) {
            Logger.getLogger(UTS.class.getName()).log(Level.SEVERE,null,e);
       }
       
        System.out.println("");
        System.out.println("====================");
        System.out.println("Laporan Kurir Barang");
        System.out.println("====================");
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Nama Pengirim : " + nama_pengirim);
        System.out.println("Nama Penerima : " + nama_penerima);
        System.out.println("Alamat Penerima : " + alamat_penerima);
        System.out.println("No Telepon Penerima  : " + no_telpon);
        System.out.println("Berat Barang(Kg) : " + berat);
        System.out.println("Jarak(Km) : " + jarak);
        System.out.println("Jenis Pegiriman : " + ket_jenis_pengiriman);
        System.out.println("Harga Ongkos Kirim : " + harga_ongkir);
        System.out.println("Pajak(10%) : " + pajak);
        System.out.println("Total Ongkir : " + total_ongkir);
   } 
}
