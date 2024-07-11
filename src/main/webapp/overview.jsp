<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head> 
		<meta charset="ISO-8859-1">
		<title>Overview | Student Portal</title>
    <link rel="icon" type="icon" href="student.png">
    <style>
        *{
            margin: 0;
        }
        body{
            background-image: url(Overview.png);
            background-size: cover;
        }
        .container{
            
            margin-top: 250px;
            margin-left: 80vh;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #1F5692;
        }

        #content1{
            font-size: 60px;
            font-weight: 500;
        }

        #content2{
            font-size: 25px;
            font-weight: 500;
            line-height: 35px;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="hero">
            <p id="content1">Project Overview</p><br>
            <pre id="content2">The Student Portal System is a
web application designed to
streamline administrative tasks
related to managing student 
records within an educational
institution.</pre>


        </div>
        
    </div>
    
</body>
</html>