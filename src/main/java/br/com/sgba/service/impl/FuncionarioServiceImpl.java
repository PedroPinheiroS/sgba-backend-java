package br.com.sgba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl {

    @Autowired
    private FuncionarioServiceImpl funcionarioService;

    /*
        Essa é a classe onde fica a lógica de programação.
        Nada deve ser realizado no controller e/ou no Repository
        Controller devem ficar apenas as chamadas nas classes services
        Chamadas services fazem o intermediario com o Repository.
        Repository são classes que chamam o banco de dados.

        Já tem alguns exemplos implementados, mas podem tirar as dúvidas normalmente.
    */
}
