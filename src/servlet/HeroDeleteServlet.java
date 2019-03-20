package servlet;

import dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroDeleteServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        new HeroDAO().delete(Integer.parseInt(req.getParameter("id")));
        resp.sendRedirect("/cookservlet/listHero");
    }
}
