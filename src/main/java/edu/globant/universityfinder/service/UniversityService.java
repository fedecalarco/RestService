/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.service;

import edu.globant.universityfinder.model.University;
import java.util.List;

/**
 *
 * @author federico.calarco
 */
public interface UniversityService {

    void add(University university);

    List<University> getAll();

    University getById(Long id);

    void remove(Long id);

    void upload(University university);

}
