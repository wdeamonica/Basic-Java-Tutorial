/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author winny
 */
public class CobaBufferReader {

    public static void main(String[] args) throws IOException {

        // Membuat input user dengan buffered reader
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inputReader);

        System.out.println("Masukkan Angka : ");
        System.out.println("Ini konversi integer = ");
        int a = Integer.parseInt(input.readLine());
        System.out.println("Ini konversi double = ");
        Double b = Double.parseDouble(input.readLine());

        if (b % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }

}
