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
public class LoopingWhile {
    public static void main(String[] args) {
        
        boolean run = true;
        int a = 0;
        
       Scanner sc = new Scanner (System.in);
        
        while (run) {
            System.out.println("Apakah Anda Sudah Kepengen Pulang ??");
            System.out.println("Jawab ya / tidak ");
            System.out.println("Input jawaban = ");
            String jawab = sc.nextLine();
            
            //cek kondisi
            if (jawab.equalsIgnoreCase("ya")) {
                run = false;
            }
            a++;
        }
        System.out.println("");
    }
    
}
