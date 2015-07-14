/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitest;

/**
 *
 * @author christianmccabe
 */
public class Capabilities {
    
    private String name;
    private String asOfRelease;
    private String shortDescription;
    private String longDescription;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the asOfRelease
     */
    public String getAsOfRelease() {
        return asOfRelease;
    }

    /**
     * @param asOfRelease the asOfRelease to set
     */
    public void setAsOfRelease(String asOfRelease) {
        this.asOfRelease = asOfRelease;
    }

    /**
     * @return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * @param shortDescription the shortDescription to set
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @return the longDescription
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
    
}
