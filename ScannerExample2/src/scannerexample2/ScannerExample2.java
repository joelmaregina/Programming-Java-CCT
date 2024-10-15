/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerexample2;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class ScannerExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("What is your dog's name ?");
        
        String dogName = myInput.nextLine(); // Captures the dog´s name
        
        System.out.println("Does " + dogName + " bark a lot?");
        
        System.out.println("Pick a number from 1 to 100");
        
        try{
            
            int number = myInput.nextInt(); // Captures the number of barks the dog does
            
            if(number <= 100 && number >= 1){ // Check if the number entered is between the numbers requested
                System.out.println("The Square of that number is: " + (number * number));
            }else{ //Alert the user that the typed number is not betweein the numbers requested
                System.out.println("The number is not valid, please type a number between 1 and 100.");
            }

            
        }catch(Exception e){
            System.out.println("Thats not a number!");
        
        }
    }
    
}
