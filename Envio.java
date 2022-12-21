




public class Envio {


    private String Calle;
    private int codigoPostal;
    private String piso;
    
    
    
    public Envio(String calle, int codigoPostal, String piso){
        
        this.setEnvio(calle, codigoPostal, piso);

    }
    
    public void setEnvio(String calle, int codigoPostal, String piso){
        
        this.Calle = calle;
        this.codigoPostal = codigoPostal;
        this.piso = piso;

    }
    
    
    public String getEnvio(){
    
        return ", Calle: " + this.Calle + ", Codigo Postal: " + this.codigoPostal + ", Piso : " + this.piso;
    
    
    }
    
}
