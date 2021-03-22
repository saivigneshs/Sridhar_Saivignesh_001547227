/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import java.util.ArrayList;

/**
 *
 * @author Saivignesh Sridhar
 */
public class CollegeDirectory {
        University university;
        ArrayList<College> collList;

    public ArrayList<College> getCollList() {
        return collList;
    }

    public void setCollList(ArrayList<College> collList) {
        this.collList = collList;
    }
        
        public CollegeDirectory(University u){
        this.university = u;
        collList = new ArrayList<>();
        }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    
    public College newCollege(String name) {

        College coll = new College(name);
        collList.add(coll);
        return coll;
    }

    public College findColl(String name) {

        for (College c : collList) {

            if (c.name.equals(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
        
}
