<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./style.css" />
        <title>Catalogue</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">    
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

    </head>
    <body>

        <div id="catalogue">
            <div class="container">
                <div class="row d-flex wrap">
                    <c:forEach items="${catalogue}" var="c">

                        <div class="row">
                            <div class="col-4">
                                <div class="card">

                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}</div>

                                </div>
                            </div>
                        </div>


                    </c:forEach>
                </div>
            </div>
        </div>

    </body>
</html>
