/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.domain.customer;

import java.util.UUID;

/**
 *
 * @author leonardo
 */
public class Customer {

    private String id;
    private String name;
    private String cpf;
    
    public Customer(){
        this.id = UUID.randomUUID().toString();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }
    

}
