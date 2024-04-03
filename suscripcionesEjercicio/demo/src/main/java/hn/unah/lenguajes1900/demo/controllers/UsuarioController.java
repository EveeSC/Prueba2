package hn.unah.lenguajes1900.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Usuario;
import hn.unah.lenguajes1900.demo.services.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuario/guardar")
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return this.usuarioServiceImpl.crearUsuario(usuario);
    }

    @GetMapping("/usuario/obtener")
    public List<Usuario> obtenerUsuarios(){
        return this.usuarioServiceImpl.obtenerUsuarios();
    }

    @PutMapping("/usuario/actualizar/{id}")
    public Usuario actualizarUsuario(@PathVariable long id, @RequestBody Usuario usuario){
        return this.usuarioServiceImpl.actualizarUsuario(id, usuario);
    }

    @GetMapping("usuario/buscar-para-eliminar")
    public Optional<Usuario> buscarParaEliminar(@RequestParam long id){
        return this.usuarioServiceImpl.buscarPorId(id);
    }

    @DeleteMapping("usuario/eliminar")
    public String eliminarUsuario(@RequestParam long id){
        return this.usuarioServiceImpl.eliminarPorId(id);
    }

    
}
