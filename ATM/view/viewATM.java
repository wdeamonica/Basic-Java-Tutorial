/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.view;

import ATM.model.modelATM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ayuni
 */
public class viewATM {

    modelATM mdl = new modelATM();
    
    private static int option;
    private int saldo, konfirmasi_pin, pilih, penarikan, setor, jum_transfer, no_rekening;

    InputStreamReader inputStream = new InputStreamReader(System.in);
    BufferedReader inputt = new BufferedReader(inputStream);
    
    public void menuUtama() {
        try {
            
        boolean ulang = true;
            
            
                System.out.println("       SELAMAT DATANG       ");
                System.out.println("     DI ATM BANK BATMAN     ");
                System.out.println("============================");

                System.out.print("SILAHKAN INPUTKAN PIN ANDA -> ");

                int pinn = Integer.parseInt(inputt.readLine()); // Inputan
                if (pinn == mdl.getPin()) // Kondisi If
                {
                    do { // Kondisi Do While
                        System.out.println("\n--------------------------");
                        System.out.println("MENU TRANSAKSI ANDA");
                        System.out.println("SILAHKAN PILIH OPTION");
                        System.out.println("-> 1. LIHAT SALDO");
                        System.out.println("-> 2. TRANSFER");
                        System.out.println("-> 3. TARIK TUNAI");
                        System.out.println("-> 4. SETOR TUNAI");
                        System.out.println("-> 5. KELUAR");
                        System.out.println("--------------------------");
                        System.out.print("OPTION -> ");
                        option = Integer.parseInt(inputt.readLine());

                        switch (option) { // Perulangan Case
                            case 1:
                                lihatSaldo();
                                break;

                            case 2:
                                lihatTransfer();
                                break;

                            case 3:
                                lihatTarikTunai();
                                break;

                            case 4:
                                lihatSetorTunai();
                                
                                break;
                            case 5:
                                System.out.println("Apakah anda yakin mau keluar? (y/t) ");
                                System.out.print("Masukkan jawaban : ");
                                String jawaban = inputt.readLine();
                                
                                if (jawaban.equalsIgnoreCase("y")) {
                                    System.exit(0);
                                }
                                pinn();
                                
                                break;
                            default:
                                System.out.println("Menu tidak terdaftar :(");

                        }
                        boolean run=true;
                        do{
                        System.out.println("\nTEKAN 0 UNTUK KEMBALI KE MENU");
                        System.out.print("-> ");
                        int proses = Integer.parseInt(inputt.readLine());
                        if (proses == 0) {
                            run =false;
                        }else{
                            System.out.println("Maaf Pilihan Tidak Terdaftar");
                        }
                            
                        }while(run);
                        
                    } while (ulang);
                } else {
                    System.out.println("PIN YANG ANDA MASUKKAN SALAH");
                }
            } catch (IOException e) {
                System.out.print("");
            } catch (NumberFormatException e) {
                System.out.println("PIN ANDA BUKAN ANGKA !");
            }
        
    }

    public void lihatSaldo() {
        System.out.println("================================");
        System.out.println("SALDO ANDA SAAT INI : " + mdl.getSaldo());
        System.out.println("================================");
    }

    public void pinn() throws IOException {
        System.out.print("PIN ANDA : ");
        mdl.getPin();
        Integer.parseInt(inputt.readLine());
        System.out.print("KONFIRMASI PIN ANDA : ");
        konfirmasi_pin = Integer.parseInt(inputt.readLine());
        if (konfirmasi_pin == mdl.getPin()) { // Pencocokan PIN
            System.out.println("> PIN MATCH : OK ");
        } else {
            System.out.println("> PIN NOT MATCH. Trasaksi Batal");
            System.exit(0);
        }
    }

