/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

/**
 *
 * @author winny
 */
public class FungsiNonStatic {
 
    // ini fungsi static
    static void minum (String minuman) {
        System.out.println("Saya sedang minum = " + minuman);
    }
    
    // fungsi non static
    void makan (String makanan) {
        System.out.println("Saya sedang makan = " + makanan);
    }

    
    public static void main(String[] args) {
        minum("Coca-cola");
        
        // instansiasi dulu
        // panggil classnya dulu
        FungsiNonStatic fn = new FungsiNonStatic();
        fn.makan("Nasi Padang");
    }
}
