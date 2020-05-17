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
public class NestedIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Start");
        
        if (a == 5) {
            if (b == 10) {
                System.out.println("Ini adalah aksi dimana a = 5 dan b = 10");
            } else {
                System.out.println("Ini adalah aksi dimana a = 5 bukan b = 10");
            }
        } else {
            System.out.println("Ini adalah aksi dimana a salah");
        }
        System.out.println("S E L E S A I !");
    }
}
