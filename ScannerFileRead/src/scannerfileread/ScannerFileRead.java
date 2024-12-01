/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerfileread;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author kheal
 */
public class ScannerFileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*
        
          This code uses a while loop to read ALL of the content from a file
        
          Note a while loop is best because when you are accessing a file then it might be empty!
        
        */
      
        try{
             Scanner myFile = new Scanner(new FileReader("test.txt")); //open the file
             
             String input;
             
             while (myFile.hasNextLine()){
                 //is there anything in the file?
                 
                 input = myFile.nextLine();
                 
                 System.out.println("I have just read: " + input);
             }
             System.out.println("END OF FILE!");
        
        }catch (Exception e) {
            
             System.out.println("File not found!");
        }
    }
    
}
