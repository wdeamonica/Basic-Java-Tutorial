/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5;

import batch4.pertemuan4.FungsiNonStatic;
import java.util.Scanner;

/**
 *
 * @author winny
 */
public class CobaClassMobil2 {

    // atribut / properti
    static int bbm, kecepatan;

    // Method atau perilaku
    // Jika bbm 10
    // Kecepatan  20
    // maka diboleh belok
    // jika tidak maka jangan belok
    void belok() {
        if ((bbm > 10) || (kecepatan > 20)) {
            System.out.println("Boleh belok");
        } else {
            System.out.println("Tidak boleh belok");
        }
    }

    // Method MajuCepat
    // Jika bbm lebih dari 50
    // kecepatannya lebih dari 80
    // maka diboleh maju cepat
    // jika tidak maka jangan
    void majuKencang() {
        if ((bbm >= 50) || (kecepatan >= 80)) {
            System.out.println("Boleh maju cepat");
        } else {
            System.out.println("Jangan maju cepat");
        }
    }

    // Method matikanMesin
    // jika kecepatan dibawah 10
    // atau bbm dibawah 10
    // maka matikan mesin
    // jika tidak rem pelan 
    void matikanMesin() {
        if ((bbm <= 10) || (kecepatan <= 10)) {
            System.out.println("Matikan mesin");
        } else {
            System.out.println("Rem pelan");
        }
    }

    public static void main(String[] args) {

        // instansiasi
        CobaClassMobil2 mobil = new CobaClassMobil2();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nMasukkan jumlah bbm = ");
        mobil.bbm = scan.nextInt();

        System.out.println("\nMasukkan jumlah kecepatan = ");
        mobil.kecepatan = scan.nextInt();
        
        mobil.belok();

    }
}
