
import java.util.*;

public class CategoriaFINAL extends Categoria{

    private ArrayList<Producto> productos;

    public CategoriaFINAL(String nombre){
        super(nombre);
        this.productos = new ArrayList<>();
    }
    


    public boolean addProducto(Producto p){
        return productos.add(p);

    }


    public ArrayList<Producto> mostrarLista(){


        return productos;

    }


    @Override
    public String toString(){
        String muestra = "Esta categoria es " + this.verNombre() + " y tiene  los siguientes productos " + " (";

        for(Producto  p: productos){

            muestra += p.toString() + ",";


        }
        muestra += ")";
        return muestra;




    }






}