
package pkgswitch;


public class Switch {

    public static void main(String[] args) {
        //Switch
        String colorLuz = "Rosa";
        
        switch(colorLuz) {
        
        case "Verde" :
            System.out.println("Puede continuar");
            //
            break;
        
        case"Amarillo" :
            System.out.println("Alto parcil");
            //
            break;
        
        case "Rojo" :
            System.out.println("Alto total");
            //
            break;
            
        default:
            System.out.println("Color no valido");
            
    }
     
    }
    
}
