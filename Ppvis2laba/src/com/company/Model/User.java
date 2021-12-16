package com.company.Model;

public class User {
    String username;
    String password;
    String role;
    String fio;
    String phone;


    public User(String username, String password,String role, String fio,String phone) {
        this.username = username;
        this.password = password;
        this.username = role;
        this.password = fio;
        this.username = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getFio() {
        return fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
