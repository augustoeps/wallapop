
import java.util.*;

public class CategoriaNOFINAL extends Categoria {


    ArrayList<Categoria> categorias = new ArrayList<>();

    public CategoriaNOFINAL(String nombre){
        super(nombre);
        this.categorias = new ArrayList<>();
    }

    public ArrayList<Categoria> verCategorias(){
        return this.categorias;

    }

    public boolean addCategoria(Categoria c){
        return this.categorias.add(c);
    }

    @Override
    public String toString(){
        String resultado = "Las categorias en esta categoría " + this.verNombre() +  " son :" + "( ";
        for(Categoria c: this.categorias){
            resultado += c.verNombre() + ", ";
        }
        resultado += "). "; 
        return resultado;
    }




    
}
