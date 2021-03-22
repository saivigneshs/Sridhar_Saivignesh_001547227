/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.College;
import info5100.university.example.Department.CollegeDirectory;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DeptDirectory;
import info5100.university.example.Department.University;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.AlumniDirectory;
import info5100.university.example.Persona.EmploymentHistory.Employment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        University uni = new University("Northeastern");
        
        CollegeDirectory cd = uni.getCd();
        College coe = cd.newCollege("College of Engineering");
        College cps = cd.newCollege("College of Professional Studies");
        
        
        DeptDirectory dd = coe.getDeptDirectory();

        Department coe_is = dd.newDept("Information Systems");
        Department coe_dae = dd.newDept("Data Analytics and Engineering");
        
        
        System.out.println("-------- INFORMATION SYSTEMS ----------");
        System.out.println("---------------------------------------");
        
        Course course =  coe_is.newCourse("App Engg & Dev", "info 5100", 4);
        Course course1 = coe_is.newCourse("Data Science", "info 6100", 3);
        Course course2 = coe_is.newCourse("PSA", "info 6200", 3);
        Course course3 = coe_is.newCourse("Web Design", "info 6105", 4);
        Course course4 = coe_is.newCourse("Web Tools", "info 6205", 4);
        Course course5 = coe_is.newCourse("Cloud Computing", "info 6120", 4);
        Course course6 = coe_is.newCourse("Database Management", "info 6215", 4);
        Course course7 = coe_is.newCourse("UI/UX", "info 6320", 4);
        Course course8 = coe_is.newCourse("OOPS", "info 6225", 4);
        Course course9 = coe_is.newCourse("Advanced Database Management", "info 6310", 4);
        Course course10 =coe_is.newCourse("Multithreading", "info 6325", 4);
        Course course11 =coe_is.newCourse("Big Data Systems", "info 7310", 4);
        Course course12 =coe_is.newCourse("Data warehousing", "info 7325", 4);

        CourseSchedule cs_Fall19 =      coe_is.newCourseSchedule("Fall2019");
        CourseSchedule cs_Spring20 =    coe_is.newCourseSchedule("Spring2020");
        CourseSchedule cs_Fall20 =      coe_is.newCourseSchedule("Fall2020");
        CourseSchedule cs_Spring21 =    coe_is.newCourseSchedule("Spring2021");

        CourseOffer co_5100 = cs_Fall20.newCourseOffer("info 5100");
        CourseOffer co_6200 = cs_Fall20.newCourseOffer("info 6200");
        CourseOffer co_6100 = cs_Fall20.newCourseOffer("info 6100");
        CourseOffer co_6105 = cs_Spring21.newCourseOffer("info 6105");
        CourseOffer co_6205 = cs_Spring21.newCourseOffer("info 6205");
        
        CourseOffer co_6120 = cs_Fall20.newCourseOffer("info 6120");
        CourseOffer co_6215 = cs_Fall20.newCourseOffer("info 6215");
        CourseOffer co_6320 = cs_Fall20.newCourseOffer("info 6320");
        CourseOffer co_6225 = cs_Spring21.newCourseOffer("info 6225");
        CourseOffer co_6310 = cs_Spring21.newCourseOffer("info 6310");
        
        CourseOffer co_6325 = cs_Fall20.newCourseOffer("info 6325");
        CourseOffer co_7310 = cs_Spring21.newCourseOffer("info 7310");
        CourseOffer co_7325 = cs_Spring21.newCourseOffer("info 7325");
        
        CourseOffer co_5100_1 = cs_Spring20.newCourseOffer("info 5100");
        CourseOffer co_6200_1 = cs_Spring20.newCourseOffer("info 6200");
        CourseOffer co_6100_1 = cs_Fall19.newCourseOffer("info 6100");
        CourseOffer co_6105_1 = cs_Fall19.newCourseOffer("info 6105");
        CourseOffer co_6205_1 = cs_Fall19.newCourseOffer("info 6205");
        
        
        
        co_5100.generatSeats(10);
        co_6200.generatSeats(10);
        co_6100.generatSeats(10);
        co_6105.generatSeats(50);
        co_6205.generatSeats(20);
        co_6120.generatSeats(20);
        co_6215.generatSeats(20);
        co_6320.generatSeats(30);
        co_6225.generatSeats(30);
        co_6310.generatSeats(15);
        co_6325.generatSeats(15);
        co_7310.generatSeats(20);
        co_7325.generatSeats(25);
        co_5100_1.generatSeats(20);
        co_6200_1.generatSeats(20);
        co_6100_1.generatSeats(20);
        co_6105_1.generatSeats(20);
        co_6205_1.generatSeats(20);
        
        PersonDirectory pd = coe_is.getPersonDirectory();
        Person person = pd.newPerson("1001","Argentina");
        Person person1 = pd.newPerson("1002","Brazil");
        Person person2 = pd.newPerson("1003","Cuba");
        Person person3 = pd.newPerson("1004","Denmark");
        Person person4 = pd.newPerson("1005","Egypt");
        Person person5 = pd.newPerson("1006","Finland");
        Person person6 = pd.newPerson("1007","France");
        Person person7 = pd.newPerson("1008","Germany");
        Person person8 = pd.newPerson("1009","Italy");
        Person person9 = pd.newPerson("1010","Canada");
        Person person10 = pd.newPerson("1011","India");
        Person person11 = pd.newPerson("1012","Poland");

        StudentDirectory sd = coe_is.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student1 = sd.newStudentProfile(person1);
        StudentProfile student2 = sd.newStudentProfile(person2);
        StudentProfile student3 = sd.newStudentProfile(person3);
        StudentProfile student4 = sd.newStudentProfile(person4);
        StudentProfile student5 = sd.newStudentProfile(person5);
        StudentProfile student6 = sd.newStudentProfile(person6);
        StudentProfile student7 = sd.newStudentProfile(person7);
        StudentProfile student8 = sd.newStudentProfile(person8);
        StudentProfile student9 = sd.newStudentProfile(person9);
        StudentProfile student10 = sd.newStudentProfile(person10);
        StudentProfile student11 = sd.newStudentProfile(person11);

 
        CourseLoad cl_fall19 = student.newCourseLoad("Fall2019");
        CourseLoad stud1_cl_fall19 = student1.newCourseLoad("Fall2019");
        CourseLoad stud2_cl_fall19 = student2.newCourseLoad("Fall2019");
        CourseLoad stud3_cl_fall19 = student3.newCourseLoad("Fall2019");
        CourseLoad stud4_cl_fall19 = student4.newCourseLoad("Fall2019");
        CourseLoad stud5_cl_fall19 = student5.newCourseLoad("Fall2019");
        CourseLoad stud6_cl_fall19 = student6.newCourseLoad("Fall2019");
        CourseLoad stud7_cl_fall19 = student7.newCourseLoad("Fall2019");
        CourseLoad stud8_cl_fall19 = student8.newCourseLoad("Fall2019");
        CourseLoad stud9_cl_fall19 = student9.newCourseLoad("Fall2019");
        CourseLoad stud10_cl_fall19 = student10.newCourseLoad("Fall2019");
        CourseLoad stud11_cl_fall19 = student11.newCourseLoad("Fall2019");
        
        
         CourseLoad cl_spring20 = student.newCourseLoad("Spring2020");
        CourseLoad stud1_cl_spring20 = student1.newCourseLoad("Spring2020");
        CourseLoad stud2_cl_spring20 = student2.newCourseLoad("Spring2020");
        CourseLoad stud3_cl_spring20 = student3.newCourseLoad("Spring2020");
        CourseLoad stud4_cl_spring20 = student4.newCourseLoad("Spring2020");
        CourseLoad stud5_cl_spring20 = student5.newCourseLoad("Spring2020");
        CourseLoad stud6_cl_spring20 = student6.newCourseLoad("Spring2020");
        CourseLoad stud7_cl_spring20 = student7.newCourseLoad("Spring2020");
        CourseLoad stud8_cl_spring20 = student8.newCourseLoad("Spring2020");
        CourseLoad stud9_cl_spring20 = student9.newCourseLoad("Spring2020");
        CourseLoad stud10_cl_spring20 = student10.newCourseLoad("Spring2020");
        CourseLoad stud11_cl_spring20 = student11.newCourseLoad("Spring2020");


        // StudentProfile student1 = sd.newStudentProfile(person1);
        CourseLoad cl_fall20 = student.newCourseLoad("Fall2020");
        CourseLoad stud1_cl_fall20 = student1.newCourseLoad("Fall2020");
        CourseLoad stud2_cl_fall20 = student2.newCourseLoad("Fall2020");
        CourseLoad stud3_cl_fall20 = student3.newCourseLoad("Fall2020");
        CourseLoad stud4_cl_fall20 = student4.newCourseLoad("Fall2020");
        CourseLoad stud5_cl_fall20 = student5.newCourseLoad("Fall2020");
        CourseLoad stud6_cl_fall20 = student6.newCourseLoad("Fall2020");
        CourseLoad stud7_cl_fall20 = student7.newCourseLoad("Fall2020");
        CourseLoad stud8_cl_fall20 = student8.newCourseLoad("Fall2020");
        CourseLoad stud9_cl_fall20 = student9.newCourseLoad("Fall2020");
        CourseLoad stud10_cl_fall20 = student10.newCourseLoad("Fall2020");
        CourseLoad stud11_cl_fall20 = student11.newCourseLoad("Fall2020");

        CourseLoad cl_spring21 = student.newCourseLoad("Spring2021");
        CourseLoad stud2_cl_spring21 = student2.newCourseLoad("Spring2021");
        CourseLoad stud3_cl_spring21 = student3.newCourseLoad("Spring2021");
        CourseLoad stud4_cl_spring21 = student4.newCourseLoad("Spring2021");
        CourseLoad stud5_cl_spring21 = student5.newCourseLoad("Spring2021");
        CourseLoad stud6_cl_spring21 = student6.newCourseLoad("Spring2021");
        CourseLoad stud7_cl_spring21 = student7.newCourseLoad("Spring2021");
        CourseLoad stud8_cl_spring21 = student8.newCourseLoad("Spring2021");
        CourseLoad stud9_cl_spring21 = student9.newCourseLoad("Spring2021");
        CourseLoad stud10_cl_spring21 = student10.newCourseLoad("Spring2021");
        CourseLoad stud11_cl_spring21 = student11.newCourseLoad("Spring2021");
        CourseLoad stud1_cl_Spring21 = student1.newCourseLoad("Spring2021");
        
