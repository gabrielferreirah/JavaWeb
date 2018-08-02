/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gariel de Oliveira Ferreira
 */
@WebServlet(urlPatterns = "/hello")
public class Exemplo01 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Request  -> Requisição: É o que chega para o servidor.
        //Response -> Resposta: É o que é retornado para o cliente.
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("	<title>Exemplo 01</title>");
out.println("</head>");
out.println("<body>");
out.println("	<h1>Olá Mundo</h1>");
out.println("	<form action='Calcular' method='post'>");
out.println("		<label>Número 01</label>");
out.println("		<input type='number' name='numero-01'>");
out.println("		<label>Número 02</label>");
out.println("		<input type='number' name='numero-02'>");
out.println("		<input type='submit' value='Calcular'>");
out.println("	</form>");
out.println("</body>");
out.println("</html>");
    }
    
    
    
}
