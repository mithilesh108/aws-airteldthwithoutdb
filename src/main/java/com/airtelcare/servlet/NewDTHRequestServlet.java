package com.airtelcare.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/*import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;*/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet(urlPatterns={"/dthRequest"})
public class NewDTHRequestServlet extends HttpServlet {
  public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  System.out.println(LocalDateTime.now()+" NewDTHRequestServlet  service method : "+LocalDate.now());
    String name = null;
    String connectionType = null;
    String refNo = null;
    
    name = req.getParameter("name");
    String contactNo = req.getParameter("contactNo");
    String emailAddress = req.getParameter("emailAddress");
    String city = req.getParameter("city");
    String state = req.getParameter("state");
    String pincode = req.getParameter("pincode");
    
    connectionType = req.getParameter("connectionType");
    
    refNo = String.valueOf(Calendar.getInstance().getTimeInMillis());
    
    req.setAttribute("name", name);
    req.setAttribute("contactNo", contactNo);
    req.setAttribute("emailAddress", emailAddress);
    req.setAttribute("city", city);
    req.setAttribute("state", state);
    req.setAttribute("pincode", pincode);
    req.setAttribute("connectionType", connectionType);
    req.setAttribute("refNo", refNo);
    
    req.getRequestDispatcher("/request-details.jsp").forward(req, resp);        
  }
}
