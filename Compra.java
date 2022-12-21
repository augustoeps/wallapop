



public class Compra {

    private int idCompra;
    
    //private Usuario user;
    private Pago pay;
    private Envio delivery;
    
    public Compra(){
        
        
        this.idCompra =  -1;
        this.pay = new Pago(-1,-1,-1);
        this.delivery = new Envio("",-1,"");
        
    }
    
    
    public Compra(int idCompra, int precio, int numeroCuenta,int clave, String calle, int codigo, String piso){
        
        
        this.idCompra =  idCompra;
        this.pay = new Pago(precio,numeroCuenta,clave);
        this.delivery = new Envio(calle,codigo,piso);
        

        
    }
    
    
    
    
    public void setPago(int precio, int numeroCuenta, int clave){
    
    
        this.pay.setPago(precio,  numeroCuenta, clave);
    
    
    
    }
    
    
    public void setEnvio(String calle, int codigoPostal, String piso){
        
        this.delivery.setEnvio(calle, codigoPostal, piso);
    
    
    }
    
    
    
    public String getCompra(){
    
        return "Id de compra "+ this.idCompra +", " + this.pay.getPago() + this.delivery.getEnvio();
    
    
    }


    
}




    
}
