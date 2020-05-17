/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5.overriding;

/**
 *
 * @author winny
 */
public class Kucing extends Hewan {

    @Override
    public void setNama() {
        String hewan = "Eliazer";
        System.out.println("Nama nya = " + hewan);
    }

    @Override
    public void setSuara() {
        String suara = "Krok-krok";
        System.out.println("Suara nya = " + suara);
    }

    @Override
    public void setKaki() {
        int kaki = 2;
        System.out.println("Jumlah kaki = " + kaki);
    }
}
