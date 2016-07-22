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
        universityDao.add(university);
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
        universityDao.remove(id);
    }

    @Override
    public void upload(Long id, University university) {

        University uni = this.getById(id);

        uni.setName(university.getName());
        uni.setAddress(university.getAddress());
        uni.setCareers(university.getCareers());
        uni.setEmail(university.getEmail());
        uni.setLocation(university.getLocation());
        uni.setPhone(university.getPhone());
        uni.setWebpage(university.getWebpage());

        universityDao.add(uni);
    }

}
