/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.AlumniDirectory;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    AlumniDirectory alumdirectory;
    EmployerDirectory employerdirectory;

    public EmployerDirectory getEmployerdirectory() {
        return employerdirectory;
    }

    public void setEmployerdirectory(EmployerDirectory employerdirectory) {
        this.employerdirectory = employerdirectory;
    }
    
    HashMap<String,Integer> jobRanks;
    HashMap<String, CourseSchedule> mastercoursecatalog;

    public HashMap<String, CourseSchedule> getMastercoursecatalog() {
        return mastercoursecatalog;
    }
    HashMap<String, Integer> courseRanks;
    HashMap<String, Integer> studRanks;
    HashMap<String, Integer> faculRanks;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory(this);
        alumdirectory = new AlumniDirectory(this);
        employerdirectory = new EmployerDirectory(this);
        jobRanks = new HashMap<String,Integer>();
        courseRanks = new HashMap<String,Integer>();
        studRanks = new HashMap<String,Integer>();
        faculRanks = new HashMap<String,Integer>();
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }

    public AlumniDirectory getAlumdirectory() {
        return alumdirectory;
    }

    public void setAlumdirectory(AlumniDirectory alumdirectory) {
        this.alumdirectory = alumdirectory;
    }

    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }
   
    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    public void jobRankingByPromo(){
        for(StudentProfile stud : alumdirectory.getAlumlist()){
            for(Employment emp : stud.getEmploymenthistory().getEmployments()){
               System.out.println("ID: "+stud.getPersonDetails().getPersonId()+ "\n Name: " + stud.getPersonDetails().getName()+ " \n CGPA: " + stud.getgpa() +  " \n Job Role: " +emp.getJob() +" \n Promotions: " + emp.getPromotions());
                if(jobRanks.containsKey(emp.getJob())){
                    int totPromo = jobRanks.get(emp.getJob());
                    totPromo += emp.getPromotions();
                    jobRanks.replace(emp.getJob(), totPromo);
                }
                else {
                jobRanks.put(emp.getJob(), emp.getPromotions());
                }
            }
        }
        printJobRankMap(jobRanks);
    }
    
    
    
    
    private void printJobRankMap(HashMap<String, Integer> jobRanks) {
        Map<String, Integer> sortedMap = sortByValue(jobRanks);
        for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Job Role = " + en.getKey()
                    + ", Alumni has " + en.getValue()+" Promotions.");
        }
    }
    
    private Map<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        //To change body of generated methods, choose Tools | Templates.
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer>> list
                = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                    Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }
    
    public int courseRelevance_Dept(){
        int rel_factor = 0;
        for(StudentProfile sp : studentdirectory.getStudentlist()){
        rel_factor += sp.getRelevance_stud();
           // System.out.println(sp.getPersonDetails().getName()+"'s Course Relevance : "+sp.getRelevance_stud());
        }
        return (rel_factor/(studentdirectory.getStudentlist().size() ) )*20;
    }
    
    
    public void displayPopularCourses(){
        ArrayList<Course> totalCourses = new ArrayList<>();
    for(StudentProfile sp : studentdirectory.getStudentlist()){
        totalCourses.addAll(sp.getCourses());
        //System.out.println("Size now : >> "+totalCourses.size());
    }
    int totSize = totalCourses.toArray().length;
    Course[] array = totalCourses.toArray(new Course[totalCourses.size()]);
        courseTally(array, totSize);
        
    }
    
    private void courseTally(Course[] totalCourses, int totSize){
        boolean visited[] = new boolean[totSize];  
        Arrays.fill(visited, false); 
        for (int i = 0; i < totSize; i++) { 
        if (visited[i] == true) 
            continue; 
        
        int count = 1; 
        for (int j = i + 1; j < totSize; j++) { 
            if (totalCourses[i] == totalCourses[j]) { 
                visited[j] = true; 
                count++; 
            } 
        } 
      //  System.out.println(totalCourses[i].getName() + "    " + count);
        courseRanks.put(totalCourses[i].getName(), count);
    }
        Map<String, Integer> sortedMap = sortByValue(courseRanks);
                for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Course Name = \"" + en.getKey()
                    + ", No of Students opted so far = " + en.getValue());
        }
}
    
    public String stud_fac_ratio(){
    return "("+alumdirectory.getAlumlist().size()+"/"+facultydirectory.getTeacherlist().size()+")";
    }
    
    public void topStudents(){
         for(StudentProfile sp : studentdirectory.getStudentlist()){
         studRanks.put(sp.getPersonDetails().getName(),(int)sp.getgpa());
         }
         
         Map<String, Integer> sortedMap = sortByValue(studRanks);
                for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Student Name = " + en.getKey()
                    + ", CGPA Obtained = " + en.getValue());
        }
    }
    
    public void topFaculty(){
         for(FacultyProfile fp : facultydirectory.getTeacherlist()){
         faculRanks.put(fp.getPerson().getName(),(int)fp.calcFacultyRating());
         }
         
         Map<String, Integer> sortedMap = sortByValue(faculRanks);
                for (Map.Entry<String, Integer> en : sortedMap.entrySet()) {
            System.out.println("Faculty Name = " + en.getKey()
                    + ", Rating = " + en.getValue());
        }
    }
}
