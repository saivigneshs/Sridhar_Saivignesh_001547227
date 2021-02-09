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
public class Person {

    public String getStFirstName() {
        return stFirstName;
    }

    public void setStFirstName(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public String getStMobNo() {
        return stMobNo;
    }

    public void setStMobNo(String stMobNo) {
        this.stMobNo = stMobNo;
    }

    public String getStDOB() {
        return stDOB;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }

    public int getInAge() {
        return inAge;
    }

    public void setInAge(int inAge) {
        this.inAge = inAge;
    }

    public int getInHeight() {
        return inHeight;
    }

    public void setInHeight(int inHeight) {
        this.inHeight = inHeight;
    }

    public int getInWeight() {
        return inWeight;
    }

    public void setInWeight(int inWeight) {
        this.inWeight = inWeight;
    }

    public String getStSSN() {
        return stSSN;
    }

    public void setStSSN(String stSSN) {
        this.stSSN = stSSN;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
    private String stFirstName;
    private String stLastName;
    private String stMobNo;
    private String stDOB;
    private int inAge;
    private int inHeight;
    private int inWeight;
    private String stSSN;
    private Account checkAccount;
    private Account saveAccount;

    public Account getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(Account checkAccount) {
        this.checkAccount = checkAccount;
    }

    public Account getSaveAccount() {
        return saveAccount;
    }

    public void setSaveAccount(Account saveAccount) {
        this.saveAccount = saveAccount;
    }
    
    //private Account[] account;

//    public Account[] getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account[] account) {
//        this.account = account;
//    }
    private Address address;
    private License license;
    private Medical medical;
}
