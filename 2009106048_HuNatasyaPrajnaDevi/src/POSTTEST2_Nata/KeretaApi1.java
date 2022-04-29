/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST2_Nata;

/**
 *
 * @author ASUS
 */
//File Main 
// Nama : Hu,Natasya Prajna Devi
// NIM  : 2009106048 

import java.util.Scanner;
import java.util.ArrayList;


public class KeretaApi1 {
    static Scanner in = new Scanner (System.in);
    static ArrayList<KeretaApi2> daftar = new ArrayList<KeretaApi2>();
    static KeretaApi2 kereta;
    
    public static void main(String[] args) {
        
        int menu;
        do{
            System.out.println("===========================================");
            System.out.println(" SELAMAT DATANG DI PROGRAM MANAJEMEN KERETA.");
            System.out.println(" SILAKAN KETIKKAN PILIHAN ANDA ");
            System.out.println("===========================================");
            System.out.println("1) Membuat Daftar Kota Keberangkatan   ");
            System.out.println("2) Melihat Daftar Kota Keberangkatan   ");
            System.out.println("3) Menghapus Daftar Kota Keberangkatan   ");
            System.out.println("4) Mengedit Daftar Kota Keberangkatan   ");
            System.out.println("5) Keluar Program   ");
            System.out.println("===========================================");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = in.nextInt(); in.nextLine();
            if (menu == 1){
                nambah();
            }
            else if (menu == 2){
                tampil();
            }
            else if (menu == 3){
                hapus();
            }
            else if (menu == 4){
                edit();
            }
            else if (menu == 5){
                System.exit(0);
            }
        } while (menu != 5);
    }

    
    private static void nambah() {
        System.out.print("Masukkan Nama Lengkap Anda            >>  ");
        String namaPenumpang = in.nextLine();
        System.out.print("Masukkan Nama Stasiun Tujuan Anda     >> ");
        String namaStasiun = in.nextLine();
        System.out.print("Masukkan Nomor gerbong                >> ");
        int noGerbong = in.nextInt(); in.nextLine();
        System.out.print("Berikan kota keberangkatan            >> ");
        String kota = in.nextLine();
        System.out.print("Rating                                >> ");
        char rate = in.next().charAt(0);
        
        kereta = new KeretaApi2(namaPenumpang,namaStasiun,noGerbong,kota,rate);
        daftar.add(kereta);
    }

    private static void tampil() {
       System.out.println(" MENAMPILKAN DATA BARANG");
       for(KeretaApi2 item: daftar){
           item.kesimpulan();
       }
       
    }

    private static void hapus() {
        tampil();
        System.out.print("Berikan nama penumpang yang ingin dihapus : ");
        String namaPenumpang = in.nextLine();
        for(KeretaApi2 item: daftar){
            if(item.namaPenumpang.equals(namaPenumpang)){
                daftar.remove(item);
                break;
            }
        }
        System.out.println("berhasil dihapus.\n");
    }

    private static void edit() {
        tampil();
        System.out.print("Berikan nama penumpang yang ingin diedit : ");
        String namaPenumpang = in.nextLine();
        for(KeretaApi2 item: daftar){
            if(item.namaPenumpang.equals(namaPenumpang)){
                System.out.print("Masukkan Nama Stasiun Tujuan Anda >> ");
                String namaStasiun = in.nextLine();
                System.out.print("Masukkan Nomor gerbong >>  ");
                int noGerbong = in.nextInt(); in.nextLine();
                System.out.print("Berikan kota keberangkatan : ");
                String kota = in.nextLine();
                System.out.print("Rating : ");
                char rate = in.next().charAt(0);
                item.namaStasiun = namaStasiun;
                item.nomorGerbong = noGerbong;
                item.kota = kota;
                item.ratingStasiun = rate;
            }
        }
        System.out.println("Kota berhasil diubah.\n");
    }
    
}