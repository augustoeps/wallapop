
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        Producto p1 = new Producto(0, "camiseta", 1000);
        Producto p2 = new Producto(1, "coche", 500);
        Producto p3 = new Producto(213, "Harley Davidson", 45000);

        Usuario u1 = new Usuario(2 ,"JUAN");

        u1.añadirCompra(p1);
        u1.añadirCompra(p2);

        for(Producto p: u1.verCarrito()){
            System.out.println(p.toString());
        }

        System.out.println(u1.toString());

        u1.eliminarProdcuto(1);

        for(Producto p: u1.verCarrito()){
            System.out.println(p.toString());
        }

        System.out.println("-------------------------------------------------"); 
        
        
        Catalogo CatalogoPrincipal = new Catalogo();
        CategoriaNOFINAL ropa = new CategoriaNOFINAL("Ropa");
        CategoriaFINAL camisetas = new CategoriaFINAL("Camisetas");
        camisetas.addProducto(p1);
        ropa.addCategoria(camisetas);
        CategoriaNOFINAL vehiculo = new  CategoriaNOFINAL("Vehiculos");
        CategoriaFINAL motos = new CategoriaFINAL("motos");
        motos.addProducto(p3);
        CategoriaFINAL coches = new CategoriaFINAL("Coches");
        coches.addProducto(p2);
        vehiculo.addCategoria(coches);
        vehiculo.addCategoria(motos);
        CatalogoPrincipal.añadirCategoria(ropa);
        CatalogoPrincipal.añadirCategoria(motos);
        CatalogoPrincipal.añadirCategoria(coches);
        for(Categoria c: CatalogoPrincipal.mostrarCatalogo()){
            System.out.println(c.toString());
        }
        

       

    }
    
}