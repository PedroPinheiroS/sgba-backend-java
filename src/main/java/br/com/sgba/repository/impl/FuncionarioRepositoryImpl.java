package br.com.sgba.repository.impl;

import br.com.sgba.model.Funcionario;
import br.com.sgba.model.Usuario;
import br.com.sgba.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class FuncionarioRepositoryImpl implements FuncionarioRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    @Override
    public void novoFuncionario(Funcionario funcionario, Long usuarioId) {
        StringBuilder query = new StringBuilder();

        query.append(" INSERT INTO FUNCIONARIO VALUES (nextval('id_funcionario_sequence'),:nomeFuncionario, :idUsuario)");

        MapSqlParameterSource map = new MapSqlParameterSource();

        map.addValue("idUsuario", usuarioId).addValue("nomeFuncionario", funcionario.getNome());

        template.update(query.toString(), map);
    }

    @Override
    public Funcionario buscarFuncionarioPorNome(String nome) {
        return null;
    }

    @Override
    public Funcionario buscarFuncionarioPorId(String nome) {
        return null;
    }
}
