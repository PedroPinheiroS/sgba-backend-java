package br.com.sgba.config.security;

import br.com.sgba.model.Usuario;
import br.com.sgba.repository.impl.UsuarioRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepositoryImpl usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {

        Optional<Usuario> user = usuarioRepository.findByUsuario(usuario);

        if (user.isPresent()) { return user.get(); }

        throw new UsernameNotFoundException("Dados Invalidos");
    }
}
