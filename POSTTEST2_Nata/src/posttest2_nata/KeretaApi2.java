/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST2_Nata;

/**
 *
 * @author ASUS
 */

//FileClass
// Nama : Hu,Natasya Prajna Devi
// NIM  : 2009106048 

public class KeretaApi2 {
    String namaStasiun;
    String namaPenumpang;
    String kota;
    int nomorGerbong; 
    char ratingStasiun;
    
    
    public KeretaApi2(String namaPenumpang,String namaStasiun,int nomorGerbong,String kota,char ratingStasiun){
        this.namaPenumpang = namaPenumpang;
        this.namaStasiun = namaStasiun;
        this.nomorGerbong = nomorGerbong;
        this.kota = kota;
        this.ratingStasiun = ratingStasiun;
        
    }
    
   
    
    
    public void kesimpulan(){
        System.out.println(" ================TIKET================");
        System.out.println(" Nama Penumpang       >> "+namaPenumpang);
        System.out.println(" Nama Stasiun         >> "+namaStasiun);
        System.out.println(" Nomor Gerbong        >> "+nomorGerbong);
        System.out.println(" Tujuan Kota          >> "+kota);
        System.out.println(" Rating Stasiun       >> "+ratingStasiun);
        System.out.println(" ======================================");
     }
}