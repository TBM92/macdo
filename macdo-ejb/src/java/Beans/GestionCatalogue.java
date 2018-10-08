package Beans;

import Entites.Menu;
import Entites.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class GestionCatalogue implements GestionCatalogueLocal {
    @PersistenceContext(unitName = "macdo-ejbPU")
    private EntityManager em;

    @Override
    public List<Menu> selectMenusCatalogue(){
        TypedQuery<Menu> qr = em.createQuery("select m from Menu m", Menu.class);
        List<Menu> lesMenus = qr.getResultList();
        return lesMenus;
    }
    
    @Override
    public List<Produit> selectProduitsCatalogue(){
        TypedQuery<Produit> qr = em.createQuery("select p from Produit p", Produit.class);
        List<Produit> lesProduits = qr.getResultList();
        return lesProduits;
    }
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/

