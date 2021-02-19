
package recorer.arreglos;

public class RecorerArreglos {

    public static void main(String[] args) {
        //Recorer Arreglos
        
             int calificaciones [] = { 9, 8, 9, 10, 10, 9, 8, 8, 10, 9};
             int suma = 0;
            
            
            for ( int indice = 0; indice < calificaciones.length; indice++) {
                
                suma += calificaciones[indice];
                
            }
                
                
                float promedio = suma / calificaciones.length;
                
                System.out.println("El promedio es " + promedio);
            }
            
        }
    
    

