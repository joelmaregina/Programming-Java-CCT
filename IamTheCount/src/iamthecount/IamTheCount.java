/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iamthecount;

import inpututils.InputUtils;
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
        
       
        InputUtils myInput = new InputUtils();
        
        maxStudents = myInput.askUserForInt("How many students in the class?");

        
        for(int i=1; i<=maxStudents; i++){
            //each time around loop - print out a message with the current counter value
            System.out.println( i + " student! Ah...ah..ah..ah!");
        }
    }
    
}
