package hn.unah.lenguajes1900.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Planes;
import hn.unah.lenguajes1900.demo.services.impl.PlanesServiceImpl;

@RestController
@RequestMapping("/api")
public class PlanesController {
    
    @Autowired
    private PlanesServiceImpl planesServiceImpl;

    @PostMapping("/plan/crear")
    public Planes crearPlan(@RequestBody Planes plan){
        return this.planesServiceImpl.crearPlan(plan);
    }
}
