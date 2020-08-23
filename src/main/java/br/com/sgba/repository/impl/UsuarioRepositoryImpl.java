package br.com.sgba.repository.impl;

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

        sql.append("select * from usuario where usuario = :user");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("user", user);

        return template.query(sql.toString(), mapSqlParameterSource, new UsuarioRowMapper()).stream().findFirst();

    }

    public Optional<Usuario> findById(Long idUsuario) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from usuario where usuario_id = :idUsuario");

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("idUsuario", idUsuario);

        return template.query(sql.toString(), mapSqlParameterSource, new UsuarioRowMapper()).stream().findFirst();

    }
}
