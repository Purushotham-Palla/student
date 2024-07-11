package com.portal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoImp.StudentBoImp;
import com.portal.model.Student;

@WebServlet("/createServlet")
public class CreateServlet extends HttpServlet {
//	 Create: Adding a new student to the database.
       
    public CreateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("studentName");
		String email = request.getParameter("studentEmail");
		int age = Integer.parseInt(request.getParameter("studentAge"));
		
		Student st = new Student(name,email,age);
		
//		calling the StudentBoImp, where we no need to create again object for StudentBoImp
		StudentBoImp obj =StudentBoImp.objStudentBoImp();
		int i = obj.save(st);
		
		PrintWriter out = response.getWriter();
		
		if(i==1) {
			
			response.sendRedirect("readServlet");
			
		}
		else {
			out.println("Register Failed");
		}
		
	}




}
