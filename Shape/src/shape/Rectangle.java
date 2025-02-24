/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author joelm
 */
public class Rectangle {
    
    //PROPERTIES
    private int height;
    private int width;
    
    //CONSTRUCTOR(S)
    
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    
    /**
     * Calculate the area of the rectangle
     * @return The area as an int
    */
    //METHODS
    public int getArea(){
        return (this.height * this.width);
    }
}
