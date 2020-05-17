/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

/**
 *
 * @author winny
 */
public class LatihanArrayMultidimesi {

    public static void main(String[] args) {

        String[][] nama = {
            {"Lili", "08111", "Bekasi"},
            {"Lala", "08122", "Jakarta"},
            {"Maya", "08133", "Timor Timur"}
        };

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama : " + nama[i][0]);
            System.out.print("\t Nomor : " + nama[i][1]);
            System.out.println("\t Lokasi : " + nama[i][2]);
        }
    }
}
