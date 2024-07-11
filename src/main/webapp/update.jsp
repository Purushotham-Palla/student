<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.portal.model.Student" %>
    
<!DOCTYPE html>
<html>
	<head> 
		<meta charset="ISO-8859-1">
		<title>Update | Student Portal</title>
    	<link rel="stylesheet" href="update.css">
    	<link rel="icon" type="icon" href="student.png">
	</head>
	<body>
		<div class="hero">
	        <p id="updateheading">Update Details</p>
	        
	         <% Student st =(Student)request.getAttribute("singleStudent");
	        %>
	        <div class="details">
	            <form action="updateServlet"  method="get">
	            	<input style="display:none;"  type=number" name="studentId" value = "<%=st.getId() %>">
	                <label for="studentName">Name :</label>
	                <input type="text" name="studentName" required id="studentName" value="<%= st.getName() %>"><br>
	    
	                <label for="studentEmail">Email :</label>   
	                <input type="email" name="studentEmail" required id="studentEmail" value="<%= st.getEmail() %>"><br>
	    
	                <label for="studentAge">Age :</label>  
	                <input type="number" name="studentAge" required id="studentAge" value="<%= st.getAge() %>"><br><br>
	    
	                <input type="submit" value="Save" id="submit">
	            </form>
	
	
	        </div>
	     </div>
	</body>
</html>