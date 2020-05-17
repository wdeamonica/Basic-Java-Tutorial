/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class LatihanNestedIf {

    // if pertama ==> Punya kartu member ga?
    // dapet diskon kartu 5k
    // if kedua ==> jika punya kartu belanjanya lebih dari 500000
    // maka dapet diskon 50k
    // kalo belanjanya >=300000 maka diskon 30k
    // kalo belanjanya diantara 100000 - <300000 diskon 10k
    // kalo ga punya kartu ga dapet diskon
    // kalo ga punya kartu, belanjanya 500k dapet diskon 25k
    // kalo 300000 - 500000 diskon 10k
    // kalo belanjanya dibawah 300000 ga dapet diskon
    public static void main(String[] args) {
        String status;
        int member = 5000;
        int harga;
        int diskon = 0;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("============ STRUK BELANJA ============\n");
        
        System.out.println("Punya Kartu Member Ga Gengs? (Ya/Ga)");
        status = scan.nextLine();

        System.out.println("Masukan jumlah belanjaan : ");
        harga = scan.nextInt();

        if (status.equalsIgnoreCase("ya")) {
            if (harga > 500000) {
                diskon = 50000 + member;
                System.out.println("Anda Mendapatkan Diskon " + diskon);
                total = harga - diskon;
                System.out.println("Total belanjaan : " + total);

            } else if (harga >= 300000 && harga <= 500000) {
                diskon = 30000 + member;
                System.out.println("Anda Mendapatkan Diskon " + diskon);
                total = harga - diskon;
                System.out.println("Total belanjaan : " + total);

            } else if ((harga >= 100000) && (harga < 300000)) {
                diskon = 10000 + member;
                System.out.println("Anda Mendapatkan Diskon " + diskon);
                total = harga - diskon;
                System.out.println("Total belanjaan : " + total);
            }

        } else {
            if (status.equalsIgnoreCase("ga"));{
            System.out.println("Maaf anda tidak mendapatkan diskon member :-)");
        }  if (harga > 50000) {
                diskon = 50000;
                System.out.println("Anda dapat diskon = " + diskon);
                total = harga - diskon;
                System.out.println("Total : " + total);
            } else if (harga >= 300000) {
                diskon = 30000;
                System.out.println("Anda dapat diskon = " + diskon);
                total = harga - diskon;
                System.out.println("Total : " + total);
            } else if (harga >= 100000 && harga <= 300000) {
                diskon = 10000;
                {
                    System.out.println("Anda dapat diskon = " + diskon);
                    total = harga - diskon;
                    System.out.println("Total : " + total);
                }
            }
        }
    }
}
