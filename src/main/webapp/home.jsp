<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	  <form action="addAlien">
		<label for="aid">Alien ID</label>
		<input type="text" placeholder="Enter Alien Id" name="aid"><br>
		<label for="aname">Alien Name</label>
		<input type="text" placeholder="Enter Name" name="aname"><br>
		<label for="tech">Enter Tech</label>
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	
	
	 
	<form action="getAlien">
	<input type="text" name="aid"><br>
	<input type="submit"><br>
	</form>
	
</body>
</html>