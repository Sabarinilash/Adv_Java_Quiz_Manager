<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
<body style="background-color: #F2ECD4">
	<h1></h1>
	<div>
		<div align="right">
			<td><a href="load-home-page">Logout</a>
			<tr>


				<td><a href="load-home-page">Home</a></td>
			</tr>
		</div>


		<div align="center">
			<h3>Add Questions</h3>

			<form:form id="adminform" modelAttribute="question" method="POST"
				action="/JavaQuiz/adminProcess">
				<table>
					<tr>
						<td><form:label path="question">Question</form:label></td>
						<td><form:input maxlength="50" path="question" /></td>
					</tr>
					<tr>
						<td><form:label path="option1">option1</form:label></td>
						<td><form:input path="option1" /></td>
					</tr>

					<tr>
						<td><form:label path="option2">option2</form:label></td>
						<td><form:input path="option2" /></td>
					</tr>
					<tr>
						<td><form:label path="option3">option3</form:label></td>
						<td><form:input path="option3" /></td>
					</tr>
					<tr>
						<td><form:label path="option4">option4</form:label></td>
						<td><form:input path="option4" /></td>
					</tr>


					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form:form>

		</div>
</body>

</html>



<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<html>
<head>
<title>Welcome</title>
</head>
<body style="background-color: #F2ECD4">
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	<h1>${url}</h1>
	<div>
		<div align="right">
			<td><a href="load-home-page">Logout</a>
			<tr>

				<td><a href="load-home-page">Home</a></td>
			</tr>
		</div>

		<div align="center">
			<h2>Add Questions</h2>
			<br>
			<form:form id="adminform" modelAttribute="question"
				action="JavaQuiz/adminProcess" method="post">
				<table align="center">
					<tr>
						<td><form:label path="question">question</form:label></td>
						<td><input type="text" id="question" name="question" required
							minLength="4" maxLength="100"
							placeholder="upto 100 characters long" /></td>
					</tr>
					<tr>
						<td><form:label path="option1">option1</form:label></td>
						<td><input type="text" id="option1" name="option1" required
							minLength="4" maxLength="50"
							placeholder="upto 50 characters long" /></td>
					</tr>

					<tr>
						<td><form:label path="option2">option2</form:label></td>
						<td><input type="text" id="option2" name="option2" required
							minLength="4" maxLength="50"
							placeholder="upto 50 characters long" /></td>
					</tr>

					<tr>
						<td><form:label path="option3">option3</form:label></td>
						<td><input type="text" id="option3" name="option3" required
							minLength="4" maxLength="50"
							placeholder="upto 50 characters long" /></td>
					</tr>


					<td><form:label path="option4">option4</form:label></td>
					<td><input type="text" id="option4" name="option4" required
						minLength="4" maxLength="50" placeholder="upto 50 characters long" /></td>
					</tr>
					<tr>
						<td align="center"><input type="button" value="create"
							onclick="adminform" /></td>
					</tr>
				</table>
			</form:form>
</body>


</div>

</div>
 --%>


</body>