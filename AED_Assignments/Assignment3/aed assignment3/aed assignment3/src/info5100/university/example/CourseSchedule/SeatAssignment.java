/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    CourseLoad courseload;
    double coursegrade;
    double facultyGrade;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public void assigngrade(double coursegrade){
       this.coursegrade = coursegrade; 
    }
    
    public void assignFacultyRating(double facultyGrade){
    this.facultyGrade = facultyGrade;
    }
    
    public double getgpa(){
        return coursegrade;
    }
    
}
