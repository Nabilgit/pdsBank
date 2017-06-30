package edu.god.bank.server;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import edu.god.bank.bean.AppAuthentification;
import edu.god.bank.bean.Client;
import edu.god.bank.bean.EstateValue;
import edu.god.bank.bean.RealEstate;
import edu.god.bank.dao.CalculISFDAO;
import java.util.List;
import java.util.ArrayList;

public class Features {
    
    public static boolean userExist(AppAuthentification authentification, Connection connection) {
        int linesNumber = 0;
        try {
            
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users where login_User = ? and password_User= ?");
            pstmt.setString(1, authentification.getLogin());
            pstmt.setString(2, authentification.getPassword());
            //ResultSet result = pstmt.executeQuery();
            
            ResultSet result = pstmt.executeQuery();
            //System.out.println("requête : "  + pstmt.toString());
                        //we place on last line
            result.last();
            //we recover line number
            linesNumber = result.getRow();
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        if(linesNumber == 1)
            return true;
        else
            return false;
    }
    
    
     public static int clientExist(Client client, Connection connection) {
        int linesNumber = 0;
        int idClient= 0;
        try {
            
            System.out.println("TEST ARG : " + client.getEmail());
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Customer where last_name_customer = ? and first_name_customer= ? and email_Customer = ? ");
            pstmt.setString(1, client.getName());
            pstmt.setString(2, client.getSurname());   
            pstmt.setString(3, client.getEmail());
            ResultSet result = pstmt.executeQuery();
            result.next();
            idClient = result.getInt("id_Customer");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        return idClient;
    }
    
     
       public static void insertRealEstate(RealEstate restate, Connection connection) {
        try {
            
            String sql = "INSERT INTO RealEstate(id_Customer, amount, id_TypeEstate ) Values ( ?, ?, (select id_TypeEstate from type_estate t where t.libelle = 'Immobilier'))";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, restate.getIdCustomer());
            pstmt.setFloat(2, restate.getAmount());   
            //pstmt.setString(3, "");
            ResultSet result = pstmt.executeQuery();
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public static double CalculEstate(EstateValue estate, Connection connection, CalculISFDAO dao){
        
        float estateTotal = 0;
        int firstCutValue= dao.getFirstCutValue(connection);
        int secondCutValue = dao.getSecondCutValue(connection);
        int thirdCutValue  = dao.getThirdCutValue(connection);
        double wealthTaxe = 0;
        double firstCut = dao.getFirstRate(connection);
        double secondCut= dao.getSecondRate(connection);
        double thirdCut=dao.getThirdRate(connection);
        System.out.println( "Cut value : " + firstCutValue +  " " + secondCutValue + " " + thirdCutValue +" ");
        System.out.println( "Cut rate : " + firstCut +  " " + secondCut + " " + thirdCut +" ");
        estateTotal = estate.getAssetsestate() + estate.getCapitalestate()+estate.getRealestate();
        
        if( estateTotal <= firstCutValue){
        
            return wealthTaxe;
        
        }else if (estateTotal > firstCutValue && estateTotal <= secondCutValue){
        
            wealthTaxe = (estateTotal - firstCutValue) * firstCut - ((estate.getDonation()+estate.getInvestement())*0.05);
            return wealthTaxe;

        }else if(estateTotal > secondCutValue && estateTotal <= 2570000 ){
        
            double slice1 = (estateTotal -secondCutValue) * secondCut;
            double slice2 = (secondCutValue - firstCutValue) * firstCut;           
            wealthTaxe = slice1+slice2 - ((estate.getDonation()+estate.getInvestement())*0.05);    
            return wealthTaxe;

        }else if(estateTotal > thirdCutValue){
    
            double slice1 = (estateTotal - thirdCutValue) * thirdCut;
            double slice2 = (thirdCutValue - secondCutValue) * secondCut; 
            double slice3 =(secondCutValue - firstCutValue) *thirdCut; 
            wealthTaxe = slice1+slice2+slice3 -((estate.getDonation()+estate.getInvestement())*0.05);
            return wealthTaxe;
        
        } else{
            return 0;
        }
    }
    
}