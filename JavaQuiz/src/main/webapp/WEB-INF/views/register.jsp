<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Register Student</title>
            <style>
                body {
                    background-color: silver;
                    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    color: black
                }
                
                button {
                    padding: 5px;
                    margin-bottom: 10px;
                }
                
                a {
                    border: 1px solid rgb(92, 78, 126);
                    text-decoration: none;
                    margin-top: 10px;
                    padding: 5px;
                }
            </style>
        </head>

        <body>
            <form:form id="regForm" modelAttribute="student" action="registerProcess" method="post">
                <table align="center">
                    <tr>
                        <div align="center">
                            <h1>Student Registration</h1>
                        </div>
                        <br>
                        <td>
                            <form:label path="name">UserName</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <form:label path="email">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>

                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register1" name="register1">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="load-home-page">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        <footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>

        </html>