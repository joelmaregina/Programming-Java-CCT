/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclassexercise7oct;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class InClassExercise7Oct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
        System.out.println("Type in a number bellow or equals to 100");
        
        int myNumber;
        
        try{
            myNumber = myInput.nextInt();
            
            if ( myNumber > 100) {
                System.out.println("Too Big!");
            } else{
                System.out.println("Perfect");
            }
            
        }catch (Exception e){
            System.out.println("The input needs to be a number");
        }
        
        
    }
    
}
