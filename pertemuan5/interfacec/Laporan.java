/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.interfacec;

/**
 *
 * @author winny
 */
public class Laporan implements cetak, tampil {

    @Override
    public void cetakA3() {
        System.out.println("Kertas Ukuran A3");
    }

    @Override
    public void cetakA4() {
        System.out.println("Kertas Ukuran A4");
    }

    @Override
    public void tampilWeb() {
        System.out.println("Tampil Web");
    }

    @Override
    public void tampilMobile() {
        System.out.println("Tampil Mobile");
    }

}
