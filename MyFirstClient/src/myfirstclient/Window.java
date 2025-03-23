/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstclient;

/**
 *
 * @author joelm
 */
public class Window {
    //PROPERTIES
    private int glassHeight;
    private int glassWidth;
    private int frameLenght;
    private String blindColour;
    
    //Constructors
    
    public Window(int glassHeight, int glassWidth, int frameLenght, String blindColour) {
        this.glassHeight = glassHeight;
        this.glassWidth = glassWidth;
        this.frameLenght = frameLenght;
        this.blindColour = blindColour;
    }
    
    //Default windows (the most commom window size)

    public Window() {
       this.frameLenght = 4;  
       this.glassHeight = 1000;
       this.glassWidth = 1000;
       this.blindColour = "white";
    }

    //Collects the Height of the windows glass
    public int getGlassHeight() {
        return glassHeight;
    }
    
    //Collects the Width of the windows glass
    public int getGlassWidth() {
        return glassWidth;
    }

    public void setBlindColour(String blindColour) {
        this.blindColour = blindColour;
    }
    
    
    //METHODS
    
    /**Calculate the size of the windows
     * @return The size as an int
     */
    public int getWindowSize(){
        return (this.glassHeight + this.frameLenght) * (this.glassWidth + this.frameLenght);
    }
    
    /** Unlocks the Windows if the user is indoors, the windows have a locker and the window is locked
     * @param inside collects the info if the person is inside the house;
     * @param locker collects the info if the window have a locker;
     * @param locked collects the info if the window is locked or not;
     * @return The message if the windows can be unlocked or not
     */

    public String unlock(boolean inside, boolean locker, boolean locked){
        if (inside == true && locker == true && locked == true){
            return "The window is now Unlocked";
        } else if (inside == false && locker == true && (locked == true || locked == false)) {
            return "You are outside the house you can't acess the locker to unlock";
        } else if (inside == true && locker == true && locked == false) {
            return "The window is already unlocked";
        } else {
            return "This window dont have a locker, so it can´t be unlocked";
        }
    }
    
    /** Locks the Windows if the user is indoors, the window have a locker and the window is unlocked
     * @param inside collects the info if the person is inside the house;
     * @param locker collects the info if the window have a locker;
     * @param locked collects the info if the window is locked or not;
     * @return The message if the windows can be locked or not
     */
    
    public String lock(boolean inside, boolean locker, boolean locked){
        if (inside == true && locker == true && locked == false){
            return "The window is now Locked";
        } else if (inside == false && locker == true && (locked == false || locked == true)){
            return "You are outside the house you can't acess the locker to lock";
        } else if (inside == true && locker == true && locked == true) {
            return "The window is already locked";
        } else {
            return "This window dont have a locker, so it can´t be locked";
        }
    }
    
}
