/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.controller;

import ATM.model.modelATM;
import ATM.view.viewATM;
import java.io.IOException;

/**
 *
 * @author ayuni
 */
public class controllerATM {
`
    private final modelATM model;
    private final viewATM view;

    public controllerATM(modelATM model, viewATM view) {
        this.model = model;
        this.view = view;
    }


    public void createView() throws IOException {
        view.menuUtama();
        
    }
}
