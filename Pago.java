public class Pago {


    private int  precio;
    private int numeroCuenta;
    private int clave;
    
    
    
    public Pago(int precio, int numeroCuenta, int clave){
        
        this.precio = precio;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
    
    
    }
    
    
    public void setPago(int precio, int numeroCuenta,int clave){
    
    
        this.precio = precio;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
    
    
    }
    
    
    public String  getPago(){
    
        return " Precio = "+this.precio +  ", Numero de Cuenta = "+this.numeroCuenta + ", Clave = " +this.clave;
        
    
    
    }
    
}
