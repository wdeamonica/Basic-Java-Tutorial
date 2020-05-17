/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.exception;

/**
 *
 * @author winny
 */
public class CobaException {
    public static void main(String[] args) {
        try {
            int a = 10;
            
            System.out.println (a/0);
            
        } catch (Exception e) { // nangkap error
            System.out.println(e.getMessage());
            System.out.println("Terjadi kesalahan");
        } finally { // selalu dieksekusi
            System.out.println("Lanjut Jalan");
        }
    }
}
