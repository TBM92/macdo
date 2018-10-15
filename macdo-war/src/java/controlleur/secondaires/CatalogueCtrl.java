package controlleur.secondaires;

import Beans.GestionCatalogueLocal;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CatalogueCtrl implements sousController, Serializable {
    
//    @Override
//    public String execute(HttpServletRequest request, HttpServletResponse response) {
//        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
//        List leCatalogue = gestionCatalogue.selectTypesCatalogue();
//        request.setAttribute("catalogue", leCatalogue);
//        String url= "/WEB-INF/catalogue.jsp";
//        return url;
//    }
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
        
        
        List leCatalogue = gestionCatalogue.selectMenusCatalogue();
        request.setAttribute("catalogue", leCatalogue);
        leCatalogue = gestionCatalogue.selectProduitsCatalogue();
        request.setAttribute("catalogue", leCatalogue);
        String url= "/WEB-INF/catalogue.jsp";
        return url;
    }
    
//    @Override
//    public String execute(HttpServletRequest request, HttpServletResponse response) {
//        String idType = request.getParameter("idType");
//        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
//        List leCatalogue = null;
//        if (idType.equals(null)) {
//            leCatalogue = gestionCatalogue.selectMenusCatalogue();
//            leCatalogue = gestionCatalogue.selectProduitsCatalogue();
//        } else{
//            leCatalogue = gestionCatalogue.selectMenusCatalogue(Long.valueOf(idType));
//            leCatalogue = gestionCatalogue.selectProduitsCatalogue(Long.valueOf(idType));
//        }
//        
//        request.setAttribute("catalogue", leCatalogue);
//        String url= "/WEB-INF/catalogue.jsp";
//        return url;
//    }

    private GestionCatalogueLocal lookupGestionCatalogueLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCatalogueLocal) c.lookup("java:global/macdo/macdo-ejb/GestionCatalogue!Beans.GestionCatalogueLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/

