/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author joelm
 */
public class SecurityAnalyst extends Employee{
    
    public SecurityAnalyst(String firstName, String surname, String ppsn, int employeeID) {
        super(firstName, surname, ppsn, "Security Analyst", employeeID);
    }
    
    @Override
    public String work(){
        return this.getFirstName() + " is trying yo hack a server";
    }
    
}
