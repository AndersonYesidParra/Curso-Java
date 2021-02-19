
package main;

public class Main {

    public static void main(String[] args) {
        
        Circulo circulos [];
        Triangulo triangulos[];
        
        Figura circulo = new Circulo(9f);
        Figura triangulo = new Triangulo(10f, 5f);
        
        System.out.println(circulo.area());
        System.out.println(triangulo.area());
      
    }
    
}
