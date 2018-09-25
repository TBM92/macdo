package Entites;

import java.io.Serializable;
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
    private Collection<LigneDeCommande> LigneDeCommandes;
    
    @ManyToMany(mappedBy = "Elements")
    private Collection<Produit> Produits;
    
    

    public Element() {
    }

    public Element(String nom) {
        this.nom = nom;
    }

    public Element(String nom, Collection<LigneDeCommande> LigneDeCommandes) {
        this.nom = nom;
        this.LigneDeCommandes = LigneDeCommandes;
    }

    public Element(String nom, Collection<LigneDeCommande> LigneDeCommandes, Collection<Produit> Produits) {
        this.nom = nom;
        this.LigneDeCommandes = LigneDeCommandes;
        this.Produits = Produits;
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
        return LigneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> LigneDeCommandes) {
        this.LigneDeCommandes = LigneDeCommandes;
    }

    public Collection<Produit> getProduits() {
        return Produits;
    }

    public void setProduits(Collection<Produit> Produits) {
        this.Produits = Produits;
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