////    Student one seat assignment    

        SeatAssignment sa = cl_fall19.newSeatAssignment(co_5100);
        sa.assigngrade(4.00);
        sa.assignFacultyRating(3.5);
        SeatAssignment sa_1 = cl_spring20.newSeatAssignment(co_6105);
        sa_1.assigngrade(2.00);
        sa_1.assignFacultyRating(2.0);
        SeatAssignment sa_2 = cl_fall20.newSeatAssignment(co_6215);
        sa_2.assigngrade(2.00);
        sa_2.assignFacultyRating(4.5);
        SeatAssignment sa_3 = cl_spring21.newSeatAssignment(co_6325);
        sa_3.assigngrade(3.67);
        sa_3.assignFacultyRating(4.0);
      
        
        //    Student two seat assignment    

        SeatAssignment sa4 = stud1_cl_fall19.newSeatAssignment(co_5100);
        sa4.assigngrade(1.00);
        sa4.assignFacultyRating(5);
        SeatAssignment sa_5 = stud1_cl_spring20.newSeatAssignment(co_6105);
        sa_5.assigngrade(1.67);
        sa_5.assignFacultyRating(4.0);
        SeatAssignment sa_6 = stud1_cl_fall20.newSeatAssignment(co_6215);
        sa_6.assigngrade(2.00);
        sa_6.assignFacultyRating(4.5);
        SeatAssignment sa_7 = stud1_cl_Spring21.newSeatAssignment(co_6325);
        sa_7.assigngrade(3.67);
        sa_7.assignFacultyRating(4.5);
        
        
          //    Student third seat assignment    

        SeatAssignment sa8 = stud2_cl_fall19.newSeatAssignment(co_5100);
        sa8.assigngrade(4.00);
        sa8.assignFacultyRating(4);
        SeatAssignment sa_9 = stud2_cl_spring20.newSeatAssignment(co_6200);
        sa_9.assigngrade(2.33);
        sa_9.assignFacultyRating(4.0);
        SeatAssignment sa_10 = stud2_cl_fall20.newSeatAssignment(co_6205);
        sa_10.assigngrade(1.00);
        sa_10.assignFacultyRating(4.5);
        SeatAssignment sa_11 = stud2_cl_spring21.newSeatAssignment(co_6320);
        sa_11.assigngrade(1.00);
        sa_11.assignFacultyRating(4.5);
        
           //    Student four seat assignment    

        SeatAssignment sa_12 = stud3_cl_fall19.newSeatAssignment(co_5100);
        sa_12.assigngrade(2.00);
        sa_12.assignFacultyRating(4);
        SeatAssignment sa_13 = stud3_cl_spring20.newSeatAssignment(co_6200);
        sa_13.assigngrade(3.33);
        sa_13.assignFacultyRating(4.0);
        SeatAssignment sa_14 = stud3_cl_fall20.newSeatAssignment(co_6205);
        sa_14.assigngrade(2.00);
        sa_14.assignFacultyRating(4.5);
        SeatAssignment sa_15 = stud3_cl_spring21.newSeatAssignment(co_6320);
        sa_15.assigngrade(2.00);
        sa_15.assignFacultyRating(4.5);
        
            //    Student five seat assignment    

        SeatAssignment sa_16 = stud4_cl_fall19.newSeatAssignment(co_5100);
        sa_16.assigngrade(4.00);
        sa_16.assignFacultyRating(4);
        SeatAssignment sa_17 = stud4_cl_spring20.newSeatAssignment(co_6105);
        sa_17.assigngrade(1.33);
        sa_17.assignFacultyRating(4.0);
        SeatAssignment sa_18 = stud4_cl_fall20.newSeatAssignment(co_6325);
        sa_18.assigngrade(4.00);
        sa_18.assignFacultyRating(4.5);
        SeatAssignment sa_19 = stud4_cl_spring21.newSeatAssignment(co_7310);
        sa_19.assigngrade(4.00);
        sa_19.assignFacultyRating(4.5);
        
            //    Student Six seat assignment    

        SeatAssignment sa_20 = stud5_cl_fall19.newSeatAssignment(co_5100);
        sa_20.assigngrade(3.00);
        sa_20.assignFacultyRating(4);
        SeatAssignment sa_21 = stud5_cl_spring20.newSeatAssignment(co_6215);
        sa_21.assigngrade(3.33);
        sa_21.assignFacultyRating(4.0);
        SeatAssignment sa_22 = stud5_cl_fall20.newSeatAssignment(co_6310);
        sa_22.assigngrade(1.00);
        sa_22.assignFacultyRating(4.5);
        SeatAssignment sa_23 = stud5_cl_spring21.newSeatAssignment(co_7310);
        sa_23.assigngrade(4.00);
        sa_23.assignFacultyRating(4.5);
        
            //    Student Seven seat assignment    

        SeatAssignment sa_24 = stud6_cl_fall19.newSeatAssignment(co_5100);
        sa_24.assigngrade(2.00);
        sa_24.assignFacultyRating(4);
        SeatAssignment sa_25 = stud6_cl_spring20.newSeatAssignment(co_6215);
        sa_25.assigngrade(3.33);
        sa_25.assignFacultyRating(4.0);
        SeatAssignment sa_26 = stud6_cl_fall20.newSeatAssignment(co_6310);
        sa_26.assigngrade(4.00);
        sa_26.assignFacultyRating(4.5);
        SeatAssignment sa_27 = stud6_cl_spring21.newSeatAssignment(co_7310);
        sa_27.assigngrade(2.00);
        sa_27.assignFacultyRating(4.5);
        
             //    Student eight seat assignment    

        SeatAssignment sa_28 = stud7_cl_fall19.newSeatAssignment(co_5100);
        sa_28.assigngrade(4.00);
        sa_28.assignFacultyRating(4);
        SeatAssignment sa_29 = stud7_cl_spring20.newSeatAssignment(co_6100);
        sa_29.assigngrade(3.33);
        sa_29.assignFacultyRating(4.0);
        SeatAssignment sa_30 = stud7_cl_fall20.newSeatAssignment(co_6225);
        sa_30.assigngrade(4.00);
        sa_30.assignFacultyRating(4.5);
        SeatAssignment sa_31 = stud7_cl_spring21.newSeatAssignment(co_7325);
        sa_31.assigngrade(4.00);
        sa_31.assignFacultyRating(4.5);
        
              //    Student nine seat assignment    

        SeatAssignment sa_32 = stud8_cl_fall19.newSeatAssignment(co_6105);
        sa_32.assigngrade(4.00);
        sa_32.assignFacultyRating(4);
        SeatAssignment sa_33 = stud8_cl_spring20.newSeatAssignment(co_6215);
        sa_33.assigngrade(3.33);
        sa_33.assignFacultyRating(4.0);
        SeatAssignment sa_34 = stud8_cl_fall20.newSeatAssignment(co_7310);
        sa_34.assigngrade(4.00);
        sa_34.assignFacultyRating(4.5);
        SeatAssignment sa_35 = stud8_cl_spring21.newSeatAssignment(co_7325);
        sa_35.assigngrade(4.00);
        sa_35.assignFacultyRating(4.5);
        
        
              //    Student Ten seat assignment    

        SeatAssignment sa_36 = stud9_cl_fall19.newSeatAssignment(co_6120);
        sa_36.assigngrade(4.00);
        sa_36.assignFacultyRating(4);
        SeatAssignment sa_37 = stud9_cl_spring20.newSeatAssignment(co_6100);
        sa_37.assigngrade(4.00);
        sa_37.assignFacultyRating(4.0);
        SeatAssignment sa_38 = stud9_cl_fall20.newSeatAssignment(co_7310);
        sa_38.assigngrade(4.00);
        sa_38.assignFacultyRating(4.5);
        SeatAssignment sa_39 = stud9_cl_spring21.newSeatAssignment(co_6310);
        sa_39.assigngrade(4.00);
        sa_39.assignFacultyRating(4.5);
        
              //    Student Eleven seat assignment    

        SeatAssignment sa_40 = stud10_cl_fall19.newSeatAssignment(co_6120);
        sa_40.assigngrade(4.00);
        sa_40.assignFacultyRating(4);
        SeatAssignment sa_41 = stud10_cl_spring20.newSeatAssignment(co_6100);
        sa_41.assigngrade(3.33);
        sa_41.assignFacultyRating(4.0);
        SeatAssignment sa_42 = stud10_cl_fall20.newSeatAssignment(co_7310);
        sa_42.assigngrade(4.00);
        sa_42.assignFacultyRating(4.5);
        SeatAssignment sa_43 = stud10_cl_spring21.newSeatAssignment(co_6310);
        sa_43.assigngrade(4.00);
        sa_43.assignFacultyRating(4.5);
        
               //    Student Twelve seat assignment    

        SeatAssignment sa_44 = stud11_cl_fall19.newSeatAssignment(co_6120);
        sa_44.assigngrade(2.00);
        sa_44.assignFacultyRating(2);
        SeatAssignment sa_45 = stud11_cl_spring20.newSeatAssignment(co_6100);
        sa_45.assigngrade(2.33);
        sa_45.assignFacultyRating(2);
        SeatAssignment sa_46 = stud11_cl_fall20.newSeatAssignment(co_7310);
        sa_46.assigngrade(2.00);
        sa_46.assignFacultyRating(2);
        SeatAssignment sa_47 = stud11_cl_spring21.newSeatAssignment(co_6310);
        sa_47.assigngrade(2.00);
        sa_47.assignFacultyRating(2);
        
   
        
        SeatAssignment sa_48 = stud2_cl_fall19.newSeatAssignment(co_5100_1);
        sa_48.assigngrade(4.00);
        sa_48.assignFacultyRating(4);
        SeatAssignment sa_49 = stud2_cl_spring20.newSeatAssignment(co_6200_1);
        sa_49.assigngrade(2.33);
        sa_49.assignFacultyRating(4.0);
        SeatAssignment sa_50 = stud2_cl_fall20.newSeatAssignment(co_6205_1);
        sa_50.assigngrade(1.00);
        sa_50.assignFacultyRating(4.5);
        SeatAssignment sa_51 = stud2_cl_spring21.newSeatAssignment(co_6320);
        sa_51.assigngrade(1.00);
        sa_51.assignFacultyRating(4.5);
        
  

