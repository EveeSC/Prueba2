package hn.unah.lenguajes1900.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Planes;
import hn.unah.lenguajes1900.demo.entities.TipoStreaming;
import hn.unah.lenguajes1900.demo.repositories.PlanesRepository;
import hn.unah.lenguajes1900.demo.repositories.TipoStreamingRepository;
import hn.unah.lenguajes1900.demo.services.TipoStreamingService;

@Service
public class TipoStreamingServiceImpl implements TipoStreamingService{

    @Autowired
    private TipoStreamingRepository tipoStreamingRepository;
    @Autowired
    private PlanesRepository planesRepository;

    @Override
    public TipoStreaming crearTipoStreaming(TipoStreaming tipoStreaming) {
        TipoStreaming tipoStreaming2 = this.tipoStreamingRepository.save(tipoStreaming);
        if (null!= tipoStreaming.getPlanes()) {
            for (Planes plan: tipoStreaming.getPlanes()) {
                plan.setTipoStreaming(tipoStreaming2);
                this.planesRepository.save(plan);
            }
        }
        return tipoStreaming2;
    }

    @Override
    public List<TipoStreaming> obtenerStreaming() {
        return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
    }
    
}
