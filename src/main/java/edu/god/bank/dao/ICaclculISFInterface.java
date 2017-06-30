/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.god.bank.dao;

import java.sql.Connection;

/**
 *
 * @author Nabil
 */
public interface ICaclculISFInterface {
    double getFirstRate(Connection connection);
    double getSecondRate(Connection connection);
    double getThirdRate(Connection connection);
    int getFirstCutValue(Connection connection);
    int getSecondCutValue(Connection connection);
    int getThirdCutValue(Connection connection);
    
}
