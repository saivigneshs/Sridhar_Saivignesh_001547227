/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Saivignesh Sridhar
 */
//Medical record number, Alergy1, Alergy2, Alergy3
public class Medical {

    public String getStMedRecNo() {
        return stMedRecNo;
    }

    public void setStMedRecNo(String stMedRecNo) {
        this.stMedRecNo = stMedRecNo;
    }

    public String getStAllergy1() {
        return stAllergy1;
    }

    public void setStAllergy1(String stAllergy1) {
        this.stAllergy1 = stAllergy1;
    }

    public String getStAllergy2() {
        return stAllergy2;
    }

    public void setStAllergy2(String stAllergy2) {
        this.stAllergy2 = stAllergy2;
    }

    public String getStAllergy3() {
        return stAllergy3;
    }

    public void setStAllergy3(String stAllergy3) {
        this.stAllergy3 = stAllergy3;
    }
    private String stMedRecNo;
    private String stAllergy1;
    private String stAllergy2;
    private String stAllergy3;
}
