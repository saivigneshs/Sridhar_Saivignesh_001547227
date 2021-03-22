/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    public String semester;
    ArrayList<SeatAssignment> seatassignments;
    double semGPA;

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    public void setSeatassignments(ArrayList<SeatAssignment> seatassignments) {
        this.seatassignments = seatassignments;
    }
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        seatassignments.add(sa);
        //sa.assigngrade(4.00);
        //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    
    
   public double calculateGPA(){
        int courseCount = 0;
        semGPA = 0;
        
        for (SeatAssignment sa : seatassignments ) {          
            courseCount++;
           semGPA = semGPA + sa.coursegrade;
            
        }
        
        semGPA = semGPA / courseCount;
       
        //System.out.println("GPA :" + semGPA+" for "+courseCount+" courses");
        return semGPA;
    }
    
}
