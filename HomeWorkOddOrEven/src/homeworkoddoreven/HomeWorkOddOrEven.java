/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkoddoreven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class HomeWorkOddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        
        int number;
        
        System.out.println("Type in the number you want to discover if its Odd or Even:");
        
        try{
            // Collects the user input
            number = Integer.parseInt(myInput.readLine());
            
            // Test if the number is even or odd and tells the user if its even or odd
            if ( number%2 == 0 ){ 
                System.out.println("The number is Even");
            }else{
                System.out.println("The number is Odd");
            }
        
        }catch(Exception e){
            // Error message if the person doesnt type in a number
            System.out.println("The number typed is not valid!");
        }
    }
    
}
