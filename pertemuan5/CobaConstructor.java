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
public class CobaConstructor {
    
    
    private String nama;
    private int umur;
    

// constructor
// tidak ada void
public CobaConstructor (String namaOrang, int umurOrang){
    
   nama = namaOrang;
   umur = umurOrang;
    
}

public void perkenalan() {
    System.out.println("Nama saya " + nama + "Umur saya " + umur);
}

    public static void main(String[] args) {
        CobaConstructor cc = new CobaConstructor("Ardi", 23);
        
        cc.perkenalan();
    }
}
