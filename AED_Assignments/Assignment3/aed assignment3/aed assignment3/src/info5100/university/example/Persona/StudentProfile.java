/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistory;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistory employmenthistory;
    ArrayList<Course> courses = new ArrayList<Course>();
    public Person getPersonDetails(){
        return person;
    }
    
    public EmploymentHistory getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistory employmenthistory) {
        this.employmenthistory = employmenthistory;
    }
    

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistory();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
    public double getgpa(){
        double GPA = transcript.calculateGPA();
        return GPA;
    }
    
    public boolean isProgramComplete(){
        boolean isComplete = false;
        if(transcript.calcTotalCredits() >=16 ){
        isComplete = false;
            System.out.println("Student is now an Alumni.");
        }
        return isComplete;
    }
    
    public ArrayList<Course> getCourses(){
   
        for(CourseLoad c1oad : transcript.getCourseloadlist().values()){
            for(SeatAssignment sa : c1oad.getSeatassignments()){
               
                CourseOffer co = sa.getSeat().getCourseoffer();
                courses.add(co.getCourse());               
                }
        }
        return courses;
    }
    
    public int getRelevance_stud(){      
        courses = getCourses();
        ArrayList<Course> coPreferred = new ArrayList<>();
        int count=0;
        try{
    for(Employment emp : employmenthistory.getEmployments()){
        EmployerProfile empProf =  emp.getEmployer();
        coPreferred = empProf.getHmPrefCourses().get(emp.getJob());
    if(coPreferred!=null){
        for(Course cs : courses){
        if(coPreferred.contains(cs)){
        count++;
        }
    }
    }
    }
       } catch(Exception e){System.out.println("----");}
        System.out.println("No of Relevant Courses "+person.getName()+" has : "+count);
        return count;
    }
    
}
