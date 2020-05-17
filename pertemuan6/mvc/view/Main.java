/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan6.mvc.view;

import batch4.pertemuan6.mvc.controller.ControllerMahasiswa;
import batch4.pertemuan6.mvc.model.Mahasiswa;

/**
 *
 * @author winny
 */
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa model = new Mahasiswa();
        ViewMahasiswa view = new ViewMahasiswa();
        
        ControllerMahasiswa conn = new ControllerMahasiswa(model, view);
        conn.createView();
    }
}   
