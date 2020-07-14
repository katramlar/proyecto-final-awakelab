<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Bienvenido</title>
	</head>
	<body>
		<form action="add">
			<label>Usuario: </label>
			<input type="text" name="usuariotxt"> <br>
			<label>Contraseña: </label>
			<input type="text" name="passwordtxt"> <br>
			<input type="submit" value="Ingresar">
		</form>
	</body>
</html>
