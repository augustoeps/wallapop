
import java.util.*;

public class Catalogo {



    private ArrayList<Categoria> catalogo;
    
    public Catalogo(){
        catalogo = new ArrayList<Categoria>(); 
    }
    
    public boolean añadirCategoria(Categoria categoria){
        return catalogo.add(categoria);
    }
    
    public int tamaño(){
        return catalogo.size();
    }
    
    public ArrayList<Categoria> mostrarCatalogo(){
        return this.catalogo;
    }
    

}
    

