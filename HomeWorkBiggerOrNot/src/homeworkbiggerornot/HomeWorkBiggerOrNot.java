/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkbiggerornot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class HomeWorkBiggerOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
        
        int num1, num2;
        
        System.out.println("Type in the first number:");
        
        try{
            // Allocate the number typed in in the variable num1
            num1 = Integer.parseInt(myInput.readLine());
            
            System.out.println("Type in the second number:");
            
            // Allocate the number typed in in the variable num2
            num2 = Integer.parseInt(myInput.readLine());
            
            //Tests if the which number is bigger or if they are equals and output it to the user
            if( num1 > num2 ) {
                System.out.println(" The first number is bigger than the second number: " + num1 + " > " + num2);
            } else if (num2 > num1){
                System.out.println(" The second number is bigger than the first number: " + num1 + " < " + num2);
            }else {
                System.out.println(" The  numbers have the same value: " + num2 + " = " + num1);
            }
            
        } catch (Exception e){
            // Error message if the person doesnt type in a number
            System.out.println("The number typed is not valid!");
        }
        
    }
    
}