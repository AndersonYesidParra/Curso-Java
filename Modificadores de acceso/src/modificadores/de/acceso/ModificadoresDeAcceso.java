
package modificadores.de.acceso;

public class ModificadoresDeAcceso {

    public static void main(String[] args) {
        //Modificadores de acceso
        
        Usuario codi = new Usuario();
        codi.username = "Codi";
        //codi.password = "Codi";
        codi.setPassword("Pass");
        
        
        System.out.println(codi.username);
        System.out.println(codi.getPassword());
        
        codi.saluda();

        }
    
}
