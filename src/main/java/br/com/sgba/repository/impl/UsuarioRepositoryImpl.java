package br.com.sgba.repository.impl;

import br.com.sgba.model.Funcionario;
import br.com.sgba.model.Usuario;
import br.com.sgba.repository.RowMapper.UsuarioRowMapper;
import br.com.sgba.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Autowired
    NamedParameterJdbcTemplate template;

    @Override
    public Optional<Usuario> findByUsuario(String user) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from usuario where login = :user");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("user", user);

        return template.query(sql.toString(), mapSqlParameterSource, new UsuarioRowMapper()).stream().findFirst();
    }

    public Optional<Usuario> findById(Long idUsuario) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from usuario where usuario_id = :idUsuario");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("idUsuario", idUsuario);

        return template.query(sql.toString(), mapSqlParameterSource, new UsuarioRowMapper()).stream().findFirst();

    }

    public Long novoUsuario(Usuario usuario, Long usuarioId){
        StringBuilder query = new StringBuilder();
        /*Não estou com acesso ao banco pra ver o nome das variaveis.Corrigir depois*/
        query.append("INSERT INTO USUARIO VALUES (nextval('id_usuario_sequence'),:loginUsuario, :senhaUsuario ) returning id_usuario");
        MapSqlParameterSource map = new MapSqlParameterSource();

        map.addValue("idUsuario", usuarioId).addValue("loginUsuario",usuario.getLogin()).addValue("senhaUsuario", usuario.getSenha());

        return template.queryForObject(query.toString(),map, Long.class);
    }


}
