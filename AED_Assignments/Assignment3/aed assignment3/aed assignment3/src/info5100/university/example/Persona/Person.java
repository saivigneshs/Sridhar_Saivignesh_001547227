/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String id;
    public Person (String id, String name){
        
        this.id = id;
        this.name = name;
    }
    public String getPersonId(){
        return id;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
}
