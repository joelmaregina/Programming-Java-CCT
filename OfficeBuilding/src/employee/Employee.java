/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author joelm
 */
public class Employee {
    private String firstName;
    private String surname;
    private String ppsn;
    private String role;
    private int employeeID;
    protected double wallet;

    public Employee(String firstName, String surname, String ppsn, String role, int employeeID) {
        this.firstName = firstName;
        this.surname = surname;
        this.ppsn = ppsn;
        this.role = role;
        this.employeeID = employeeID;
        this.wallet = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public double getWallet() {
        return wallet;
    }
    
    
    
    public String work (){
        return this.firstName + " is working now";
    }
    
}
