/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.application;

import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import br.edu.unijuazeiro.progiii.sales.domain.customer.CustomersService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author leonardo
 */
@ApplicationScoped
public class CustomersApplication {

    @Inject
    private CustomersService customersService;

    public void save(Customer customer) {
        this.customersService.save(customer);
    }

    public List<Customer> listAll() {
        return this.customersService.listAll();
    }

    public Customer findById(String id) {
        return this.customersService.findById(id);
    }

    public void update(Customer customer) {
        this.customersService.update(customer);
    }
    
    public void delete(String id) {
        this.customersService.delete(id);
    }
    
}
