/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class InputUtils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        String userInput;
        int maxValue = 20;
        int number = 0;
        
        /*
        do{
            System.out.println("Enter some text: ");
            System.out.println("You must enter text only!");
            
            userInput = myInput.nextLine();
            
        } while(!userInput.matches("[a-zA-Z!?.!', ]+"));
        */
        
        /*
        do{
            System.out.println("Enter some number: ");
            System.out.println("You must enter numbers only!");
            
            userInput = myInput.nextLine();
            
        } while(!userInput.matches("[0-9]+"));
        
        number = Integer.parseInt(userInput);
        
        number *= 2;
        
        System.out.println("The double of your number = " + number);
        */
        
        int myInputNum = maxValue + 1;
                
        /*
        do{
            System.out.println("Enter some number (Max value = 20): ");
            System.out.println("You must enter numbers only (Max value = 20)!");
            
            userInput = myInput.nextLine();
            
            if (userInput.matches("[0-9]+")){
                number = Integer.parseInt(userInput);
            }
            
        } while(!userInput.matches("[0-9]+") || number > maxValue);
        
        System.out.println("The double of your number = " + (number*2));
        */
       

        do{
            System.out.println("Enter some number (Max value = 20): ");
            System.out.println("You must enter numbers only (Max value = 20)!");
            
            try{
                myInputNum = myInput.nextInt();
            } catch (Exception e){
                System.out.println("That was not a number!");
                myInput.nextLine();
            } 
   
        } while(myInputNum > maxValue);
        
        System.out.println("The double of your number = " + (myInputNum*2));
    }
    
}
