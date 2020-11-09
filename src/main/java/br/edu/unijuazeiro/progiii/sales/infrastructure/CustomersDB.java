/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.infrastructure;

import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author leonardo
 */
public class CustomersDB {

    private List<Customer> customersList;

    public CustomersDB(ServletContext context) {
        if (context.getAttribute("customersList") != null) {
            this.customersList = (List) context.getAttribute("customersList");
        } else {
            this.customersList = new ArrayList<>();
            context.setAttribute("customersList", this.customersList);
        }
    }

    public void save(Customer customer) {
        this.customersList.add(customer);
        System.out.println("Log --- " + customersList);
    }

    public void listAll() {
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
    
    //Implementação "mais" funcional. Java 8 acima
//    public Customer findById(String id) {
//        return customersList.stream()
//                .filter(customer -> customer.getId().equals(id))
//                .findFirst()
//                .orElse(null); 
//    }
}
