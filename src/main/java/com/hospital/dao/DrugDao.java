package com.hospital.dao;

import com.hospital.models.Drug;
import com.hospital.models.Patient;

import java.util.List;

/**
 * Created by user on 5/10/2015.
 */
public interface DrugDao {
    public int insertRow(Drug drug );

    public Drug getPatientById(int id);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int id);
}
