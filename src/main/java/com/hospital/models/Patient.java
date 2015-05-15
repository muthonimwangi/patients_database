package com.hospital.models;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by user on 5/8/2015.
 */
@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue
    @Column(name = "patientid")
    private int id;

    @Column(name = "fname")
    private String fname;

    private String lname;

    private String dob;

    private String timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
