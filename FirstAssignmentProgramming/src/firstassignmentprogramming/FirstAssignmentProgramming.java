/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstassignmentprogramming;

import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class FirstAssignmentProgramming {

    /**
     * @param args the command line arguments
     */
     /* YOU HAVE TO 
     * - Insert comments to explain what is happening
     * - REPLACE ALL THE 'Output Messages' with a clear and sensible message for the user
    */
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner (System.in);
        String movieName;
        int userAge;
        
        System.out.println("Please enter the name of your favourite movie");
        
        //Collects the movie name from the user
        movieName = myKB.nextLine();
        
        //Displays the number of characters of the film the user entered
        System.out.println("The number of characters of the name of your film (including spaces) is: " + movieName.length());
        
        if (!movieName.contains("Star")){
            // Displays if the film doesn't have "Star" on its name
            System.out.println("Your film name doesn't have \"Star\" on its name (including the capital \"S\") " );
        } else {
            // Displays if the film doesn't have the word "Star"
            System.out.println("Your film has \"Star\" on its  (including the capital \"S\") ");
        }
    
        //POSSIBLE IMPROVEMENT 1 -- Can you improve the decision below? If yes --> How?
        // Change the code to show your improvement, but make sure the functionality is EXACTLY THE SAME !
        
        switch (movieName.substring(0,1)){
            case "X": case "x":
                // Displays a message if the film name starts with "X"
                System.out.println("That is probably an X-Men movie");
                break;
            case "Z" : case "z":
                // Displays a message if the film name starts with "Z"
                System.out.println("Interesting...is that a Zombie movie? Or Zoolander?");
                break;
            case "K" : case "k":
                // Displays a message if the film name starts with "K"
                System.out.println("I can't think of many movie's that start with a K");
                break;
            default:
                // Displays a message if the film name doesn't start with "X", "Z" or "K" 
                System.out.println("Your film name doesn't starts with \"X\", \"Z\" or \"K\"");
                break;
        } 
        
        ///END OF POSSIBLE IMPROVEMENT 1
        
        try{
            System.out.println("How old are you?");
            //Collects the age of the user
            userAge = myKB.nextInt(); 
            
            //POSSIBLE IMPROVEMENT 2-- Can you improve the decision below? If yes --> How?
        // Change the code to show your improvement, but make sure the functionality is EXACTLY THE SAME !
            if ((userAge >= 50) && ( userAge < 120 )){
                // Prints a message if the user is over over 50 years old and under 120 years old
                System.out.println("You don't look that old");
            } else if (userAge <50){ 
                // Prints a message if the user is under 50 years old
                System.out.println("Getting younger?");
            } else {
                // Prints a message if the user is 120 years old or above
                System.out.println("That's a great age!");  
            }
            //End of Possible Improvement 2
            
        }catch(Exception e){ 
            // Prints a message if the user type in non-numerical characteres as his/her age
            System.out.println("Invalid entry, you must type in a number for your age");
        }

    }
    
}
