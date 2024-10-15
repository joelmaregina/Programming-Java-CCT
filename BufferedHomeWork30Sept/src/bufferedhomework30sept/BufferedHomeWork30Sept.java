/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedhomework30sept;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class BufferedHomeWork30Sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        
        int num1, num2, answer;
        
        System.out.println("Please type in your first number to be added:");
        
        try{
            num1 = Integer.parseInt(myInput.readLine()); // Capture the first number to be added
            
            System.out.println("Please type in your seconf number to be added:");
            
            num2 = Integer.parseInt(myInput.readLine()); // Capture the second number to be added
            
            answer = num1 + num2; // Adds both captured numbers
            
            System.out.println("The sum of " + num1 + " and  " + num2 + " equals: " + answer);
                    
        }catch(Exception e){
            System.out.println("Not a valid number! Please type in a valid number. "); //Shows a error message if the inputed numbers are not an Integer
        }
        
    }
    
}
