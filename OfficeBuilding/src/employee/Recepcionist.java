/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author joelm
 */
public class Recepcionist extends Employee {
    
    public Recepcionist(String firstName, String surname, String ppsn, int employeeID) {
        super(firstName, surname, ppsn, "Recepcionist", employeeID);
    }
    
    @Override
    public String work(){
        return this.getFirstName() + " is dealing with customers";
    }
    
}
