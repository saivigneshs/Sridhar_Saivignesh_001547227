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
public class PatientHistory {
    
    private ArrayList<Patient> patHistory;

    public ArrayList<Patient> getPatHistory() {
        return patHistory;
    }

    public void setPatHistory(ArrayList<Patient> patHistory) {
        this.patHistory = patHistory;
    }
    
    public ArrayList<Patient> newPatientEntry(Patient patient){
        patHistory.add(patient);
        System.out.println("\nPatient "+patient.getMedID()+" Registered Successfully!"+" \t Time :: "+new Date(System.currentTimeMillis()) +"\n");
        return patHistory;
    }
}
