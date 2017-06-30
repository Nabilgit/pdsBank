package edu.god.bank.server;

import java.sql.Connection;

import edu.god.bank.server.Features;
import edu.god.bank.bean.AppAuthentification;
import edu.god.bank.bean.Client;
import edu.god.bank.bean.EstateValue;
import edu.god.bank.bean.RealEstate;
import edu.god.bank.dao.CalculISFDAO;
import edu.god.bank.server.ServerFactoryJSON;
import edu.god.bank.server.ServerParserJSON;

public class Task {
    static String result = null;

    public static String authentificationLaunched(String jsonContent, Connection connection){
        // we recover json data
        AppAuthentification auth = ServerParserJSON.getAuthentification(jsonContent);
        System.out.println(" verif info : " + auth.getLogin() + ", " + auth.getPassword());
        if (Features.userExist(auth, connection)){
            result = ServerFactoryJSON.connectionAccepted();
        }else{
            result = ServerFactoryJSON.connectionDenied();
        }
        return result;
    }

    
     public static String clientVerification(String jsonContent, Connection connection){
        Client client = ServerParserJSON.retriveClient(jsonContent);
        System.out.println("clientverif : " + client.getName());
        client.setId(Features.clientExist(client, connection));
        if (client.getId() > 0){
            result = ServerFactoryJSON.clientExist(client.getId());
        }else{
            result = ServerFactoryJSON.clientDontExist();
        }
        return result;
    }
     
      public static String insertRealEstate(String jsonContent, Connection connection){
        RealEstate restate = ServerParserJSON.getRealEstateInsertRequest(jsonContent);
        result = ServerFactoryJSON.insertSucceed();
        return result;
      }
      
      
        public static String getIsfResult(String jsonContent, Connection connection){
        CalculISFDAO dao = new CalculISFDAO();
        EstateValue vestate = ServerParserJSON.getISFComposants(jsonContent);
        result = ServerFactoryJSON.getISF(Features.CalculEstate(vestate, connection,dao));
        return result;
      }

}
