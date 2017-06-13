package edu.god.bank.server;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.stream.JsonGenerator;

public class ServerFactoryJSON {
    
    public static String connectionDenied(){
        StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","AUTH")
                .write("result","KO")
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
    }
    public static String connectionAccepted(){
        StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","AUTH")
                .write("result","OK")
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
    }
    
    public static String clientExist(int idclient){
        StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","SLCTCLIENT")
                .write("result","OK")
                .write("idClient",idclient)
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
    }
    
    
    public static String clientDontExist(){
        StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","SLCTCLIENT")
                .write("result","KO")
                .write("idClient",0)
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
    }
    
     public static String insertSucceed(){
        StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","INSERT")
                .write("result","OK")
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
    }
     
     
     public static String getISF(double isf){
         StringWriter sw = new StringWriter();
        JsonGenerator jsonGen = Json.createGenerator(sw);
        jsonGen.writeStartObject()
                .write("request","ISF")
                .write("isfValue",isf)
                .writeEnd()
                .close();
        String jsonContent = sw.toString();
        return jsonContent;
     }
}
