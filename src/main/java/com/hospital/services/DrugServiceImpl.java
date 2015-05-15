package com.hospital.services;

import com.hospital.dao.DrugDao;
import com.hospital.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 5/10/2015.
 */
public class DrugServiceImpl implements DrugService{
    @Autowired
    DrugDao drugDao;
    @Override
    public int insertRow(Drug drug) {

        return drugDao.insertRow(drug);
    }

    @Override
    public Drug getPatientById(int id) {
        return drugDao.getPatientById( id);
    }

    @Override
    public List<Drug> getList() {
        return drugDao.getList();
    }

    @Override
    public int updateRow(Drug drug) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
