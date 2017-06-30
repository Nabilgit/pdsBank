package edu.god.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CalculISFDAO implements ICaclculISFInterface {

    @Override
    public double getFirstRate(Connection connection) {
        double rate = 0.0;
        try{
        String sql = "Select taux from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 1");
            ResultSet result = pstmt.executeQuery();
            result.next();
            rate = result.getDouble("taux");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return rate;
    }

    @Override
    public double getSecondRate(Connection connection) {
    double rate = 0.0;
        try{
        String sql = "Select taux from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 2");
            ResultSet result = pstmt.executeQuery();
            result.next();
            rate = result.getDouble("taux");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return rate;    }

    @Override
    public double getThirdRate(Connection connection) {
       double rate = 0.0;
        try{
        String sql = "Select taux from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 3");
            ResultSet result = pstmt.executeQuery();
            result.next();
            rate = result.getDouble("taux");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return rate;
    }
    
    @Override
    public int getFirstCutValue(Connection connection) {
       int cutValue = 0;
        try{
        String sql = "Select valeur from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 1");
            ResultSet result = pstmt.executeQuery();
            result.next();
            cutValue = result.getInt("valeur");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return cutValue;
    }
    
    @Override
    public int getSecondCutValue(Connection connection) {
       int cutValue = 0;
        try{
        String sql = "Select valeur from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 2");
            ResultSet result = pstmt.executeQuery();
            result.next();
            cutValue = result.getInt("valeur");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return cutValue;
    }
    
    @Override
    public int getThirdCutValue(Connection connection) {
       int cutValue = 0;
        try{
        String sql = "Select valeur from taux_isf where tranche = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "Tranche 3");
            ResultSet result = pstmt.executeQuery();
            result.next();
            cutValue = result.getInt("valeur");
        }catch ( SQLException ex){
            ex.printStackTrace();
        }
        
        return cutValue;
    }
}
