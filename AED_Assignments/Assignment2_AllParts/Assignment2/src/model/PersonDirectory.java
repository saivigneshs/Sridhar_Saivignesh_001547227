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
public class PersonDirectory {
    
    public ArrayList<Person> personHistory;
    
    public PersonDirectory(){
        ArrayList<Person> persArray = new ArrayList<Person>();
        this.personHistory = persArray;
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    
    public Person addPerson(String UID, String firstName, String lastName){
        Person person = new Person();
        person.setUID(UID);
        person.setFirstName(firstName);
        person.setLastName(lastName);
//        person.setAge(age);
        personHistory.add(person);
        System.out.println("Person "+person.getUID()+" Registered Successfully!"+" \t Time :: "+new Date(System.currentTimeMillis()) +"\n");
        return person;
    }
}
