package com.patients.models;
import javax.persistence.*;

/**
 * Created by user on 5/6/2015.
 */
@Entity
@Table(name = "patients")
public class patientsdb {

    @GeneratedValue

    private int patientid;


    private String fname;

    private String lname;

    private String dob;

    public int getId() {
        return patientid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
