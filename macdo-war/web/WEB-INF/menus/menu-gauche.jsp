<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<ul class="nav flex-column">



    <c:forEach items="${menus}" var="m">
        <li class="nav-item">
            <a class="nav-link" href = "controler" onclick="choix('${m.nom}'); return false" >
                <img class="image" style="max-height: 150px; width: auto;" src= "${m.image}" title="${m.nom}">${m.nom}</a>
        </li>
    </c:forEach>
        
</ul>
