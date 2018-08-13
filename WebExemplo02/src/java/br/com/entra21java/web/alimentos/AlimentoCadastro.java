package br.com.entra21java.web.alimentos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Gabriel de Oliveira Ferreira
 */
@WebServlet(urlPatterns = "/alimentos/cadastro")
public class AlimentoCadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String nome = "asdasd";
        req.setAttribute("nome", nome);
        int[] numeros = new int[]{1, 2,3};
        req.setAttribute("numeros", numeros);
        req.getRequestDispatcher("/alimento-cadastro.jsp").include(req, resp);
    }

}
