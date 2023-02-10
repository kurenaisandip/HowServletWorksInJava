package myServlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        if (uname.equals("sandip") && pass.equals("pass"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
