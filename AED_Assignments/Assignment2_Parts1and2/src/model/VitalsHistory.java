/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Saivignesh Sridhar
 */
public class VitalsHistory {
    
    private ArrayList<Vitals> vitHistory;
    
    @Override
    public String toString() {
        return "VitalsHistory{" + "vitHistory=" + vitHistory + '}';
    }
     

    public ArrayList<Vitals> getVitHistory() {
        return vitHistory;
    }

    public void setVitHistory(ArrayList<Vitals> vitHistory) {
        this.vitHistory = vitHistory;
    }
    
    public ArrayList<Vitals> newVitalSign(Vitals vitRecord){
        Date dateNow = new Date(System.currentTimeMillis());
        vitRecord.setEntryDate(dateNow);
        vitHistory.add(vitRecord);
        System.out.println("Entry Recorded Successfully!");
        return vitHistory;
    }
    
    public String printVitals(Vitals vits,Patient pat, HashMap hm){
        
            String record = ("|"+"        "+pat.getMedID()+"        "
                              +"|"+"     "+pat.getFirstName()+" "+pat.getLastName()+"      "
                              +"|"+"     "+hm.get(vits.getAgeGroup())+"       "
                              +"|"+"        "+vits.getRespRate()+"        "
                              +"|"+"        "+vits.getHeartRate()+"        "
                              +"|"+"        "+vits.getSystoBP()+"        "
                              +"|"+"        "+vits.getWeightKgs()+"        "
                              +"|"+"        "+vits.getWeightLbs()+"        "
                              +"|"+"        "+vits.getEntryDate()+"        "
                              +"|"           );
                    
        return record;
    }
}
