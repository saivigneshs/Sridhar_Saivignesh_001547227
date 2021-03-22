/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class EmployerProfile {
    String name;
    ArrayList<Employment> employments;
    HashMap<String,ArrayList<Course>> hmPrefCourses;

    public void setHmPrefCourses(String jobRole, ArrayList<Course> PrefCourses) {
        hmPrefCourses.put(jobRole, PrefCourses);
    }

    public HashMap<String, ArrayList<Course>> getHmPrefCourses() {
        return hmPrefCourses;
    }
    public EmployerProfile(String n){  //could be company instead of just a name as a string
        name = n;
        employments = new ArrayList<>();
        hmPrefCourses = new HashMap<String,ArrayList<Course>>();
       // hmPrefCourses.put(role, arPrefCourses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
         public boolean isMatch(String id){
        if(name.equals(id)) return true;             //String is an object and can do equal matach
        return false;
    }
            
}