//  Adding Student as Alumni
        AlumniDirectory ad = coe_is.getAlumdirectory();
        ad.newAlum(student);
        ad.newAlum(student1);
        ad.newAlum(student2);
        ad.newAlum(student3);
        ad.newAlum(student4);
        ad.newAlum(student5);
        ad.newAlum(student6);
        ad.newAlum(student7);
        ad.newAlum(student8);
        ad.newAlum(student9);
        ad.newAlum(student10);
        
        
    
 //     Employer
        EmployerDirectory ed = coe_is.getEmployerdirectory();
        
        ArrayList<Course> prefCourses_1 = new ArrayList<>();
        ArrayList<Course> prefCourses_2 = new ArrayList<>();
        ArrayList<Course> prefCourses_3 = new ArrayList<>();
        
        prefCourses_1.add(co_5100.getCourse());
        prefCourses_1.add(co_6100.getCourse());
        prefCourses_1.add(co_6205.getCourse());
        prefCourses_1.add(co_6310.getCourse());
        
        prefCourses_2.add(co_6100.getCourse());
        prefCourses_2.add(co_6320.getCourse());
        prefCourses_2.add(co_6105.getCourse());
        prefCourses_2.add(co_6325.getCourse());
        
        prefCourses_3.add(co_5100.getCourse());
        prefCourses_3.add(co_6225.getCourse());
        prefCourses_3.add(co_6205.getCourse());
        prefCourses_3.add(co_6100.getCourse());
        prefCourses_3.add(co_6120.getCourse());
        
        EmployerProfile ep = ed.newEmployerProfile("Apple Inc.");
        ep.setHmPrefCourses("SDE",prefCourses_1);
        ep.setHmPrefCourses("Senior SDE",prefCourses_1);
        ep.setHmPrefCourses("WebDev",prefCourses_3);
        ep.setHmPrefCourses("Senior WebDev",prefCourses_3);
        ep.setHmPrefCourses("Manager", prefCourses_2);
        ep.setHmPrefCourses("Business Analyst",prefCourses_3);
        
        EmployerProfile ep1 = ed.newEmployerProfile("Facebook");
        ep1.setHmPrefCourses("SDE",prefCourses_1);
        ep1.setHmPrefCourses("WebDev",prefCourses_1);
        ep1.setHmPrefCourses("Manager", prefCourses_2);
        ep1.setHmPrefCourses("Data Analyst",prefCourses_3);
        
       
        EmployerProfile ep2 = ed.newEmployerProfile("Qualcomm");
        ep2.setHmPrefCourses("SDE",prefCourses_1);
        ep2.setHmPrefCourses("WebDev",prefCourses_1);
        ep2.setHmPrefCourses("Data Analyst",prefCourses_3);
        ep2.setHmPrefCourses("Technical Manager",prefCourses_2);
        ep2.setHmPrefCourses("Senior Technical Manager",prefCourses_2);
        ep2.setHmPrefCourses("Technical Manager",prefCourses_1);
        ep2.setHmPrefCourses("Project Manager",prefCourses_2);
        ep2.setHmPrefCourses("Business Analyst",prefCourses_3);
        
        
        
        EmployerProfile ep4 = ed.newEmployerProfile("Amazon");
        ep4.setHmPrefCourses("SDE",prefCourses_1);
        ep4.setHmPrefCourses("WebDev",prefCourses_1);
        ep4.setHmPrefCourses("Technical Solution Manager", prefCourses_2);
        ep4.setHmPrefCourses("Project Manager", prefCourses_2);
        ep4.setHmPrefCourses("Data Engineer",prefCourses_3);
        ep4.setHmPrefCourses("Data Analyst",prefCourses_3);
        ep4.setHmPrefCourses("Business Analyst",prefCourses_3);
        
        EmployerProfile ep5 = ed.newEmployerProfile("Dell Inc");
        ep5.setHmPrefCourses("SDE",prefCourses_1);
        ep5.setHmPrefCourses("WebDev",prefCourses_3);
        ep5.setHmPrefCourses("Project Manager", prefCourses_2);
        ep5.setHmPrefCourses("Data Scientist",prefCourses_3);
        ep5.setHmPrefCourses("Data Engineer",prefCourses_3);
        
        //student employement history
        
        Employment emp_stud = student.getEmploymenthistory().newEmployment("SDE");
        emp_stud.setPromotions(1);
        emp_stud.setEmployer(ep);
        Employment emp2_stud = student.getEmploymenthistory().newEmployment("Senior SDE");
        emp2_stud.setPromotions(2);
        emp2_stud.setEmployer(ep2);  
        
        Employment emp_stud1 = student1.getEmploymenthistory().newEmployment("Manager");
        emp_stud1.setPromotions(3);
        emp2_stud.setEmployer(ep2);
