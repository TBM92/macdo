<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="catalogue">
    <div class="container">
        <div class="row d-flex wrap">

            <c:if test="${type=='all'}">
                <c:forEach items="${catalogue}" var="c">
                    <div class="row">
                        <div class="col-4">
                            <a href = "controler" onclick="choix('${c.nom}'); return false" ><div class="card">
                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}
                                    </div>
                                    <input type="hidden" name="choix" value="${c.nom}" /><br> 
                                </div>
                            </a>
                        </div>
                    </div>
                </c:forEach>
            </c:if>
            <c:if test="${type=='produit'}">
                <c:forEach items="${catalogue}" var="c">
                    <div class="row">
                        <div class="col-4">

                            <a produit="${c.id}" onclick="go(this);
                                    return false;" href=""><div class="card">
                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}
                                    </div>
                                </div>
                            </a>

                        </div>
                    </div>
                </c:forEach>
            </c:if>
            <c:if test="${type=='menu'}">
                <c:forEach items="${catalogue}" var="c">
                    <div class="row">
                        <div class="col-4">

                            <a href = "controler" onclick="choix('${c.nom}') ; return false" ><div class="card">
                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}</div>

                                </div>
                                
                            </a>

                        </div>
                    </div>
                </c:forEach>
                
            </c:if>
            <c:if test="${type=='produitMenu'}">
                <c:forEach items="${catalogue}" var="c">
                    <div class="row">
                        <div class="col-4">

                            <a produit="${c.id}" onclick="go(this);
                                    return false;" href = "controler"><div class="card">
                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}
                                    </div>
                                </div>
                            </a>

                        </div>
                    </div>
                </c:forEach>
            </c:if>
        
        </div>
    </div>
</div>
