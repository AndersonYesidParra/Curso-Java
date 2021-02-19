
package insertar.valores;


public class InsertarValores {

    public static void main(String[] args) {
        //Insertar valores
        
        int valores [] = new int[10];
        
        for(int indice = 0; indice < valores.length; indice ++) {
        
        valores[indice] = indice;
        
    }
        for(int valor : valores ) {
            System.out.println(valor);
   
    }    
    }
    
}
