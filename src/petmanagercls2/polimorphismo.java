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
public class polimorphismo {//en esta clase crearemos dos objetos igual como hicimos con el cat y el dog
    public static void main(String[] args) {
       
        //instancias de las clases hijas, debemos tener una instancia de veterinary y doctor
        
        clsDog dog= new clsDog("criollo", false, "001", "firulais", 2013, "white", "sano");// como ya tenemos una clase dog crearemos una instacia de esta clase, es decir un objeto perro.
        
       clsCat cat = new clsCat("Angora", "002", "minino", 2015, "black", "enfermo");//como ya tenemos una clase cat crearemos una instacia de esta clase, es decir un objeto cat.
       //Instancia de veterinaria
       clsDoctor doctor = new clsDoctor("Juan Perez", "l12345");
       clsVeterinary veterinary = new clsVeterinary("veterinaria Udc", "031 9565629", "cll 125-67-89", doctor);
    
        String careDog= veterinary.PetCare(dog);
         System.out.println("EL estado de dalud de " +dog.getName()+ " es " + careDog );
         
         
        String careCat= veterinary.PetCare(cat);
        System.out.println("El estado de salud de " +cat.getName() + " es " + careCat);
    }
}