//        System.out.println("Student: "+student.getEmploymenthistory().getEmployments().size());
        
        Employment emp_stud2 = student2.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud2.setPromotions(1);
        emp_stud2.setEmployer(ep4);
        
        Employment emp2_stud2 = student2.getEmploymenthistory().newEmployment("Data Analyst");
        emp2_stud2.setPromotions(2);
        emp2_stud2.setEmployer(ep4);  
        
        Employment emp3_stud2 = student2.getEmploymenthistory().newEmployment("Technical Solution Manager");
        emp3_stud2.setPromotions(3);
        emp3_stud2.setEmployer(ep4);
        
        
        Employment emp_stud3 = student3.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud3.setPromotions(1);
        emp_stud3.setEmployer(ep4);
        
        Employment emp2_stud3 = student3.getEmploymenthistory().newEmployment("Data Analyst");
        emp2_stud3.setPromotions(2);
        emp2_stud3.setEmployer(ep4);  
        
        
        Employment emp_stud4 = student4.getEmploymenthistory().newEmployment("SDE");
        emp_stud4.setPromotions(1);
        emp_stud4.setEmployer(ep);
        
        Employment emp2_stud4 = student4.getEmploymenthistory().newEmployment("Senior SDE");
        emp2_stud4.setPromotions(2);
        emp2_stud4.setEmployer(ep);  
        
      
        Employment emp_stud5 = student4.getEmploymenthistory().newEmployment("Data Scientist");
        emp_stud5.setPromotions(1);
        emp_stud5.setEmployer(ep5);
        
      
        
        Employment emp_stud6 = student5.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud6.setPromotions(1);
        emp_stud6.setEmployer(ep1);
        
        Employment emp2_stud6 = student5.getEmploymenthistory().newEmployment("Techincal Manager");
        emp2_stud6.setPromotions(2);
        emp2_stud6.setEmployer(ep2); 
        
        
        Employment emp_stud7 = student6.getEmploymenthistory().newEmployment("SDE");
        emp_stud7.setPromotions(1);
        emp_stud7.setEmployer(ep5);
        
        Employment emp2_stud7 = student6.getEmploymenthistory().newEmployment("Project Manager");
        emp2_stud7.setPromotions(2);
        emp2_stud7.setEmployer(ep5); 
      
        
   
      //  System.out.println("Student employement history : "+student.getEmploymenthistory().getEmployments().size());
       // System.out.println(student2.getCourseLoadBySemester("Fall2020").getSeatassignments());
                      
