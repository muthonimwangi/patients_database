package com.hospital.services;

import com.hospital.dao.PatientDao;
import com.hospital.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 5/8/2015.
 */
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;

    @Override
    public int insertRow(Patient patient) {
        return patientDao.insertRow(patient);


    }

    @Override
    public Patient getPatientById(int id) {
        return patientDao.getPatientById( id);
    }

    @Override
    public List<Patient> getList() {
        return patientDao.getList();
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
