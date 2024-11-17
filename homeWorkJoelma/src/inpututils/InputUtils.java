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
         * Ask the user to enter text
         * If nor text,repeat prompt
        @param prompt the question to the user
        @retun some valid text from the user as a String
        * 
        */
    
        public String askUserForText (String prompt) {
        
            Scanner myInput = new Scanner(System.in);
        
            String userInput;
        
            do{
                System.out.println(prompt);
                System.out.println("You must enter text only!");

                userInput = myInput.nextLine();
            }while (!userInput.matches("[a-zA-Z!?.!', ]+"));
        
            // The input must be text
            return (userInput);
        }
        
        /**
         * Ask user for an integer value basef on a prompt
         * If not valid keep asking
         * @param prompt The prompt or question for the user
         * @return a valid int entered by he user
         */

        public int askUserForInt (String prompt){

            Scanner myInput = new Scanner(System.in);

            String userInput;

            do{
                System.out.println(prompt);
                System.out.println("You must enter numbers only!");

                userInput = myInput.nextLine();

            } while(!userInput.matches("[0-9]+"));

            return (Integer.parseInt(userInput));

        }

        /**
         * Ask user to enter integer value based on prompt
         * if not an int then keep asking
         * @param prompt The prompt / question for the user
         * @param maxValue the maximum int value allowed
         * @return a valid int entered by user
         */
        public int askUserForInt (String prompt, int maxValue){
            Scanner myInput = new Scanner(System.in);

            int userInput = maxValue+1;

            do{
                    System.out.println(prompt);
                    System.out.println("You must enter a number less than: " + maxValue);

                    try{
                        userInput= myInput.nextInt();
                    } catch (Exception e){
                        System.out.println("That was not a number!");
                        myInput.nextLine();
                    } 

                } while(userInput > maxValue);

            return (userInput);
        }
    }
