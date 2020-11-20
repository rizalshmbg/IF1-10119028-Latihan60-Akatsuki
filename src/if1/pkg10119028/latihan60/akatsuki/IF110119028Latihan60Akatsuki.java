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
public class IF110119028Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnggotaAkatsuki anggota1, anggota2, anggota3, anggota4, anggota5, anggota6;
        AnggotaAkatsuki anggota7, anggota8, anggota9, anggota10, anggota11, anggota12;
        
        System.out.println("==============Akatsuki==============");
        
        anggota1 = new AnggotaAkatsuki();
        anggota1.setNama("Deidara");
        anggota1.setAsalDesa("Iwagakure");
        anggota1.setCincin("青龍 - せいりゅう, Seiryū - Naga Biru/Hijau - Dewa Timur dan Musim Semi");
        anggota1.setMakananFavorit("Bakudan (Bom)");
        anggota1.tampilAnggota();
        
        anggota2 = new AnggotaAkatsuki();
        anggota2.setNama("Hidan");
        anggota2.setAsalDesa("Yugakure");
        anggota2.setCincin("三台 - さんたい, Santai - Tiga Tingkatan");
        anggota2.setMakananFavorit("Tulang Iga");
        anggota2.tampilAnggota();
        
        anggota3 = new AnggotaAkatsuki();
        anggota3.setNama("Kisame Hoshigaki");
        anggota3.setAsalDesa("Kirigakure");
        anggota3.setCincin("南斗 - なんじゅ, Nanju - Bintang Selatan");
        anggota3.setMakananFavorit("Udang dan Kepiting");
        anggota3.tampilAnggota();
        
        anggota4 = new AnggotaAkatsuki();
        anggota4.setNama("Kakuzu");
        anggota4.setAsalDesa("Takigakure");
        anggota4.setCincin("北斗 - ほくと, Hokuto - Bintang Utara");
        anggota4.setMakananFavorit("Hati Shasimi, Hati MonkFish");
        anggota4.tampilAnggota();
        
        anggota5 = new AnggotaAkatsuki();
        anggota5.setNama("Konan");
        anggota5.setAsalDesa("Amegakure");
        anggota5.setCincin("白虎 - びゃっこ, Byakko - Harimau Putih - Dewa Barat dan Musim Gugur");
        anggota5.setMakananFavorit("Ikan Panggang");
        anggota5.tampilAnggota();
        
        anggota6 = new AnggotaAkatsuki();
        anggota6.setNama("Orochimaru");
        anggota6.setAsalDesa("Konohagakure");
        anggota6.setCincin("空陳 - くうちん, Sora - Langit");
        anggota6.setMakananFavorit("Telur");
        anggota6.tampilAnggota();
        
        anggota7 = new AnggotaAkatsuki();
        anggota7.setNama("Nagato");
        anggota7.setAsalDesa("Amegakure");
        anggota7.setCincin("Tidak Memakai Cincin");
        anggota7.setMakananFavorit("Ikan Bakar dan Rebus");
        anggota7.tampilAnggota();
        
        anggota8 = new AnggotaAkatsuki();
        anggota8.setNama("Sasori");
        anggota8.setAsalDesa("Sunagakure");
        anggota8.setCincin("玉女 - ぎょくにょ, Gyokunyo - Virgo");
        anggota8.setMakananFavorit("Tidak ada");
        anggota8.tampilAnggota();
        
        anggota9 = new AnggotaAkatsuki();
        anggota9.setNama("Itachi Uchiha");
        anggota9.setAsalDesa("Konohagakure");
        anggota9.setCincin("朱雀 - すざく, Suzaku - Merah darah - Dewa Selatan dan Musim Panas");
        anggota9.setMakananFavorit("Onigiri, Kubis/Kol");
        anggota9.tampilAnggota();
        
        anggota10 = new AnggotaAkatsuki();
        anggota10.setNama("Obito Uchiha (Tobi)");
        anggota10.setAsalDesa("Konohagakure");
        anggota10.setCincin("玉女 - ぎょくにょ, Gyokunyo - Virgo");
        anggota10.setMakananFavorit("Tidak diketahui");
        anggota10.tampilAnggota();
        
        anggota11 = new AnggotaAkatsuki();
        anggota11.setNama("Yahiko (Pain)");
        anggota11.setAsalDesa("Amegakure");
        anggota11.setCincin("零 - れい, Rei - Nol/Tidak ada");
        anggota11.setMakananFavorit("Tidak diketahui");
        anggota11.tampilAnggota();
        
        anggota12 = new AnggotaAkatsuki();
        anggota12.setNama("Zetsu");
        anggota12.setAsalDesa("Tidak Di Ketahui");
        anggota12.setCincin("玄武 - げんぶ, Genbu - Kura-Kura - Dewa Utara dan Musim Dingin");
        anggota12.setMakananFavorit("Manusia");
        anggota12.tampilAnggota();
        
    }
    
}