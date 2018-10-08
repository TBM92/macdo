/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur.secondaires;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi314
 */
public class HomeCtrl implements sousController, Serializable{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/home.jsp";
    }
    
    
    
}
