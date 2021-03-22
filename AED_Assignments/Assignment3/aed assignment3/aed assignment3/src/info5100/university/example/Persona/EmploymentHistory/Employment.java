/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    ArrayList<CourseOffer> relevantcourseoffers;
    int promotions;
    String quality;

    public ArrayList<CourseOffer> getRelevantcourseoffers() {
        return relevantcourseoffers;
    }

    public void setRelevantcourseoffers(ArrayList<CourseOffer> relevantcourseoffers) {
        this.relevantcourseoffers = relevantcourseoffers;
    }

    public int getPromotions() {
        return promotions;
    }

    public void setPromotions(int promotions) {
        this.promotions = promotions;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    String job;
    Employment nextemplyment;  //next job so they are in a sequence 
    
    EmployerProfile employer;

    public EmployerProfile getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerProfile employer) {
        this.employer = employer;
    }
    
    public Employment(String j){
        
        ArrayList relevantcourseoffers = new ArrayList();
        this.job = j;
        
    }

}
