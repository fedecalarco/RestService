/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.controller;

import edu.globant.universityfinder.model.University;
import edu.globant.universityfinder.service.UniversityService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author federico.calarco
 */
@RestController
@RequestMapping("/api/universities")
public class UniversityRest {

    @Autowired
    UniversityService universityService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List> getAll() {

        List<University> lstUniversity = universityService.getAll();

        return new ResponseEntity<>(lstUniversity, HttpStatus.OK); //OK or FOUND?
    }

    @RequestMapping(value = "/{universityId}", method = RequestMethod.GET)
    public ResponseEntity<University> getById(@PathVariable Long universityId) {

        University university = universityService.getById(universityId);

        if (university == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(university, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody University university, HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Add University -> " + university.getName());
        universityService.add(university);

        response.addHeader("Location", request.getRequestURL().append("/").append(university.getId()).toString());
    }

    @RequestMapping(value = "/{universityId}", method = RequestMethod.PUT)
    public String update(@PathVariable("universityId") Long id, @RequestBody University university) {
        universityService.upload(id, university);
        return "updated";
    }

    @RequestMapping(value = "/{universityId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("universityId") Long id) {
        universityService.remove(id);
    }

}
