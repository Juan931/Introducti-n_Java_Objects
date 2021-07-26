/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanagercls2;

import clases.clsDoctor;
import clases.clsVeterinary;

/**
 *
 * @author juan
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           clsDoctor doctor = new clsDoctor("Juan Perez", "l12345");
       clsVeterinary veterinary = new clsVeterinary("veterinaria Udc", "031 9565629", "cll 125-67-89", doctor);
    
       veterinary.setData(veterinary.getName() + "-" +  veterinary.getAddress());
       
       String data=veterinary.getHospitalInformation();
       String type=veterinary.getPatientType();
       String surgery=veterinary.Surgery();
    
        System.out.println("Data: " + data);
         System.out.println("Type: " + type);
          System.out.println("Surgery: " + surgery);
    }
    
}
