/**
 *
 * @author Harald Purnell
 */
package com.hp.routingCalculator.Entity;

public class Verticies {

    private String verticiesName;
    private Integer verticiesXCoor;
    private Integer verticiesYCoor;
    
    public Verticies(String name, Integer xCoor, Integer yCoor)
    {
        this.verticiesName = name;
        this.verticiesXCoor = xCoor;
        this.verticiesYCoor = yCoor;
    }
    
    /**
     * @return the verticiesName
     */
    public String getVerticiesName() {
        return verticiesName;
    }

    /**
     * @param verticiesName the verticiesName to set
     */
    public void setVerticiesName(String verticiesName) {
        this.verticiesName = verticiesName;
    }

    /**
     * @return the verticiesXCoor
     */
    public Integer getVerticiesXCoor() {
        return verticiesXCoor;
    }

    /**
     * @param verticiesXCoor the verticiesXCoor to set
     */
    public void setVerticiesXCoor(Integer verticiesXCoor) {
        this.verticiesXCoor = verticiesXCoor;
    }

    /**
     * @return the verticiesYCoor
     */
    public Integer getVerticiesYCoor() {
        return verticiesYCoor;
    }

    /**
     * @param verticiesYCoor the verticiesYCoor to set
     */
    public void setVerticiesYCoor(Integer verticiesYCoor) {
        this.verticiesYCoor = verticiesYCoor;
    }

   
}
