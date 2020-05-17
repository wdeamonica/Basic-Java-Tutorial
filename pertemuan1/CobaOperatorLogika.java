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
public class CobaOperatorLogika {
    public static void main(String[] args) {
        //Operator Logika
        boolean a , b , c;
        
        //AND
        System.out.println("====AND====");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(c);
        
        a = true;
        b = false;
        c = (a && b);
        System.out.println(c);
        
        a = false;
        b = true;
        c = (a && b);
        System.out.println(c);
        
        a = false;
        b = false;
        c = (a && b);
        System.out.println(c);    
        
        
        //OR
        System.out.println("====OR====");
        a = true;
        b = true;
        c = (a || b);
        System.out.println(c);
        
        a = true;
        b = false;
        c = (a || b);
        System.out.println(c);
        
        a = false;
        b = true;
        c = (a || b);
        System.out.println(c);
        
        a = false;
        b = false;
        c = (a || b);
        System.out.println(c);
        
         //EXCLUSIVE OR
        System.out.println("====EXCLUSIVE OR====");
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(c);
        
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(c);
        
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(c);
        
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(c);   
        
        System.out.println("==== NEGASI ====");
        a = true;
        c = !a;
        System.out.println(c);
    }
   
}
