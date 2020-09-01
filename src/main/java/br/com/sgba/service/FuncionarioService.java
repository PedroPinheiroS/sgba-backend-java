package br.com.sgba.service;

import br.com.sgba.model.Funcionario;

public interface FuncionarioService {
    Funcionario novoFuncionario(Funcionario funcionario, Long tokenId );
}
