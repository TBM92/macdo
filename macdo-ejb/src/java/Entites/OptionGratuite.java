package Entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class OptionGratuite implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    
    private String description;
    
    @ManyToMany(mappedBy = "OptionGratuites")
    private Collection<LigneDeCommande> LigneDeCommandes;
    
    @ManyToMany(mappedBy = "OptionGratuites")
    private Collection<Menu> Menus;
    
    @ManyToMany(mappedBy = "OptionGratuites")
    private Collection<Produit> Produits;

    
    
    public OptionGratuite() {
    }

    public OptionGratuite(String nom) {
        this.nom = nom;
    }

    public OptionGratuite(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> LigneDeCommandes) {
        this.nom = nom;
        this.description = description;
        this.LigneDeCommandes = LigneDeCommandes;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> LigneDeCommandes, Collection<Menu> Menus) {
        this.nom = nom;
        this.description = description;
        this.LigneDeCommandes = LigneDeCommandes;
        this.Menus = Menus;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> LigneDeCommandes, Collection<Menu> Menus, Collection<Produit> Produits) {
        this.nom = nom;
        this.description = description;
        this.LigneDeCommandes = LigneDeCommandes;
        this.Menus = Menus;
        this.Produits = Produits;
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

    public Collection<LigneDeCommande> getLigneDeCommandes() {
        return LigneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> LigneDeCommandes) {
        this.LigneDeCommandes = LigneDeCommandes;
    }

    public Collection<Menu> getMenus() {
        return Menus;
    }

    public void setMenus(Collection<Menu> Menus) {
        this.Menus = Menus;
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
        if (!(object instanceof OptionGratuite)) {
            return false;
        }
        OptionGratuite other = (OptionGratuite) object;
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