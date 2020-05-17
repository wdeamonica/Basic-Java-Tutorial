/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author winny
 */
public class ArrayTraining {

    public static void main(String[] args) {
        String training[] = new String[10];
        System.out.println(Arrays.toString(training));
        
        Scanner sc = new Scanner (System.in);
       
        for (int i = 1; i < training.length; i++) {
            training[i] = sc.next();
            System.out.println("Nama training ke - " +i+training[i]);
        }

    }
}
