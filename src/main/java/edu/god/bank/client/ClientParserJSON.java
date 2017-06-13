package edu.god.bank.client;

import org.json.JSONException;
import org.json.JSONObject;


public class ClientParserJSON {
	public static String resultQueryAccess(String jsonContent){
		JSONObject jObject ;
		String result = null;
		try {
			jObject = new JSONObject(jsonContent);
			result = jObject.getString("result");
                        
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return KO or OK
		return result;
	}
        
        public static String getClientId(String jsonContent){
		JSONObject jObject ;
                String result = null ;
		try {
			jObject = new JSONObject(jsonContent);
                        System.out.println("test getclientfromjson : " + jObject.getString("idClient"));
			result = Integer.toString(jObject.getInt("idClient"));
                        
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return KO or OK
		return result;
	}
        
        
         public static String getISFResult(String jsonContent){
		JSONObject jObject ;
                String result = null ;
		try {
			jObject = new JSONObject(jsonContent);
			result = Integer.toString(jObject.getInt("isfValue"));
                        
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return KO or OK
		return result;
	}
}
