package com.portal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoImp.StudentBoImp;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
//Delete: deleting a student from the database.
       
    public DeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("studentId"));
		PrintWriter out = response.getWriter();
		StudentBoImp obj = StudentBoImp.objStudentBoImp();
		int i = obj.delete(id);
		
		if(i ==1)
		{
			response.sendRedirect("readServlet");
		}
		else {
			out.println("Something Wrong...!");
		}
		
	}


}
