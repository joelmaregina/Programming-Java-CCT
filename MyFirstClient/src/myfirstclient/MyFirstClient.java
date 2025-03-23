/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstclient;

/**
 *
 * @author joelm
 */
public class MyFirstClient {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window standardWindow = new Window();
        
        String unlockTheWindow = standardWindow.lock(true, true, true);
        String lockTheWindow = standardWindow.unlock(false, true, false);
        
        System.out.println(lockTheWindow);
        System.out.println(unlockTheWindow);
        
    }
        
    
}