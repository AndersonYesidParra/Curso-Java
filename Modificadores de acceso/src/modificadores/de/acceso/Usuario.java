
package modificadores.de.acceso;

public class Usuario {
    
    public String username;
    private String password;
    
    //DEfault
    //Public
    //Private
    //Protected
    
    public void saluda() {
        System.out.println("Hola, mi username es " + this.username);
        
        }
      //Getter 
       public String getPassword(){
           return this.password;
       }
       
      //setter
       public void setPassword(String password){
           this.password = password;
           
       }
  
    }
    

