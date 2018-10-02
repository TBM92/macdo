<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./style.css" />
        <title>Creation des Données</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <c:url value="controler?section=MenuGaucheCtrl" var="menuGauche"/>
                    <c:import url="${menuGauche}" />
                </div>
                <div class="col-sm-8 text-left"> 
        <h1>Création des données OK !</h1>
        </br>
        <a href="controler">Retour à l'accueil...</a>
    </body>
</html>

