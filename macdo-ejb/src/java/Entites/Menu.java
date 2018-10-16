/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author cdi314
 */
@Entity
public class Menu implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nom;
    
    private Float prix;
    
    @Column(length = 1000)
    private String description;
    
    @Column(length = 1000)
    private String image;
    
    @OneToMany(mappedBy = "menu")
    private Collection<LigneDeCommande> ligneDeCommandes;
    
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Collection<OptionGratuite> optionGratuites;
    
    @OneToMany (mappedBy = "menu")
    private Collection<Type> types;
    
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Tva tva;

    public Menu() {
        optionGratuites = new ArrayList<>();
        ligneDeCommandes = new ArrayList<>();
        types = new ArrayList();
    }

    public Menu(String nom, String image) {
        this();
        this.nom = nom;
        this.image = image;
    }
    
    public Menu(String nom, Float prix, String description, String image) {
        this();
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.image = image;
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

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Collection<LigneDeCommande> getLigneDeCommandes() {
        return ligneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> ligneDeCommandes) {
        this.ligneDeCommandes = ligneDeCommandes;
    }

    public Collection<Type> getTypes() {
        System.out.println("*-*-*-*-*-*-*-*-*" + types);
        return types;
    }

    public void setTypes(Collection<Type> types) {
        this.types = types;
    }

    

    public Tva getTva() {
        return tva;
    }

    public void setTva(Tva tva) {
        this.tva = tva;
    }



    public Collection<OptionGratuite> getOptionGratuites() {
        return optionGratuites;
    }

    public void setOptionGratuites(Collection<OptionGratuite> optionGratuites) {
        this.optionGratuites = optionGratuites;
    }
    
    
}
