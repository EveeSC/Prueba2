package hn.unah.lenguajes1900.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.TipoStreaming;
import hn.unah.lenguajes1900.demo.services.impl.TipoStreamingServiceImpl;

@RestController
@RequestMapping("/api")
public class TipoStreamingController {
    
    @Autowired
    private TipoStreamingServiceImpl tipoStreamingServiceImpl;

    @PostMapping("/streaming/crear")
    public TipoStreaming crearTipoStreaming(@RequestBody TipoStreaming tipoStreaming){
        return this.tipoStreamingServiceImpl.crearTipoStreaming(tipoStreaming);
    }

    @GetMapping("/streaming/obtener/todos")
    public List<TipoStreaming> obteneStreaming(){
        return  this.tipoStreamingServiceImpl.obtenerStreaming();
    }
    
}
