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
public class clsDog extends clsPet{
    private String breed;
    private boolean pedrigree;

    public clsDog(String breed, boolean pedrigree, String code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedrigree = pedrigree;
    }

    
    
    

    public void walk_arround(){
        System.out.println("El perro"+super.getName()+" esta paseandose.   ");
    }
    
     public void walk_arround(int km){
        System.out.println("El perro " + super.getName() + " esta caminando" +km+"km");
    }
    
      public void walk_arround(boolean dogLeash){
          String hasLeash = dogLeash ? "con correa": "sin correa";
        System.out.println("El perro " + super.getName() + " esta caminando " + hasLeash);
    }
    
    @Override
    public void Sound(){
        System.out.println("El perro " + super.getName()+ " hace guaaaaw");
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

    /**
     * @return the pedrigree
     */
    public boolean isPedrigree() {
        return pedrigree;
    }

    /**
     * @param pedrigree the pedrigree to set
     */
    public void setPedrigree(boolean pedrigree) {
        this.pedrigree = pedrigree;
    }
   
    
    
    
    
}
