<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login Quiz Manager</title>
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
                
                #home {
                    position: absolute;
                    top: 10px;
                    right: 20px;
                }
            </style>
        </head>

        <body>
            <form:form id="loginForm " modelAttribute="login" action="loginProcess" method="POST">
                <table align="center ">
                    <tr>
                        <td>
                            <form:label path="email">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left ">
                            <form:button id="login" name="login ">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                   
                        <td><a id="home" href="load-home-page ">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table align="center ">
                <tr>
                    <td style="font-style: italic; color: black; ">${message}</td>
                </tr>
            </table>
        </body>
        <footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>

        </html>