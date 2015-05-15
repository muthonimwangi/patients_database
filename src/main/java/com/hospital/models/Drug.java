package com.hospital.models;

/**
 * Created by user on 5/10/2015.
 */

import javax.persistence.*;

@Entity
@Table(name="drugs")
public class Drug {
    @Id
    @GeneratedValue
    @Column(name = "drugs_id")
    private int id;

    private String drugname;

    private String patientid;

    public int getId() {
        return id;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }
}
