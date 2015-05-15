package com.hospital.services;

import com.hospital.dao.DrugDao;
import com.hospital.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 5/10/2015.
 */
public interface DrugService {

    public int insertRow(Drug drug );

    public Drug getPatientById(int id);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int id);
}
