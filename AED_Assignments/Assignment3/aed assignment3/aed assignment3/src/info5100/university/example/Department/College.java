/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

/**
 *
 * @author Saivignesh Sridhar
 */
public class College {
    String name;
    DeptDirectory deptDirectory;

    public DeptDirectory getDeptDirectory() {
        return deptDirectory;
    }

    public void setDeptDirectory(DeptDirectory deptDirectory) {
        this.deptDirectory = deptDirectory;
    }

    public String getName() {
        return name;
    }
    
    public College(String name){
    this.name = name;
    deptDirectory = new DeptDirectory(this);
    }
    
}
