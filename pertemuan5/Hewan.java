/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5;

/**
 *
 * @author winny
 */
public class Hewan {
   int kaki;
   String Nama, Makanan;
    
    void inputData (String x,String y, int z){
        kaki=z;
        Nama=x;
        Makanan=y;
        
    }  
    void cetak (){
        System.out.println("Nama Hewan    = "+Nama);
        System.out.println("Makanan       = "+Makanan);
        System.out.println("Jumlah kaki   = "+kaki);
    }
    
    public static void main(String[] args) {
        Hewan r = new Hewan();
        r.inputData("Kucing", "Ikan", 4);
        r.cetak();
    }
}
