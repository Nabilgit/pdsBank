package edu.god.bank.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;


import edu.god.bank.server.Features;
import edu.god.bank.bean.AppAuthentification;
import edu.god.bank.server.Task;
import edu.god.bank.server.ConnectionPool;
import edu.god.bank.server.ServerParserJSON;


public class HandleClientConnection extends Thread {
    private PrintWriter out;
    private BufferedReader in;
    final private Socket clientSocket ;
    private ConnectionPool connectionPool;
    private Connection connection;
    private boolean stop = false;

    public HandleClientConnection(final Socket clientSocket, ConnectionPool pool) throws IOException {
        this.clientSocket = clientSocket;
        connection = pool.getConnectionFromPool();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        connectionPool = pool;
    }

    public void run() {
        System.out.println("client "+clientSocket.getInetAddress()+" tries to connect");
        String jsonContent;
        String result = null;

        try{
            while(!stop){
                jsonContent = this.getContentJson(in);
                switch(getRequest(jsonContent)){
                    case "AUTH":  result = Task.authentificationLaunched(jsonContent, connection);
                        System.out.println("Je recois l'info ? " + result.toString());
                        break;
                    case "SLCTCLIENT" : result = Task.clientVerification(jsonContent, connection);
                        break;
                    case "InsertEstate" : result = Task.insertRealEstate(jsonContent, connection);
                        break;
                    case "calculISF" : result = Task.getIsfResult(jsonContent, connection);
                        break;
                }
                out.println(result);
            }
        }catch(IOException e){
            finish();
        }
    }

    private String getContentJson(final BufferedReader in) throws IOException{
        return  in.readLine();
    }
    private String getRequest(String jsonContent){
        return ServerParserJSON.getRequest(jsonContent);
    }
    public synchronized void finish() {
        if (!stop) {
            stop = true;
            try {
                System.out.println("client "+clientSocket.getInetAddress()+" is disconnected");
                clientSocket.close();
                connectionPool.returnConnectionToPool(connection);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
