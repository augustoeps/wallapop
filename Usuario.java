import java.util.*;

public class Usuario {



    private int id;
    private String name;
    private ArrayList<Producto> carrito;

    public Usuario(int id, String name){
        this.id = id;
        this.name = name;
        this.carrito = new ArrayList<>();
    }

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public int getId(){return this.id;}
    public String getName(){return this.name;}

    @Override
    public String toString(){
        return "(" + this.id +  ")" + "-" + this.name;
    } 

    @Override
    public boolean equals(Object o){
        if(o instanceof Usuario){
            Usuario u = (Usuario) o;
            if(this.id == u.getId()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean añadirCompra(Producto p){
        return this.carrito.add(p);
    }
    public boolean eliminarProdcuto(int id){
        for(Producto p: this.carrito){
            if(p.getId() == id){
                return this.carrito.remove(p);
            }
        }return false;
    }
    public ArrayList<Producto> verCarrito(){
        return this.carrito;
    }




    
}
