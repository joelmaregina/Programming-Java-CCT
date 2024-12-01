/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonnacciwithscanner;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class FibonnacciWithScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 1;
        int numberOfNumbers;
        int nextNumber;

        System.out.println("Type in the number of Fibonnacii numbers you want to see: ");

        try {

                numberOfNumbers = myInput.nextInt();
                System.out.print("0, 1, ");

                for (int i  = 1  ; i <= numberOfNumbers - 2; i++) {
                    nextNumber = firstNumber + secondNumber;
                    System.out.print(nextNumber + ", ");

                    firstNumber = secondNumber;
                    secondNumber = nextNumber;
                }

        } catch (Exception e){
                System.out.println("You must type in a valid number");
        }

    }
    
}
