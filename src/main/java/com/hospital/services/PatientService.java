package com.hospital.services;

import com.hospital.models.Patient;

import java.util.List;

/**
 * Created by user on 5/8/2015.
 */
public interface PatientService {
    public int insertRow(Patient patient );

    public Patient getPatientById(int id);

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int id);
}
