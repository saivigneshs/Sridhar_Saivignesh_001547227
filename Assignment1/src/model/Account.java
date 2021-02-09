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
public class Account {

    public String getStBankName() {
        return stBankName;
    }

    public void setStBankName(String stBankName) {
        this.stBankName = stBankName;
    }

    public String getStAccNo() {
        return stAccNo;
    }

    public void setStAccNo(String stAccNo) {
        this.stAccNo = stAccNo;
    }

    public String getStRoutNo() {
        return stRoutNo;
    }

    public void setStRoutNo(String stRoutNo) {
        this.stRoutNo = stRoutNo;
    }

//    public String getStAccType() {
//        return stAccType;
//    }
//
//    public void setStAccType(String stAccType) {
//        this.stAccType = stAccType;
//    }

    public double getDbAccBal() {
        return dbAccBal;
    }

    public void setDbAccBal(double dbAccBal) {
        this.dbAccBal = dbAccBal;
    }
    private String stBankName;
    private String stAccNo;
    private String stRoutNo;
//    private String stAccType;
    private double dbAccBal;
}
