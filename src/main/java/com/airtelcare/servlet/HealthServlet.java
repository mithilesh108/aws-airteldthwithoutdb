package com.airtelcare.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
public class HealthServlet extends HttpServlet {
	
	private int reqCount = 1;
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(LocalDateTime.now() + " AirtelDTD HealthServlet  service method : " + reqCount++);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		 out.println("AirtelDTD Application is UP : "+LocalDateTime.now());
	}
}
