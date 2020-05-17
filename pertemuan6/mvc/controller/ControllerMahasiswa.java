/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan6.mvc.controller;

import batch4.pertemuan6.mvc.model.Mahasiswa;
import batch4.pertemuan6.mvc.view.ViewMahasiswa;

/**
 *
 * @author winny
 */
public class ControllerMahasiswa {

    private final Mahasiswa model;
    private final ViewMahasiswa view;

    public ControllerMahasiswa(Mahasiswa model, ViewMahasiswa view) {
        this.model = model;
        this.view = view;
    }

    
    public void createView() {
    view.inputData();
    }

}
