package Entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributs
    @Column(nullable = false)
    private String nom;

    @Column(length = 1000)
    private String image;
    
    
    //Associations
    @OneToMany(mappedBy = "type")
    private Collection<Produit> produits;

    @OneToMany(mappedBy = "type")
    private Collection<Menu> menus;

    //Constructeurs
    public Type() {
        produits = new ArrayList();
        menus = new ArrayList();
    }

    public Type(String nom) {
        this.nom = nom;
    }

    public Type(String nom, String image) {
        this.nom = nom;
        this.image = image;
    }

    public Type(String nom, Collection<Produit> produits, Collection<Menu> menus) {
        this.nom = nom;
        this.produits = produits;
        this.menus = menus;
    }

    //Getters
    public String getNom() {
        return nom;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Autres Getters-Setters

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduit(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Collection<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Collection<Menu> menus) {
        this.menus = menus;
    }

    //Autres
    @Override
    public String toString() {
        return "Entites.Type[ id=" + id + " ]";
    }

}
