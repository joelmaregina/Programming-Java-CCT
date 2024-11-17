/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkjoelma;

import inpututils.InputUtils;

/**
 *
 * @author joelm
 */
public class HomeWorkJoelma {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputUtils myInput = new InputUtils();
            int userChoice;
            String name;

           //Collects the user name and check if it matches as ab String;
           name = myInput.askUserForText("Type your name");
           
           System.out.println("What do you want to do with your name?");
           System.out.println("1 - Change to UpperCase;");
           System.out.println("2 - Change to LowerCase;");
           System.out.println("3 - Show your first letter;");
           System.out.println("4 - Show your last letter;");
           System.out.println("5 - Check if your name has a specific leter, or substring: ");
           System.out.println("0 - Exit");
           
           userChoice = myInput.askUserForInt("Pick a number", 5);
           
           switch (userChoice){
                case 1: 
                    System.out.println("Your name in UpperCase is:");
                    System.out.println(name.toUpperCase());
                    break;
                case 2:
                   System.out.println("Your name in LowerCase is: ");
                   System.out.println(name.toLowerCase());
                   break;
                case 3:
                    System.out.println("The first letter of your name is:");
                    String nameTrimmed = name.trim();
                    System.out.println(nameTrimmed.charAt(0));
                    break;
                case 4:
                    System.out.println("The last letter of your name is:");
                    String nameTrimmed2 = name.trim();
                    int nameLenght = nameTrimmed2.length()-1;
                    System.out.println(nameTrimmed2.charAt(nameLenght));
                    break;
                case 5:
                    String userCharacteres = myInput.askUserForText("Type in the letters that you want to check if it exists in your name: ");
                    if (name.contains(userCharacteres)){
                        System.out.println("Your name contains the substring: " + userCharacteres);
                    } else {
                        System.out.println("Your name doesn't contains the substring: " + userCharacteres);}
                   
                default:
                    System.out.println("Application closed.");
               
           }
                    
        }
    
}
