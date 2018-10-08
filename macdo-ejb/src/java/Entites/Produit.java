package Entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Attributs
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private Float prix;
    @Column(length = 5000)
    private String description;
    private String image;

    //Associations
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Tva tva;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Type type;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Statut statut;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Propriete> proprietes;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Element> elements;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<SupplementPayant> supplementPayants;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<OptionGratuite> optionGratuites;
    
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "produit" )
    private Collection<LigneDeCommande> ligneDeCommandes;

    //Constructeurs
    public Produit() {
       proprietes = new ArrayList();
       elements = new ArrayList();
       supplementPayants = new ArrayList();
       optionGratuites = new ArrayList();
       ligneDeCommandes = new ArrayList();
    }
    
    public Produit(String nom, Float prix, String description, String image) {
        this();
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.image = image;
    }

    public Produit(String nom, Float prix, Statut statut, String description, String image) {
        this();
        this.nom = nom;
        this.prix = prix;
        this.statut = statut;
        this.description = description;
        this.image = image;
    }

    public Produit(String nom, Float prix, Statut statut, String description, String image, Tva tva, Type type, Collection<Propriete> proprietes, Collection<Element> elements, Collection<SupplementPayant> supplementPayants, Collection<OptionGratuite> optionGratuites, Collection<LigneDeCommande> ligneDeCommandes) {
        this();
        this.nom = nom;
        this.prix = prix;
        this.statut = statut;
        this.description = description;
        this.image = image;
        this.tva = tva;
        this.type = type;
        this.proprietes = proprietes;
        this.elements = elements;
        this.supplementPayants = supplementPayants;
        this.optionGratuites = optionGratuites;
        this.ligneDeCommandes = ligneDeCommandes;
    }

    
    //Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSupplementPayants(Collection<SupplementPayant> supplementPayants) {
        this.supplementPayants = supplementPayants;
    }

    public void setOptionGratuites(Collection<OptionGratuite> optionGratuites) {
        this.optionGratuites = optionGratuites;
    }

    

    public Statut getStatut() {
        return statut;
    }

    
    
    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    //Autres Getters-Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Propriete> getProprietes() {
        return proprietes;
    }

    public void setProprietes(Collection<Propriete> proprietes) {
        this.proprietes = proprietes;
    }

    public Collection<Element> getElements() {
        return elements;
    }

    public void setElements(Collection<Element> elements) {
        this.elements = elements;
    }

    public Collection<SupplementPayant> getSupplementPayants() {
        return supplementPayants;
    }

    public void setSupplementpayants(Collection<SupplementPayant> supplementPayants) {
        this.supplementPayants = supplementPayants;
    }

    public Collection<OptionGratuite> getOptionGratuites() {
        return optionGratuites;
    }

    public void setOptiongratuites(Collection<OptionGratuite> optionGratuites) {
        this.optionGratuites = optionGratuites;
    }

    public Tva getTva() {
        return tva;
    }

    public void setTva(Tva tva) {
        this.tva = tva;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Collection<LigneDeCommande> getLigneDeCommandes() {
        return ligneDeCommandes;
    }

    public void setLigneDeCommandes(Collection<LigneDeCommande> ligneDeCommandes) {
        this.ligneDeCommandes = ligneDeCommandes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + Objects.hashCode(this.prix);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.image);
        hash = 47 * hash + Objects.hashCode(this.tva);
        hash = 47 * hash + Objects.hashCode(this.type);
        hash = 47 * hash + Objects.hashCode(this.statut);
        hash = 47 * hash + Objects.hashCode(this.proprietes);
        hash = 47 * hash + Objects.hashCode(this.elements);
        hash = 47 * hash + Objects.hashCode(this.supplementPayants);
        hash = 47 * hash + Objects.hashCode(this.optionGratuites);
        hash = 47 * hash + Objects.hashCode(this.ligneDeCommandes);
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
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.tva, other.tva)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.statut, other.statut)) {
            return false;
        }
        if (!Objects.equals(this.proprietes, other.proprietes)) {
            return false;
        }
        if (!Objects.equals(this.elements, other.elements)) {
            return false;
        }
        if (!Objects.equals(this.supplementPayants, other.supplementPayants)) {
            return false;
        }
        if (!Objects.equals(this.optionGratuites, other.optionGratuites)) {
            return false;
        }
        if (!Objects.equals(this.ligneDeCommandes, other.ligneDeCommandes)) {
            return false;
        }
        return true;
    }
    
    
    //Autres
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description + ", image=" + image + ", tva=" + tva + ", type=" + type + ", statut=" + statut + ", proprietes=" + proprietes + ", elements=" + elements + ", supplementPayants=" + supplementPayants + ", optionGratuites=" + optionGratuites + ", ligneDeCommandes=" + ligneDeCommandes + '}';
    }


}
