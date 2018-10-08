<!--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier</title>
    </head>
    <body>-->
<div id="panier">
    <h1>Panier</h1>
    <c:forEach var="p" items="${gestionPanier.panier}">
        ${p.produit.nom} ${p.prix}
        <br>
    </c:forEach>
</div>   
<!--    </body>
</html>-->
