package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet",
        urlPatterns = {"/hello", "/czesc", "/ola!"},
        initParams = {
                @WebInitParam(name = "who", value = "world"),
                @WebInitParam(name = "times", value = "5")
        }
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("who ?" + getInitParameter("who"));
        out.println("how many times will u disturb me ?" + getInitParameter("times"));
    }
}
