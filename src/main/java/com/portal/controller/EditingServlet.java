package com.portal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoImp.StudentBoImp;
import com.portal.model.Student;

@WebServlet("/editingServlet")
public class EditingServlet extends HttpServlet {
//Edit: Editing the details of an existing student
	
    public EditingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("studentId"));
		
		StudentBoImp obj = StudentBoImp.objStudentBoImp();
		Student oneStudent = obj.getOneStudent(id);
		
		request.setAttribute("singleStudent", oneStudent);
		
		RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
		
		
	}

}
