package com.example.whatsapp_part_4.data;

public class LoginRequest {
    private String username;
    private String password;
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
