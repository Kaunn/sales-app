/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijuazeiro.progiii.sales.servlets;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Conceitos iniciais sobre sessão
 * @author leonardo
 */
@WebServlet("/criar-sessao")
public class InitSession extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        //Criar ou recuperar uma sessão
        HttpSession session = req.getSession();
        //Adicionando um atributo(informação) na sessão
        session.setAttribute("meuNome", "Zezinho da sessão");
        //Setando o tempo máximo(em segundos) de inatividade entre requisições.
        //Transcorrido este tempo, a sessão irá para pedra.
        session.setMaxInactiveInterval(5);
        
        ServletContext context = getServletContext();
        context.setAttribute("meuNome2", "Zezinho do contexto");
        
        // Mata a sessão (Todos os atributos serão perdidos)
        //session.invalidate();
        
    }
    
    
    
}
