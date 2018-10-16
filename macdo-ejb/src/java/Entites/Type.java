package Entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

    @ManyToOne (cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Menu menu;

    //Constructeurs
    public Type() {
        produits = new ArrayList();
    }

    public Type(String nom) {
        this();
        this.nom = nom;
    }

    public Type(String nom, String image) {
        this();
        this.nom = nom;
        this.image = image;
    }

    public Type(String nom, Collection<Produit> produits, Menu menu) {
        this();
        this.nom = nom;
        this.produits = produits;
        this.menu = menu;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    //Autres
    @Override
    public String toString() {
        return "Entites.Type[ id=" + id + " ]";
    }

}
