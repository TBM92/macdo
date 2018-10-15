package Beans;

import Entites.Menu;
import Entites.Produit;
import Entites.Type;
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
    public List<Type> selectTypesCatalogue(){
        TypedQuery<Type> qr = em.createQuery("select t from Type t", Type.class);
        List<Type> lesTypes = qr.getResultList();
        return lesTypes;
    }
    
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
    
    @Override
    public List<Menu> selectMenusCatalogue(Long idType){ 
        TypedQuery<Menu> qr = em.createQuery("select m from Menu m where m.type.id :paramId", Menu.class);
        qr.setParameter("paramId", idType);
        List<Menu> lesMenus = qr.getResultList();
        return lesMenus;
    }
    
    @Override
    public List<Produit> selectProduitsCatalogue(Long idType){
        TypedQuery<Produit> qr = em.createQuery("select p from Produit p where p.type.id :paramId", Produit.class);
        List<Produit> lesProduits = qr.getResultList();
        return lesProduits;
    }
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/

