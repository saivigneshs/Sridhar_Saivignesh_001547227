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
public class City {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    private ArrayList <Community> communities;

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

    public City() {
    this.communities = new ArrayList<Community>();
    }
    
    public void addCommunity(Community com){
        this.communities.add(com);
        System.out.println("Community "+com.getCommuName()+" added to City "+cityName);
    }
}
