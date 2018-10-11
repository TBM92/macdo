
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./style.css" />
        <title>Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">    
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">


    </head>
    <body>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <c:url value="controler?section=MenuGaucheCtrl" var="menuGauche"/>
                    <c:import url="${menuGauche}" />
                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Hello Home !! </h1>

                    <!--<a href="controler?section=CreationDonnees">Creation des données</a>-->

                    <div class="container"> 
                        <c:url value="controler?section=CatalogueCtrl" var="catalogue"/>
                        <c:import url="${catalogue}" />
                    </div>
                </div>

                <%--<c:url value="controler?section=Panier" var="monpanier"/>
        <c:import url="${monpanier}"/>--%>
                <div id="panier">
                    <h1>Panier</h1>
                    <c:forEach var="p" items="${gestionPanier.panier}">
                        ${p.produit.nom} ${p.prix}
                        <br>
                    </c:forEach>
                </div>  
            </div>

        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            function getxmlhttp() {
                console.log("getxmlhttp");
                xmlhttp = null;
                if (window.XMLHttpRequest) { // Mozilla
                    xmlhttp = new XMLHttpRequest();
                } else {
                    if (window.ActiveXObject) { // IE
                        try {
                            xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
                        } catch (e) {
                            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
                        }
                    } else {
                        alert("Votre navigateur ne supporte pas XMLHttpRequest");
                    }
                }
                return xmlhttp;
            }

            function go(val) {
                console.log("val : "+ val.getAttribute("produit"));
                url = "controler?section=Panier&add=" + val.getAttribute("produit");
                console.log(url);
                // alert( url);

                xmlhttp = getxmlhttp();
                xmlhttp.onreadystatechange = xmlhttpChange;
                xmlhttp.open("GET", url, true);
//      xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xmlhttp.send(null);
            }

            function xmlhttpChange() {
                if (xmlhttp.readyState == 4) { // if xmlhttp shows "loaded"
                    if (xmlhttp.status == 200) { // if "OK"
                        s = xmlhttp.responseText;
                        // alert( "("+s+")");
                        console.log(s);
                        d = document.getElementById("panier");
                        //console.log(d);
                        d.innerHTML = s;
                        
                    } else {
                        alert("Problem retrieving XML data");
                    }
                }
            }
        </script>
    </body>
</html>
