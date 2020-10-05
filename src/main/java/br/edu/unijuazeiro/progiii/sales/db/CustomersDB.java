/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.db;

import br.edu.unijuazeiro.progiii.sales.models.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author leonardo
 */
public class CustomersDB  {
    
    private List<Customer> customersList;
    

    public CustomersDB(ServletContext context){
        if (context.getAttribute("customersList") != null){
           this.customersList = (List) context.getAttribute("customersList");
        }else{
           this.customersList = new ArrayList<>();
           context.setAttribute("customersList", this.customersList);
        }
    }
    
    public void save(Customer customer){
        this.customersList.add(customer);
        System.out.println("Log --- " + customersList);
    }
    
    public void listAll(){
    }
}
