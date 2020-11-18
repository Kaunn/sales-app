/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.web.components;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author leonardo
 */
@SessionScoped
public class AuthSession implements Serializable {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    public boolean isAuthenticate(){
        return username != null;
    }
    
    public void logout(){
        this.username = null;
    }

}
