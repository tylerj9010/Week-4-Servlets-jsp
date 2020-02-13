<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius to Fahrenheit Converter</title>
</head>
<body>
	<h1>Celsius to Fahrenheit Converter</h1>
	<a href="celsius.jsp"> find celsius</a>
	<form action="getFahrenheitServlet" method="post">
		<p>
			Enter the amount in celsius that you would like to convert to fahrenheit
			<input type="text" name="userDegreeAmount" size="10">
		</p>	
		<input type="submit" value="Calculate degrees"/>
	</form>

</body>
</html>