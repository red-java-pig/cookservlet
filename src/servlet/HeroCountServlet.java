package servlet;

import dao.HeroDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroCountServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        int total = new HeroDAO().getTotal();
        response.getWriter().println("Total Hero is:" + total);

    }
}
