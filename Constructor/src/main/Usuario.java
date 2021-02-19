package main;


public class Usuario {
     
    public String username;
    private String password;
    
    //Constructor
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
        
        }
    
    public void saluda() {
        System.out.println("Hola,, username es " + this.username);
        
        }
    
    public String getpassword() {
        return password;
        
    }
    
}

    

