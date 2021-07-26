/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author juan
 */
public class clsCat extends clsPet{
    private String breed;

    public clsCat(String breed, String code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
    }
    
    
    
    
    public void selfCleaning(){
        System.out.println("El gato" + super.getName() + " se esta limpiando");
    }

    @Override
    public void Sound(){
        System.out.println("El gato " + super.getName() + " hace miaaaaw");
    }    
    
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
