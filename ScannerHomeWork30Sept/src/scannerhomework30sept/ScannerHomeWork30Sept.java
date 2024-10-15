/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerhomework30sept;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class ScannerHomeWork30Sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        int num1, num2, answer;
        
        System.out.println("Please type in your first number to be added:");
        
        try{
            num1 = myInput.nextInt(); // Capture the first number to be added
            
            System.out.println("Please type in your second number to be added:");
            
            num2 = myInput.nextInt(); // Capture the second number to be added
            
            answer = num1 + num2; // Adds both captured numbers
            
            System.out.println("The sum of " + num1 + " and " + num2 + " is: "  + answer);
            
        }catch(Exception e){
            System.out.println("Not a valid number!"); //Shows a error message if the inputed numbers are not an Integer
        }
    }
    
}
