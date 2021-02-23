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
public class Patient {
    private String firstName;
    private String lastName;
    private String medID;
    private int age;
    private Vitals vitDets;
    private Date entryDate;
    private VitalsHistory vitHistory;

    public VitalsHistory getVitHistory() {
        return vitHistory;
    }

    public void setVitHistory(VitalsHistory vitHistory) {
        this.vitHistory = vitHistory;
    }
  

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    
    public Vitals getVitDets() {
        return vitDets;
    }

    public void setVitDets(Vitals vitDets) {
        this.vitDets = vitDets;
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
    
     public boolean isThisVitalSignNormal(String vitalSign){
        boolean isNormal = false;
        switch(vitalSign){
            case "RespiratoryRate":
                switch(vitDets.getAgeGroup()){
                    case 1:
                        if(30<= vitDets.getRespRate() && vitDets.getRespRate() <=50) isNormal = true;
                        break;
                    case 2:
                        if(20<= vitDets.getRespRate() && vitDets.getRespRate() <=30) isNormal = true;
                        break;
                    case 3:
                        if(20<= vitDets.getRespRate() && vitDets.getRespRate() <=30) isNormal = true;
                        break;
                    case 4:
                        if(20<= vitDets.getRespRate() && vitDets.getRespRate() <=30) isNormal = true;
                        break;
                    case 5:
                        if(20<= vitDets.getRespRate() && vitDets.getRespRate() <=30) isNormal = true;
                        break;    
                    case 6:
                        if(12<= vitDets.getRespRate() && vitDets.getRespRate() <=20) isNormal = true;
                        break;
                }
            break;
            case "HeartRate":
                switch(vitDets.getAgeGroup()){
                    case 1:
                        if(120<= vitDets.getHeartRate()&& vitDets.getHeartRate() <=160) isNormal = true;
                        break;
                    case 2:
                        if(80<= vitDets.getHeartRate() && vitDets.getHeartRate() <=140) isNormal = true;
                        break;
                    case 3:
                        if(80<= vitDets.getHeartRate() && vitDets.getHeartRate() <=130) isNormal = true;
                        break;
                    case 4:
                        if(80<= vitDets.getHeartRate() && vitDets.getHeartRate() <=120) isNormal = true;
                        break;
                    case 5:
                        if(70<= vitDets.getHeartRate() && vitDets.getHeartRate() <=110) isNormal = true;
                        break;    
                    case 6:
                        if(55<= vitDets.getHeartRate() && vitDets.getHeartRate() <=105) isNormal = true;
                        break;
                }   
            break;   
            case "BloodPressure":
                switch(vitDets.getAgeGroup()){
                    case 1:
                        if(50<= vitDets.getSystoBP()&& vitDets.getSystoBP() <=70) isNormal = true;
                        break;
                    case 2:
                        if(70<= vitDets.getSystoBP() && vitDets.getSystoBP() <=100) isNormal = true;
                        break;
                    case 3:
                        if(80<= vitDets.getSystoBP() && vitDets.getSystoBP() <=110) isNormal = true;
                        break;
                    case 4:
                        if(80<= vitDets.getSystoBP() && vitDets.getSystoBP() <=110) isNormal = true;
                        break;
                    case 5:
                        if(80<= vitDets.getSystoBP() && vitDets.getSystoBP() <=120) isNormal = true;
                        break;    
                    case 6:
                        if(110<= vitDets.getSystoBP() && vitDets.getSystoBP() <=120) isNormal = true;
                        break;
                }            
            break;
            case "WeightinKgs":
                switch(vitDets.getAgeGroup()){
                    case 1:
                        if(2<= vitDets.getWeightKgs()&& vitDets.getWeightKgs() <=3) isNormal = true;
                        break;
                    case 2:
                        if(4<= vitDets.getWeightKgs() && vitDets.getWeightKgs() <=10) isNormal = true;
                        break;
                    case 3:
                        if(10<= vitDets.getWeightKgs() && vitDets.getWeightKgs() <=14) isNormal = true;
                        break;
                    case 4:
                        if(14<= vitDets.getWeightKgs() && vitDets.getWeightKgs() <=18) isNormal = true;
                        break;
                    case 5:
                        if(20<= vitDets.getWeightKgs() && vitDets.getWeightKgs() <=42) isNormal = true;
                        break;    
                    case 6:
                        if(50< vitDets.getWeightKgs() ) isNormal = true;
                        break;
                }            
            break;  
            case "WeightinLbs":
                switch(vitDets.getAgeGroup()){
                    case 1:
                        if(4.5<= vitDets.getWeightLbs()&& vitDets.getWeightLbs() <=7) isNormal = true;
                        break;
                    case 2:
                        if(9<= vitDets.getWeightLbs() && vitDets.getWeightLbs() <=22) isNormal = true;
                        break;
                    case 3:
                        if(22<= vitDets.getWeightLbs() && vitDets.getWeightLbs() <=31) isNormal = true;
                        break;
                    case 4:
                        if(31<= vitDets.getWeightLbs() && vitDets.getWeightLbs() <=40) isNormal = true;
                        break;
                    case 5:
                        if(41<= vitDets.getWeightLbs() && vitDets.getWeightLbs() <=92) isNormal = true;
                        break;    
                    case 6:
                        if(110<= vitDets.getWeightLbs() ) isNormal = true;
                        break;
                }            
            break;
            default : System.out.println("INVALID ENTRY.");
        }
    return isNormal;
    }
}