// Faculty Rating       
        FacultyDirectory fd = coe_is.getFacultydirectory();
        Person fac1 = new Person("9101","Prof. Simon");
        Person fac2 = new Person("9002","Prof. Bugrara");
        Person fac3 = new Person("9003","Prof. Liu");
        Person fac4 = new Person("9004","Prof. Vishal Chawla");
        Person fac5 = new Person("9005","Prof. Amudhan");
        Person fac6 = new Person("9006","Dino");
        Person fac7 = new Person("9007","Robin");
        Person fac8 = new Person("9008","Jessica");
        Person fac9 = new Person("9009","Wuping Wang");
        Person fac10 = new Person("9010","Tracy");
        FacultyProfile fp_1 = fd.newFacultyProfile(fac1,3);
        FacultyProfile fp_2 = fd.newFacultyProfile(fac2,1);
        FacultyProfile fp_3 = fd.newFacultyProfile(fac3,5);
        FacultyProfile fp_4 = fd.newFacultyProfile(fac4,4);
        FacultyProfile fp_5 = fd.newFacultyProfile(fac5,1);
        
        fp_1.AssignAsTeacher(co_6105);
        fp_2.AssignAsTeacher(co_5100);
        fp_3.AssignAsTeacher(co_6100);
        fp_4.AssignAsTeacher(co_6310);
        fp_5.AssignAsTeacher(co_6325);
        

       // System.out.println(student.getRelevance_stud());
        
        
        int total_Fall2019 = coe_is.calculateRevenuesBySemester("Fall2019");
        System.out.println("Total revenue for Fall 2019: " + total_Fall2019 + " dollars");
        
        int total_Spring2020 = coe_is.calculateRevenuesBySemester("Spring2020");
        System.out.println("Total revenue for Spring 2020: " + total_Spring2020 + " dollars");
        
        int total_Fall2020 = coe_is.calculateRevenuesBySemester("Fall2020");
        System.out.println("Total revenue for Fall 2020: " + total_Fall2020 + " dollars");
        
        int total_Spring2021 = coe_is.calculateRevenuesBySemester("Spring2021");
        System.out.println("Total revenue for Spring 2021: " + total_Spring2021 + " dollars");
       
       
        

        System.out.println(" \n -------------------------JOBS WITH HIGHEST PROMOTIONS----------------------------------");
        coe_is.jobRankingByPromo();
        System.out.println(" \n -------------------------POPULAR COURSES----------------------------------");
        coe_is.displayPopularCourses();
        System.out.println(" \n -------------------------TOP STUDENTS----------------------------------");
        coe_is.topStudents();
          System.out.println(" \n -------------------------TOP FACULTY----------------------------------");
        coe_is.topFaculty();
        System.out.println("Course Relevance Factor (Based on Job Requirements) >> : "+coe_is.courseRelevance_Dept());
        System.out.println("Student to Faculty Ratio >> :"+ coe_is.stud_fac_ratio());
        
        
        
        // CPS -----------
        System.out.println("\n \n \n \n ");
        
        System.out.println("-------- DATA ANALYTICS & ENGINEERING ----------");
        System.out.println("------------------------------------------------");
        
         course =  coe_dae.newCourse("App Engg & Dev", "info 5100", 4);
         course1 = coe_dae.newCourse("Data Science", "info 6100", 3);
         course2 = coe_dae.newCourse("PSA", "info 6200", 3);
         course3 = coe_dae.newCourse("Web Design", "info 6105", 4);
         course4 = coe_dae.newCourse("Web Tools", "info 6205", 4);
         course5 = coe_dae.newCourse("Cloud Computing", "info 6120", 4);
         course6 = coe_dae.newCourse("Database Management", "info 6215", 4);
         course7 = coe_dae.newCourse("UI/UX", "info 6320", 4);
         course8 = coe_dae.newCourse("OOPS", "info 6225", 4);
         course9 = coe_dae.newCourse("Advanced Database Management", "info 6310", 4);
         course10 =coe_dae.newCourse("Multithreading", "info 6325", 4);
         course11 =coe_dae.newCourse("Big Data Systems", "info 7310", 4);
         course12 =coe_dae.newCourse("Data warehousing", "info 7325", 4);

         cs_Fall19 =      coe_dae.newCourseSchedule("Fall2019");
         cs_Spring20 =    coe_dae.newCourseSchedule("Spring2020");
         cs_Fall20 =      coe_dae.newCourseSchedule("Fall2020");
         cs_Spring21 =    coe_dae.newCourseSchedule("Spring2021");

         co_5100 = cs_Fall20.newCourseOffer("info 5100");
         co_6200 = cs_Fall20.newCourseOffer("info 6200");
         co_6100 = cs_Fall20.newCourseOffer("info 6100");
         co_6105 = cs_Spring21.newCourseOffer("info 6105");
         co_6205 = cs_Spring21.newCourseOffer("info 6205");
        
         co_6120 = cs_Fall20.newCourseOffer("info 6120");
         co_6215 = cs_Fall20.newCourseOffer("info 6215");
         co_6320 = cs_Fall20.newCourseOffer("info 6320");
         co_6225 = cs_Spring21.newCourseOffer("info 6225");
         co_6310 = cs_Spring21.newCourseOffer("info 6310");
        
         co_6325 = cs_Fall20.newCourseOffer("info 6325");
         co_7310 = cs_Spring21.newCourseOffer("info 7310");
         co_7325 = cs_Spring21.newCourseOffer("info 7325");
        
        co_5100_1 = cs_Spring20.newCourseOffer("info 5100");
        co_6200_1 = cs_Spring20.newCourseOffer("info 6200");
        co_6100_1 = cs_Fall19.newCourseOffer("info 6100");
        co_6105_1 = cs_Fall19.newCourseOffer("info 6105");
        co_6205_1 = cs_Fall19.newCourseOffer("info 6205");

        co_5100.generatSeats(10);
        co_6200.generatSeats(10);
        co_6100.generatSeats(10);
        co_6105.generatSeats(50);
        co_6205.generatSeats(20);
        co_6120.generatSeats(20);
        co_6215.generatSeats(20);
        co_6320.generatSeats(30);
        co_6225.generatSeats(30);
        co_6310.generatSeats(15);
        co_6325.generatSeats(15);
        co_7310.generatSeats(20);
        co_7325.generatSeats(25);
        
        co_5100_1.generatSeats(10);
        co_6200_1.generatSeats(10);
        co_6100_1.generatSeats(10);
        co_6105_1.generatSeats(50);
        co_6205_1.generatSeats(20);

         pd = coe_dae.getPersonDirectory();
         person = pd.newPerson("1001","Argentina");
         person1 = pd.newPerson("1002","Brazil");
         person2 = pd.newPerson("1003","Cuba");
         person3 = pd.newPerson("1004","Denmark");
         person4 = pd.newPerson("1005","Egypt");
         person5 = pd.newPerson("1006","Finland");
         person6 = pd.newPerson("1007","France");
         person7 = pd.newPerson("1008","Germany");
         person8 = pd.newPerson("1009","Italy");
         person9 = pd.newPerson("1010","Canada");
         person10 = pd.newPerson("1011","India");
         person11 = pd.newPerson("1012","Poland");

         sd = coe_dae.getStudentDirectory();
         student = sd.newStudentProfile(person);
         student1 = sd.newStudentProfile(person1);
         student2 = sd.newStudentProfile(person2);
         student3 = sd.newStudentProfile(person3);
         student4 = sd.newStudentProfile(person4);
         student5 = sd.newStudentProfile(person5);
         student6 = sd.newStudentProfile(person6);
         student7 = sd.newStudentProfile(person7);
         student8 = sd.newStudentProfile(person8);
         student9 = sd.newStudentProfile(person9);
         student10 = sd.newStudentProfile(person10);
         student11 = sd.newStudentProfile(person11);

 
         cl_fall19 = student.newCourseLoad("Fall2019");
         stud1_cl_fall19 = student1.newCourseLoad("Fall2019");
         stud2_cl_fall19 = student2.newCourseLoad("Fall2019");
         stud3_cl_fall19 = student3.newCourseLoad("Fall2019");
         stud4_cl_fall19 = student4.newCourseLoad("Fall2019");
         stud5_cl_fall19 = student5.newCourseLoad("Fall2019");
         stud6_cl_fall19 = student6.newCourseLoad("Fall2019");
         stud7_cl_fall19 = student7.newCourseLoad("Fall2019");
         stud8_cl_fall19 = student8.newCourseLoad("Fall2019");
         stud9_cl_fall19 = student9.newCourseLoad("Fall2019");
         stud10_cl_fall19 = student10.newCourseLoad("Fall2019");
         stud11_cl_fall19 = student11.newCourseLoad("Fall2019");
        
        
          cl_spring20 = student.newCourseLoad("Spring2020");
         stud1_cl_spring20 = student1.newCourseLoad("Spring2020");
         stud2_cl_spring20 = student2.newCourseLoad("Spring2020");
         stud3_cl_spring20 = student3.newCourseLoad("Spring2020");
         stud4_cl_spring20 = student4.newCourseLoad("Spring2020");
         stud5_cl_spring20 = student5.newCourseLoad("Spring2020");
         stud6_cl_spring20 = student6.newCourseLoad("Spring2020");
         stud7_cl_spring20 = student7.newCourseLoad("Spring2020");
         stud8_cl_spring20 = student8.newCourseLoad("Spring2020");
         stud9_cl_spring20 = student9.newCourseLoad("Spring2020");
         stud10_cl_spring20 = student10.newCourseLoad("Spring2020");
         stud11_cl_spring20 = student11.newCourseLoad("Spring2020");


        // StudentProfile student1 = sd.newStudentProfile(person1);
         cl_fall20 = student.newCourseLoad("Fall2020");
         stud1_cl_fall20 = student1.newCourseLoad("Fall2020");
         stud2_cl_fall20 = student2.newCourseLoad("Fall2020");
         stud3_cl_fall20 = student3.newCourseLoad("Fall2020");
         stud4_cl_fall20 = student4.newCourseLoad("Fall2020");
         stud5_cl_fall20 = student5.newCourseLoad("Fall2020");
         stud6_cl_fall20 = student6.newCourseLoad("Fall2020");
         stud7_cl_fall20 = student7.newCourseLoad("Fall2020");
         stud8_cl_fall20 = student8.newCourseLoad("Fall2020");
         stud9_cl_fall20 = student9.newCourseLoad("Fall2020");
         stud10_cl_fall20 = student10.newCourseLoad("Fall2020");
         stud11_cl_fall20 = student11.newCourseLoad("Fall2020");

         cl_spring21 = student.newCourseLoad("Spring2021");
         stud2_cl_spring21 = student2.newCourseLoad("Spring2021");
         stud3_cl_spring21 = student3.newCourseLoad("Spring2021");
         stud4_cl_spring21 = student4.newCourseLoad("Spring2021");
         stud5_cl_spring21 = student5.newCourseLoad("Spring2021");
         stud6_cl_spring21 = student6.newCourseLoad("Spring2021");
         stud7_cl_spring21 = student7.newCourseLoad("Spring2021");
         stud8_cl_spring21 = student8.newCourseLoad("Spring2021");
         stud9_cl_spring21 = student9.newCourseLoad("Spring2021");
         stud10_cl_spring21 = student10.newCourseLoad("Spring2021");
         stud11_cl_spring21 = student11.newCourseLoad("Spring2021");
         stud1_cl_Spring21 = student1.newCourseLoad("Spring2021");
        
