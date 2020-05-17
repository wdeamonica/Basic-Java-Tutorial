/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM.view;

import ATM.*;
import ATM.controller.controllerATM;
import ATM.model.modelATM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ayuni
 */
class ATM {

    private static int option;

    public static void main(String args[]) throws IOException {

        modelATM mdl = new modelATM();
        
        viewATM lihat = new viewATM();
        
        controllerATM control = new controllerATM(mdl, lihat);
        control.createView();

        
        
        }
    }

