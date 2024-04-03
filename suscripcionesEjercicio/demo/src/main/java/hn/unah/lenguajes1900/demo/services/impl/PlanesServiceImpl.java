package hn.unah.lenguajes1900.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Planes;
import hn.unah.lenguajes1900.demo.repositories.PlanesRepository;
import hn.unah.lenguajes1900.demo.services.PlanesService;

@Service
public class PlanesServiceImpl implements PlanesService {
    
    @Autowired 
    private PlanesRepository planesRepository;

    @Override
    public Planes crearPlan(Planes plan) {
        return this.planesRepository.save(plan);
    }

    
}
