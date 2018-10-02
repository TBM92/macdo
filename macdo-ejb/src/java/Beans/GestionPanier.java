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
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.Stateful;

/**
 *
 * @author cdi314
 */
@Stateful
public class GestionPanier implements GestionPanierLocal {

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
        if (panier != null) {
            this.panier = panier;
        }
    }

    @Override
    public void addArticle(Produit produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.add(lig);
    }

    @Override
    public void addArticle(Menu produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.add(lig);
    }

    @Override
    public void removeArticle(Produit produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.remove(lig);
    }

    public void removeArticle(Menu produit) {
        LigneDeCommande lig = new LigneDeCommande(1, produit.getPrix(), produit.getTva().getTaux());
        panier.remove(lig);
    }

    public void removeArticle(Integer indiceOfPanier) {
        panier.remove(indiceOfPanier.intValue());
    }
}
