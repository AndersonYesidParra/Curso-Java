
package sobrecarga.demetodos;

public class Main {

    public static void main(String[] args) {
        
       Calculadora calculadora = new Calculadora();
       
       float resultado = calculadora.suma(10.5f, 20.5f);
       System.out.println("El resultado es: " + resultado);
    }
    
}
