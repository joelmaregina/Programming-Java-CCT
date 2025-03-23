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
    
    public Triangle (){
        this.base = 2;
        this.height = 3;
    }
    

    /**
     * Calculate the area of the rectangle
     * @return The area as an int
     */
    //METHODS
    
    public int getBase(){
        return base;
    }
    
    public int getHeight() {
        return height;
    }

    public int getArea() {
        return ( (this.base * this.height)/2 );
    }
    
}
