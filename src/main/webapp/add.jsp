<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head> 
		<meta charset="ISO-8859-1">
		 <title>Add Student | Student Portal</title>
    	<link rel="stylesheet" href="add.css">
    	<link rel="icon" type="icon" href="student.png">
	</head>
	<body>
		
		<div class="hero">
        	<div class="titles">
          <a href="home.jsp" id="create-button">Home</a>
    	</div>
		
        	<p>Register</p>
        	
	        <div class="content">
	        
	            <div class="details">
	            
	                <form action="createServlet" method="get">
	                    <label for="studentName">Name</label><br>   
	                    <input type="text" name="studentName" id="studentName" required placeholder="Enter student's name"><br>
	        
	                    <label for="studentEmail">Email</label><br>   
	                    <input type="email" name="studentEmail" id="studentEmail" required placeholder="Enter student's email"><br>
	        
	                    <label for="studentAge">Age</label><br>   
	                    <input type="number" name="studentAge" id="studentAge" required placeholder="Enter student's age"><br><br>
	        
	                    <input type="submit" value="Save" id="submit">
	                </form>
	    
	            </div>
	            
	        </div>
        
    	</div>
	
	</body>
</html>