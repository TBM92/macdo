/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author cdi314
 */
@Entity
public class LigneDeCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer quantite;
    private Float prix;
    private Float tvaTaux;
    
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Commande commande;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Menu menu;
    
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "ligneParent")
    private Collection<LigneDeCommande> sousLignesDeCommandes;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private LigneDeCommande ligneParent;
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Collection<OptionGratuite> optionGratuites;
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Collection<SupplementPayant> supplementPayants;
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Collection<Element> elements;
    
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Produit produit;
    
    public LigneDeCommande() {
        System.out.println(">>>>>>>>>>>LigneDeCommande");
        sousLignesDeCommandes = new ArrayList<>();
        optionGratuites = new ArrayList<>();
        supplementPayants = new ArrayList<>();
        elements = new ArrayList<>();
    }

    public LigneDeCommande(Integer quantite, Float prix, Float tvaTaux) {
        this();
        this.quantite = quantite;
        this.prix = prix;
        this.tvaTaux = tvaTaux;
        System.out.println("------------LigneDeCommande");
    }

    public LigneDeCommande(Integer quantite, Float prix, Float tvaTaux, Commande commande) {
        this();
        this.quantite = quantite;
        this.prix = prix;
        this.tvaTaux = tvaTaux;
        this.commande = commande;
    }

    public LigneDeCommande(Integer quantite, Float prix, Float tvaTaux, Commande commande, LigneDeCommande ligneParent, Collection<Element> elements, Produit produit) {
        this();
        this.quantite = quantite;
        this.prix = prix;
        this.tvaTaux = tvaTaux;
        this.commande = commande;
        this.ligneParent = ligneParent;
        this.elements = elements;
        this.produit = produit;
    }

    public LigneDeCommande(Produit produit, Integer quantite) {
        this();
        this.produit = produit;
        this.prix = produit.getPrix();
        if( produit.getTva()==null)
            System.out.println(">>>>>>>>>>>>>>>>>>OOOOOPPPPPSSSS "+ produit.getNom());
        this.tvaTaux = produit.getTva().getTaux();
        this.quantite = quantite;
        System.out.println("================ LigneDeCommande");
    }
    
    public LigneDeCommande(Produit produit){
        this(produit, 1);
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Float getTvaTaux() {
        return tvaTaux;
    }

    public void setTvaTaux(Float tvaTaux) {
        this.tvaTaux = tvaTaux;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    
    

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Collection<LigneDeCommande> getSousLignesDeCommandes() {
        return sousLignesDeCommandes;
    }

    public void setSousLignesDeCommandes(Collection<LigneDeCommande> sousLignesDeCommandes) {
        this.sousLignesDeCommandes = sousLignesDeCommandes;
    }

    public LigneDeCommande getLigneParent() {
        return ligneParent;
    }

    public void setLigneParent(LigneDeCommande ligneParent) {
        this.ligneParent = ligneParent;
    }

    public Collection<OptionGratuite> getOptionGratuites() {
        return optionGratuites;
    }

    public void setOptionGratuites(Collection<OptionGratuite> optionGratuites) {
        this.optionGratuites = optionGratuites;
    }

    public Collection<SupplementPayant> getSupplementPayants() {
        return supplementPayants;
    }

    public void setSupplementPayants(Collection<SupplementPayant> supplementPayants) {
        this.supplementPayants = supplementPayants;
    }

    public Collection<Element> getElements() {
        return elements;
    }

    public void setElements(Collection<Element> elements) {
        this.elements = elements;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        System.out.println("..............."+this.id);
        hash = 41 * hash + Objects.hashCode(this.id);
//        hash = 41 * hash + Objects.hashCode(this.quantite);
        hash = 41 * hash + Float.hashCode(this.prix);
        hash = 41 * hash + Float.hashCode(this.tvaTaux);
//        hash = 41 * hash + Objects.hashCode(this.commande);
//        hash = 41 * hash + Objects.hashCode(this.menu);
//        hash = 41 * hash + Objects.hashCode(this.sousLignesDeCommandes);
//        hash = 41 * hash + Objects.hashCode(this.ligneParent);
//        hash = 41 * hash + Objects.hashCode(this.optionGratuites);
//        hash = 41 * hash + Objects.hashCode(this.supplementPayants);
//        hash = 41 * hash + Objects.hashCode(this.elements);
//        hash = 41 * hash + Objects.hashCode(this.produit);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LigneDeCommande other = (LigneDeCommande) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
//        if (!Objects.equals(this.quantite, other.quantite)) {
//            return false;
//        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        if (!Objects.equals(this.tvaTaux, other.tvaTaux)) {
            return false;
        }
        if (!Objects.equals(this.commande, other.commande)) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (!Objects.equals(this.sousLignesDeCommandes, other.sousLignesDeCommandes)) {
            return false;
        }
        if (!Objects.equals(this.ligneParent, other.ligneParent)) {
            return false;
        }
        if (!Objects.equals(this.optionGratuites, other.optionGratuites)) {
            return false;
        }
        if (!Objects.equals(this.supplementPayants, other.supplementPayants)) {
            return false;
        }
        if (!Objects.equals(this.elements, other.elements)) {
            return false;
        }
        if (!Objects.equals(this.produit, other.produit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneDeCommande{" + "id=" + id + ", quantite=" + quantite + ", prix=" + prix + ", tvaTaux=" + tvaTaux + ", commande=" + commande + ", menus=" + menu + ", sousLignesDeCommandes=" + sousLignesDeCommandes + ", ligneParent=" + ligneParent + ", optionGratuites=" + optionGratuites + ", supplementPayants=" + supplementPayants + ", elements=" + elements + ", produit=" + produit + '}';
    }
    
    
}
