
package pkgwhile;


public class While {

    public static void main(String[] args) {
        // While
        //int contador = 1;
         
       // while( contador < 11 ) {
       //     System.out.println("Hola Mundo!" + contador);
       //contador ++;
       
       
       int contador = 0;
       int numero = 55000;
       
       while( numero > 0 ) {
           numero = numero / 10;
           contador++;
       }
       
       System.out.println("El número posee " + contador + " dígitos");
           
    }
   
    }
    

