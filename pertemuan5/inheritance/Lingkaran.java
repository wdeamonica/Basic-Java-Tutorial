/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.inheritance;

/**
 *
 * @author winny
 */
public class Lingkaran extends BangunDatar {

    int r;

    @Override
    float luas() {
        float luas = (float) (Math.PI * Math.pow(r, 2));
        System.out.println("Menghitung luas bangun datar = " + luas + " cm2");
        return luas;
    }

    @Override
    float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Menghitung keliling = " + keliling + " cm2");
        return keliling;
    }
}
