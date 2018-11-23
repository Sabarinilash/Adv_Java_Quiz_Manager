<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


        <html>

        <head>
            <title>Quiz Manager</title>
        </head>

        <body style="background-color:	silver">
            <h1></h1>
            <div>
                <div align="right">
                    <td><a href="load-home-page">Logout</a>
                        <tr>

                            <td><a href="load-home-page">Home</a>
                            </td>
                        </tr>
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
                </div>

                <div align="center">
                    <h2>Add Questions</h2>
                    <br>

                    <body>
                        <form:form id="adminform" modelAttribute="mchoice" action="adminProcess" method="post">
                            <table align="center">
                                <tr>
                                    <td>
                                        <form:label path="question">Question</form:label>
                                    </td>
                                    <td><input type="text" id="question" name="question" required minLength="4" maxLength="100" placeholder="upto 100 characters long" /></td>
                                </tr>
                                <tr>
                                    <td>
                                        <form:label path="option1">Option1</form:label>
                                    </td>
                                    <td><input type="text" id="option1" name="option1" required minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
                                </tr>

                                <tr>
                                    <td>
                                        <form:label path="option2">Option2</form:label>
                                    </td>
                                    <td><input type="text" id="option2" name="option2" required minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
                                </tr>

                                <tr>
                                    <td>
                                        <form:label path="option3">Option3</form:label>
                                    </td>
                                    <td><input type="text" id="option3" name="option3" required minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
                                </tr>



                                <tr>
                                    <td>
                                        <form:label path="option4">Option4</form:label>
                                    </td>
                                    <td><input type="text" id="option4" name="option4" required minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
                                </tr>
                                <tr>
                                    <td><label for="answer"> Correct Answer</label></td>
                                    <td><input type="text" id="answer" name="answer" required minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        <input type="button" value="submit" name="button" onClick='adminform' />
                                        
                                    </td>
                                </tr>

                            </table>
                        </form:form>

                    </body>


                </div>

            </div>
        </body>
        <footer style="position:absolute; right: 10px; bottom: 10px"> Developed & &copy; Sabari.Nilash_KURAPATI@Epita.fr</footer>

        </html>x