    public void lihatTransfer() throws IOException {

        System.out.println("=================================");
        System.out.println("TRANSFER DANA KE BANK");
        System.out.println("=================================");
        System.out.println("1. Ke sesama");
        System.out.println("2. Ke Bank lain");
        System.out.print("Pilih = ");

        int pilih = Integer.parseInt(inputt.readLine());
        if (pilih == 1) {
            System.out.print("Masukan No Rekening : ");
            no_rekening = Integer.parseInt(inputt.readLine());
            System.out.print("Masukan Jumlah Transfer : ");
            jum_transfer = Integer.parseInt(inputt.readLine());

            pinn();

            if (jum_transfer >= mdl.getSaldo()) { // Cek saldo memenuhi aturan transfer
                System.out.println("> SALDO TIDAK CUKUP");
            } else {

                System.out.println(" -> No Rekening     = " + no_rekening);
                System.out.println(" -> Nama Penerima   = Winny Dea Monica");
                System.out.println(" -> Jumlah Transfer = " + jum_transfer);
                
                saldo = mdl.getSaldo() - jum_transfer;
                mdl.setSaldo(saldo);
                System.out.println(" -> Sisa Saldo = " + mdl.getSaldo());
                System.out.println(" TRANSAKSI BERHASIL !");
            }
        } else if (pilih == 2) {
            System.out.print("Masukan No Rekening : ");
            no_rekening = Integer.parseInt(inputt.readLine());
            System.out.print("Masukan Jumlah Transfer : ");
            jum_transfer = Integer.parseInt(inputt.readLine());
            

            pinn();

            if (jum_transfer >= mdl.getSaldo()) { // Cek saldo memenuhi aturan transfer
                System.out.println("> SALDO TIDAK CUKUP");
            } else {

                System.out.println(" -> No Rekening     = " + no_rekening);
                System.out.println(" -> Nama Penerima   = Winny Dea Monica");
                System.out.println(" -> Jumlah Transfer = " + jum_transfer);
                System.out.println(" -> PPN             = 5000");
                mdl.getSaldo();
                saldo = mdl.getSaldo() - jum_transfer -5000;
                mdl.setSaldo(saldo);
                System.out.println(" -> Sisa Saldo = " + mdl.getSaldo());
                System.out.println(" TRANSAKSI BERHASIL !");
            }
        }

    }

    public void lihatTarikTunai() throws IOException {
        System.out.println("=================================");
        System.out.println("PENARIKAN UANG ");
        System.out.println("=================================");
        System.out.println("Masukkan jumlah yang ingin ditarik :");
        System.out.print("1. 100.000 \t");
        System.out.println("3. 500.000");
        System.out.print("2. 200.000 \t");
        System.out.println("4. 1.000.000");
        System.out.println("5. Jumlah lainnya");
        System.out.print("Masukkan pilihan : ");
        pilih = Integer.parseInt(inputt.readLine());

        if (pilih == 1) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            mdl.getPenarikan();
            penarikan = 100000;
            mdl.setPenarikan(penarikan);
            System.out.println("Jumlah Setor \t : " + mdl.getPenarikan());

            pinn();

            if (mdl.getPenarikan() >= mdl.getSaldo()) {
                System.out.println("Saldo Anda Tidak Cukup");
            } else {
                saldo = mdl.getSaldo() - mdl.getPenarikan();
                mdl.setSaldo(saldo);
                System.out.println("Saldo akhir : " + mdl.getSaldo());
            }

        } else if (pilih == 2) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            mdl.getPenarikan();
            penarikan = 200000;
            mdl.setPenarikan(penarikan);
            System.out.println("Jumlah Setor \t : " + mdl.getPenarikan());

            pinn();

