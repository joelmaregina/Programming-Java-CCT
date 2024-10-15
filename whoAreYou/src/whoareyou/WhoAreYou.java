/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whoareyou;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class WhoAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to our Website. Whats your name?");
        
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        
        String name;
        
        try {
            name = myInput.readLine(); //Captures the user name
            
            System.out.println("Oh, that is a very nice name, " + name + " !");
        }catch(Exception e){
            System.out.println("Not a valid name!");
        }
    }
    
}
