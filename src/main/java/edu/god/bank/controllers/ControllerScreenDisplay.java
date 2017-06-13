/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.god.bank.controllers;

import edu.god.bank.view.ScreenDisplayISF;
import edu.god.bank.view.ScreenISFForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nabil
 */



public class ControllerScreenDisplay implements ActionListener{
    
    private final ScreenDisplayISF fenDisplay;

    public ControllerScreenDisplay(ScreenDisplayISF fen2){
     this.fenDisplay = fen2;   
    }
    
    public void actionPerformed(ActionEvent e) {
        this.fenDisplay.dispose();
        ScreenISFForm fen2 = new ScreenISFForm();
    }
    
}
