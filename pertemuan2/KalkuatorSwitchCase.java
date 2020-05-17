/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class KalkuatorSwitchCase {
  
    
    // nilai pertama
    // nilai kedua
    // operator
    // case penambahan
    // case pengurangan
    // case pembagian
    // case perkalian
    // case mod
    
    public static void main(String[] args) {
        
        double a;
        double b;
        double total;
        String operator;
           
        System.out.println("*=========== KALKUATOR ===========*\n");
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Masukan Operator = ");
        operator = scan.nextLine ();
         
        System.out.println("Masukan angka pertama = ");
        a = scan.nextDouble();
         
        System.out.println("Masukan angka kedua = ");
        b = scan.nextDouble();
        
        switch (operator) {
            case "+":
                total = a + b;
                System.out.println("Total =" + total);
                break;
                
            case "-":
                total = a - b;
                System.out.println("Total =" + total);
                break;
                
             case "*":
                total = a * b;
                System.out.println("Total =" + total);
                break;
                
             case "/":
                 total = a / b;
                System.out.println("Total =" + total);
                break;
                
             case "%":
                 total = a % b;
                System.out.println("Total =" + total);
                break;
                
             default:
                 System.out.println("NULL");
    }
  }
}
