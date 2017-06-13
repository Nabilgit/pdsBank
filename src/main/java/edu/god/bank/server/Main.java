package edu.god.bank.server;

import edu.god.bank.server.HandleClientConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;


public class Main {
    
    public static void main(String[] args){
        
        int server_port;
        ServerSocket serverSocket;
        Socket clientSocket;
        final ConnectionPool connectionPool = new ConnectionPool();
    
    
        Properties prop = new Properties();
        InputStream input = null;

        String filename = "serverConfig.properties";
        System.out.println("test : " + filename);
        input = Main.class.getClassLoader().getResourceAsStream(filename);
        
        /*if (input == null) {
            System.out.println("unable to find " + filename);
        }
        // load a properties file
        try {
            prop.load(input);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        server_port = Integer.parseInt(prop.getProperty("portlisten"));
        */
        server_port = 12345;
        try {
            System.out.println("Server running ....");
            serverSocket = new ServerSocket(server_port);

            while(true){
                clientSocket = serverSocket.accept();
                new HandleClientConnection(clientSocket, connectionPool).start();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
