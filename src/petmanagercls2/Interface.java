/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanagercls2;

import clases.*;


/**
 *
 * @author juan
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       clsDog dog= new clsDog("criollo", false, "001", "firulais", 2013, "white", "sano");// como ya tenemos una clase dog crearemos una instacia de esta clase, es decir un objeto perro.
        
       clsCat cat = new clsCat("Angora", "002", "minino", 2015, "black", "enfermo");//como ya tenemos una clase cat crearemos una instacia de esta clase, es decir un objeto cat.
       //I
   
        System.out.println(dog.getAnimalType()); 
        System.out.println(""+cat.getAnimalType()); 
        System.out.println(dog.getNumberofBones());
        System.out.println(""+cat.getNumberofBones());
    
    }
    
}
