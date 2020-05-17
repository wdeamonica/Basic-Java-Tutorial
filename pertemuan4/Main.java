/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

import static batch4.pertemuan4.CobaProsedure.ucapSalam;

/**
 *
 * @author winny
 */
public class Main {
    public static void main(String[] args) {
        
        // cara 1
        //CobaProsedur.ucapSalam ("Selamat Malem!");
        
        // cara 2
        // Panggil 1
        ucapSalam("Selamat Malem!");
        
        // Panggil 2
        System.out.println(CobaFungsiReturn.luasPersegi(10));
        
        // Panggil 3
        FungsiNonStatic sa = new FungsiNonStatic();
        sa.makan("Pempek");
    }
}