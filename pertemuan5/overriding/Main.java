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
public class Main {

    public static void main(String[] args) {

        BangunDatar bd = new BangunDatar();

        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lk = new Lingkaran();

        pp.panjang = 10;
        pp.lebar = 5;

        pp.luas();
        pp.keliling();

        lk.r = 10;

        lk.luas();
        lk.keliling();

    }
}
