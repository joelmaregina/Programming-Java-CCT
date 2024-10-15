/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexample;

import java.util.Scanner;

/**
 *
 * @author Ken Healy
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myKB = new Scanner(System.in);
        
        String sentence = "There is a bus on the road";
        
        int len = sentence.length();
        
        System.out.println("The length of the sentence is " + len);
        
        System.out.println("Enter password");
        String pword = myKB.nextLine();
        pword = pword.trim(); // gets rid of leading and trailing spaces
        //check password length
        
        String first = pword.substring(0,1); //get first letter
        System.out.println("The first letter is " + first);
        
        String second = pword.substring(1, 2); //get second letter
        System.out.println("Second letter is " + second);
        
        //check to see if the uppercase version of first is the same as original version of first
        if (first.toUpperCase().equals(first)){
            System.out.println("First letter is a capital");
        }
        else{
            System.out.println("First letter is NOT capital");
        }
        
        if ((pword.length() < 8) || (pword.contains(" ")) ){
            
            System.out.println("INVALID PASSWORD - Must be at least 8 characters. No spaces!");
            
            
        }
        else{
            System.out.println("THAT IS FINE! WELL DONE!");
        }
        
        
            
        System.out.println("Oh what a wonderful world".substring(5,8));
    }
    
}
