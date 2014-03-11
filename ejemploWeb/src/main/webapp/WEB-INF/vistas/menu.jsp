<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>titulo pagina</title>
</head>
<body>
	<h3>MENU</h3>
	<p>${llave}</p>
	<a href="<c:url value="/formPersona"/>">Alta persona</a>
	<a href="<c:url value="/listaPersonas"/>">Lista de personas</a>
	
</body>
</html>