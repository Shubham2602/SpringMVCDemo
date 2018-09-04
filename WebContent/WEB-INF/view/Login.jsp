<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Hello World - Login</title>
</head>

<body>
	<form:form action="processFormv3" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br>
		<br>
		
		Last Name : <form:input path="lastName" />
		<br>
		<br>
		
		Country :
		<form:select path="country">
			<form:option value="India" label="India"/>
			<form:option value="Sri Lanka" label="Sri Lanka"/>
			<form:option value="Pakistan" label="Pakistan"/>
			<form:option value="Bangladesh" label="Bangladesh"/>
		</form:select>
		<input type="submit" value="Submit" />
		
		
	</form:form>
</body>
</html>