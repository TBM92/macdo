package controlleur.secondaires;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface sousController {

    public String execute( 
//            ServletContext application,
            HttpServletRequest request,
            HttpServletResponse response);
    
}
