
package retornar.valores;

public class RetornarValores {

    public static void main(String[] args) {
        //Retornar valore
        
        Triangulo triangulo = new Triangulo();
        triangulo.base = 10 ;
        triangulo.altura = 20;
        
        
            float resultado = triangulo.area();
            System.out.println(resultado);
    }
    }
    

