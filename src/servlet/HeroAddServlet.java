package servlet;

import bean.Hero;
import dao.HeroDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroAddServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");

        Hero hero=new Hero();
        hero.setName(req.getParameter("name"));
        hero.setHp(Float.parseFloat(req.getParameter("hp")));
        hero.setDamage(Integer.parseInt(req.getParameter("damage")));

        new HeroDAO().add(hero);

        resp.sendRedirect("/cookservlet/listHero");
    }
}
