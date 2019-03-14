package com.treinamento.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.treinamento.model.Cachorro;

@WebServlet("/cachorro")
public class CachorroServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CachorroServelt() {
        super();
        System.out.println("Construtor");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public ServletConfig getServletConfig() {
		System.out.println("Servlet Config");
		return null;
	}
	
	public String getServletInfo() {
		System.out.println("servelt Info");
		return null; 
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service");
		super.service(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cachorro> cachorros = new ArrayList<>();
		cachorros.add(new Cachorro("Shrek", 4));
		cachorros.add(new Cachorro("Pingo", 9));
		cachorros.add(new Cachorro("Apolo", 7));
		
		System.out.println("get");
		response.getWriter().append(cachorros.toString())
							.append("Served at Get: ")
							.append(request.getContextPath());
	}
}
