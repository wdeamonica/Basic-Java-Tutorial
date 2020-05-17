/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan6.mvc.view;

import batch4.pertemuan6.mvc.model.Mahasiswa;
import java.util.Scanner;

/**
 *
 * @author winny
 */
public class ViewMahasiswa {

    public void inputData() {
        Mahasiswa mhs = new Mahasiswa();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("======== Masukkan Data Mahasiswa ========");
        System.out.println("Nama = ");
        mhs.setNama(input.nextLine());
        System.out.println("NIM = ");
        mhs.setNim(input.nextInt());

        System.out.println("===== Output =====");
        System.out.println("Nama = " + mhs.getNama());
        System.out.println("NIM = " + mhs.getNIM());

    }

}
