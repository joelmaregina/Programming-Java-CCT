/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iamthecount;

import java.util.Scanner;






/**
 *
 * @author Ken
 */
public class IamTheCount {

    /**
     * Simple program to count a number of students
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int maxStudents=0 ;
        
       
         Scanner myKB = new Scanner(System.in);
        
        System.out.println("How many students are in class today?");
            
        maxStudents = myKB.nextInt();
        // input must be a number
        
        System.out.println("I am the count...I love to count. Let's count students...");
        
        for(int i=1; i<=maxStudents; i++){
            //each time around loop - print out a message with the current counter value
            System.out.println( i + " student! Ah...ah..ah..ah!");
            
            myKB.nextLine();
             
        }
    }
    
}
