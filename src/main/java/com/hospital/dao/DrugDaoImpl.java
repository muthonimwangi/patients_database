package com.hospital.dao;

import com.hospital.models.Drug;
import com.hospital.models.Patient;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by user on 5/10/2015.
 */
public class DrugDaoImpl implements DrugDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int insertRow(Drug drug) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;


    }

    @Override
    public Drug getPatientById(int id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Drug.class);
        criteria.add(Restrictions.eq("id", id));
        Drug drug = (Drug) criteria.uniqueResult();
        session.close();
        return drug;

    }

    @Override
    public List<Drug> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drug> drugList = session.createQuery("from Drug").list();
        session.close();
        return drugList;
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
