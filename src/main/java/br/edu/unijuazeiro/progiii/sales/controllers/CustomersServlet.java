/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.controllers;

import br.edu.unijuazeiro.progiii.sales.application.CustomerApplication;
import br.edu.unijuazeiro.progiii.sales.infrastructure.CustomersDB;
import br.edu.unijuazeiro.progiii.sales.domain.customer.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leonardo
 */
@WebServlet("/customers")
public class CustomersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cpf = req.getParameter("cpf");

        Customer customer = new Customer();
        customer.setCpf(cpf);
        customer.setName(name);
        
        CustomerApplication customerApplication = new CustomerApplication();
        customerApplication.save(customer);
       
//       
//        CustomersDB customersDB = new CustomersDB(getServletContext());
//        customersDB.save(customer);
//        resp.sendRedirect("customers.jsp");
       
    }

}
