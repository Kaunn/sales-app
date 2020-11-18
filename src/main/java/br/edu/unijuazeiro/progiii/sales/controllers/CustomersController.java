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
    private CustomersDB customerDB;

    @Inject
    private Result result;

    @Get("new")
    public void newCustomer() {

    }

    @Get("")
    public void getCustomers() {
        result.include("customersList", this.customerDB.listAll());
    }

    @Get("id/{id}")
    public void getCustomer(String id) {
        result.include("customer", this.customerDB.findById(id));
    }

    @Post("save")
    public void save(Customer customer) {
        this.customerDB.save(customer);
        result.redirectTo(this).getCustomers();
    }

    @Post("update")
    public void update(Customer customer) {
        this.customerDB.update(customer);
        result.redirectTo(this).getCustomers();
    }

    @Post("delete")
    public void delete(Customer customer) {
        this.customerDB.delete(customer.getId());
        result.redirectTo(this).getCustomers();
    }

}
