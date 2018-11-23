<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


        <html>

        <head>
            <title>Admin Manager</title>
            <style>
                body {
                    background-color: silver;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    color: black
                }
                
                a {
                    border: 1px solid rgb(92, 78, 126);
                    text-decoration: none;
                    padding: 5px;
                    margin: 50px;
                }
                
                #logout {
                    position: absolute;
                    top: 10px;
                    right: 20px;
                }
            </style>
        </head>

        <body>


            <div>
                <div id="Logout">
                    <td><a href="load-home-page">Logout</a>
                </div>

                <div align="center">
                    <h1> Welcome Back Admin <b style="color: black;">${email}</b> </h1> <br>
                </div>
                <div align="center">
                    <a href="admin"> <b> Create Test </b></a>
                </div>
        </body>
        <footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>

        </html>