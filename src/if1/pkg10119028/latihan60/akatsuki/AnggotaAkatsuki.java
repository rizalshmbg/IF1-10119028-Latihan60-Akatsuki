/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan60.akatsuki;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar karakter anggota akatsuki
 */
public class AnggotaAkatsuki extends Ninja {
    private String cincin, makananFavorit;
    
    public String getCincin() {
        return this.cincin;
    }
    
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }
    
    public String getMakananFavorit() {
        return this.makananFavorit;
    }
    
    public void setMakananFavorit(String makananFavorit) {
        this.makananFavorit = makananFavorit;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsalDesa());
        System.out.println("Identitas Cincin: " + getCincin());
        System.out.println("Makanan Favorit\t: " + getMakananFavorit());
        System.out.println();
    }    
}