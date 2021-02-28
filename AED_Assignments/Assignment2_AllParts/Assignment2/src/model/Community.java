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
public class Community {
    
    private String commuName;

    public String getCommuName() {
        return commuName;
    }

    public void setCommuName(String commuName) {
        this.commuName = commuName;
    }
    private ArrayList<House> house;

    public Community() {
        this.house = new ArrayList<House>();
    }

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    public void addHouse(House house){
        this.house.add(house);
        System.out.println("House "+house.getHouseID()+" added to Community "+commuName);
    }
    
}
