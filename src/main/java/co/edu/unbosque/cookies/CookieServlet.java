package co.edu.unbosque.cookies;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "cookieServlet", value = "/cookie-servlet")
public class CookieServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Cookie Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie= new Cookie("username","aniiita");
        response.addCookie(cookie);

        // Hello
        PrintWriter out = response.getWriter();
        //redireccionar a una pagina que me muestre lo que necesito
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}