<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<title>Welcome</title>
</head>
<body style="background-color:	#F2ECD4">
<h1></h1>
<div>
   <div align="right">
      <td><a href="load-home-page">Logout</a>
      
   </div>
   
   <div align="center">
      Welcome <b style="color:red;">${name}</b>
      <h2>Online Test Application</h2><br>
      <p><a href="load-exam-page">Start Quiz</p></p>
   
   </div>

</div>



</body>