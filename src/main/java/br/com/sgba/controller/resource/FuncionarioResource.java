package br.com.sgba.controller.resource;

import br.com.sgba.model.Funcionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.annotation.Resource;

@Resource
public interface FuncionarioResource {

    @PostMapping(value = "/novo")
    ResponseEntity novo(String jwt, Funcionario funcionario);


    @GetMapping(value = "/{funcionarioId}")
    ResponseEntity buscarPorNome(String jwt, Integer funcionarioId);

    @PutMapping(value = "/atualizar/{funcionarioId}")
    ResponseEntity atualizar(String jwt, Integer funcionario);

}