            if (mdl.getPenarikan() >= mdl.getSaldo()) {
                System.out.println("Saldo Anda Tidak Cukup");
            } else {
                saldo = mdl.getSaldo() - mdl.getPenarikan();
                mdl.setSaldo(saldo);
                System.out.println("Saldo akhir : " + mdl.getSaldo());
            }

        } else if (pilih == 3) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            mdl.getPenarikan();
            penarikan = 500000;
            mdl.setPenarikan(penarikan);
            System.out.println("Jumlah Setor \t : " + mdl.getPenarikan());

            pinn();

            if (mdl.getPenarikan() >= mdl.getSaldo()) {
                System.out.println("Saldo Anda Tidak Cukup");
            } else {
                saldo = mdl.getSaldo() - mdl.getPenarikan();
                mdl.setSaldo(saldo);
                System.out.println("Saldo akhir : " + mdl.getSaldo());
            }
        } else if (pilih == 4) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            mdl.getPenarikan();
            penarikan = 1000000;
            mdl.setPenarikan(penarikan);
            System.out.println("Jumlah Setor \t : " + mdl.getPenarikan());

            pinn();

            if (mdl.getPenarikan() >= mdl.getSaldo()) {
                System.out.println("Saldo Anda Tidak Cukup");
            } else {
                saldo = mdl.getSaldo() - mdl.getPenarikan();
                mdl.setSaldo(saldo);
                System.out.println("Saldo akhir : " + mdl.getSaldo());
            }
        } else {
            System.out.print("Masukan jumlah uang >> ");
            mdl.getPenarikan();
            penarikan = Integer.parseInt(inputt.readLine());
            mdl.setPenarikan(penarikan);
            System.out.println("Saldo Awal \t\t : " + mdl.getSaldo());
            System.out.println("Jumlah Penarikan \t : " + mdl.getPenarikan());

            pinn();

            if (mdl.getPenarikan() >= mdl.getSaldo()) {
                System.out.println("Saldo Anda Tidak Cukup");
            } else {
                saldo = mdl.getSaldo() - mdl.getPenarikan();
                mdl.setSaldo(saldo);
                System.out.println("Saldo akhir : " + saldo);
            }
        }
    }

    public void lihatSetorTunai() throws IOException {
        System.out.println("=================================");
        System.out.println("SETOR TUNAI");
        System.out.println("=================================");
        System.out.println("Masukkan jumlah yang ingin disetor :");
        System.out.print("1. 100.000 \t");
        System.out.println("3. 500.000");
        System.out.print("2. 200.000 \t");
        System.out.println("4. 1.000.000");
        System.out.println("5. Jumlah lainnya");
        System.out.print("Masukkan pilihan -> ");
        pilih = Integer.parseInt(inputt.readLine());

        if (pilih == 1) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            setor = 100000;
            mdl.setSetor(setor);
            System.out.println("Jumlah Setor \t : " + mdl.getSetor());

            pinn();

            saldo = mdl.getSaldo() + mdl.getSetor();
            mdl.setSaldo(saldo);
            System.out.println("Saldo akhir : " + mdl.getSaldo());

        } else if (pilih == 2) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            setor = 200000;
            mdl.setSetor(setor);
            System.out.println("Jumlah Setor \t : " + mdl.getSetor());

            pinn();

            saldo = mdl.getSaldo() + mdl.getSetor();
            mdl.setSaldo(saldo);
            System.out.println("Saldo akhir : " + mdl.getSaldo());
        } else if (pilih == 3) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            setor = 500000;
            mdl.setSetor(setor);
            System.out.println("Jumlah Setor \t : " + mdl.getSetor());

            pinn();

            saldo = mdl.getSaldo() + mdl.getSetor();
            mdl.setSaldo(saldo);
            System.out.println("Saldo akhir : " + mdl.getSaldo());
        } else if (pilih == 4) {
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            setor = 1000000;
            mdl.setSetor(setor);
            System.out.println("Jumlah Setor \t : " + mdl.getSetor());

            pinn();

            saldo = mdl.getSaldo() + mdl.getSetor();
            mdl.setSaldo(saldo);
            System.out.println("Saldo akhir : " + mdl.getSaldo());
        } else {
            System.out.print("Masukan jumlah uang >> ");
            mdl.getSetor();
            setor = Integer.parseInt(inputt.readLine());
            mdl.setSetor(setor);
            System.out.println("Saldo Awal \t : " + mdl.getSaldo());
            System.out.println("Jumlah Setor \t : " + mdl.getSetor());

            pinn();

            saldo = mdl.getSaldo() + mdl.getSetor();
            mdl.setSaldo(saldo);
            System.out.println("Saldo akhir : " + mdl.getSaldo());

        }
    }
}
