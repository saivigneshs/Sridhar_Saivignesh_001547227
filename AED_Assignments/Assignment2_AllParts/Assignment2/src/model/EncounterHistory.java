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
public class EncounterHistory {

      private ArrayList<Encounter> encHistoryArray;
      
       public EncounterHistory() {
        this.encHistoryArray = new ArrayList<Encounter>();
    }
       
        public void newVitalEncounter(Encounter encounter){
        Date dateNow = new Date(System.currentTimeMillis());
        encounter.setEntryDate(dateNow);
        this.encHistoryArray.add(encounter);
        System.out.println("Entry Recorded Successfully at "+dateNow+" !");
    }

    public ArrayList<Encounter> getEncHistoryArray() {
        return encHistoryArray;
    }

    public void setEncHistoryArray(ArrayList<Encounter> encHistoryArray) {
        this.encHistoryArray = encHistoryArray;
    }
    
    public String printVitals(Encounter encount,Patient pat, HashMap hm){
        
        Vitals vits = encount.getVitDet();
        
            String record = ("|"+"        "+pat.getMedID()+"        "
                              +"|"+"     "+pat.getFirstName()+" "+pat.getLastName()+"      "
                              +"|"+"     "+hm.get(vits.getAgeGroup())+"       "
                              +"|"+"        "+vits.getRespRate()+"        "
                              +"|"+"        "+vits.getHeartRate()+"        "
                              +"|"+"        "+vits.getSystoBP()+"        "
                              +"|"+"        "+vits.getWeightKgs()+"        "
                              +"|"+"        "+vits.getWeightLbs()+"        "
                              +"|"+"        "+encount.getEntryDate()+"        "
                              +"|"           );
                    
        return record;
    }
  
}
