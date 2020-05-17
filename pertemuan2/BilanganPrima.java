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
public class BilanganPrima {
     public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
        
        int input;
        
        System.out.println("Masukan nilai = ");
        input = scan.nextInt();

     for (int i = 2; i < input; i++) {
         boolean isPrima = true;

         for (int j = 2; j < i; j++) {
             if(i%j==0){
                 isPrima = false;
                 break;
             }
         }

         if(isPrima==true){
         System.out.println(i+",");
    }
  }
 }
}
