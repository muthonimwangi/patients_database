package com.hospital.controller;

import com.hospital.models.Drug;
import com.hospital.models.Patient;
import com.hospital.services.DrugService;
import com.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by user on 5/8/2015.
 */
@Controller
public class PatientController {
   @Autowired
    PatientService patientService;

    @Autowired
    DrugService drugService;


    @RequestMapping("/")
    public ModelAndView hello() {

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO HOSPITAL DATABASE");
        model.setViewName("hello");

        return model;
    }
    @RequestMapping("/drugs")
    public ModelAndView patient_drugs()
    {
        ModelAndView model = new ModelAndView();
        List<Patient> patientsList = patientService.getList();
        model.addObject("patientList", patientsList);
        model.setViewName("drugdisplay");

        return model;
    }

   @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                               @RequestParam(value = "lname", required = false) String lname,
                               @RequestParam(value = "dob", required = false) String dob

    ) {
        ModelAndView model = new ModelAndView();


        Patient patient = new Patient();
        patient.setFname(fname);
        patient.setLname(lname);
        patient.setDob(dob);

        patientService.insertRow(patient);


    model.setViewName("hello");
    return model;
    }
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "patient_id", required = false) String patientid,
                            @RequestParam(value = "drug_name", required = false) String drugname
    )
    {
        ModelAndView model = new ModelAndView();

        Drug drug = new Drug();
        drug.setDrugname(drugname);
        drug.setPatientid(patientid);
        drugService.insertRow(drug);

        model.setViewName("drugdisplay");
        return model;
    }

    @RequestMapping("/list")
    public  ModelAndView viewList()


    {
        ModelAndView model = new ModelAndView();
        List<Patient> patientsList = patientService.getList();
        model.addObject("detailsList", patientsList);

        model.setViewName("displaypatient");
        return model;


    }
    @RequestMapping("/display")
    public  ModelAndView viewdisplay()


    {
        ModelAndView model = new ModelAndView();
        List<Drug> drugList = drugService.getList();
        model.addObject("drugdetailsList",drugList );

        model.setViewName("displayform");
        return model;


    }
//    public void list() {
//
//        List<Patient> patientsList = patientService.getList();
//
//        for (Patient patient :patientsList) {
//            System.out.println(patient.getFname() + " " + patient.getLname() + " " + patient.getDob());
//            System.out.println("\n\n**********************************\n\n");
//        }
    }

