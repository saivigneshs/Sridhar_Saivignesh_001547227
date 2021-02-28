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
public class PatientData {
   
    private String firstName;
    private String lastName;
    private String commuName;
    private String houseID;
    private String cityName;
    private Vitals vits;

    public Vitals getVits() {
        return vits;
    }

    public void setVits(Vitals vits) {
        this.vits = vits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCommuName() {
        return commuName;
    }

    public void setCommuName(String commuName) {
        this.commuName = commuName;
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
}
