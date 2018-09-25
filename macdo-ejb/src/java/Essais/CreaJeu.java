package Essais;

import Entites.Produit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreaJeu {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("macdo-ejbPU");
        EntityManager em = emf.createEntityManager();
        
        // Créa --------------------- 
        //Date d = new GregorianCalendar(2018, 8, 9, 9, 0).getTime();
        Produit p01 = new Produit();
        Produit p02 = new Produit();
        
        
        
        //----------------------------------------------------------------------
        System.out.println("");
        //----------------------------------------------------------------------
        
        // Assos --------------------- 
        
        
        
        // Persist --------------------- 
        em.persist(p01);
        em.persist(p02);
        
        // Transaction --------------------- 
        EntityTransaction et = em.getTransaction();
        et.begin();
        et.commit();
        
        
        //----------------------------------------------------------------------
        System.out.println("");
        //----------------------------------------------------------------------
        
        
        
        em.close();
        emf.close();
        
        System.out.println("**************** FIN ****************");
    }
    
}
