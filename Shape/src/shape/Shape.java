/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import inpututils.InputUtils;

/**
 *
 * @author joelm
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InputUtils myInput = new InputUtils();       
        
        int b = myInput.askUserForInt("Please enter the Triangle base: ");
        int h = myInput.askUserForInt("Please enter the Triangle height: ");
        
        Triangle t1 = new Triangle(b, h);
        
        System.out.println("The area of the rectangle is: " + t1.getArea());
        
        /*int h = myInput.askUserForInt("Please enter the Rectangle height: ");
        int w = myInput.askUserForInt("Please enter the Rectangle width: ");
     
        Rectangle r1 = new Rectangle(h, w);
        
        System.out.println("The area of the rectangle is: " + r1.getArea());
        */
    }
    
}
