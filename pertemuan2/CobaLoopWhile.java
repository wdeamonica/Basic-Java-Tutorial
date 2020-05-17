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
public class CobaLoopWhile {
    public static void main(String[] args) {
        int i=0;
        
        while(i <= 10) {
            
            //blok kode yang akan diulang
            System.out.println("Perulangan ke =" + i);
            // increment
            i++;
        }
        
        // program untuk menjumlahkan
        int a, b;
        int hasil =0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukan nilai awal : ");
        a = sc.nextInt();
        System.out.println("Masukan nilai kedua : ");
        b = sc.nextInt();
        
        while(a <= b){
            hasil = hasil + a;
            System.out.println("Ditambah " + a + "Menjadi " + hasil);
         a++;
        }
    }
    
}
