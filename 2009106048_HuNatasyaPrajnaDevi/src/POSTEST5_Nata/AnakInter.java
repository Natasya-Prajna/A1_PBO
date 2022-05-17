/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTEST5_Nata;

/**
 *
 * @author ASUS
 */
public class AnakInter implements InterNata {
    public String nama;
    static int noPelanggan = 0;
    
    public AnakInter(String nama){
    this.nama = nama;
    
    }
    
    class tencu {
        static String tencuz(){
            return "Terimakasih Telah Berkunjung";
        }
    }
    
    @Override
    public void login() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            noPelanggan++;
            System.out.println("Halo "+this.nama+" No.Pelanggan Anda "+noPelanggan);
            System.out.println(" SELAMAT DATANG DI PROGRAM MANAJEMEN KERETA.");
            System.out.println(" SILAKAN KETIKKAN PILIHAN ANDA ");
    }

    @Override
    public void logout() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            System.out.println("========================================== ");
            System.out.println("Hai "+this.nama+" Code >>  "+noPelanggan);
            System.out.println(tencu.tencuz());
            System.out.println("========================================== ");
    }
    
}
