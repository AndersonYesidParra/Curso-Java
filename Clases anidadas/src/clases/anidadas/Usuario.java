
package clases.anidadas;

public class Usuario {
    
    public String username;
    
    public Usuario(String username){
        this.username = username;
    }
    
    public void establerRol(){
        Administrado admin = new Administrado();
        admin.trabajar();
    }
    
    public class Administrado {
        
        public void trabajar(){
            System.out.println("El administrador se encuentra trabajando");
        }
        
    }
   
}
