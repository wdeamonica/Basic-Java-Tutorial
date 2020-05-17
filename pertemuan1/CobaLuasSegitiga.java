/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan1;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class CobaLuasSegitiga {
   public static void main(String[] args) {
        double Luas;
        double a;
        double t;
        
        Scanner scan = new Scanner (System.in);
        
        //Luas Segitiga
        System.out.println("Masukan jumlah alas :");
        a = scan.nextDouble();
        System.out.println("Masukan jumlah tinggi :");
        t = scan.nextDouble();
        Luas = a * t / 2;
        
        System.out.println("Hasil dari perhitungan adalah = " + Luas + " cm2");
        
    } 
}
