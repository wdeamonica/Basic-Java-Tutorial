/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.overriding;

/**
 *
 * @author winny
 */
public class Omnivora {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.setNama();
        h.setSuara();
        h.setKaki();
        
        System.out.println("===============================");
        
        Kucing k = new Kucing ();
        k.setNama();
        k.setSuara();
        k.setKaki();
    }
}
