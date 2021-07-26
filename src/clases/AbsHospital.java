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
public abstract class AbsHospital {
    private String data;
    
    public abstract String getPatientType();
    public abstract String Surgery();

public String getHospitalInformation(){
     
    return "la informacion es:" + this.getData();
}

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

}
