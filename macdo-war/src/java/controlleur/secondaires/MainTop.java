/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur.secondaires;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi314
 */
public class MainTop implements sousController{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
       return "/WEB-INF/menus/menu-top.jsp";
    }
    
}
