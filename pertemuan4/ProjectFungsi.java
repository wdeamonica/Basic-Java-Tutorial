/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author winny
 */
public class ProjectFungsi {

    //============= STASIUN ============= 
    // 1. Tampil semua stasiun
    // 2. Tambah stasiun
    // 3. Edit nama stasiun
    // 4. Hapus stasiun
    // 5. Keluar
    // Tampil semua data arrayList    
    static ArrayList stasiun = new ArrayList();


    static InputStreamReader inputReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputReader);

    static void menuStasiun() throws IOException {
        System.out.println("*============= STASIUN ============= ");
        System.out.println("1. Tampil semua stasiun ");
        System.out.println("2. Tambah stasiun");
        System.out.println("3. Edit nama stasiun");
        System.out.println("4. Hapus stasiun");
        System.out.println("5. Keluar");
        System.out.println("\nMasukkan nomor : ");

        int pilihStasiun = Integer.parseInt(input.readLine());

        switch (pilihStasiun) {
            case 1:
                tampilStasiun();
                break;

            case 2:
                tambahStasiun();
                break;

            case 3:
                editStasiun();
                break;

            case 4:
                hapusStasiun();
                break;

            case 5:
                System.exit(0);
            default:
                System.out.println("NULL");
        }

    }

     private static void tampilStasiun() {
        if (stasiun.isEmpty()) {
            System.out.println("Stasiun belum ada");
        } else {
            System.out.println("Daftar Stasiun");
            for (int i = 0; i < stasiun.size(); i++) {
                System.out.println("Stasiun ke = " + i + " " + stasiun.get(i));
            }
        }
     }
   
    private static void tambahStasiun() throws IOException {
        System.out.println("Daftar Stasiun : ");
        String namaStasiun = input.readLine();
        stasiun.add(namaStasiun);
        
    }

    private static void editStasiun() throws IOException {
        System.out.println("Daftar Stasiun : ");
        int nomor = Integer.parseInt(input.readLine());
        
        menuStasiun();
        
        System.out.println("Nama stasiun baru = ");
        String editStasiun = input.readLine();
        stasiun.set(nomor, editStasiun);
    }

    private static void hapusStasiun() throws IOException {
        System.out.println("Daftar Stasiun : ");
        int nomor = Integer.parseInt(input.readLine());
        
        menuStasiun();
        
        System.out.println("Nama stasiun baru = ");
        String hapusStasiun = input.readLine();
        stasiun.remove(hapusStasiun);
    }
    
    public static void main(String[] args) throws IOException {
        boolean run = true;
        do {
            menuStasiun();
        } while (run);

    }
}
