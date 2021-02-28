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
import model.City;
import model.Community;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.Patient;
import model.PatientData;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.Vitals;

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
            
            PersonDirectory perDir = new PersonDirectory();
            PatientDirectory patHistory = new PatientDirectory();
            EncounterHistory encHistory = new EncounterHistory();
            
            
            //Getting Environment Ready...
                       
            Person p1=perDir.addPerson("001", "Apple", "Banana");
            Person p2=perDir.addPerson("002","Caramel", "Cream");
            Person p3=perDir.addPerson("003","Butter", "Bun");
            Person p4=perDir.addPerson("004","Donut", "Dunks");
            Person p5=perDir.addPerson("005","Egg", "Toast");
            Person p6=perDir.addPerson("006","Fruit", "Jam");
            
            
            
            House cv_101 =  new House();
            cv_101.setHouseID("cv_101");
            cv_101.addResident(p1);
            
            House cv_102 =  new House();
            cv_102.setHouseID("cv_102");
            cv_102.addResident(p2);
            
            House cv_103 =  new House();
            cv_103.setHouseID("cv_103");
            cv_103.addResident(p3);
            cv_103.addResident(p4);
            
            House lw_101 = new House();
            lw_101.setHouseID("lw_101");
            lw_101.addResident(p5);
            
            House lw_201 = new House();
            lw_201.setHouseID("lw_201");
            lw_201.addResident(p6);
           
            
            Community cityview = new Community();
            cityview.setCommuName("CityView Apts");
            cityview.addHouse(cv_101);
            cityview.addHouse(cv_102);
            cityview.addHouse(cv_103);
            Community longwood = new Community();
            longwood.setCommuName("Longwood Apts");
            longwood.addHouse(lw_101);
            longwood.addHouse(lw_201);
           
            City city = new City();
            city.setCityName("Cityville");
            city.addCommunity(longwood);
            city.addCommunity(cityview);
            
                        
            System.out.println("Size: "+perDir.getPersonHistory().size());
            
            
        while(true){
            try{
            System.out.println("\n");
            
            System.out.println("Enter UID : ");
            String UID = scan.next();
            boolean personExists = false;
            Person currentPerson = new Person();
            
              for(Person person : perDir.getPersonHistory()){
                                if(person.getUID().equals(UID)){
                                    personExists = true;
                                    currentPerson = person;
                                    System.out.println("Welcome to the Clinic, "+person.getFirstName());
                                    break;
                                }
                                
                                }
              
            if(personExists) {
            
            System.out.println("To ENTER Patient"
                    + " details, \t \t Enter choice as 1");
            System.out.println("To VIEW Patient History,  \t \t Enter choice as 2 \n \n  ");
                System.out.println("to Calculate Total Number of Abnormal Patients in this City, \t \t Enter Choice as 3");
            System.out.println("To EXIT, Enter choice as 9 \n ");
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            switch(choice){
			case 1:
                            //clearConsole();
                            System.out.println("\n \n \n \n \n");
                           
                            System.out.println("Recording Patient Details...");
                            //String patientID = "";
                            String firstName = "";
                            String lastName = "";
                            int age = 0;
                            boolean isNormal = false;
                            double weightKgs = 0;
                            double weightLbs = 0;
                            double respRate = 0.0;
                            double heartRate = 0.0;
                            double systoBP = 0.0;
                            //boolean isNewPatient = true;
                            
                            //System.out.println("Enter Patient ID :");
                           // patientID = scan.next();
                            
                            
//                            for(Patient patient : patHistory.getPatHistory()){
//                                if(patient.getMedID().equals(patientID)){
//                                    isNewPatient = false;
//                                    firstName = patient.getFirstName();
//                                    lastName = patient.getLastName();
//                                    age = patient.getAge();
//                                    break;
//                                } 
//                            }
                            
                            Patient patient = new Patient();
//                            if(isNewPatient){
                                System.out.println(" Registration for Patient ID : \t"+currentPerson.getUID());
                                
                                firstName = currentPerson.getFirstName();
                                lastName = currentPerson.getLastName();
                                age = currentPerson.getAge();
//                            }
                            
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
                            
                            patient.setMedID(currentPerson.getUID());
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
                            vitDets.setPatID(currentPerson.getUID());
                               
                            
                            
                                                  
                            Encounter enco = new Encounter();
                            enco.setVitDet(vitDets);
                            
                            encHistory.newVitalEncounter(enco);
                            
                          
                            System.out.println("Choose one of the following : 1. Check for all Vitals \t 2. Quick Check for a particular Vital");
                            select = scan.nextInt();
                            if(1 == select){
                            isNormal = patient.isPatientNormal(vitDets);
                            }
                            else if(2 == select) {
                                System.out.println("Which of these Vitals do you wish to check : \n RespiratoryRate \t HeartRate \n BloodPressure \t WeightinKgs \t WeightinKgs");
                                String vitName = scan.next();
                                isNormal = enco.isThisVitalSignNormal(vitName);
                                if(isNormal){
                                    System.out.println(vitName+" level is Normal for "+patient.getFirstName()+" "+patient.getLastName()+".");
                                } else System.out.println(vitName+" level is Abnormal for "+patient.getFirstName()+" "+patient.getLastName()+".");
                            }
                            //vitDets.setIsNormal(isNormal);
                            patient.setEncHistory(encHistory);  
                            patHistory.addPatientEntry(patient);
                            break;
                           
			case 2: 
                            System.out.println("\n \n \n \n \n");
                            System.out.println("Viewing Patient Details...");
                            
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
                            for(Patient pat : patHistory.getPatHistory()){
                                if(pat.getMedID().equals(currentPerson.getUID())){
                                    
                                    for(Encounter encount : encHistory.getEncHistoryArray()){
                                        if(encount.getVitDet().getPatID().equals(UID)){
                                          
                                          //System.out.println(vits.toString());
                                          record = encHistory.printVitals(encount,pat,hmAgeGroup);
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
                            System.out.println("Patient "+UID+"'s Number of Visits :: "+noOfVisits);
                            
                          
			break;
                        case 3:
                            int counter =0;
                            int cv_count = 0;
                            int lw_count = 0;
                            Vitals abnormalVits = new Vitals();
                            ArrayList<PatientData> abnormalPats = new ArrayList<>();
                            if(encHistory.getEncHistoryArray().size()>0){
                                for(Encounter enc : encHistory.getEncHistoryArray()){
                                           if(!enc.isThisVitalSignNormal("BloodPressure")){
                                               abnormalVits = enc.getVitDet();
                                        for(Community com : city.getCommunities()){
                                            
                                         for(House house : com.getHouse()){
                                            for(Person resi : house.getResidents()){
                                                  if(resi.getUID().equals(abnormalVits.getPatID())){
                                                  PatientData patDets = new PatientData();
                                                  patDets.setFirstName(resi.getFirstName());
                                                  patDets.setLastName(resi.getLastName());
                                                  patDets.setVits(abnormalVits);
                                                  patDets.setHouseID(house.getHouseID());
                                                  patDets.setCommuName(com.getCommuName());
                                                  patDets.setCityName(city.getCityName());
                                                  if(com.getCommuName().equals("CityView Apts")){
                                                  cv_count++;
                                                  }
                                                  else if(com.getCommuName().equals("Longwood Apts")){
                                                          lw_count++;
                                                          }
                                                  abnormalPats.add(patDets);
                                                  } 
                                            }
                                         }
                                        }
                                               counter++;
                                           }
                                }
                            }
                            
                            System.out.println("Total Count of Abnormal Patients : "+counter+" :: in Cityview : "+cv_count+" :: in Longwood : "+lw_count);
                            
//                            for(Community com : city.getCommunities()){
//                                for(House house : com.getHouse()){
//                                    for(Person resi : house.getResidents()){
//                                       Patient pat = patHistory.fetchPatientByUID(resi.getUID());
//                                       if(pat.getEntryDate()!=null){
//                                           if(pat.getEncHistory().getEncHistoryArray().size()>0){
//                                           for(Encounter enc : pat.getEncHistory().getEncHistoryArray()){
//                                           if(!enc.isThisVitalSignNormal("BloodPressure")){
//                                               counter++;
//                                           }
//                                           }   
//                                           }
//                                       }
//                                    }
//                                    
//                                }
//                            }
                            
                            break;
			case 9: System.out.println("Leaving the Paediatrics Ward...");
			System.exit(0);
			default: System.out.println("Incorrect value! Kindly select the right option.");
			}
        }
            else{
                System.out.println("Person does not exist.");
            }
        }catch(Exception e){
           
        }
        }
    }
   
}
