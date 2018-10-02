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
public class Statut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Attributs
    private Integer nombre;
    @Column(nullable = false)
    private String nom;

    //Associations
    @OneToMany(mappedBy = "statut")
    private Collection<Produit> produits;

    //Constructeurs
    public Statut() {
        produits = new ArrayList();
    }

    public Statut(Integer nombre, String nom) {
        this();
        this.nombre = nombre;
        this.nom = nom;
    }

    public Statut(Integer nombre, String nom, Collection<Produit> produits) {
        this();
        this.nombre = nombre;
        this.nom = nom;
        this.produits = produits;
    }

    //Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNombre() {
        return nombre;
    }

    public String getNom() {
        return nom;
    }

    //Setters
    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //Autres Getters-Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    //Autres
    @Override
    public String toString() {
        return "Entites.Statut[ id=" + id + " ]";
    }

}
