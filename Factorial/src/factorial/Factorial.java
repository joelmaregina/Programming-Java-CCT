/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import inpututils.InputUtils;
import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputUtils myInput = new InputUtils();
        int factorial;
        int result;
        
        factorial = myInput.askUserForInt("Type in the number you want to discover the factorial: ");
        
        int factorialOriginal = factorial;
        
        if (factorial == 0 || factorial == 1) {
            System.out.println("The factorial of " + factorial + " = 1");
        } else {
            result = 1;
            for (int i = factorial; factorial-1 > 0; factorial--){
                result = result * factorial;
                System.out.println(result);
            }
            System.out.println("The factorial of " + factorialOriginal + " is " + result);
        }
        

    }
    
}
