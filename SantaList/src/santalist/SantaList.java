/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package santalist;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author joelm
 */
public class SantaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            Scanner myFile = new Scanner(new FileReader("NiceList.txt"));
            String name;
            int age;
            
            while (myFile.hasNextLine()){
                //1st line should be name; 2nd line should be age
                
                name = myFile.nextLine();
                if(myFile.hasNextInt()){
                    
                    age = myFile.nextInt();
                    System.out.println("Ho! ho! Ho! It looks like " + name + " has being good. They are " + age + " years old.");
                    myFile.nextLine(); //Makes sure it goes for the next line.
                    
                } else {
                    System.out.println("Humm. Looks like " + name + " forgot their age!");
                }
                
            }
            System.out.println("Thats the end of the list!");
                
            
            
        }catch(Exception e){
            System.out.println("File Error / File not found");
        }
    }
    
}
