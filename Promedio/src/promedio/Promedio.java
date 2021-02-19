
package promedio;

public class Promedio {

    public static void main(String[] args) {

        // El promedio minímo par aprobar es de 7.
        // Si el promedio es de diez = Muchas Felicidades
        // Si el promedio es aprobatorio pero menor a diez = Felicidades
        // Si el promedio no es aprobatorio = Es necesario reposar bloques
        
        int promedio = 9;
       
        if ( promedio  >= 7 ) {
             
            // el promedio es aprobatorio
        
            if ( promedio == 10){
            
            System.out.println("Muchas Felicidades");
        
            } else {

                    System.out.println("Felicidades");
           
            }
        
            }else {
                // El promedio No es aprobatorio
                
                System.out.println("Es necesario repasar bloques");
            
       } 
       
        
    }
    
}
