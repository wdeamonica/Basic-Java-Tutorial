/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.inheritance;

/**
 *
 * @author winny
 */
public class Main {
    public static void main(String[] args) {
        
    BangunDatar bd = new BangunDatar();
    bd.keliling();
    bd.luas();
    
    
    System.out.println("=================================");
    
    PersegiPanjang pp = new PersegiPanjang();
    Lingkaran lk = new Lingkaran();
    
    pp.luas();
    pp.keliling();
    
    
    lk.luas();
    lk.keliling();

    
    }
}
