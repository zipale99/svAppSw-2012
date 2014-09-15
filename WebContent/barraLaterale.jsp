<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/stile.css" media="screen"/>
<title>Barra di navigazione laterale</title>
</head>
<body>


<!-- La visualizzazione della corretta home page è gestita lato client andando
a esaminare l'oggetto session e in base al ruolo dell'utente loggato viene fatto variare il menu 
visualizzato 
-->

<%
	//Se è un customer
	if (false) {
%>

	<jsp:include page = "login.jsp" ></jsp:include>
	<hr>
	<ul id="menu">
	<li><a href="index.jsp">Home</a></li>
	<li><a href="">opzione1</a></li>
   	<li><a href="">opzione2</a></li>
   	<li><a href="">opzione3</a></li>
   	<li><a href="">opzione4</a></li>
	</ul>
	
<% 
	//se invece è un TA
%>
	
	<jsp:include page = "login.jsp" ></jsp:include>
	<hr>
	<ul id="menu">
	<li><a href="index.jsp">Home</a></li>
	<li><a href="">opzione1</a></li>
   	<li><a href="">opzione2</a></li>
   	<li><a href="">opzione3</a></li>
   	<li><a href="">opzione4</a></li>
	</ul>
	
<%
	}
	else {
//altrimenti
%>

	<p>Benvenuto Ospite</p>
	<hr>
	<jsp:include page = "login.jsp"></jsp:include>
	<hr>
	<ul id="menu">
	<li><a href="index.jsp">Home</a></li>
	<li><a href="">opzione1</a></li>
   	<li><a href="">opzione2</a></li>
   	</ul>
	
<% } %>
	

</body>
</html>