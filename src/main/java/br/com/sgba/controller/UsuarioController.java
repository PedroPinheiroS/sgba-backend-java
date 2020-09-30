package br.com.sgba.controller;

import br.com.sgba.controller.resource.UsuarioResource;
import br.com.sgba.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController implements UsuarioResource {


    /*
    * TODO
    * Adicionar novo usuario no banco
    * Já deixei essa rota liberada de forma que não seja necessário o jwt
    *
    */
    @Override
    public ResponseEntity novo(Usuario usuario) {
        return null;
    }

    /*
     * TODO
     * Atualizar dados cadastrais do usuario
     * Somente atualizar com ele logado via jwt
     *
     */
    @Override
    public ResponseEntity atualiza(Usuario usuario) {
        return null;
    }
}
