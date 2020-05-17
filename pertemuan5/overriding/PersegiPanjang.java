/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.overriding;

/**
 *
 * @author winny
 */
// Kelas anak
public class PersegiPanjang extends BangunDatar {

    int panjang, lebar;

    @Override
    float luas() {
        float luas = panjang * lebar;
        System.out.println("Menghitung luas bangun datar = " + luas + " cm2");
        return luas;
    }

    @Override
    float keliling() {
        float keliling = (2 * panjang) * (2 * lebar);
        System.out.println("\nMenghitung keliling = " + keliling + " cm2");
        return keliling;
    }
}
