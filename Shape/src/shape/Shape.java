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
        
        System.out.println("Welcome to the Area Cauculator");
        System.out.println("Please select the Shape form you want to know the area: ");
        System.out.println("1 - Rectangle");
        System.out.println("2 - Triangle ");
        System.out.println("3 - Circle");
        System.out.println("4 - Square");
        System.out.println("0 - Close the application");
        
        int userChoice = myInput.askUserForInt("Type in your choice;", 4);
        
        switch (userChoice) {
            case 1: 
                int rh = myInput.askUserForInt("Please enter the Rectangle height: ");
                int w = myInput.askUserForInt("Please enter the Rectangle width: ");

                Rectangle r1 = new Rectangle(rh, w);
                Rectangle r2 = new Rectangle();

                System.out.println("The area of the rectangle is: " + r1.getArea());
                System.out.println("The default area of the rectangle is: " + r2.getArea());
                System.out.println("The height of the rectangle is: " + r1.getHeight());
                System.out.println("The width of the rectangle is: " + r1.getWidth());
                break;
            case 2: 
                int b = myInput.askUserForInt("Please enter the Triangle base: ");
                int th = myInput.askUserForInt("Please enter the Triangle height: ");

                Triangle t1 = new Triangle(b, th);
                Triangle t2 = new Triangle();

                System.out.println("The area of the triangle is: " + t1.getArea());
                System.out.println("The default area of the triangle is: " + t2.getArea());
                System.out.println("The base of the triangle is: " + t1.getBase());
                System.out.println("The height of the triangle is: " + t1.getHeight());
                break;
            case 3:
                int radius = myInput.askUserForInt("Please enter the Cicle radius");
                
                Circle c1 = new Circle (radius);
                
                System.out.println("The area of the Circle is: " + c1.getArea());
                System.out.println("The radius of the Circle is: " + c1.getRadius());
                break;
            case 4:
                Square s1 = new Square(6);
                
                System.out.println("The area of the square is: " + s1.getArea());
                System.out.println("The width of the square is: " + s1.getWidth());
                
            default:
                System.out.println("The application has been closed.");
                
        }
          
    }
    
}
