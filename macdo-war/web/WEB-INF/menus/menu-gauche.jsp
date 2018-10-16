<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<ul class="nav flex-column">



    <c:forEach items="${types}" var="t">
        <li class="nav-item">
            <a class="nav-link" href = "controler" onclick="choix('${t.nom}'); return false" >
                <img class="image" style="max-height: 150px; width: auto;" src= "${t.image}" title="${t.nom}">${t.nom}</a>
        </li>
    </c:forEach>


    <%--
    <li class="nav-item">
        <c:url value="controler?section=CreationDonnees" var="creaDonnees" />
        <a class="nav-link active" href="${creaDonnees}">Créer les données</a>
    </li>
    --%>


    <%--
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=5"><img class="image" src ="./Images/vignette/menu.png" title="Nos menus"/>Nos menus</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=2"><img class="image" src ="./Images/vignette/sandwich.png" title="Nos sandwichs"/>Nos sandwichs</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=6"><img class="image" src ="./Images/vignette/boisson.png" title="Nos boissons"/>Nos boissons</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=1"><img class="image" src ="./Images/vignette/salade.png" title="Nos salades"/>Nos salades</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=4"><img class="image" src ="./Images/vignette/dessert.png" title="Nos desserts"/>Nos desserts</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="controler?section=CatalogueCtrl&ref=3"><img class="image" src ="./Images/vignette/friteEtSauce.png" title="Frites et sauces"/>Frites et sauces</a>
    </li>
    --%>

    <%--
    <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
    </li>
    --%>
</ul>
