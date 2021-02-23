/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import model.Patient;
import model.PatientHistory;
import model.Vitals;
import model.VitalsHistory;

/**
 *
 * @author Saivignesh Sridhar
 */
public class MainMenu {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t \t \t -----------------------------------------");
        System.out.println("\t \t \t ---->  Welcome to Paediatrics Ward <----- ");
        System.out.println("\t \t \t -----------------------------------------");
             TimeUnit.SECONDS.sleep(3);
            HashMap<Integer, String> hmAgeGroup = new HashMap<>();
            hmAgeGroup.put(1,"Newborn");
            hmAgeGroup.put(2,"Infant");
            hmAgeGroup.put(3,"Toddler");
            hmAgeGroup.put(4,"Preschooler");
            hmAgeGroup.put(5,"School Age");
            hmAgeGroup.put(6,"Adolescent");
            PatientHistory patHistory = new PatientHistory();
            ArrayList<Patient> patArray = new ArrayList<Patient>();
            VitalsHistory vitHistory = new VitalsHistory();
            ArrayList<Vitals> vitArray = new ArrayList<Vitals>();
            
        while(true){
            System.out.println("\n");
            System.out.println("To ENTER Patient details, \t \t Enter choice as 1");
            System.out.println("To VIEW Patient History,  \t \t Enter choice as 2 \n \n  ");
            System.out.println("To EXIT, Enter choice as 9 \n ");
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            switch(choice){
			case 1:
                            //clearConsole();
                            System.out.println("\n \n \n \n \n");
                           
                            System.out.println("Recording Patient Details...");
                            String patientID = "";
                            String firstName = "";
                            String lastName = "";
                            int age = 0;
                            boolean isNormal = false;
                            double weightKgs = 0;
                            double weightLbs = 0;
                            double respRate = 0.0;
                            double heartRate = 0.0;
                            double systoBP = 0.0;
                            boolean isNewPatient = true;
                            
                            System.out.println("Enter Patient ID :");
                            patientID = scan.next();
                            
                            for(Patient patient : patArray){
                                if(patient.getMedID().equals(patientID)){
                                    isNewPatient = false;
                                    firstName = patient.getFirstName();
                                    lastName = patient.getLastName();
                                    break;
                                } 
                            }
                            
                            Patient patient = new Patient();
                            if(isNewPatient){
                                System.out.println("First Time Registration for Patient ID : \t"+patientID);
                                System.out.println("Enter Patient's First Name: ");
                                firstName = scan.next();
                                System.out.println("Enter Patient's Last Name: ");
                                lastName = scan.next();
                            }
                            
                            System.out.println("\n \n");
                            System.out.println("Select the Age Group "+firstName+" "+lastName+" belongs to : \n ");
                            System.out.println("\t \t 1. \t Newborn \n"
                                    + "\t \t 2. \t Infant (1-12 months) \n"
                                    + "\t \t 3. \t Toddler (1-3 years) \n"
                                    + "\t \t 4. \t Preschooler (3-5 years) \n"
                                    + "\t \t 5. \t School Age (6-12 years) \n"
                                    + "\t \t 6. \t Adolescent (13+ years) \n"
                                    + "");
                            int select = scan.nextInt();
                            System.out.println("Enter "+firstName+" "+lastName+"'s "+"Weight in kgs: ");
                            weightKgs = scan.nextDouble();
                            if(select == 2){
                                System.out.println("Respiratory Rate on Infants should be counted for a full 60 seconds... \n Starting now...");
                                int n = 54;
                                TimeUnit.SECONDS.sleep(54);
                                while(n<60){
                                n+=1;
                                System.out.println(n);
                                TimeUnit.SECONDS.sleep(1);
                                }
                                
                                
                                
                            }
                            System.out.println("Enter "+firstName+" "+lastName+"'s "+"Respiratory Rate: ");
                            respRate = scan.nextDouble();
                            System.out.println("Enter "+firstName+" "+lastName+"'s "+"Heart Rate: ");
                            heartRate = scan.nextDouble(); 
                            System.out.println("Enter "+firstName+" "+lastName+"'s "+"Systolic Blood Pressure: ");
                            systoBP = scan.nextDouble(); 
                            weightLbs = 2.20462 * weightKgs;
                            
                            patient.setMedID(patientID);
                            patient.setFirstName(firstName);
                            patient.setLastName(lastName);
                            patient.setAge(age);
                                                 
                            
                            Vitals vitDets = new Vitals();
                           
                            vitDets.setHeartRate(heartRate);
                            vitDets.setRespRate(respRate);
                            vitDets.setSystoBP(systoBP);
                            vitDets.setWeightKgs(weightKgs);
                            vitDets.setWeightLbs(weightLbs);
                            vitDets.setAgeGroup(select);
                            vitDets.setPatID(patientID);
                            patient.setVitDets(vitDets);  
                            System.out.println("Choose one of the following : 1. Check for all Vitals \t 2. Quick Check for a particular Vital");
                            select = scan.nextInt();
                            if(1 == select){
                            isNormal = patient.isPatientNormal(vitDets);
                            }
                            else if(2 == select) {
                                System.out.println("Which of these Vitals do you wish to check : \n RespiratoryRate \t HeartRate \n BloodPressure \t WeightinKgs \t WeightinKgs");
                                String vitName = scan.next();
                                isNormal = patient.isThisVitalSignNormal(vitName);
                                if(isNormal){
                                    System.out.println(vitName+" level is Normal for "+patient.getFirstName()+" "+patient.getLastName()+".");
                                } else System.out.println(vitName+" level is Abnormal for "+patient.getFirstName()+" "+patient.getLastName()+".");
                            }
                            vitDets.setIsNormal(isNormal);
                            
                                                  
                            vitHistory.setVitHistory(vitArray);
                            patHistory.setPatHistory(patArray);
                            patArray = patHistory.newPatientEntry(patient);
                            vitArray = vitHistory.newVitalSign(vitDets);
                            TimeUnit.SECONDS.sleep(3);
                            break;
                           
			case 2: 
                            System.out.println("\n \n \n \n \n");
                            System.out.println("Viewing Patient Details...");
                            System.out.println("Enter Patient ID to Retrieve: ");
                            patientID = scan.next();
                            StringBuilder header = new StringBuilder(200);
                            String record = "";
                            header.append("|").append("    Patient ID     ")
                                .append("|").append(" Patient Full Name ")
                                .append("|").append("    Age Group      ")
                                .append("|").append("  Respiratory Rate ")
                                .append("|").append("    Heart Rate     ")
                                .append("|").append("  Respiratory Rate ")
                                .append("|").append("   Weight in kgs   ")
                                .append("|").append("   Weight in lbs   ")
                                .append("|").append("   Recorded Date   ")
                                    .append("|");
                          StringBuilder data = new StringBuilder(1000);
                          data.append(header.toString()).append("\n");
                          
                            int noOfVisits = 0;
                            for(Patient pat : patArray){
                                if(pat.getMedID().equals(patientID)){
                                    
                                    for(Vitals vits : vitArray){
                                        if(vits.getPatID().equals(patientID)){
                                          
                                          //System.out.println(vits.toString());
                                          record = vitHistory.printVitals(vits,pat,hmAgeGroup);
                                          data.append(record);
                                          noOfVisits++; 
                                          data.append("\n");
                                          
                                        }
                                        
                                    }
                                    System.out.println("\n --------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println(data);
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n ");
                                  break;  
                                } 
                            }
                            System.out.println("Patient "+patientID+"'s Number of Visits :: "+noOfVisits);
                             TimeUnit.SECONDS.sleep(2);
                            System.out.println("Total number of Visits: "+vitArray.size());
                          
			break;
			case 9: System.out.println("Leaving the Paediatrics Ward...");
			System.exit(0);
			default: System.out.println("Incorrect value! Kindly select the right option.");
			}
        }
    }
   
}
