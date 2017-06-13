package edu.god.bank.controllers;

import edu.god.bank.client.ClientFactoryJSON;
import edu.god.bank.client.ClientParserJSON;
import edu.god.bank.client.Communicator;
import java.awt.Color;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import edu.god.bank.view.ScreenConnection;
import edu.god.bank.view.ScreenISFForm;


public class ControllerScreenConnection implements ActionListener {

    private final JTextField identifiant;
    private final transient JPasswordField password;
    private final JLabel lblError;
    private final ScreenConnection fen;

    public ControllerScreenConnection(ScreenConnection  fen0, JTextField identifiant0, JPasswordField password0, JLabel labelError) {
        this.identifiant = identifiant0;
        this.password = password0;
        this.fen = fen0;
        lblError = labelError;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        resetAfterError();
        String id = identifiant.getText();
        String pwd = pwdToString();
        if (!"".equals(identifiant.getText().trim()) && !pwd.isEmpty()) {
                Communicator communicator = new Communicator();
                communicator.sendData(new ClientFactoryJSON().makeJSONauthentification(id, pwd));
                if(communicator.receiveData().equals("OK")){
                    this.fen.dispose();
                    fen.setVisible(false);
                    ScreenISFForm fen2 = new ScreenISFForm();
                    
                    System.out.println("okok");
              }
           
            
        } else {
            if ("".equals(identifiant.getText().trim())) {
                identifiant.requestFocus();
                identifiant.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else if (pwd.isEmpty()) {
                password.requestFocus();
                password.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            lblError.setText("Veuillez remplir tous les champs");
            lblError.setForeground(Color.red);
        }
    }

    

    private void resetAfterError() {
        lblError.setText("");
        identifiant.setBorder(UIManager.getBorder("TextField.border"));
        password.setBorder(UIManager.getBorder("TextField.border"));
    }


    private String pwdToString() {
        String pwd = "";
        for (char aChar : password.getPassword()) {
            pwd += aChar;
        }
        return pwd;
    }
    
    /*
    public void test(){
        
    
                String id = identifiant.getText();
		String pass = String.valueOf(password.getPassword());

		//si l'un des champ d'identification est vide affichage d'un message d'alerte
		if (id.isEmpty()|| pass.isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Veuillez renseigner les champs permettant de vous identifier");
		}
		else 
		{
			Communicator communicator = new Communicator();

			communicator.sendData(ClientFactoryJSON.makeJSONauthentification(id, pass));
			if(communicator.receiveData().equals("OK") ) {
				JOptionPane.showMessageDialog(null, "Vous etes connecté");
			}else
				JOptionPane.showMessageDialog(null, "Vos identifiants ne sont pas corrects");
		}
             }
    */
}



