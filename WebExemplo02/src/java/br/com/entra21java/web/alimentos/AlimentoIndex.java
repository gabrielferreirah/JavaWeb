package br.com.entra21java.web.alimentos;

import br.com.entra21java.bean.AlimentoBean;
import br.com.entra21java.dao.AlimentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
@WebServlet(urlPatterns = "/alimentos")
public class AlimentoIndex extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<AlimentoBean> alimentos = new AlimentoDAO().obterTodos();
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Alimento - Lista</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("");
        out.print("<h3>Lista de Alimentos</h3>");
        out.print("<table>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>Código</th>");
        out.print("<th>Nome</th>");
        out.print("<th>Quantidade</th>");
        out.print("<th>Preço</th>");
        out.print("<th>Ação</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");

        for (AlimentoBean alimento : alimentos) {
            out.print("<tr>");
            out.print("<td>"+alimento.getId()+"</td>");
            out.print("<td>"+alimento.getNome()+"</td>");
            out.print("<td>"+alimento.getQuantidade()+"</td>");
            out.print("<td>"+alimento.getPreco()+"</td>");
            out.print("<td></td>");
            out.print("</tr>");
        }

        out.print("</tbody>");
        out.print("<tfoot>");
        out.print("<tr>");
        out.print("<th>Código</th>");
        out.print("<th>Nome</th>");
        out.print("<th>Quantidade</th>");
        out.print("<th>Preço</th>");
        out.print("<th>Ação</th>");
        out.print("</tr>");
        out.print("</tfoot>");
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }

}
