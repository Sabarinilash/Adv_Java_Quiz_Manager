<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login Quiz</title>
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
                    padding: 5px;
                }
                
                #home {
                    position: absolute;
                    top: 10px;
                    right: 20px;
                }
            </style>
        </head>

        <body>
            <form:form id="AdminLoginForm" modelAttribute="AdminLogin" action="AdminLoginProcess" method="post">
                <table align="center">
                    <tr>
                        <div align="center">
                            <h1>Admin Login</h1>
                        </div>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="email" font-family="Verdana">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password" font-family="Verdana">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="admin" name="admin">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a id="home" href="load-home-page" style="text-decoration: none">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: black; ">${message}</td>
                </tr>
            </table>
        </body>

        <footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>

        </html>