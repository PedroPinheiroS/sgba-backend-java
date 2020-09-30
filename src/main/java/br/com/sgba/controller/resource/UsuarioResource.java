package br.com.sgba.controller.resource;

import br.com.sgba.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.annotation.Resource;

@Resource
public interface UsuarioResource {

    @PostMapping(value = "/novo")
    ResponseEntity novo(Usuario usuario);

    @PutMapping(value = "/atualizar/{id}")
    ResponseEntity atualiza(Usuario usuario);

}
