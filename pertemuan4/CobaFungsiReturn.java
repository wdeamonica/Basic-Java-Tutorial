/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

/**
 *
 * @author winny
 */
public class CobaFungsiReturn {

    static int luasPersegi(int sisi) {

        int luas = sisi * sisi;
        return luas;
    }

    static double luasLingkaran(double r) { // (int r, double phi);

        // cara kedua
        // double luas1 = phi * Math.pow(r,2) <-- untuk kuadrat
        // return (int) luas;
        double luas1 = r * r;
        luas1 *= 3.14;
        return luas1;
    }

    static double volumeKubus(double sisi) {

        double volume = sisi * sisi;
        volume *= sisi;
        return volume;
    }

    static double luasKubus() {

        //memanggil fungsi luasPersegi
        return 6 * luasPersegi(10);
    }

    static int luasPersegiPanjang(int p, int l) {

        int luas = p * l;
        return luas;
    }

    public static void main(String[] args) {

        System.out.println("Luas Persegi = " + luasPersegi(10));

        // cara kedua
        // System.out.println(luasLingkaran (10, 3.14));
        System.out.println("Luas Lingkaran = " + luasLingkaran(10));

        System.out.println("Volume Kubus = " + volumeKubus(10));
        System.out.println("Luas Kubus = " + luasKubus());
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang(10, 9));
    }

}
