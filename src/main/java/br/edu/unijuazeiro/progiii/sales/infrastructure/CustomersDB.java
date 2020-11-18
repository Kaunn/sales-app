/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.infrastructure;

import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author leonardo
 */
@ApplicationScoped
public class CustomersDB {

    private List<Customer> customersList = new ArrayList<>();

    public CustomersDB() {

    }

    public void save(Customer customer) {
        this.customersList.add(customer);
    }

    public Customer findById(String id) {
        Customer found = null;
        for (Customer customer : customersList) {
            if (customer.getId().equals(id)) {
                found = customer;
                break;
            }
        }
        return found;
    }

    public void update(Customer customer) {
        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getId().equals(customer.getId())) {
                System.out.println("Aqui " + customer.getName());
                customersList.set(i, customer);
                break;
            }
        }

    }

    public List<Customer> listAll() {
        return customersList;
    }

    public void delete(String id) {
        customersList.removeIf(customer -> customer.getId().equals(id));
    }

    //Implementação "mais" funcional. Java 8 acima
//    public Customer findById(String id) {
//        return customersList.stream()
//                .filter(customer -> customer.getId().equals(id))
//                .findFirst()
//                .orElse(null); 
//    }
}
