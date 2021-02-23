package model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saivignesh Sridhar
 */
public class Vitals {

    @Override
    public String toString() {
        return "Vitals{" + "ageGroup=" + ageGroup + ", respRate=" + respRate + ", heartRate=" + heartRate + ", systoBP=" + systoBP + ", weightKgs=" + weightKgs + ", weightLbs=" + weightLbs + ", entryDate=" + entryDate + ", isNormal=" + isNormal + ", patID=" + patID + '}';
    }
    private int ageGroup;

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }
    private double respRate;
    private double heartRate;
    private double systoBP;
    private double weightKgs;
    private double weightLbs;
    
    private Date entryDate;
    private boolean isNormal;
    private String patID;
    
    public String getPatID() {
        return patID;
    }

    public void setPatID(String patID) {
        this.patID = patID;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public boolean isIsNormal() {
        return isNormal;
    }

    public void setIsNormal(boolean isNormal) {
        this.isNormal = isNormal;
    }
    
    public double getWeightKgs() {
        return weightKgs;
    }

    public void setWeightKgs(double weightKgs) {
        this.weightKgs = weightKgs;
    }

    public double getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(double weightLbs) {
        this.weightLbs = weightLbs;
    }
  

    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        this.respRate = respRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystoBP() {
        return systoBP;
    }

    public void setSystoBP(double systoBP) {
        this.systoBP = systoBP;
    }
    
}