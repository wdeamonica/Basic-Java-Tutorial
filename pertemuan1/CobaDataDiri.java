/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan1;

import java.util.Scanner;

/**
 *
 * @author winny
 */
public class CobaDataDiri {
    public static void main(String[] args) {
        
        System.out.println("==== Data Diri ===== \n");
        System.out.println("Hi, guys! Let me introduce ma self ^^ \n");
       
          Scanner scan = new Scanner (System.in);
          
          String nama;
          int umur;
          String univ;
          String fakultas;
          String jurusan;
          String alamat;
          String hp;
          String hobby;
          float ipk;
          int bb;
          double tb;
          char darah;
          
        
        //Nama
        System.out.println("Siapa nama kamu? = ");
        nama = scan.nextLine();
        System.out.println("Nama : " + nama);
        
        //Universitas
        System.out.println("Dimana asal universitas kamu? = ");
        univ = scan.nextLine();
        System.out.println("Universitas : " + univ);
        
        //Fakultas
        System.out.println("Dimana asal fakultas kamu? = ");
        fakultas = scan.nextLine();
        System.out.println("Fakultas : " + fakultas);
        
        //Jurusan
        System.out.println("Dimana asal jurusan kamu? = ");
        jurusan = scan.nextLine();
        System.out.println("Jurusan : " + jurusan);
        
        //Alamat
        System.out.println("Dimana kamu tinggal kamu? = ");
        alamat = scan.nextLine();
        System.out.println("Alamat : " + alamat);
        
        //No. Hp
        System.out.println("Berapa no hp kamu? = ");
        hp = scan.nextLine();
        System.out.println("No. HP : " + hp);
        
        //Hobby
        System.out.println("Apa hobi kamu? = ");
        hobby = scan.nextLine();
        System.out.println("Hobby : " + hobby);
        
        //Umur  
        System.out.println("Berapa umur kamu? = ");
        umur = scan.nextInt();
        System.out.println("Umur : " + umur);
        
        //IPK
        System.out.println("Berapa IPK kamu? = ");
        ipk = scan.nextFloat();
        System.out.println("IPK : " + ipk);
        
        //Berat badan
        System.out.println("Berapa berat badan kamu? = ");
        bb = scan.nextInt();
        System.out.println("Berat badan : " + bb + " kg");
        
         //Tinggi badan
        System.out.println("Berapa tinggi badan kamu? = ");
        tb = scan.nextDouble();
        System.out.println("Tinggi badan : " + tb + " cm");
        
        //Golongan Darah
        System.out.println("Apa golongan darah kamu? = ");
        darah = scan.next().charAt(0);
        System.out.println("Golongan Darah : " + darah);
        
        
    }
}
