/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondinclassexercise7oct;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class SecondInClassExercise7Oct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        
        String colour;
        System.out.println("Please input the colour of the traffic Light");
        
        try{
            colour = myInput.readLine();
            
            switch(colour){
                case "Red": case "red" : case "RED":
                    System.out.println("Stop!");
                    break; 
                case "Orange": case "Yellow" : case "Ambar":
                    System.out.println("Slow down");
                    break; 
                case "Green":
                    System.out.println("Keep going");
                    break; 
                default:
                    System.out.println("The colour typed is not valid!");
                    break;       
            }
            
        } catch(Exception e){
            System.out.println("?");
        }
    }
    
}
