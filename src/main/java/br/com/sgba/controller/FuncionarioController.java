package br.com.sgba.controller;

import br.com.sgba.config.security.TokenService;
import br.com.sgba.controller.resource.FuncionarioResource;
import br.com.sgba.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController implements FuncionarioResource {

    @Autowired
    TokenService tokenService;

    @Override
    public ResponseEntity<Void> novo(@RequestHeader(value = "Authorization") String jwt, @RequestBody Funcionario funcionario) {

        Long id = tokenService.getIdUsuario(jwt.substring(7));

        return null;
    }

    @Override
    public ResponseEntity<Funcionario> buscarPorNome(Funcionario funcionario) {
        return null;
    }

    @Override
    public ResponseEntity<Void> atualizar(Funcionario funcionario) {
        return null;
    }
}
