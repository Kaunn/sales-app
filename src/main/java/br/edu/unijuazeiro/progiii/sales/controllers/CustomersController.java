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
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.edu.unijuazeiro.progiii.sales.application.CustomersApplication;
import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import br.edu.unijuazeiro.progiii.sales.exceptions.BusinessException;
import br.edu.unijuazeiro.progiii.sales.web.annotations.Auth;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@Controller
@Path("customers")
@Auth
public class CustomersController {

    @Inject
    private CustomersApplication customerApplication;

    @Inject
    private Result result;

    @Get("new")
    public void newCustomer() {

    }

    @Get("")
    public void getCustomers() {
        result.include("customersList", this.customerApplication.listAll());
    }

    @Get("id/{id}")
    public void getCustomer(String id) {
        result.include("customer", this.customerApplication.findById(id));
    }

    @Post("save")
//    @IncludeParameters
    public void save(Customer customer) {
        try{
           this.customerApplication.save(customer);
           result.redirectTo(this).getCustomers();
        }catch(BusinessException ex){
           result.include("error", ex.getMessage());
           result.include("customer", customer);
           result.redirectTo(this).newCustomer();
        }
    }

    @Post("update")
    public void update(Customer customer) {
        this.customerApplication.update(customer);
        result.redirectTo(this).getCustomers();
    }

    @Post("delete")
    public void delete(Customer customer) {
        this.customerApplication.delete(customer.getId());
        result.redirectTo(this).getCustomers();
    }

}
