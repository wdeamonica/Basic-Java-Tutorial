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
public class CobaLuasLingkaran {
    public static void main(String[] args) {
        double Luas;
        double phi = 3.14;
        double r;
        
        Scanner scan = new Scanner (System.in);
        
        //Luas Lingkaran
        System.out.println("Masukan jumlah jari-jari !");
        r = scan.nextDouble();
        Luas = phi * r * r;
        System.out.println("Jari-jari : " + r + " cm");
        
        System.out.println("Hasil dari perhitungan adalah = " + Luas + " cm2");
        
    }
    
}
