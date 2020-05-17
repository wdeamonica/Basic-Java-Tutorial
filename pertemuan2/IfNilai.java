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
public class IfNilai {
    
    // Tampilkan nilai
    // Jika nilai lebih besar dari 70 dan lebih kecil 85 => nilai B
    // Jika nilai lebih besar sama dengan 85 sampai 100 => nilai A
    // Jika nilai lebih besar dari 60 sampai 70 => nilai C
    // Jika nilai 40 sampai 50 => nilai D
    // Nilai di bawah 40 silahkan anda pulang
    
    public static void main(String[] args) {
        
          Scanner scan = new Scanner (System.in);
        
        int a;
        
        System.out.println("Masukan nilai = ");
        a = scan.nextInt();
        
         if ((a > 70) && (a <= 85)){
             System.out.println("Nilai B");
             
         } else if ((a >= 85) && (a <= 100)) {
             System.out.println("Nilai A");
             
         } else if ((a >= 50) && (a <= 70)) {
             System.out.println("Nilai C");
             
         } else if ((a >= 40) && (a <= 50)) {
             System.out.println("Nilai D");
             
         } else {
             System.out.println("Belajar lebih giat lagi ya!!!!");
         }
         }
}
