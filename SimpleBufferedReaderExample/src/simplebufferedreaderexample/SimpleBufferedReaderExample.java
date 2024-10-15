/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplebufferedreaderexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ken Healy
 */
public class SimpleBufferedReaderExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //declare BufferedReader to use Keyboard
      BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in)); 
      
      String userName;
      
      //prompt
      System.out.println("Enter your name");
      
      try{
            //get input
             userName = myKB.readLine();
             System.out.println("Hello " + userName + ". Isn't this a great class!");
             System.out.println("Please enter a number");
             
             //To read an int I need to convert the string to an int
             // use Integer.parseInt()   
             int num = Integer.parseInt(myKB.readLine());
             
             System.out.println("Multiplied by two, that is: " + (num * 2));   
      }
      catch(Exception e) {
          // error message - make sure you are clear
          System.out.println("Invalid input - that was not a number.");
      }
      
    }
    
}
