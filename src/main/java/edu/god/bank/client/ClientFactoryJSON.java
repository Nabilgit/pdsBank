package edu.god.bank.client;

import java.io.BufferedReader;
import java.io.StringWriter;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import edu.god.bank.bean.Client;

public class ClientFactoryJSON {
	public static String makeJSONauthentification(String login, String password){
                StringWriter sw = new StringWriter();
		JsonGenerator jsonGen = Json.createGenerator(sw);
		jsonGen.writeStartObject()
				.write("request","AUTH")
				.write("login",login)
				.write("password", password)
				.writeEnd()
				.close();
		String jsonContent = sw.toString();
		return jsonContent;
	}
        
        public static String makeJSONclientRetriever(String name, String surname,String email){
            StringWriter sw = new StringWriter();
            JsonGenerator jsonGen = Json.createGenerator(sw);
            jsonGen.writeStartObject()
                    .write("request","SLCTCLIENT")
                    .write("name",name)
                    .write("surname",surname)
                    .write("email", email)
                    .writeEnd()
                    .close();
            String jsonContent = sw.toString();
            return jsonContent;
        }
        
        
        public static String makeJsonInsertRealEstate(int idClient, String realEstateAmount){
            StringWriter sw = new StringWriter();
            JsonGenerator jsonGen = Json.createGenerator(sw);
            jsonGen.writeStartObject()
                    .write("request","InsertEstate")
                    .write("idClient",idClient)
                    .write("realEstate",realEstateAmount)
                    .write("typeEstate", "Immobilier")
                    .writeEnd()
                    .close();
            String jsonContent = sw.toString();
            return jsonContent;
        }
	
        public static String makeJsonInsertCapitalEstate(int idClient, int realEstateAmount){
            StringWriter sw = new StringWriter();
            JsonGenerator jsonGen = Json.createGenerator(sw);
            jsonGen.writeStartObject()
                    .write("request","InsertEstate")
                    .write("idClient",idClient)
                    .write("realEstate",realEstateAmount)
                    .write("typeEstate", "Immobilier")
                    .writeEnd()
                    .close();
            String jsonContent = sw.toString();
            return jsonContent;
        }
        
         public static String makeJsonCalculISF(float realestate , float capitalestate, float assetsestate, float donation, float investement){
            StringWriter sw = new StringWriter();
            JsonGenerator jsonGen = Json.createGenerator(sw);
            jsonGen.writeStartObject()
                    .write("request","calculISF")
                    .write("realestate",realestate)
                    .write("capitalestate",capitalestate)
                    .write("assetsestate", assetsestate)
                    .write("donation", donation)
                    .write("investement", investement)
                    .writeEnd()
                    .close();
            String jsonContent = sw.toString();
            return jsonContent;
        }
}