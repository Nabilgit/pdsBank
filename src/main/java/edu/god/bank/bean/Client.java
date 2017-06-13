package edu.god.bank.bean;

public class Client {
    String name;
    String surname;
    String email;
    int id;

    public Client(){};
    
    public Client (String name, String surname, String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String firstName) {
        this.surname = firstName;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
