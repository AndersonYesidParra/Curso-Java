
package main;

public class Main {

    public static void main(String[] args) {
        Gato gato = new Gato("gato", "raza", 2);
        Perro perro = new Perro("Perro", "raza", 4);
        
        gato.dormir();
        perro.dormir();
    }
    
}
