/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Saivignesh Sridhar
 */
public class Encounter {

       private Vitals vitDet;

    public Vitals getVitDet() {
        return vitDet;
    }

    public void setVitDet(Vitals vitDet) {
        this.vitDet = vitDet;
    }
       private Date entryDate;       

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

  
    
    
        public boolean isThisVitalSignNormal(String vitalSign){
        boolean isNormal = false;
        Vitals vitDets = this.vitDet;
        
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
