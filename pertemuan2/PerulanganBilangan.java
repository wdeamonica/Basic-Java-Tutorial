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
public class PerulanganBilangan {
    public static void main(String[] args) {
        System.out.println("1. Bilangan Genap ");
        System.out.println("2. Bilangan Ganjil ");
        System.out.print("Masukkan Pilihan Anda : ");
        Scanner input = new Scanner (System.in);
        int pilihan = input.nextInt();
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
         if (pilihan == 1){            
            for (int i =2;i<=angka;i+=2){
                System.out.print(i);
                System.out.println(", ");
            }
        }else if (pilihan ==2){                       
            for (int i =1;i<=angka;i+=2){
                System.out.print(i);
                System.out.println(", ");                
            }
           
        }        
   }  
}