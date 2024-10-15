/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whoareyourscanner;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class WhoAreYourScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
        
        String name;
        
        try{
            System.out.println("Hello! Welcome to our Website. Whats your name?");

            name = myInput.nextLine(); //Captures the input user name

            System.out.println("Oh, that is a very nice name, " + name + " !");
            
        } catch(Exception e){
            System.out.println("Oh no! Thats not a valid name!");
        }
    }
    
}
