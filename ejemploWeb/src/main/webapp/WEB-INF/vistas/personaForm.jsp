<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>alta persona</title>
</head>
<body>
	<h3>ALTA</h3>
	<hr>
	<c:url var="alta" value="/altaPersona" />
	<form:form id="formAlta" action="${alta}" method="post"
		modelAttribute="persona">
		<div>
			<label>Nombre: </label>
			<form:input path="nombre" id="nombre" />
		</div>
		<div>
			<label>Apodo: </label>
			<form:input path="apodo" id="apodo" />
		</div>
		<input type="submit" value="Alta">
	</form:form>
	<a href="<c:url value="/menu"/>">Regresar Menu</a>
</body>
</html>