/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewritecalc;





import inpututils.InputUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


/**
 *
 * @author Ken
 */
public class FileWriteCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*
          If you look at the main() here you will notice that it is mostly just calling other methods to do the work!
        
          This is an example of breaking the problem down into smaller problems
        
        */
        String filename = "";
        int num1, num2;
        Scanner myKB = new Scanner(System.in);
        
        InputUtils myInput = new InputUtils();
        
        filename = getFilename(); // I have written a method to do this
        
        try{
            System.out.println("Please enter a number");
            num1 = myKB.nextInt();
            
            System.out.println("Please enter a second number");
            num2 = myKB.nextInt();
         
               
            writeToFile(filename, num1+num2); //also a method to do this!
        
        }catch(Exception e){
            
            
        }
         
    }
    
    
    /*
        *****************    GENERAL NOTE ********************
    
    The methods shown below are 'static'. We haven't explained this yet.
    
    In general, this is not a good practice but to avoid it we would need to do something ELSE that we haven't seen yet either :)
    
    PLEASE AVOID USING STATIC METHODS IN YOUR CODE
    
    */
    
    
    /**
     * Ask the user for a filename
     * @return the filename with a .txt extension
     */
    public static String getFilename(){
        
        String filename;
        Scanner myKB = new Scanner(System.in);
       
            
            System.out.println("Please enter a filename. Do NOT enter the file extension");
            filename = myKB.nextLine();
            filename = filename + ".txt";
        
        
        return filename;
    }
    
    /**
     * Write a numeric value to a file. The file name is provided
     * @param filename - the file to write to
     * @param valueToWrite - the  int value to write by appending to file specified
     * 
     */
    public static void writeToFile(String filename, int valueToWrite){
        
        //you always need try-catch with a BufferedWriter, because there might be a problem accessing the folder/drive you want
        try {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filename,true)); ///use true to append, not to overwrite the archive
            
            myWriter.newLine();       // this creates a new line in the file
            
            myWriter.write(Integer.toString(valueToWrite)); //I have to convert numbers into a string so that I can use the .write() method
                   
            myWriter.close(); //saves the changes - make sure you remember this!!
            
        }catch (Exception e) {
            
            System.out.println("Unable to write to file: " + filename);
        }
    }
   
    
}
