/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author joelm
 */
public class Circle {
    
    //PROPERTIES
    private double radius;
    private double PI = 3.14159; 
    
    //CONSTRUCTORS

    public Circle(double radius) {
        this.radius = radius;
    }
    
    //METHODS
    
    public double getArea(){
        return (this.radius * this.radius * this.PI);
    }
    
}
