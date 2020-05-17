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
public class VariableGlobalDanLokal {
    
    // Variabel lokal adalah variabel yang hanya bisa diakses di dalam
    
    static String nama = "Ardi";
    static String jk = "Cowok";
    
    
    // jadi ini adalah variavel lokal
    
    static void batman() {
        String nama = "Alfian";
        String jk = "Laki-laki";
        
        System.out.println("Nama = " + nama);
        System.out.println("Jenis kelamin \t= " + jk);
    }
    
    public static void main(String[] args) {
        batman();
        
        System.out.println("===================");
        System.out.println("Nama = " + nama);
        System.out.println("Jenis kelamin \t= " + jk);
    }
}
