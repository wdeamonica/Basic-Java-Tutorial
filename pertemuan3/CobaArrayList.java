/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author winny
 */
public class CobaArrayList {

    public static void main(String[] args) {
        ArrayList Ransel = new ArrayList();

        Ransel.add("Pulpen"); // Tipe data string
        Ransel.add(123); // Tipe data integer
        Ransel.add(0.2); // Tipe data double

        // Untuk Sort syaratnya tipe data harus sama
        // Collections.sort(Ransel);
        // for (Object i : Ransel) {
        // System.out.println(i);
        // }
        // Buat ngehapus index
        // Ransel.remove(0);
        System.out.println(Ransel.size()); // buat nampilim jumlah index
        System.out.println("Index ke " + Ransel.get(0)); // buat nampilin value/nilai per index
        System.out.println("Index ke " + Ransel.get(1));
        System.out.println("Index ke " + Ransel.get(2));

        // buat ngehapus index
        Ransel.remove(0);
        System.out.println("Sisanya ==== ");

        // buat ngedit
        Ransel.set(0, "apa aja");
        Ransel.set(1, "Pulpen");

        // Cara buat nampilin semua data arrayList
        Ransel.forEach((o) -> {
            System.out.println(o);
        });
    }
}
