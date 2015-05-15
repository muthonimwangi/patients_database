package com.hospital.controller;

import com.hospital.models.Drug;
import com.hospital.models.Patient;
import com.hospital.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by user on 5/10/2015.
 */

@Controller
public class DrugController {
    /*@Autowired
    DrugService drugService;

   *//* @RequestMapping("/")
    public ModelAndView hello() {

        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO HOSPITAL DATABASE");
        model.setViewName("drug");

        return model;
    }
*//*
    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "drugname", required = false) String drugname)
    {
        ModelAndView model = new ModelAndView();


        Drug drug = new Drug();
        drug.setDrugname(drugname);

        drugService.insertRow(drug);


        model.setViewName("drug");
        return model;
    }

    @RequestMapping("/list")

    public void list() {

        List<Drug> drugList = drugService.getList();

        for (Drug drug : drugList) {
            System.out.println(drug.getDrugname());
            System.out.println("\n\n**********************************\n\n");
        }
    }*/
}
