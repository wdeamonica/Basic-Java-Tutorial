/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class FungsiDalamFungsi {

    static double luasSelimut(double r, double t) {
        double luas = 2 * 3.14 * r * t;
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

    static double luasPermukaanTabung(double r, double t) {
        return 2 * luasLingkaran(r) + luasSelimut(r, t);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("*====== LUAS PERMUKAAN TABUNG ======*");

        System.out.println("\nMasukkan nilai jari-jari = ");
        double r = scan.nextDouble();
        System.out.println("Jari-jari = " + r + "cm");

        System.out.println("\n=====================================");

        System.out.println("\nMasukkan nilai tinggi = ");
        double t = scan.nextDouble();
        System.out.println("Jari-jari = " + t + "cm");

        System.out.println("\n=====================================");

        System.out.println("\nLuas Selimut = " + luasSelimut(r, t) + "cm2");
        System.out.println("Luas Lingkaran = " + luasLingkaran(r) + "cm2");

        System.out.println("\n=====================================");
        System.out.println("\nLuas Permukaan Tabung = " + luasPermukaanTabung(r, t) + "cm2");
        System.out.println("\n=====================================");
    }
}
