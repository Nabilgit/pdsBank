package edu.god.bank.server;

import org.json.JSONException;
import org.json.JSONObject;
import edu.god.bank.bean.AppAuthentification;
import edu.god.bank.bean.Client;
import edu.god.bank.bean.EstateValue;
import edu.god.bank.bean.RealEstate;

public class ServerParserJSON {
    
    static public AppAuthentification getAuthentification(String jsonContent){

        JSONObject jObject = null;
        AppAuthentification authentification = new AppAuthentification();
        String log = null;
        String pwd = null;
        try {
            jObject = new JSONObject(jsonContent);
            log = jObject.getString("login");
            pwd = jObject.getString("password");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        authentification.setLogin(log);
        authentification.setPassword(pwd);
        return authentification;
    }
    
    static public  String getRequest(String jsonContent){
        JSONObject jObject = null;
        String request = null;
        try {
            jObject = new JSONObject(jsonContent);
            request = jObject.getString("request");
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return request;
    }
    /*
    static public  Client getClient(String jsonContent){
        Client client = new Client();
        JSONObject jObject = null;
        try {
            jObject = new JSONObject(jsonContent);
            client.setName(jObject.getString("name"));
            client.setFirstName(jObject.getString("firstName"));
            client.setAddress(jObject.getString("address"));

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return client;
    }*/
    
    
    static public Client retriveClient(String jsonContent){

        JSONObject jObject = null;
        Client client = new Client();
        String name = null;
        String surname = null;
        String email = null;
        try {
            jObject = new JSONObject(jsonContent);
            name = jObject.getString("name");
            surname = jObject.getString("surname");
            email = jObject.getString("email");
            
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        client.setName(name);
        client.setSurname(surname);
        client.setEmail(email);
        return client;
    }
    
    
     static public RealEstate getRealEstateInsertRequest(String jsonContent){

        JSONObject jObject = null;
        RealEstate rEstate = new RealEstate();
        int idCustomer = 0;
        int amount = 0;
        try {
            jObject = new JSONObject(jsonContent);
            idCustomer = jObject.getInt("idClient");
            amount = jObject.getInt("realEstate");
            
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        rEstate.setIdCustomer(idCustomer);
        rEstate.setAmount(amount);
        return rEstate;
    }
     
     static public EstateValue getISFComposants(String jsonContent){

        JSONObject jObject = null;
        EstateValue estate = new EstateValue();
        float realestate = 0;
        float capitalestate = 0;
        float assetsestate = 0;
        float donation = 0;
        float investement = 0;
        try {
            jObject = new JSONObject(jsonContent);
            realestate = jObject.getInt("realestate");
            capitalestate = jObject.getInt("capitalestate");
            assetsestate = jObject.getInt("assetsestate");
            donation =  jObject.getInt("donation");
            investement = jObject.getInt("investement");
                    
                    
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        estate.setRealestate(realestate);
        estate.setCapitalestate(capitalestate);
        estate.setAssetsestate(assetsestate);
        estate.setInvestement(investement);
        return estate;
    }
    
}
