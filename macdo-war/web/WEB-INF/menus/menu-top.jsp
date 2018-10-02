<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand -->
    <c:url value="controler" var="url01" />
    <a class="navbar-brand" href="${url01}">Home</a>

    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <c:url value="controler?section=CreationDonnees" var="url02" />
            <a class="nav-link" href="${url02}">creer les données</a>
        </li>
        <!-- Dropdown -->
<!--        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                Animaux
            </a>
            <div class="dropdown-menu">
                <a class="dropdown-item" href="FrontControleur?section=addAnimal">nouveau</a>
                <%--<c:url value="FrontControleur?section=findAnimaux&ref=all" var="url150" />--%>
                <a class="dropdown-item" href="${url150}">all</a>
                <%--<c:forEach items="${especes}" var="esp">--%>
                    <%--<c:url value="FrontControleur?section=findAnimaux&ref=${esp.label}" var="url200" />--%>
                    <a class="dropdown-item" href="${url200}">${esp.label}</a>
                <%--</c:forEach>--%>
            </div>
        </li>-->
    </ul>
</nav>
