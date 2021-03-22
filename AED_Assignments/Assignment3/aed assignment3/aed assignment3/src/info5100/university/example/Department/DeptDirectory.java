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
public class DeptDirectory {
    College college;
    ArrayList<Department> deptList;

    public DeptDirectory(College c){
    this.college = c;
        deptList = new ArrayList<>();
    }
    
    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public ArrayList<Department> getDeptList() {
        return deptList;
    }

    public void setDeptList(ArrayList<Department> deptList) {
        this.deptList = deptList;
    }
    
    
    public Department newDept(String name) {

        Department d = new Department(name);
        deptList.add(d);
        return d;
        
    }
    
    public Department findDept(String name) {

        for (Department d : deptList) {

            if (d.name.equals(name)) {
                return d;
            }
        }
            return null; //not found after going through the whole list
    }
}
