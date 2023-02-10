package com.addservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddServlet", value = "/add")
public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        PrintWriter out = res.getWriter(); // we need this to print in we browser

        out.println("result is: " +k);  // out is the name of the print writer object

        // Session Management
        // We use this if want to share data between different servlet or send data to another servlet
        // but we can also use another way: requestdispacther

        // For request dispatcher to work we have to write this code
//        req.setAttribute("k", k);

//        RequestDispatcher rd = req.getRequestDispatcher("Hello");
//        rd.forward(req, res);


//        Session
//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);

        // Cookie
        Cookie cookie = new Cookie("k", k +"");
        res.addCookie(cookie);


        // Now we will use Url redirecting

//        res.sendRedirect("Hello?k=" +k);  // URL Rewriting
        res.sendRedirect("Hello");
    }
}
