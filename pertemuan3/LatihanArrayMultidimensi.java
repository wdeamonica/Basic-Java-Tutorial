/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author winny
 */
public class LatihanArrayMultidimensi {

    public static void main(String[] args) {
        String[][] nama = new String[3][4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nama.length; i++) {

            System.out.print("Masukkan nama index ke : " + "[" + i + "]" + " [0] = ");
            nama[i][0] = sc.nextLine();

            System.out.print("Masukkan nama index ke : " + "[" + i + "]" + " [1] = ");
            nama[i][1] = sc.nextLine();

            System.out.print("Masukkan nama index ke : " + "[" + i + "]" + " [2] = ");
            nama[i][2] = sc.nextLine();

            System.out.print("Masukkan nama index ke : " + "[" + i + "]" + " [3] = ");
            nama[i][3] = sc.nextLine();
        }
        System.out.println("\n");

        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i][0] + "\t" + " | " + "\t");
            System.out.print(nama[i][1] + "\t" + " | " + "\t");
            System.out.print(nama[i][2] + "\t" + " | " + "\t");
            System.out.println(nama[i][3] + "\t");
        }

    }
}
