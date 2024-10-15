/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework30sept;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author joelm
 */
public class HomeWork30Sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        
        String quest;
        String favouriteColour;
        
        System.out.println("Hello! What is your quest?");
        
        try{
            quest = myInput.readLine(); //Captures the user quest
            
            System.out.println("What is your favourite colour?");
            
            favouriteColour = myInput.readLine();//Captures the user favourite colour
            
            System.out.println("Ah, I see your quest is to " + quest + ", and your favourite colour is: " + favouriteColour);
        }catch(Exception e){
            System.out.println("Not a valid input");
        }
        
    }
    
}
