/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkdividingnumber;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class HomeWorkDividingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        double dividend, divisor, result;
        
        System.out.println("Type in the dividend: ");
        
        try{
            // Collects the user input of the dividend
            dividend = myInput.nextDouble();
            
            System.out.println("Type in the divisor: ");
            
            // Collects the user input of the divisor
            divisor = myInput.nextDouble();
          
            if( divisor != 0){ // Test if the divisor is different from 0, makes the division and output the result
                result = dividend/divisor;
                System.out.println("The division of the first number: " + dividend + " by the second number: " + divisor + " is = " + result );
            } else { //If the divisor is 0, output an error message
                System.out.println("Can´t divide by zero");
            }
        
        } catch (Exception e){
            // Error message if the person doesnt type in a number
            System.out.println("The number typed is not valid!");
        }
        
    }
    
}
