package br.com.sgba.service.impl;

import br.com.sgba.model.Funcionario;
import br.com.sgba.repository.impl.FuncionarioRepositoryImpl;
import br.com.sgba.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    FuncionarioRepositoryImpl funcionarioRepository;

    @Override
    public Funcionario novoFuncionario(Funcionario funcionario, Long id) {
        funcionario.setIdFuncionario(funcionarioRepository.novoFuncionario(funcionario,id));
        funcionario.setIdUsuario(id);

        return funcionario;
    }

    /*
        Essa é a classe onde fica a lógica de programação.
        Nada deve ser realizado no controller e/ou no Repository
        Controller devem ficar apenas as chamadas nas classes services
        Chamadas services fazem o intermediario com o Repository.
        Repository são classes que chamam o banco de dados.

        Já tem alguns exemplos implementados, mas podem tirar as dúvidas normalmente.
    */
}
