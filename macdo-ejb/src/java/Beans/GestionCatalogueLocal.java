package Beans;

import Entites.Menu;
import Entites.Produit;
import Entites.Type;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionCatalogueLocal {

    
    public List<Menu> selectMenusCatalogue();

    public List<Produit> selectProduitsCatalogue();

    public List<Produit> selectProduitsCatalogue(Long idType);

    public List<Menu> selectMenusCatalogue(Long idType);

    public List<Type> selectTypesCatalogue();
    
    
}
