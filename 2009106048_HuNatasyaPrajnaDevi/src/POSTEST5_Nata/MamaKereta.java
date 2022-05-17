/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTEST5_Nata;

/**
 *
 * @author ASUS
 */
public class MamaKereta {
    private String jenis;
    private String namaKereta;
    private String kualitasKereta;
    private String warnaKereta;
    
    public MamaKereta(String namaKereta,String jenis,String kualitasKereta,String warnaKereta){
        this.namaKereta = namaKereta;
        this.jenis = jenis;
        this.kualitasKereta = kualitasKereta;
        this.warnaKereta = warnaKereta;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    public String getnamaKereta(){
        return this.namaKereta;
    }
    public String getkualitasKereta(){
        return this.kualitasKereta;
    }
    public String getwarnaKereta(){
        return this.warnaKereta;
    }
    
    public void warnaKereta(String a){
        System.out.println("Warna Kereta  >> "+warnaKereta);
    }
    
    public void warnaKereta(int a){
        System.out.println("Kode Lengkap Warnanya adalah >> "+a);
    }
    
    public void MamaShow(){
        System.out.println("======== DESKRIPSI KERETA ===========");
        System.out.println("| Kereta ini Bernama          >> "+namaKereta);
        System.out.println("| Jenis Kereta                >> "+jenis);
        System.out.println("| Kualitas Warna Kereta       >> "+warnaKereta);
        System.out.println("| Kualitas Kereta             >> "+kualitasKereta);
        System.out.println("======================================");
    }
}
