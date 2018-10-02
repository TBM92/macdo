package controlleur.secondaires;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuGaucheCtrl implements sousController, Serializable {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String url= "/WEB-INF/menus/menu-gauche.jsp";
        return url;
    }
    

}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/
