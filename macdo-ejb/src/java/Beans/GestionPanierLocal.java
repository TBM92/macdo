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
import javax.ejb.Local;
import javax.persistence.EntityManager;

/**
 *
 * @author cdi314
 */
@Local
public interface GestionPanierLocal {

    public void addArticle(Menu produit);

    public ArrayList<LigneDeCommande> getPanier();

    public void addArticle(Produit produit);

    public void removeArticle(Produit produit);

    public void setPanier(ArrayList<LigneDeCommande> panier);

    public void removeArticle(Integer indiceOfPanier);

    public void removeArticle(Menu produit);


    public void persist(Object object);

    public void addProduit(Long id);

    public Produit getProduitById(Long id);
    
}
