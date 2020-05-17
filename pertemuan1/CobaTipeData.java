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
public class CobaTipeData {
    public static void main(String[] args) {
        
        //Integer
        int i = 78238723; //deklarasi
        System.out.println("===== INTEGER =====");
        System.out.println("Nilai Integer = " + i);
        System.out.println("Nilai MAX Byte = " + Integer.MAX_VALUE);
        System.out.println("Nilai MIN Byte = " + Integer.MIN_VALUE);
    
    
        //Character
        char c= 'z';
        char d= 'y';
        System.out.println("==== CHARACTER ====");
        System.out.println("Nilai Character = " + c + d);
        
        //Float
        float j= 2.1f;
        System.out.println("====== FLOAT ======");
        System.out.println("Nilai Float = " + j);
        System.out.println("Nilai MAX Byte = " + Float.MAX_VALUE);
        System.out.println("Nilai MIN Byte = " + Float.MIN_VALUE);
     
        //String
        String s = "Winny Dea Monica";
        System.out.println("====== String ======");
        System.out.println("Nama ku = " + s);
        
        //Byte
        byte o = 127;
        System.out.println("======= Byte =======");
        System.out.println("Nilai byte = " + (o+17));
        System.out.println("Nilai MAX Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai MIN Byte = " + Byte.MIN_VALUE);
        
        //Long
        long y = 1278989898;
        System.out.println("======= Long =======");
        System.out.println("Nilai long = " + y);
        System.out.println("Nilai MAX Byte = " + Long.MAX_VALUE);
        System.out.println("Nilai MIN Byte = " + Long.MIN_VALUE);
        System.out.println("Jangkauan Long = " + Long.BYTES);
        System.out.println("Besar Long = " + Long.SIZE);
        
        //Double
        double doubl = 2.34;
        System.out.println("======= Double =======");
        System.out.println("Nilai double = " +doubl);
        System.out.println("Jangkauan Double = " + Double.BYTES);
        System.out.println("Besar Double = " + Double.SIZE);
        
        //Short
        short sh = 125;
        System.out.println("======= Short =======");
        System.out.println("Nilai short = " +sh);
        System.out.println("Jangkauan Short = " + Short.BYTES);
        System.out.println("Besar Short = " + Short.SIZE);
        
        //Boolean
        boolean val = false;
        System.out.println("======= Boolean =======");
        System.out.println("Nilai boolean = " +val);
    }
}
