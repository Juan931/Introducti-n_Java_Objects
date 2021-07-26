/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanagercls2;

import clases.clsDog;

/**
 *
 * @author juan
 */
public class polimorphismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        clsDog dog= new clsDog("criollo", false, "001", "firulais", 2013, "white", "sano");
        
        dog.walk_arround();
        dog.walk_arround(10);
        dog.walk_arround(true);
    }
    
}
