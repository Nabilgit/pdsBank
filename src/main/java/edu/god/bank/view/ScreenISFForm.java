/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.god.bank.view;

import com.sun.prism.paint.Color;
import edu.god.bank.controllers.ScreenIsfFormController;
import javafx.scene.text.Font;
import javax.swing.JFrame;

/**
 *
 * @author Nabil
 */
public class ScreenISFForm extends javax.swing.JFrame {

    /**
     * Creates new form ScreenISFForm
     */
    public ScreenISFForm() {
        initComponents();
        setVisible(true);
        calculateISFButton.addActionListener(new ScreenIsfFormController(this,nameField,surnameField,emailField,realEstateAmountField, capitalAmountField, assetsAmountField, donationField, investmentField));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        realEstateLabel = new javax.swing.JLabel();
        CapitalEstateLabel = new javax.swing.JLabel();
        AssetsEstateLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        realEstateAmountField = new javax.swing.JTextField();
        realEstateAmountLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));
        capitalAmountField = new javax.swing.JTextField();
        capitalAmountLabel = new javax.swing.JLabel();
        assetsAmountLabel = new javax.swing.JLabel();
        assetsAmountField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        donationLabel = new javax.swing.JLabel();
        investementLabel = new javax.swing.JLabel();
        donationField = new javax.swing.JTextField();
        investmentField = new javax.swing.JTextField();
        calculateISFButton = new javax.swing.JToggleButton();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        realEstateLabel.setText("Patrimoine immobilier");

        CapitalEstateLabel.setText("Patrimoine Financier");

        AssetsEstateLabel.setText("Patrimoine  mobilier");
        AssetsEstateLabel.setToolTipText("");

        nameLabel.setText("Nom : ");

        surnameLabel.setText("Prenom :");
        surnameLabel.setToolTipText("");

        realEstateAmountField.setToolTipText("");
        realEstateAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realEstateAmountFieldActionPerformed(evt);
            }
        });

        realEstateAmountLabel.setText("Montant : ");

        capitalAmountLabel.setText("Montant : ");

        assetsAmountLabel.setText("Montant");

        assetsAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetsAmountFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Déduction impôts/nvestissement : ");

        donationLabel.setText("Total Dons :");

        investementLabel.setText("Total investissment :");

        calculateISFButton.setText("Calculer");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setText(" Email :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CapitalEstateLabel)
                                        .addComponent(AssetsEstateLabel)
                                        .addComponent(surnameLabel))
                                    .addGap(19, 19, 19))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(realEstateLabel)
                                    .addGap(16, 16, 16)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(calculateISFButton)))
                .addGap(0, 316, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assetsAmountLabel)
                                .addComponent(capitalAmountLabel)
                                .addComponent(nameLabel)
                                .addComponent(emailLabel)
                                .addComponent(realEstateAmountLabel))
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(investementLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(donationLabel)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donationField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(capitalAmountField)
                        .addComponent(investmentField)
                        .addComponent(assetsAmountField)
                        .addComponent(realEstateAmountField)
                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(surnameField, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(realEstateLabel)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realEstateAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realEstateAmountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(CapitalEstateLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capitalAmountLabel)
                    .addComponent(capitalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(AssetsEstateLabel)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assetsAmountLabel)
                    .addComponent(assetsAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donationLabel)
                    .addComponent(donationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(investmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(investementLabel))
                .addGap(14, 14, 14)
                .addComponent(calculateISFButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realEstateAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realEstateAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_realEstateAmountFieldActionPerformed

    private void assetsAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetsAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assetsAmountFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssetsEstateLabel;
    private javax.swing.JLabel CapitalEstateLabel;
    private javax.swing.JTextField assetsAmountField;
    private javax.swing.JLabel assetsAmountLabel;
    private javax.swing.JToggleButton calculateISFButton;
    private javax.swing.JTextField capitalAmountField;
    private javax.swing.JLabel capitalAmountLabel;
    private javax.swing.JTextField donationField;
    private javax.swing.JLabel donationLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel investementLabel;
    private javax.swing.JTextField investmentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField realEstateAmountField;
    private javax.swing.JLabel realEstateAmountLabel;
    private javax.swing.JLabel realEstateLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    // End of variables declaration//GEN-END:variables
}