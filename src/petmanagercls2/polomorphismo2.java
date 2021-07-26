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
public class polomorphismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       clsDog dog= new clsDog("criollo", false, "001", "firulais", 2013, "white", "sano");
        
       clsCat cat = new clsCat("Angora", "002", "minino", 2015, "black", "enfermo");
    
       dog.Sound();
       cat.Sound();
    
    }
    
}