////    Student one seat assignment    

         sa = cl_fall19.newSeatAssignment(co_5100);
        sa.assigngrade(4.00);
        sa.assignFacultyRating(3.5);
         sa_1 = cl_spring20.newSeatAssignment(co_6105);
        sa_1.assigngrade(2.00);
        sa_1.assignFacultyRating(2.0);
         sa_2 = cl_fall20.newSeatAssignment(co_6215);
        sa_2.assigngrade(2.00);
        sa_2.assignFacultyRating(4.5);
         sa_3 = cl_spring21.newSeatAssignment(co_6325);
        sa_3.assigngrade(3.67);
        sa_3.assignFacultyRating(4.0);
      
        //    Student two seat assignment    

         sa4 = stud1_cl_fall19.newSeatAssignment(co_5100);
        sa4.assigngrade(1.00);
        sa4.assignFacultyRating(5);
         sa_5 = stud1_cl_spring20.newSeatAssignment(co_6105);
        sa_5.assigngrade(1.67);
        sa_5.assignFacultyRating(4.0);
         sa_6 = stud1_cl_fall20.newSeatAssignment(co_6215);
        sa_6.assigngrade(2.00);
        sa_6.assignFacultyRating(4.5);
         sa_7 = stud1_cl_Spring21.newSeatAssignment(co_6325);
        sa_7.assigngrade(3.67);
        sa_7.assignFacultyRating(4.5);
        
        
          //    Student third seat assignment    

         sa8 = stud2_cl_fall19.newSeatAssignment(co_5100);
        sa8.assigngrade(4.00);
        sa8.assignFacultyRating(4);
         sa_9 = stud2_cl_spring20.newSeatAssignment(co_6200);
        sa_9.assigngrade(2.33);
        sa_9.assignFacultyRating(4.0);
         sa_10 = stud2_cl_fall20.newSeatAssignment(co_6205);
        sa_10.assigngrade(1.00);
        sa_10.assignFacultyRating(4.5);
         sa_11 = stud2_cl_spring21.newSeatAssignment(co_6320);
        sa_11.assigngrade(1.00);
        sa_11.assignFacultyRating(4.5);
        
           //    Student four seat assignment    

         sa_12 = stud3_cl_fall19.newSeatAssignment(co_5100);
        sa_12.assigngrade(2.00);
        sa_12.assignFacultyRating(4);
         sa_13 = stud3_cl_spring20.newSeatAssignment(co_6200);
        sa_13.assigngrade(3.33);
        sa_13.assignFacultyRating(4.0);
         sa_14 = stud3_cl_fall20.newSeatAssignment(co_6205);
        sa_14.assigngrade(2.00);
        sa_14.assignFacultyRating(4.5);
         sa_15 = stud3_cl_spring21.newSeatAssignment(co_6320);
        sa_15.assigngrade(2.00);
        sa_15.assignFacultyRating(4.5);
        
            //    Student five seat assignment    

         sa_16 = stud4_cl_fall19.newSeatAssignment(co_5100);
        sa_16.assigngrade(4.00);
        sa_16.assignFacultyRating(4);
         sa_17 = stud4_cl_spring20.newSeatAssignment(co_6105);
        sa_17.assigngrade(1.33);
        sa_17.assignFacultyRating(4.0);
         sa_18 = stud4_cl_fall20.newSeatAssignment(co_6325);
        sa_18.assigngrade(4.00);
        sa_18.assignFacultyRating(4.5);
         sa_19 = stud4_cl_spring21.newSeatAssignment(co_7310);
        sa_19.assigngrade(4.00);
        sa_19.assignFacultyRating(4.5);
        
            //    Student Six seat assignment    

         sa_20 = stud5_cl_fall19.newSeatAssignment(co_5100);
        sa_20.assigngrade(3.00);
        sa_20.assignFacultyRating(4);
         sa_21 = stud5_cl_spring20.newSeatAssignment(co_6215);
        sa_21.assigngrade(3.33);
        sa_21.assignFacultyRating(4.0);
         sa_22 = stud5_cl_fall20.newSeatAssignment(co_6310);
        sa_22.assigngrade(1.00);
        sa_22.assignFacultyRating(4.5);
         sa_23 = stud5_cl_spring21.newSeatAssignment(co_7310);
        sa_23.assigngrade(4.00);
        sa_23.assignFacultyRating(4.5);
        
            //    Student Seven seat assignment    

         sa_24 = stud6_cl_fall19.newSeatAssignment(co_5100);
        sa_24.assigngrade(2.00);
        sa_24.assignFacultyRating(4);
         sa_25 = stud6_cl_spring20.newSeatAssignment(co_6215);
        sa_25.assigngrade(3.33);
        sa_25.assignFacultyRating(4.0);
         sa_26 = stud6_cl_fall20.newSeatAssignment(co_6310);
        sa_26.assigngrade(4.00);
        sa_26.assignFacultyRating(4.5);
         sa_27 = stud6_cl_spring21.newSeatAssignment(co_7310);
        sa_27.assigngrade(2.00);
        sa_27.assignFacultyRating(4.5);
        
             //    Student eight seat assignment    

         sa_28 = stud7_cl_fall19.newSeatAssignment(co_5100);
        sa_28.assigngrade(4.00);
        sa_28.assignFacultyRating(4);
         sa_29 = stud7_cl_spring20.newSeatAssignment(co_6100);
        sa_29.assigngrade(3.33);
        sa_29.assignFacultyRating(4.0);
         sa_30 = stud7_cl_fall20.newSeatAssignment(co_6225);
        sa_30.assigngrade(4.00);
        sa_30.assignFacultyRating(4.5);
         sa_31 = stud7_cl_spring21.newSeatAssignment(co_7325);
        sa_31.assigngrade(4.00);
        sa_31.assignFacultyRating(4.5);
        
              //    Student nine seat assignment    

         sa_32 = stud8_cl_fall19.newSeatAssignment(co_6105);
        sa_32.assigngrade(4.00);
        sa_32.assignFacultyRating(4);
         sa_33 = stud8_cl_spring20.newSeatAssignment(co_6215);
        sa_33.assigngrade(3.33);
        sa_33.assignFacultyRating(4.0);
         sa_34 = stud8_cl_fall20.newSeatAssignment(co_7310);
        sa_34.assigngrade(4.00);
        sa_34.assignFacultyRating(4.5);
         sa_35 = stud8_cl_spring21.newSeatAssignment(co_7325);
        sa_35.assigngrade(4.00);
        sa_35.assignFacultyRating(4.5);
        
        
              //    Student Ten seat assignment    

         sa_36 = stud9_cl_fall19.newSeatAssignment(co_6120);
        sa_36.assigngrade(4.00);
        sa_36.assignFacultyRating(4);
         sa_37 = stud9_cl_spring20.newSeatAssignment(co_6100);
        sa_37.assigngrade(4.00);
        sa_37.assignFacultyRating(4.0);
         sa_38 = stud9_cl_fall20.newSeatAssignment(co_7310);
        sa_38.assigngrade(4.00);
        sa_38.assignFacultyRating(4.5);
         sa_39 = stud9_cl_spring21.newSeatAssignment(co_6310);
        sa_39.assigngrade(4.00);
        sa_39.assignFacultyRating(4.5);
        
              //    Student Eleven seat assignment    

         sa_40 = stud10_cl_fall19.newSeatAssignment(co_6120);
        sa_40.assigngrade(4.00);
        sa_40.assignFacultyRating(4);
         sa_41 = stud10_cl_spring20.newSeatAssignment(co_6100);
        sa_41.assigngrade(3.33);
        sa_41.assignFacultyRating(4.0);
         sa_42 = stud10_cl_fall20.newSeatAssignment(co_7310);
        sa_42.assigngrade(4.00);
        sa_42.assignFacultyRating(4.5);
         sa_43 = stud10_cl_spring21.newSeatAssignment(co_6310);
        sa_43.assigngrade(4.00);
        sa_43.assignFacultyRating(4.5);
        
               //    Student Twelve seat assignment    

         sa_44 = stud11_cl_fall19.newSeatAssignment(co_6120);
        sa_44.assigngrade(2.00);
        sa_44.assignFacultyRating(2);
         sa_45 = stud11_cl_spring20.newSeatAssignment(co_6100);
        sa_45.assigngrade(2.33);
        sa_45.assignFacultyRating(2);
         sa_46 = stud11_cl_fall20.newSeatAssignment(co_7310);
        sa_46.assigngrade(2.00);
        sa_46.assignFacultyRating(2);
         sa_47 = stud11_cl_spring21.newSeatAssignment(co_6310);
        sa_47.assigngrade(2.00);
        sa_47.assignFacultyRating(2);
        
        
        
        sa_48 = stud2_cl_fall19.newSeatAssignment(co_5100_1);
        sa_48.assigngrade(4.00);
        sa_48.assignFacultyRating(4);
        sa_49 = stud2_cl_spring20.newSeatAssignment(co_6200_1);
        sa_49.assigngrade(2.33);
        sa_49.assignFacultyRating(4.0);
        sa_50 = stud2_cl_fall20.newSeatAssignment(co_6205_1);
        sa_50.assigngrade(1.00);
        sa_50.assignFacultyRating(4.5);
        sa_51 = stud2_cl_spring21.newSeatAssignment(co_6320);
        sa_51.assigngrade(1.00);
        sa_51.assignFacultyRating(4.5);
        
        SeatAssignment sa_52 = stud11_cl_fall19.newSeatAssignment(co_5100_1);
        sa_52.assigngrade(2.00);
        sa_52.assignFacultyRating(2);
        SeatAssignment  sa_53 = stud11_cl_spring20.newSeatAssignment(co_6200_1);
        sa_53.assigngrade(2.33);
        sa_53.assignFacultyRating(2);
        SeatAssignment  sa_54 = stud11_cl_fall20.newSeatAssignment(co_6205_1);
        sa_54.assigngrade(2.00);
        sa_54.assignFacultyRating(2);
        SeatAssignment  sa_55 = stud11_cl_spring21.newSeatAssignment(co_6320);
        sa_55.assigngrade(2.00);
        sa_55.assignFacultyRating(2);
        
  

