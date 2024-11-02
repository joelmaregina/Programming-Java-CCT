/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordcheck;

import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class PasswordCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask user for a password and grant access if correct
        
              
        Scanner myKB = new Scanner(System.in);
        String pword;
        int attempts = 0;
        int loops = 5;
       
        String correctPassword = "Password"; //this is the correct password - it is easier to change it by setting it at the start of the program
                       
        do{
            //ask user for password at least once!
            int test = attempts;
             if(test >= 1) {
                loops--;
                System.out.println("Wrong password! Try again! You have more " + loops + " attempts!"); 
             }
            System.out.println("Please enter your password. "); //prompt
             pword = myKB.nextLine(); //get input
             attempts++;
             
             
             //repeat if user gets password wrong - exact match required
        }while (!pword.equals(correctPassword) && attempts <= 4);
        
        if(pword.equals(correctPassword)){
            System.out.println("Access granted");
        } else {
            System.out.println("Wrong password! ");
            System.out.println("You reached the limit of 5 attemps");
        } 
        //the only way to leave the loop is if the password is right
        
        /*
          WHY?
        
          Guard is --> !pword.equals(correctPassword)
        
          Loop will continue while guard is true
        
          So loop only stops if guard is false
        
          therefore loop  only stops if  ! (!pword.equals(correctPassword))
           So loop only stops if  pword.equals(correctPassword)
        */  
    }
    
}
