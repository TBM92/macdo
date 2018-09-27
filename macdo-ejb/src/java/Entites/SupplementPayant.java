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
public class SupplementPayant implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    
    private String description;
    
    private Float prix;
    
    @ManyToMany(mappedBy = "SupplementPayants")
    private Collection<LigneDeCommande> ligneDeCommandes;
    
    @ManyToMany(mappedBy = "SupplementPayants")
    private Collection<Produit> produits;
    
    

    public SupplementPayant() {
        ligneDeCommandes = new ArrayList<>();
        produits = new ArrayList<>();
    }

    public SupplementPayant(String nom) {
        this();
        this.nom = nom;
    }

    public SupplementPayant(String nom, Float prix) {
        this();
        this.nom = nom;
        this.prix = prix;
    }

    public SupplementPayant(String nom, String description) {
        this();
        this.nom = nom;
        this.description = description;
    }

    public SupplementPayant(String nom, String description, Float prix) {
        this();
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public SupplementPayant(String nom, String description, Float prix, Collection<LigneDeCommande> LigneDeCommandes) {
        this();
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.ligneDeCommandes = LigneDeCommandes;
    }

    public SupplementPayant(String nom, String description, Float prix, Collection<LigneDeCommande> LigneDeCommandes, Collection<Produit> Produits) {
        this();
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.ligneDeCommandes = LigneDeCommandes;
        this.produits = Produits;
    }
    
    
    
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
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
        if (!(object instanceof SupplementPayant)) {
            return false;
        }
        SupplementPayant other = (SupplementPayant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom + " "+ prix +'('+id+")";
    }
    
}

/*--------------- CDI1804 --------------- by CL --------------- CDI1804 ---------------*/
