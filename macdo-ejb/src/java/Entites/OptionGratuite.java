package Entites;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.util.ArrayList;
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
    private Collection<LigneDeCommande> ligneDeCommandes;
    
    @ManyToMany(mappedBy = "OptionGratuites")
    private Collection<Menu> menus;
    
    @ManyToMany(mappedBy = "OptionGratuites")
    private Collection<Produit> produits;

    
    
    public OptionGratuite() {
        ligneDeCommandes = new ArrayList<>();
        menus = new ArrayList<>();
        produits = new ArrayList<>();
    }

    public OptionGratuite(String nom) {
        this();
        this.nom = nom;
    }

    public OptionGratuite(String nom, String description) {
        this();
        this.nom = nom;
        this.description = description;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> ligneDeCommandes) {
        this();
        this.nom = nom;
        this.description = description;
        this.ligneDeCommandes = ligneDeCommandes;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> ligneDeCommandes, Collection<Menu> Menus) {
        this();
        this.nom = nom;
        this.description = description;
        this.ligneDeCommandes = ligneDeCommandes;
        this.menus = Menus;
    }

    public OptionGratuite(String nom, String description, Collection<LigneDeCommande> ligneDeCommandes, Collection<Menu> Menus, Collection<Produit> Produits) {
        this();
        this.nom = nom;
        this.description = description;
        this.ligneDeCommandes = ligneDeCommandes;
        this.menus = Menus;
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

    public Collection<LigneDeCommande> getLigneDeCommandes() {
        return ligneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> ligneDeCommandes) {
        this.ligneDeCommandes = ligneDeCommandes;
    }

    public Collection<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Collection<Menu> menus) {
        this.menus = menus;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
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