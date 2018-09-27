package controlleur.secondaires;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreerCommandeCtrl implements sousController, Serializable {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        return "/WEB-INF/nouvelle-commande.jsp";
    }
    
    
    
    
    
}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/
