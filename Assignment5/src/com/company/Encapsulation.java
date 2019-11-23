package com.company;

public class Encapsulation {
    private String username;
    private String password;

    Encapsulation(String username, String password) {
        this.username = username;
        this.password = password;
    }
    void printdetails(){
        System.out.println(this.username);
        System.out.println(this.password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
