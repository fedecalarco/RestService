/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.controller;

import edu.globant.universityfinder.model.University;
import edu.globant.universityfinder.service.UniversityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author federico.calarco
 */
@RestController
@RequestMapping("/university")
public class UniversityRest {
    
    @Autowired
    UniversityService universityService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<University> getAll() {
        
        return universityService.getAll();
    }
    
    @RequestMapping(value = "/{universityId}", method = RequestMethod.GET)
    @ResponseBody
    public University getById(@PathVariable Long universityId) {
        
        return universityService.getById(universityId);
    }
    
    
    
    
}
