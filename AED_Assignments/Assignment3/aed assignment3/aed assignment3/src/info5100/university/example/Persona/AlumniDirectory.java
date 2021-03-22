/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AlumniDirectory {
       Department department;
    ArrayList<StudentProfile> alumlist;

    public ArrayList<StudentProfile> getAlumlist() {
        return alumlist;
    }

    public void setAlumlist(ArrayList<StudentProfile> alumlist) {
        this.alumlist = alumlist;
    }
        
    public AlumniDirectory(Department d) {

        department = d;
        alumlist = new ArrayList();

    }

    public StudentProfile newAlum(StudentProfile sp) {
        alumlist.add(sp);
        return sp;
    }

    
   }
      

