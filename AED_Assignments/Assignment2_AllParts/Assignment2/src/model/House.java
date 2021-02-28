/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Saivignesh Sridhar
 */
public class House {
    
    private String houseID;
    private ArrayList<Person> residents;

    public ArrayList<Person> getResidents() {
        return residents;
    }

    public void setResidents(ArrayList<Person> residents) {
        this.residents = residents;
    }

    public House() {
        this.residents = new ArrayList<>();
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }


    public void addResident(Person resident){
    this.residents.add(resident);
        System.out.println("Resident "+resident.getFirstName()+"  Added to House "+houseID);
    }
}
