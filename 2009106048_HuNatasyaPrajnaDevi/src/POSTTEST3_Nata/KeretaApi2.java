/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST3;

/**
 *
 * @author ASUS
 */
public class KeretaApi2 {
    private String namaStasiun;
    private String namaPenumpang;
    private String kota;
    private int nomorGerbong; 
    private char ratingStasiun;
    
    //Get
    public String getnamaPenumpang(){
        return namaPenumpang;
    }
    public String getnamaStasiun(){
        return namaStasiun;
    }
    public int getnomorGerbong(){
        return nomorGerbong;
    }
    public String getkota(){
        return kota;
    }
    public char getratingStasiun() { 
        return ratingStasiun;  
    }
    // Set
    public void setnamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }
    public void setnamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }
    public void setnomorGerbong(int nomorGerbong) {
        this.nomorGerbong = nomorGerbong;
    }
    public void setratingStasiun(char ratingStasiun) {
        this.ratingStasiun = ratingStasiun;
    }
    public void setkota(String kota){
        this.kota = kota;
    }
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