
package com.codigofacilito.com.clases;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
             
            String nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
            int edad = Integer.parseInt(
                   JOptionPane.showInputDialog(null, "¿Cual es tu edad?")); 
            
            JOptionPane.showMessageDialog(null, "La salida");
            System.out.println(nombre);
            System.out.println(edad);
            
        }
            
        
}
       
    
    

