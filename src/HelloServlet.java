import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    public void init(ServletConfig config) {
        System.out.println("init of Hello Servlet");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            System.out.printf("%s\t%s%n", header, value);
        }

        try {
            //不仅发送到浏览器的内容会使用UTF-8编码，而且还通知浏览器使用UTF-8编码方式进行显示
            response.setContentType("text/html; charset=UTF-8");
            //仅仅是发送的浏览器的内容是UTF-8编码的，至于浏览器是用哪种编码方式显示不管
            //response.setCharacterEncoding("UTF-8");
            response.getWriter().println("<h1>Hello, 你好, Servlet!</h1>");
            response.getWriter().println(new Date());

            response.setContentType("text/html");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}