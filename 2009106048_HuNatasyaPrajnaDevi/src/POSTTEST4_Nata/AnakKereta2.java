/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4_Nata;

/**
 *
 * @author ASUS
 */
public class AnakKereta2 extends MamaKereta{
    public AnakKereta2 (String namaKereta,String jenis,String kualitasKereta,String warnaKereta){
        super (namaKereta,jenis,kualitasKereta,warnaKereta);
          
    }
    @Override
    public void MamaShow(){
        System.out.println("======= DESKRIPSI KERETA EXPRESS ========");
        System.out.println("| Kereta ini Bernama          >> "+getnamaKereta());
        System.out.println("| Jenis Kereta                >> "+getJenis());
        System.out.println("| Kualitas Warna Kereta       >> "+getwarnaKereta());
        System.out.println("| Kualitas Kereta             >> "+getkualitasKereta());
        System.out.println("======================================");
    }
}