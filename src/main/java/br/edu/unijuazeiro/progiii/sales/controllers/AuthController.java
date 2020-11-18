/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unijuazeiro.progiii.sales.domain.user.User;
import br.edu.unijuazeiro.progiii.sales.infrastructure.UsersDB;
import br.edu.unijuazeiro.progiii.sales.web.components.AuthSession;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
public class AuthController {

   @Inject
   private UsersDB usersDB;
   
   @Inject
   private Result result;
   
   @Inject
   private AuthSession session;
    
   @Get("login")
   public void login(){
       
   }
   
   @Post("auth")
   public void authenticate(User user){
      User fromDB = this.usersDB.findByUsername(user.getUsername());
      if (fromDB != null){
          if (fromDB.getPassword().equals(user.getPassword())){
              this.session.setUsername(fromDB.getUsername());
              this.result.redirectTo(CustomersController.class).getCustomers();
          }
      }else{
         result.include("msgLoginError", "Usuário/senha inválidos");
         result.redirectTo(this).login();
      }
   } 
   
   @Get("logout")
   public void logout(){
       this.session.logout();
       result.redirectTo(this).login();
   }
}
