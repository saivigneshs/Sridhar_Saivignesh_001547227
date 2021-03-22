/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseSchedule;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Saivignesh Sridhar
 */
public class University {

    public CollegeDirectory getCd() {
        return cd;
    }

    public void setCd(CollegeDirectory cd) {
        this.cd = cd;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    CollegeDirectory cd;
    ArrayList<CourseSchedule> csList = new ArrayList<CourseSchedule>();
    
    public University(String name) {
        this.name = name;
        cd = new CollegeDirectory(this);
    }
    
    
    public int calcTotalRevenue(){
        int totalVal = 0;
        for(College co : cd.getCollList()){
            for(Department d : co.getDeptDirectory().getDeptList()){
                for(CourseSchedule cs: d.getMastercoursecatalog().values()){
                csList.add(cs);
                }
            }
        }
        for(CourseSchedule cs : csList){
        totalVal += cs.calculateTotalRevenues();
        }
        return totalVal;
    }
    
    
   }
