/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisionhomework2024229;

import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class RevisionHomework2024229 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
             Scanner myFile = new Scanner(new FileReader("ages.txt")); //open the file
             
             //Initialize the variable that will be used to read the people age;
             int input;
             //Initialize the counter of people.
             int count = 0;
             
             while (myFile.hasNextLine()){
                 
                 //Reads and transforms the age of people to an int,
                 input = parseInt(myFile.nextLine());
                 //Increment the counter
                 count++;
                 
                 //Outputs the adequate message to each age present on the list
                 if (input <= 15){
                     System.out.println("Person number " + count + " ( Age = " + input + " )" + " : This person should be in school !");
                 } else if(input >=16 && input <= 18 ){
                     System.out.println("Person number " + count + " ( Age = " + input + " )" +  " : This person could get a job, but we think they should stay in school.");
                 } else if(input >= 19 && input <= 65){
                     System.out.println("Person number " + count + " ( Age = " + input + " )" +  " : Time for this person to get a job. Rent doesn’t pay itself, you know!");
                 }else if (input > 65){
                     System.out.println("Person number " + count + " ( Age = " + input + " )" +  " : This person can retire now.");
                 }
                 
                 //System.out.println("I have just read: " + input);
             }
             
             //Outputs the number of people processed
             System.out.println(" - Number of people processed: " + count);
             System.out.println("THE FILE HAS BEEN PROCESSED. END OF FILE!");
        
        }catch (Exception e) {
            System.out.println("File not found!");
        }
    }
                 
    
}
