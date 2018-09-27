package Entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Element implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    
    @ManyToMany(mappedBy = "Elements")
    private Collection<LigneDeCommande> ligneDeCommandes;
    
    @ManyToMany(mappedBy = "Elements")
    private Collection<Produit> produits;
    
    

    public Element() {
        ligneDeCommandes = new ArrayList<>();
        produits = new ArrayList<>();
    }

    public Element(String nom) {
        this();
        this.nom = nom;
    }

    public Element(String nom, Collection<LigneDeCommande> LigneDeCommandes) {
        this();
        this.nom = nom;
        this.ligneDeCommandes = LigneDeCommandes;
    }

    public Element(String nom, Collection<LigneDeCommande> LigneDeCommandes, Collection<Produit> Produits) {
        this();
        this.nom = nom;
        this.ligneDeCommandes = LigneDeCommandes;
        this.produits = Produits;
    }
    
    
    
    
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<LigneDeCommande> getLigneDeCommandes() {
        return ligneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> LigneDeCommandes) {
        this.ligneDeCommandes = LigneDeCommandes;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> Produits) {
        this.produits = Produits;
    }
    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Element)) {
            return false;
        }
        Element other = (Element) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom + '('+id+")";
    }
    
    
    
    
    
    
    
    

}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/
