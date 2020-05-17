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
public class LatihanBilanganPrima {
    public static void main(String[] args) {
        
        Scanner prima = new Scanner (System.in);
        
        int nilai;
        
        System.out.println("======= BILANGAN PRIMA =======");
        System.out.println("\nMasukan nilai : ");
        nilai = prima.nextInt();
                
        boolean status = true;
        for (int i =2; i <= nilai;  i++) {
            status = true;
            
        for (int j =2; j < i;  j++) {
            if (i%j == 0){
            status = false;
            break;
        }
    }
    }
        if(status == true) {
            System.out.println("Bilangan Prima");
         }
        else {
            System.out.println("Bukan Bilangan Prima");
        }
        }
}
