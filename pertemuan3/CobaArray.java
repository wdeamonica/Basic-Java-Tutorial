/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class CobaArray {

    public static void main(String[] args) {

        int angka9[] = {1, 2, 3};
        String nama[] = {"Zanuar", "Alfian", "Alifia"};

        System.out.println(angka9[1]);
        System.out.println(nama[0]);

        //loop array cara pertama
        for (int i = 1; i < nama.length; i++) {
            System.out.println("Nama = " + nama[i]);
        }

        //loop array cara kedua
        for (String x : nama) {
            System.out.println("Nama = " + x);
        }

        // Array cara ketiga
        String nama3[] = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < nama3.length; i++) {
            nama3[i] = scan.nextLine();

            System.out.println("Nama ke : " + i + " " + nama3[i]);
        }

    }
}
