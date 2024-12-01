/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonnacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class Fibonnacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

        long firstNumber = 0;
        long secondNumber = 1;
        int numberOfNumbers;
        long nextNumber;

        System.out.println("Type in the number of Fibonnacii numbers you want to see: ");

        try {
            
                numberOfNumbers = Integer.parseInt(myInput.readLine());
                System.out.print("0, 1, ");
                for (int i = 1; i <= numberOfNumbers - 2 ; i++ ){
                        nextNumber = firstNumber + secondNumber;
                        System.out.print(nextNumber + ", ");

                        firstNumber = secondNumber;
                        secondNumber = nextNumber;
                }

        }catch (Exception e){
            
            System.out.println("You must type in a valid number!");
        }
        
        
    }
    
}
