/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author joelm
 */
public class Triangle {
    
    //PROPERTIES
    
    private int base;
    private int height;
    
    //CONSTRUCTORS

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    /**
     * Calculate the area of the rectangle
     * @return The area as an int
     */
    //METHODS
    
    public int getArea(){
        return ( (this.base * this.height)/2 );
    }
    
}
