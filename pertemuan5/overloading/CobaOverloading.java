/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.overloading;

/**
 *
 * @author winny
 */
public class CobaOverloading {

    public void tambah() {
        int a = 5, b = 6;
        System.out.println("Hasilnya " + (a + b));
    }

    public void tambah(int x, int y) {
        System.out.println("Hasilnya " + (x * y));
    }

    public void tambah(int a, int b, int c) {
        System.out.println("Hasilnya " + (a + b + c));
    }

}
