/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import br.edu.unijuazeiro.progiii.sales.infrastructure.CustomersDB;
import javax.inject.Inject;


/**
 *
 * @author leonardo
 */
@Controller
@Path("customers")
public class CustomersController {

    @Inject
    private CustomersDB customerDB;
    @Inject
    private Result result;
    
    @Get("new")
    public void newCustomer(){

    }
    
    @Get("")
    public void getCustomers(){
       result.include("customersList", this.customerDB.listAll());
    }

    @Post("save")     
    public void save(Customer customer){
        this.customerDB.save(customer);
        result.redirectTo(this).getCustomers();
    }
    
    @Post("update")
    public void update(){
        
    }
    
    @Post("delete")
    public void delete(){
        
    }
    
}
