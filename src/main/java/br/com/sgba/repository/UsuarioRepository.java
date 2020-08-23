package br.com.sgba.repository;

import br.com.sgba.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository {

    Optional<Usuario> findByUsuario(String usuario);

    Optional<Usuario> findById(Long id);

}
