<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



        <div id="catalogue">
            <div class="container">
                <div class="row d-flex wrap">
                    <c:forEach items="${catalogue}" var="c">

                        <div class="row">
                            <div class="col-4">
                                <div class="card">

                                    <img class="card-img-top mx-auto d-block" style="max-height: 150px; width: auto;" src= "${c.image}" title="${c.nom}">
                                    <div class="card-body">${c.nom}
                                        <div class="card-footer">
                                            <a href="Controller?section=Panier&add=${c.id}">>>>>>ADD<<<<<</a>
                                            <%--<form action="Controller?section=Panier" method="get">
                                                <input type='hidden' name='urlImage' value='${c.id}' />
                                                <INPUT TYPE='SUBMIT' class="btn btn-primary mx-auto d-block" NAME='add' VALUE='Ajouter' />
                                             </form>--%>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>

