<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>
${userCalc.getConversionAmount()}&#176;
${userCalc.getFinalMeasurement()}
</p>
<p>
	<a href="index.jsp">go home</a>
<p>
</body>
</html>