/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanagercls2;

import clases.*;
import java.util.Date;
/**
 *
 * @author juan
 */
public class PetManagercls2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
         clsDog dog1= new clsDog("criollo", false, "001", "firulais", 2013, "white", "sano");// como ya tenemos una clase dog crearemos una instacia de esta clase, es decir un objeto perro.
        
        clsCat cat1 = new clsCat("Angora", "002", "minino", 2015, "black", "enfermo");//como ya tenemos una clase cat crearemos una instacia de esta clase, es decir un objeto cat.
    
        Date current_date = new Date();
        int current_year= current_date.getYear();
        
        int agePet1 =current_year - dog1.getBorn_year();
        int agePet2 =current_year -cat1.getBorn_year();
        
        if (agePet1> agePet2){
            System.out.println("La mascota" + dog1.getName() + "Es mayor que la mascota" + cat1.getName());
        }else{
            if (agePet2 > agePet1){
                System.out.println("La mascota" + dog1.getName() + "Es mayor que la mascota" + cat1.getName());
            }else{
                System.out.println("La mascota" + dog1.getName() + "tiene la misma edad que " + cat1.getName());
            }
        } 
        cat1.Eat();
        cat1.Move();
        cat1.Sound();
        dog1.Eat();
        dog1.Move();
        dog1.Sound();
        
        dog1.walk_arround();
        cat1.selfCleaning();
    }
    
}
