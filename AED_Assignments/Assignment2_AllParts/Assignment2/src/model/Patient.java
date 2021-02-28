/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Saivignesh Sridhar
 */
public class Patient extends Person{

    private String medID;
 
    private Date entryDate;
    
    public EncounterHistory encHistory;

    public Patient() {
    this.encHistory = new EncounterHistory();
    }
    
    

    public EncounterHistory getEncHistory() {
        return encHistory;
    }

    public void setEncHistory(EncounterHistory encHistory) {
        this.encHistory = encHistory;
    }
  

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
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

    public String getMedID() {
        return medID;
    }

    public void setMedID(String medID) {
        this.medID = medID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean isPatientNormal(Vitals vits) throws InterruptedException{
        boolean patState = false;
        double weightKgs = 0;
        double weightLbs = 0;
        double respRate = 0.0;
        double heartRate = 0.0;
        double systoBP = 0.0;
        int ageGroup = 0;
        
        weightKgs = vits.getWeightKgs();
        weightLbs = vits.getWeightLbs();
        respRate = vits.getRespRate();
        heartRate = vits.getHeartRate();
        systoBP = vits.getSystoBP();
        ageGroup = vits.getAgeGroup();
        
                        System.out.println("Patient ID :: "+vits.getPatID()+" | "
                        + "Resp Rate :: "+respRate+" | "
                        + "HeartRate :: "+heartRate+" | "
                        + "Systo BP :: "+systoBP+" | "
                        + "Weight in Kgs :: "+weightKgs+" | "               
                        + "Weight in Lbs :: "+weightLbs+" | "  
                        + "\n");
        
        switch(ageGroup){
            case 1 : // new born
                if(30.00 <=respRate && respRate <=50.00 && 120.00 <=heartRate && heartRate<=160 && 50.00 <= systoBP && systoBP <= 70.00  && (  (2<=weightKgs && weightKgs <=3) || (4.5<=weightLbs && weightLbs<=7) ) ){
                patState = true;
                    System.out.println("Newborn is Normal.");
                }
                else {System.out.println("Newborn requires further Diagnosis. ");
                patState = false;
                
                if(respRate > 50 && heartRate > 160 && systoBP > 70){
                    System.out.println("\t !!! Newborn might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 120){
                    System.out.println("\t !!! Newborn might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                break;
                
            case 2 : // Infant
                if(20.00 <=respRate && respRate <=30.00 && 80.00 <=heartRate && heartRate<=140 && 70.00 <= systoBP && systoBP <= 100.00  && (  (4<=weightKgs && weightKgs <=10) || (9<=weightLbs && weightLbs<=22) ) ){
                patState = true;
                    System.out.println("Infant is Normal");
                }
                else {System.out.println("Infant requires further Diagnosis. ");
                patState = false; 
                
                if(respRate > 30 && heartRate > 140 && systoBP > 100){
                    System.out.println("\t !!! Infant might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 80){
                    System.out.println("\t !!! Infant might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                break;
                
            case 3 : // Toddler
                if(20.00 <=respRate && respRate <=30.00 && 80.00 <=heartRate && heartRate<=130 && 80.00 <= systoBP && systoBP <= 110.00  && (  (10<=weightKgs && weightKgs <=14) || (22<=weightLbs && weightLbs<=31) ) ){
                patState = true;
                    System.out.println("Toddler is Normal");
                }
                else {System.out.println("Toddler requires further Diagnosis. ");
                patState = false;
                
                if(respRate > 30 && heartRate > 130 && systoBP > 110){
                    System.out.println("\t !!! Toddler might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 80){
                    System.out.println("\t !!! Toddler might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                
                break;
                
            case 4 : // PreSchooler
                if(20.00 <=respRate && respRate <=30.00 && 80.00 <=heartRate && heartRate<=120 && 80.00 <= systoBP && systoBP <= 110.00  && (  (14<=weightKgs && weightKgs <=18) || (31<=weightLbs && weightLbs<=40) ) ){
                patState = true;
                    System.out.println("Preschooler is Normal");
                }
                else {System.out.println("Preschooler requires further Diagnosis. ");
                patState = false;
                
                if(respRate > 30 && heartRate > 120 && systoBP > 110){
                    System.out.println("\t !!! Preschooler might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 80){
                    System.out.println("\t !!! Preschooler might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                break;
            
            case 5 : // School Age
                if(20.00 <=respRate && respRate <=30.00 && 70.00 <=heartRate && heartRate<=110 && 80.00 <= systoBP && systoBP <= 120.00  && (  (20<=weightKgs && weightKgs <=42) || (41<=weightLbs && weightLbs<=92) ) ){
                patState = true;
                    System.out.println("School Age is Normal");
                }
                else {System.out.println("School Age requires further Diagnosis. ");
                patState = false;
                 
                if(respRate > 30 && heartRate > 110 && systoBP > 120){
                    System.out.println("\t !!! School Age might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 70){
                    System.out.println("\t !!! School Age might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                break;
                
            case 6 : // Adolescent
                if(12.00 <=respRate && respRate <=20.00 && 55.00 <=heartRate && heartRate<=105 && 110.00 <= systoBP && systoBP <= 120.00  && (  50<=weightKgs || 110<=weightLbs ) ){
                patState = true;
                    System.out.println("Adolescent is Normal");
                }
                else {System.out.println("Adolescent requires further Diagnosis. ");
                patState = false;
                 
                if(respRate > 20 && heartRate > 105 && systoBP > 120){
                    System.out.println("\t !!! Adolescent might be under Stress/Fever. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                if(heartRate < 55){
                    System.out.println("\t !!! Adolescent might have Bradycardia! Critical Aid required Immediately. !!!");
                    TimeUnit.SECONDS.sleep(2);
                }
                }
                break;
        }
        //additional CHECKS        
        
        return patState;
    }
    
}
