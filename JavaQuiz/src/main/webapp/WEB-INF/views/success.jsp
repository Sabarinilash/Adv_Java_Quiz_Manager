<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>


        <html>

        <head>
            <title>Welcome</title>
            <style>
                body {
                    background-color: silver;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    color: black
                }
                
                a {
                    border: 1px solid rgb(92, 78, 126);
                    text-decoration: none;
                    padding: 10px;
                }
            </style>
        </head>

        <body>
            <h1></h1>
            <div>
                <div align="right">
                    <td><a href="load-home-page">Logout</a>

                </div>

                <div align="center">
                    Welcome <b style="color:black;">${name}</b>
                    <h2>Online Test Application</h2><br>
                    <p><a href="load-exam-page">Start Quiz</p></p>
   
   </div>

</div>
</body>
<footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>
</html>