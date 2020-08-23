package br.com.sgba.controller.resource;

import br.com.sgba.model.Funcionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Resource
public interface FuncionarioResource {

    @PostMapping(value = "/novo")
    ResponseEntity<Void> novo(String jwt, Funcionario funcionario);

    ResponseEntity<Funcionario> buscarPorNome(Funcionario funcionario);

    ResponseEntity<Void> atualizar(Funcionario funcionario);

}
