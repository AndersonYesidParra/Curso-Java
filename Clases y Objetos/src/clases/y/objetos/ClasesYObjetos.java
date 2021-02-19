
package clases.y.objetos;

public class ClasesYObjetos {

    public static void main(String[] args) {
        //Clases y Objetos
        
        Perro lassie = new Perro();//Instancia 
        
        lassie.nombre = "Lassie";
        lassie.raza = "Colie";
        lassie.edad = 4;
        
        System.out.println( "El nombre es : " + lassie.nombre );
        System.out.println( "La raza es : " + lassie.raza );
        System.out.println( "La edad es : " +  lassie.edad );
    
        lassie.comer();
    }
    
}
