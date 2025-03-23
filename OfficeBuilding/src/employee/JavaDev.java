/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author joelm
 */
public class JavaDev extends Employee {
    
    public JavaDev(String firstName, String surname, String ppsn, int employeeID) {
        super(firstName, surname, ppsn, "Java Dev", employeeID);
    }
    
    
    
    @Override
    public String work(){
        return this.getFirstName() + " is debugging some briken code";
        
        
                
    }
}
