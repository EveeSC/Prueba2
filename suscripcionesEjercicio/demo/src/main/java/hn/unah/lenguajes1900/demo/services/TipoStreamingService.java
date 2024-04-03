package hn.unah.lenguajes1900.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.demo.entities.TipoStreaming;

public interface TipoStreamingService {
    
    public TipoStreaming crearTipoStreaming(TipoStreaming tipoStreaming);

    public List<TipoStreaming> obtenerStreaming();
}