//  Adding Student as Alumni
         ad = coe_dae.getAlumdirectory();
        ad.newAlum(student);
        ad.newAlum(student1);
        ad.newAlum(student2);
        ad.newAlum(student3);
        ad.newAlum(student4);
        ad.newAlum(student5);
        ad.newAlum(student6);
        ad.newAlum(student7);
        ad.newAlum(student8);
        ad.newAlum(student9);
        ad.newAlum(student10);
        
        
    
 //     Employer
         ed = coe_dae.getEmployerdirectory();
        
        prefCourses_1 = new ArrayList<>();
        prefCourses_2 = new ArrayList<>();
        prefCourses_3 = new ArrayList<>();
        
        prefCourses_1.add(co_5100.getCourse());
        prefCourses_1.add(co_6100.getCourse());
        prefCourses_1.add(co_6205.getCourse());
        prefCourses_1.add(co_6310.getCourse());
        
        prefCourses_2.add(co_6100.getCourse());
        prefCourses_2.add(co_6320.getCourse());
        prefCourses_2.add(co_6105.getCourse());
        prefCourses_2.add(co_6325.getCourse());
        
        prefCourses_3.add(co_5100.getCourse());
        prefCourses_3.add(co_6225.getCourse());
        prefCourses_3.add(co_6205.getCourse());
        prefCourses_3.add(co_6100.getCourse());
        prefCourses_3.add(co_6120.getCourse());
        
         ep = ed.newEmployerProfile("Apple Inc.");
        ep.setHmPrefCourses("SDE",prefCourses_1);
        ep.setHmPrefCourses("Senior SDE",prefCourses_1);
        ep.setHmPrefCourses("WebDev",prefCourses_3);
        ep.setHmPrefCourses("Senior WebDev",prefCourses_3);
        ep.setHmPrefCourses("Manager", prefCourses_2);
        ep.setHmPrefCourses("Business Analyst",prefCourses_3);
        
         ep1 = ed.newEmployerProfile("Facebook");
        ep1.setHmPrefCourses("SDE",prefCourses_1);
        ep1.setHmPrefCourses("WebDev",prefCourses_1);
        ep1.setHmPrefCourses("Manager", prefCourses_2);
        ep1.setHmPrefCourses("Data Analyst",prefCourses_3);
        
       
         ep2 = ed.newEmployerProfile("Qualcomm");
        ep2.setHmPrefCourses("SDE",prefCourses_1);
        ep2.setHmPrefCourses("WebDev",prefCourses_1);
        ep2.setHmPrefCourses("Data Analyst",prefCourses_3);
        ep2.setHmPrefCourses("Technical Manager",prefCourses_2);
        ep2.setHmPrefCourses("Senior Technical Manager",prefCourses_2);
        ep2.setHmPrefCourses("Technical Manager",prefCourses_1);
        ep2.setHmPrefCourses("Project Manager",prefCourses_2);
        ep2.setHmPrefCourses("Business Analyst",prefCourses_3);
        
        
        
         ep4 = ed.newEmployerProfile("Amazon");
        ep4.setHmPrefCourses("SDE",prefCourses_1);
        ep4.setHmPrefCourses("WebDev",prefCourses_1);
        ep4.setHmPrefCourses("Technical Solution Manager", prefCourses_2);
        ep4.setHmPrefCourses("Project Manager", prefCourses_2);
        ep4.setHmPrefCourses("Data Engineer",prefCourses_3);
        ep4.setHmPrefCourses("Data Analyst",prefCourses_3);
        ep4.setHmPrefCourses("Business Analyst",prefCourses_3);
        
         ep5 = ed.newEmployerProfile("Dell Inc");
        ep5.setHmPrefCourses("SDE",prefCourses_1);
        ep5.setHmPrefCourses("WebDev",prefCourses_3);
        ep5.setHmPrefCourses("Project Manager", prefCourses_2);
        ep5.setHmPrefCourses("Data Scientist",prefCourses_3);
        ep5.setHmPrefCourses("Data Engineer",prefCourses_3);
        
        //student employement history
        
         emp_stud = student.getEmploymenthistory().newEmployment("SDE");
        emp_stud.setPromotions(1);
        emp_stud.setEmployer(ep);
         emp2_stud = student.getEmploymenthistory().newEmployment("Senior SDE");
        emp2_stud.setPromotions(2);
        emp2_stud.setEmployer(ep2);  
        
         emp_stud1 = student1.getEmploymenthistory().newEmployment("Manager");
        emp_stud1.setPromotions(3);
        emp2_stud.setEmployer(ep2);
