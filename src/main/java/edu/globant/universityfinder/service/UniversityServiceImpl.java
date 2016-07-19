/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.service;

import edu.globant.universityfinder.dao.UniversityDao;
import edu.globant.universityfinder.model.University;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author federico.calarco
 */
@Service
public class UniversityServiceImpl implements UniversityService {
    
    @Autowired
    UniversityDao universityDao;

    @Override
    public void add(University university) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<University> getAll() {
        return universityDao.getAll();
    }

    @Override
    public University getById(Long id) {
        return universityDao.getById(id);
    }

    @Override
    public void remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upload(University university) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
