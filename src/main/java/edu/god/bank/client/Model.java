package edu.god.bank.client;

import edu.god.bank.bean.Client;
import edu.god.bank.client.ClientFactoryJSON;
import edu.god.bank.client.ClientParserJSON;
import edu.god.bank.client.Communicator;

public class Model {
	
	private final static Communicator communicator = new Communicator();
	
	// return OK if user exists else KO
	public static String checkUserExist(String login, String password){
		
		String jsonContent = ClientFactoryJSON.makeJSONauthentification(login, password);
		communicator.sendData(jsonContent);
		return ClientParserJSON.resultQueryAccess(communicator.receiveData()); 
	
	}
	
	public static String addClient(Client client){
		return null;
	}
	
	public static String launchSimulation(){
		return null;
	}
}
