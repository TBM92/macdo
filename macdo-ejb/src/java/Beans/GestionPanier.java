/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entites.LigneDeCommande;
import Entites.Menu;
import Entites.Produit;
import java.util.ArrayList;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi314
 */
@Stateful
public class GestionPanier implements GestionPanierLocal {

    @PersistenceContext(unitName = "macdo-ejbPU")
    private EntityManager em;

    private ArrayList<LigneDeCommande> panier;

    public GestionPanier() {
        panier = new ArrayList<>();
    }

    @Override
    public ArrayList<LigneDeCommande> getPanier() {
        return panier;
    }

    @Override
    public void setPanier(ArrayList<LigneDeCommande> panier) {
        
            this.panier = panier;
        
    }

    @Override
    public void addArticle(Produit produit) {
        System.out.println("addArticle++++++++++++"+ produit);
        LigneDeCommande lig = new LigneDeCommande(produit);
        System.out.println("LigneDeCommande done");
        System.out.println("addArticle>>>"+this.panier);
        panier.add(lig);
        System.out.println("addArticle>>>done"+this.panier);
    }

    @Override
    public void addArticle(Menu produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        if (panier == null) {
            System.out.println("null");
        }
        panier.add(lig);
    }

    @Override
    public void removeArticle(Produit produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.remove(lig);
    }

    @Override
    public void removeArticle(Menu produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.remove(lig);
    }

    @Override
    public void removeArticle(Integer indiceOfPanier) {
        panier.remove(indiceOfPanier.intValue());
    }

    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Produit getProduitById(Long id) {
        Produit produit = em.find(Produit.class, id);
        return produit;
    }

    @Override
    public void addProduitInPanierById(Long id) {
        
        Produit produit = getProduitById(id);
        System.out.println("panier >>>>>  :"+ panier +"produit :>>>> "+produit);
        if (produit != null) {
            addArticle(produit);
        }
        System.out.println("panier :<<<<: "+panier);
    }
}
