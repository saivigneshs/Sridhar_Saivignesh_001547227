/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.Image;
/**
 *
 * @author Saivignesh Sridhar
 */
//License number, date it was issued, date of expiration, blood type, and a picture.

public class License {

    public String getStLicNo() {
        return stLicNo;
    }

    public void setStLicNo(String stLicNo) {
        this.stLicNo = stLicNo;
    }

    public String getStBloodType() {
        return stBloodType;
    }

    public void setStBloodType(String stBloodType) {
        this.stBloodType = stBloodType;
    }

    public Image getImPhoto() {
        return ImPhoto;
    }

    public void setImPhoto(Image ImPhoto) {
        this.ImPhoto = ImPhoto;
    }
    private String stLicNo;
    private String stIssDate;

    public String getStIssDate() {
        return stIssDate;
    }

    public void setStIssDate(String stIssDate) {
        this.stIssDate = stIssDate;
    }

    public String getStExpDate() {
        return stExpDate;
    }

    public void setStExpDate(String stExpDate) {
        this.stExpDate = stExpDate;
    }
    private String stExpDate;
    private String stBloodType;
    private Image ImPhoto;
}
