package br.com.sgba.repository;

import br.com.sgba.model.Cliente;

public interface ClienteRepository {

    void novoCliente(Cliente cliente);

    Cliente buscarClientePorNome(String nome);

    Cliente buscarClientePorId(Long id);

}
