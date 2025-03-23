/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package officebuilding;

/**
 *
 * @author joelm
 */
public class OfficeBuilding {

    
    private int numFloors;
    private String adress;
    private Company companyList;

    public OfficeBuilding(int numFloors, String adress) {
        this.numFloors = numFloors;
        this.adress = adress;
        companyList = generateCompanies();
    }
    
    public Company generateCompanies(){
        return null;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
