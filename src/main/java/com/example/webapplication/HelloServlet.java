package com.example.webapplication;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Servlet", urlPatterns = "/Hello")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {

//        int k  = (int) req.getAttribute("k"); // this will receive the attribute from another servlet using the key( this method is request dispacther)

//        int k = Integer.parseInt(req.getParameter("k"));    //this is for the url redirecting

//        HttpSession session = req.getSession();
//
////        session.removeAttribute("k");
//
//        int k = (int) session.getAttribute("k");

//        Cookie
        int k = 0;
        Cookie cookies [] =req.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());
            }
        }

        k = k * k;

        PrintWriter out = res.getWriter();
        out.println("Result is " +k);
    }

    }
