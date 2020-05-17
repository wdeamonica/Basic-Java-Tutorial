/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan2;

/**
 *
 * @author winny
 */
public class CobaDoWhile {
    public static void main(String[] args) {
        // do
        // aksi
        // while (kondisi)
        int a =0;
        boolean kondisi = true;
        
        do {
            a++;
            System.out.println("Do while ke - " + a);
            if (a == 5) {
                kondisi = false;}
            } while (kondisi);
        }
    }
