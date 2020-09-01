package br.com.sgba.repository;

import br.com.sgba.model.Funcionario;

public interface FuncionarioRepository {

    Long novoFuncionario(Funcionario funcionario, Long usuarioId);

    Funcionario buscarFuncionarioPorId(String nome);

}
