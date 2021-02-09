/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Saivignesh Sridhar
 */
public class Address {

    public String getStStreetName() {
        return stStreetName;
    }

    public void setStStreetName(String stStreetName) {
        this.stStreetName = stStreetName;
    }

    public String getStCity() {
        return stCity;
    }

    public void setStCity(String stCity) {
        this.stCity = stCity;
    }

    public String getStState() {
        return stState;
    }

    public void setStState(String stState) {
        this.stState = stState;
    }

    public String getStZipCode() {
        return stZipCode;
    }

    public void setStZipCode(String stZipCode) {
        this.stZipCode = stZipCode;
    }
    private String stStreetName;
    private String stCity;
    private String stState;
    private String stZipCode;
}
