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
public class CobaLampuLaluLintas {
    public static void main(String[] args) {
        
        //buat variabel
        String lampu;
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Input warna lampu");
        lampu = sc.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Berhenti");
                break;
                
            case "kuning":
                System.out.println("Pelan-pelan");
                break;
                
             case "hijau":
                System.out.println("Jalan");
                break;
                
             default:
                 System.out.println("Rusak");
        }
    }
    
}
