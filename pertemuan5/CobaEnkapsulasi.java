/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batch4.pertemuan5;

/**
 *
 * @author winny
 */
public class CobaEnkapsulasi {
    
    // Enkapsulasi
    
    private String username;
    private int password;
    
    // Getter
    public int getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
 
    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}