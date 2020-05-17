/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5;

/**
 *
 * @author winny
 */
public class CobaClassMobil {

    // atribut atau properti
    String tipe = "Sport";
    String warna = "Putih";

    //  method atau perilaku
    static void belokKanan() {
        System.out.println("Mobil Belok Kanan");
    }

    public static void main(String[] args) {

        // panggil atau instasiasi
        CobaClassMobil cb = new CobaClassMobil();
        cb.belokKanan();
        
        // cara panggil / instasiasi (2)
        // CobaClassMobil.belokKanan();
    }
}
 
