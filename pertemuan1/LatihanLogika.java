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
public class LatihanLogika {
    public static void main(String[] args) {
        
        //Program melakukan Operator Logika
        
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
                
       Scanner input = new Scanner (System.in);
        
        System.out.print ("Masukan Nilai Tebakan = ");
        nilaiTebakan = input.nextInt();
                
        //Operator Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda = " + statusTebakan);
        
        //Operator Relasi
        System.out.println("\nMasukkan Nilai diantara 5 dan 9 = ");
        nilaiTebakan = input.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan <= 9);
        System.out.println("Nilai Tebaan anda adalah "+ statusTebakan);
    }
    
}
