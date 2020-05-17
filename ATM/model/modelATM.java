/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.model;

/**
 *
 * @author ayuni
 */
public class modelATM {

    private int pin = 123, saldo=0, penarikan=0, setor=0; // Variabel

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPenarikan() {
        return penarikan;
    }

    public void setPenarikan(int penarikan) {
        this.penarikan = penarikan;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}
