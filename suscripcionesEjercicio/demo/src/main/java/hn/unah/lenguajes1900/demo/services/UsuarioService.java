package hn.unah.lenguajes1900.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.demo.entities.Usuario;

public interface UsuarioService {

    public Usuario crearUsuario(Usuario usuario);

    public List<Usuario> obtenerUsuarios();

    public Optional<Usuario> buscarPorId(long id);

    public Usuario actualizarUsuario(long id, Usuario usuario);

    public String eliminarPorId(long id);
}