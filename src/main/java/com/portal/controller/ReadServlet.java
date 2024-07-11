package com.portal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoImp.StudentBoImp;
import com.portal.model.Student;

@WebServlet("/readServlet")
public class ReadServlet extends HttpServlet {
//Read: Displaying a list of all students from the database.
	
    public ReadServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentBoImp obj = StudentBoImp.objStudentBoImp();
		
		List<Student> studentList = obj.getAll();
			
		request.setAttribute("studentdetails",studentList);	
			
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}
	

}

