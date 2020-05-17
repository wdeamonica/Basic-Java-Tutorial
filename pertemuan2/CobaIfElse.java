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
public class CobaIfElse {
    public static void main(String[] args) {
        // Tampilkan nama
        // Nilai
        // Jika Nilainya lebih dari 50 maka anda lulus
        
        Scanner scan = new Scanner (System.in);
        
        String nama;
        int a;
        
        System.out.println("Siapa nama kamu? = ");
        nama = scan.nextLine();
        System.out.println("Nama : " + nama);
        
        System.out.println("Masukan Nilai = ");
        a = scan.nextInt();
        System.out.println("Nilai : " + a);
        
        // Program Lulus
        if (a > 50) {
            System.out.println("Anda Lulus!");
        }
        
        System.out.println("Masukan Jumlah Belanja = ");
        a = scan.nextInt();
        System.out.println("Jumlah Belanja : " + a);
        
        // Program Belanja
        if (a > 200000) {
            System.out.println("Anda Dapat Hadiah!");
        }
       
    }
    }