//        System.out.println("Student: "+student.getEmploymenthistory().getEmployments().size());
        
         emp_stud2 = student2.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud2.setPromotions(1);
        emp_stud2.setEmployer(ep4);
        
         emp2_stud2 = student2.getEmploymenthistory().newEmployment("Data Analyst");
        emp2_stud2.setPromotions(2);
        emp2_stud2.setEmployer(ep4);  
        
         emp3_stud2 = student2.getEmploymenthistory().newEmployment("Technical Solution Manager");
        emp3_stud2.setPromotions(3);
        emp3_stud2.setEmployer(ep4);
        
        
         emp_stud3 = student3.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud3.setPromotions(1);
        emp_stud3.setEmployer(ep4);
        
         emp2_stud3 = student3.getEmploymenthistory().newEmployment("Data Analyst");
        emp2_stud3.setPromotions(2);
        emp2_stud3.setEmployer(ep4);  
        
        
         emp_stud4 = student4.getEmploymenthistory().newEmployment("SDE");
        emp_stud4.setPromotions(1);
        emp_stud4.setEmployer(ep);
        
         emp2_stud4 = student4.getEmploymenthistory().newEmployment("Senior SDE");
        emp2_stud4.setPromotions(2);
        emp2_stud4.setEmployer(ep);  
        
      
         emp_stud5 = student4.getEmploymenthistory().newEmployment("Data Scientist");
        emp_stud5.setPromotions(1);
        emp_stud5.setEmployer(ep5);
        
      
        
         emp_stud6 = student5.getEmploymenthistory().newEmployment("Data Engineer");
        emp_stud6.setPromotions(1);
        emp_stud6.setEmployer(ep1);
        
         emp2_stud6 = student5.getEmploymenthistory().newEmployment("Techincal Manager");
        emp2_stud6.setPromotions(2);
        emp2_stud6.setEmployer(ep2); 
        
        
         emp_stud7 = student6.getEmploymenthistory().newEmployment("SDE");
        emp_stud7.setPromotions(1);
        emp_stud7.setEmployer(ep5);
        
         emp2_stud7 = student6.getEmploymenthistory().newEmployment("Project Manager");
        emp2_stud7.setPromotions(2);
        emp2_stud7.setEmployer(ep5); 
      
        
   
      //  System.out.println("Student employement history : "+student.getEmploymenthistory().getEmployments().size());
       // System.out.println(student2.getCourseLoadBySemester("Fall2020").getSeatassignments());
                      
// Faculty Rating       
         fd = coe_dae.getFacultydirectory();
         fac1 = new Person("9101","Prof. Simon");
         fac2 = new Person("9002","Prof. Bugrara");
         fac3 = new Person("9003","Prof. Liu");
         fac4 = new Person("9004","Prof. Vishal Chawla");
         fac5 = new Person("9005","Prof. Amudhan");
         fac6 = new Person("9006","Dino");
         fac7 = new Person("9007","Robin");
         fac8 = new Person("9008","Jessica");
         fac9 = new Person("9009","Wuping Wang");
         fac10 = new Person("9010","Tracy");
         fp_1 = fd.newFacultyProfile(fac1,3);
         fp_2 = fd.newFacultyProfile(fac2,1);
         fp_3 = fd.newFacultyProfile(fac3,5);
         fp_4 = fd.newFacultyProfile(fac4,4);
         fp_5 = fd.newFacultyProfile(fac5,1);
        
        fp_1.AssignAsTeacher(co_6105);
        fp_2.AssignAsTeacher(co_5100);
        fp_3.AssignAsTeacher(co_6100);
        fp_4.AssignAsTeacher(co_6310);
        fp_5.AssignAsTeacher(co_6325);
        
        
       // System.out.println(student.getRelevance_stud());
        
        
         total_Fall2019 = coe_dae.calculateRevenuesBySemester("Fall2019");
        System.out.println("Total revenue for Fall 2019: " + total_Fall2019 + " dollars");
        
         total_Spring2020 = coe_dae.calculateRevenuesBySemester("Spring2020");
        System.out.println("Total revenue for Spring 2020: " + total_Spring2020 + " dollars");
        
        

        int total = coe_dae.calculateRevenuesBySemester("Fall2020");
        System.out.println("Total revenue for Fall 2020 : " + total + " dollars");
        
        total_Spring2021 = coe_dae.calculateRevenuesBySemester("Spring2021");
        System.out.println("Total revenue for Spring 2021: " + total_Spring2021 + " dollars");
        
       
        

        System.out.println(" \n -------------------------JOBS WITH HIGHEST PROMOTIONS----------------------------------");
        coe_dae.jobRankingByPromo();
        System.out.println(" \n -------------------------POPULAR COURSES----------------------------------");
        coe_dae.displayPopularCourses();
        System.out.println(" \n -------------------------TOP STUDENTS----------------------------------");
        coe_dae.topStudents();
          System.out.println(" \n -------------------------TOP FACULTY----------------------------------");
        coe_dae.topFaculty();
        System.out.println("Course Relevance Factor (based on Job Requirements)>> : "+coe_dae.courseRelevance_Dept()+" %");
        System.out.println("Student to Faculty Ratio >> :"+ coe_dae.stud_fac_ratio());
    
        System.out.println("Total Revenue to "+uni.getName()+" : "+uni.calcTotalRevenue()+" USD");
        
    }

}
