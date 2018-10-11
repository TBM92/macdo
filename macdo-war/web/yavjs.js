/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//$(document).ready(function () {
//    $(".produit").click(function () {
//
//        $.ajax({
//            url: 'controler?section=Panier',
//            type: 'GET',
//            data: 'section=Panier',
//            dataType: 'html',
//            success: function (code_html, statut) {
//
//            },
//            error: function (resultat, statut, erreur) {
//
//            },
//            complete: function (resultat, statut) {
//
//            }
//
//        });
//    });
//});



function getxmlhttp() {
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

function go(element) {
    url = "controler?section=Panier&add=" + element.getAttribute("produit");
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
            d = document.getElementById("panier");
            d.innerHTML = s;
        } else {
            alert("Problem retrieving XML data");
        }
    }
}
