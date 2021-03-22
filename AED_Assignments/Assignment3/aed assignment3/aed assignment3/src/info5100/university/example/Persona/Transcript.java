/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {
    
    
    HashMap<String, CourseLoad> courseloadlist;

    public HashMap<String, CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }

    public void setCourseloadlist(HashMap<String, CourseLoad> courseloadlist) {
        this.courseloadlist = courseloadlist;
    }
    
    CourseLoad currentcourseload;
    CourseLoad courseload;

    public CourseLoad getCourseload() {
        return courseload;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }
    double CGPA ;
    
    public Transcript(){
        
        courseloadlist = new HashMap<String, CourseLoad>();
        
    }
    
    public CourseLoad newCourseLoad(String sem){
        
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }
    
    public CourseLoad getCurrentCourseLoad(){
        
        return currentcourseload;
        
    }
        public CourseLoad getCourseLoadBySemester(String semester){
        
        return courseloadlist.get(semester);
        
    }
        
        
    public void printcourseload(){
        System.out.println("Hi");
        for (Map.Entry me : courseloadlist.entrySet()) {
            System.out.println("Hi");
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
    }
    
    
    public double calculateGPA(){
        int semCount = courseloadlist.size();
        CGPA = 0;
        courseloadlist.forEach((sem,cload)-> { CGPA = CGPA + cload.calculateGPA();} );
        //System.out.println("No of Semesters >> "+courseloadlist.size());
        CGPA = CGPA/semCount;
        //System.out.println("Semester CGPA >> "+CGPA);
        
        return CGPA;
    }
    
    public int calcTotalCredits(){
        int total= 0;
        for(CourseLoad cload : courseloadlist.values()){
           for(SeatAssignment sa :  cload.getSeatassignments()){
               if(sa.getSeat().isOccupied()){
           total += sa.getSeat().calcCredits();
               }
               }
        }
        return total;
    }
}
