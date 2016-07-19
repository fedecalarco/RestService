/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.globant.universityfinder.dao;

import edu.globant.universityfinder.model.University;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author federico.calarco
 */
@Repository
@Transactional
public class UniversityDaoImpl implements UniversityDao {

    // Hardcode persist 
    List<University> universityList = new ArrayList<>();

    public UniversityDaoImpl() {
        
        University u1 = new University(1L, "Universidad Nacional de La Plata", "La Plata", "55 nro 648", "www.unlp.edu.ar", "221451531", "contacto@unlp.edu.ar");
        University u2 = new University(2L, "Universidad Buenos Aires", "Buenos Aires", "caba", "www.uba.edu.ar", "111451531", "contacto@uba.edu.ar");
        
        
        universityList.add(u1);
        universityList.add(u2);
    }
    
    

    @Override
    public void add(University university) {
        universityList.add(university);
    }

    @Override
    public List<University> getAll() {
        return universityList;
    }

    @Override
    public University getById(Long id) {

        // TODO: 
        return universityList.get(id.intValue());
    }

    @Override
    public void remove(Long id) {
        universityList.remove(id.intValue());
    }

    @Override
    public void upload(University university) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
