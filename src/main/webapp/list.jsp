<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.portal.model.Student,java.util.*,com.portal.daoImp.StudentBoImp" %>
    
<!DOCTYPE html>
<html>
	<head> 
		<meta charset="ISO-8859-1">
		<title>View Students | Student Portal</title>
	    <link rel="stylesheet" href="list.css">
	    <link rel="icon" type="icon" href="student.png">
	</head>
	<body>
		<div class="hero">
	        <p>Student Records</p>
	    </div>
	    <div class="titles">
          <a href="home.jsp" id="create-button">Home</a>
          <a href="add.jsp" id="create-button">Add Student</a>
          <form id="create-button" action="readServlet" method="get">
          <input id="create-button" type="text" id="search" name="search" placeholder="Enter search term">
          <button id="create-button" type="submit">Search</button>
    </form>
          
    	</div>
	    <div class="studentdetails">
	        <table>
	            <thead>
		            <tr>
		                <td id="studentid"><b>Student Id</b></td>
		                <td id="studentidname"><b>Name</b></td>
		                <td id="studentidname"><b>Email</b></td>
		                <td id="studentid"><b>Age</b></td>
		                <td style="text-align: center;" colspan="2"><b>Action</b></td>
		            </tr>
	            </thead>
	            
	            <tbody>
	            <%
	            
	            	List<Student> studentList =(List<Student>)request.getAttribute("studentdetails");			
	           		
	            	if(studentList !=null)
	            	{
	            		for(Student st :studentList)
	            		{
	            %>
	            
		            <tr>
		                <td> <%= st.getId() %></td>
		                <td><%= st.getName() %></td>
		                <td><%= st.getEmail() %></td>
		                <td><%= st.getAge() %></td>
		                <td id="actionline"><a href=editingServlet?studentId=<%= st.getId() %> id="edit">Edit</a> </td>
		                <td id="actionline"><a href=deleteServlet?studentId=<%= st.getId()%> id="delete">Delete</a></td>
		            </tr> 
		            
		            <%}
	            	}
		            %>
	            </tbody>           
	        </table>
	        <br>
	       
    	</div>	
	</body>
</html>