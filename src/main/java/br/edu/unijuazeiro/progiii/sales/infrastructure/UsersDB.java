/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.infrastructure;

import br.edu.unijuazeiro.progiii.sales.domain.user.User;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author leonardo
 */
@ApplicationScoped
public class UsersDB {

    private List<User> usersDB = new ArrayList<>();

    //Exemplo, nunca, jamais, nunca mesmo, fazer isso.
    public UsersDB() {
       usersDB.add(new User("joao", "123456"));
    }
    
    public User findByUsername(String userName){
        return this.usersDB.stream()
                .filter(user -> user.getUsername().equals(userName))
                .findFirst().get();
    }

}
