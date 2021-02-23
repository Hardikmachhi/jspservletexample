/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package Adi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADITYA
 */
 @WebServlet (name="name ",urlPatterns={"/url patter of servlet"})
public class adiservelet extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
      doPost(req,res);
      
  }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
      res.setContentType("text/html");
      PrintWriter out=res.getWriter();
     String n=req.getParameter("n");    
     if(n!=null && n.equalsIgnoreCase("r")){
              res.sendRedirect("Adi/a1.html");
                 ServletContext sc=getServletContext();
             sc.setAttribute("n",n);
     }
     if(n!=null && n.equalsIgnoreCase("f")){
             req.getRequestDispatcher("Adi/a2.html").forward(req,res);
             ServletContext sc=getServletContext();
             sc.setAttribute("n",n);
     }
          out.println("<html>");
      out.println("<body>");
      out.println("Login Page");
      out.println("<form action='adiservelet' method='Post'>");
      out.println("Name:<input type='text' name='n' id='n'></br>");
       out.println("<a href='Adi/a1.html'>goto a1.html page</a><br><br>");
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
     
  } 
}
