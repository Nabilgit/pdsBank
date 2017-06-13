/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.god.bank.bean;

/**
 *
 * @author Nabil
 */
public class RealEstate {
    
    private int idEstate;
    private float amount;
    private int idCustomer;
    private int idTypeEstate;

    public int getIdEstate() {
        return idEstate;
    }

    public void setIdEstate(int idEstate) {
        this.idEstate = idEstate;
    }
    

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdTypeEstate() {
        return idTypeEstate;
    }

    public void setIdTypeEstate(int idTypeEstate) {
        this.idTypeEstate = idTypeEstate;
    }
    
    


}
