
package stringclase;
public class Stringclase {

 
    public static void main(String[] args) {
        //String = Clase 
        
        //String mensaje = "Hola, soy un String";
        
       // System.out.println(mensaje.toUpperCase());
       // System.out.println(mensaje.toLowerCase());
        
       // System.out.println(mensaje);
        
       String mensaje = "";
       String curso = "Java";
       
       float  valor = 110.872040f;
       mensaje = String.format("El total es %.2f %s", valor, "MX");
       
       System.out.println(mensaje);
        
    }
    
}
