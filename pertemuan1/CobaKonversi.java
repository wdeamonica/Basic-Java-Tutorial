/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan1;

/**
 *
 * @author winny
 */
public class CobaKonversi {
    public static void main(String[] args) {
        int angkaInt= 10;
        String angkaString= "15";
        double angkaDouble= 20.5;
        
        System.out.println(angkaInt);
        System.out.println(angkaString);
        System.out.println(angkaDouble);
        
        //Coba Konversi Data
        
        int i = Integer.parseInt(angkaString);
        Double d = Double.valueOf(angkaInt);
        int t = (int) angkaDouble;
        String e = String.valueOf(angkaDouble);
        Double l = Double.valueOf(angkaString);
        String h = String.valueOf(angkaInt);
        
        System.out.println("==========");
        System.out.println(i);
        System.out.println(d);
        System.out.println(t);
        System.out.println(e);
        System.out.println(l);
        System.out.println(h);
    }
  
}
