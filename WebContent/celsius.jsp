<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit to Celsius Converter</title>
</head>
<body>
	<h1>Fahrenheit to Celsius Converter</h1>
	<a href="fahrenheit.jsp"> find fahrenheit</a>
	<form action="getCelsiusServlet" method="post">
		<p>
			Enter the amount in fahrenheit that you would like to convert to celsius
			<input type="text" name="userDegreeAmount" size="10">
			
		</p>	
		<input type="submit" value="Calculate degrees"/>
	</form>

</body>
</html>