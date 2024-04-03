package hn.unah.lenguajes1900.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.Planes;

@Repository
public interface PlanesRepository extends CrudRepository<Planes, Long>{
    
}
