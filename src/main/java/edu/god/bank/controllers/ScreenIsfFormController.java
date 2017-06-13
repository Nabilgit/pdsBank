package edu.god.bank.controllers;

import edu.god.bank.bean.Client;
import edu.god.bank.client.ClientFactoryJSON;
import edu.god.bank.client.Communicator;
import edu.god.bank.view.ScreenDisplayISF;
import edu.god.bank.view.ScreenISFForm;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import edu.god.bank.view.ScreenISFForm;

public class ScreenIsfFormController implements ActionListener {
    
    
    private final JTextField name;
    private final JTextField surname;
    private final JTextField realEstateAmount;
    private final JTextField capitalEstateAmount;
    private final JTextField assetsEstateAmount;
    private final JTextField donationField;
    private final JTextField investementField;
    private final JTextField email;
    private final ScreenISFForm fenIsf;

    
    public ScreenIsfFormController (ScreenISFForm fen, JTextField name, JTextField surname, JTextField email, JTextField realEstate, JTextField capitalEstate , JTextField assetsEstate, JTextField donation, JTextField investment){
        this.name = name;
        this.surname = surname;
        this.realEstateAmount = realEstate;
        this.capitalEstateAmount = capitalEstate;
        this.assetsEstateAmount = assetsEstate;
        this.donationField = donation;
        this.investementField = investment;
        this.email = email;
        this.fenIsf = fen;
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = this.name.getText();
        String surname = this.surname.getText();
        String email = this.email.getText();
        String realEstateAmount = this.realEstateAmount.getText();
        float capitalEstateAmount = Float.parseFloat(this.capitalEstateAmount.getText());  
        float assetsEstateAmount = Float.parseFloat(this.assetsEstateAmount.getText());
        float donation = Float.parseFloat(this.donationField.getText());
        float investement = Float.parseFloat(this.investementField.getText());
        
        System.out.println(name +  "  " + surname + "  " + email);
        Client c = new Client(name, surname,email);
        
        Communicator communicator = new Communicator();
        communicator.sendData(new ClientFactoryJSON().makeJSONclientRetriever(c.getName(), c.getSurname(), c.getEmail()));
       
        //System.out.println(" TEST RECEIVE : "+communicator.receiveData());
        //System.out.println(" TEST RECEIVE 2 : "+communicator.receiveIdClient());

        if(communicator.receiveData().equals("OK")){
         // c.setId(Integer.parseInt(communicator.receiveIdClient()));
          
         communicator.sendData(new ClientFactoryJSON().makeJsonCalculISF(Float.parseFloat(realEstateAmount), capitalEstateAmount, assetsEstateAmount, donation, investement));
         double isf = Double.parseDouble(communicator.receiveISFResult());
         double totalAmount = capitalEstateAmount + assetsEstateAmount + capitalEstateAmount;

            //communicator.sendData(new ClientFactoryJSON().makeJsonInsertRealEstate(c.getId(), realEstateAmount));
          this.fenIsf.dispose();
          ScreenDisplayISF displayFen = new ScreenDisplayISF(isf, totalAmount);
        
        }
    }
    
    
    

}