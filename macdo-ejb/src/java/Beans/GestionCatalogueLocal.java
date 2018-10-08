package Beans;

import Entites.Menu;
import Entites.Produit;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GestionCatalogueLocal {

    
    public List<Menu> selectMenusCatalogue();

    public List<Produit> selectProduitsCatalogue();
    
    
}
