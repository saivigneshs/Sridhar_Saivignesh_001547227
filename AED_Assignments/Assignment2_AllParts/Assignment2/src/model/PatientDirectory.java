/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saivignesh Sridhar
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patHistory;

    public PatientDirectory() {
        
        ArrayList<Patient> patArray = new ArrayList<Patient>();
        this.patHistory = patArray;
    }
    
    

    public ArrayList<Patient> getPatHistory() {
        return patHistory;
    }

    public void setPatHistory(ArrayList<Patient> patHistory) {
        this.patHistory = patHistory;
    }
    
    public void addPatientEntry(Patient patient){
        patient.setEntryDate(new Date(System.currentTimeMillis()));
        patHistory.add(patient);
        System.out.println("\nPatient "+patient.getMedID()+" Registered Successfully!"+" \t Time :: "+new Date(System.currentTimeMillis()) +"\n");
    }
    
    public Patient fetchPatientByUID(String UID){
        Patient targetPat = new Patient();
        for(Patient pats : patHistory)
        {
            if(pats.getMedID().equals(UID)){
            targetPat = pats;
            break;
            }
        }
        return targetPat;
    }
}
