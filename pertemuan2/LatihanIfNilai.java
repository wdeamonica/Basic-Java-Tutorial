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
public class LatihanIfNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int a;
        int total=0;
        
        System.out.println("Masukan jumlah pemakaian air = ");
        a = scan.nextInt();
        System.out.println("Jumlah pemakaian air : " + a + " m3");
        
        // 10 (10 pertama)
        if (a <= 10){
             total = a * 1000;
        
        // 20 (10 berikutnya)
         } else if (a <= 20) {
             total = 10 * 1000;
             total += (a - 10)* 1500;
        
        // 35 (15 berikutnya)
         } else if (a <= 35) {
             total = 10 * 1000;
             total += 10 * 1500;
             total += (a - 20) * 2000;
         
        // Lebih dari 35
         } else if (a > 35) {
             total = 10 * 1000;
             total += 10 * 1500;
             total += 15 * 2000;
             total += (a - 35) * 3000;
             
         }
         System.out.println("Jumlah yang perlu dibayar : " + total);
         System.out.println("Rp. " + total + ",00");
             }
}
