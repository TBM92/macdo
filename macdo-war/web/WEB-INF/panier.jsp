
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="panier">
    <h5 id="titlePAnier">Panier</h5>
    <div id="liste">
        <c:forEach var="p" items="${gestionPanier.panier}" varStatus="status">
            <a href="controler?section=Panier&plus=${status.index}">+</a>${p.quantite} X ${p.produit.nom} ${p.prix}<a href="controler?section=Panier&moins=${status.index}">-</a>
            <br>
        </c:forEach>
    </div>
    <div id="total">Total<span id="prixttc">${prixTtc}</span></div>
    <div id="valider"><a href="controler?section=Panier&valider">valider le panier</a></div>
</div>   




