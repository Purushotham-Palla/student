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

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
//Update: updating the details of an existing student
	
    public UpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			 int id = Integer.parseInt(request.getParameter("studentId"));
			 String name = request.getParameter("studentName");
			 String email = request.getParameter("studentEmail");
			 int age = Integer.parseInt( request.getParameter("studentAge"));
			 
			Student st = new Student(id,name,email,age);
			StudentBoImp obj = StudentBoImp.objStudentBoImp();
			int i = obj.update(st);
			PrintWriter out = response.getWriter();
			System.out.println("I value "+i);
			if( i == 1)
			{
				response.sendRedirect("readServlet");
			}
			else {
				out.println("Details are not updated");
			}
			
			
			
	}


}
