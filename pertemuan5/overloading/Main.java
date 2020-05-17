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
public class Main {

    public static void main(String[] args) {
        CobaOverloading co = new CobaOverloading();

        co.tambah();

        System.out.println("============================");

        co.tambah(3, 3);

        System.out.println("============================");

        co.tambah(1, 2, 3);
    }

}
