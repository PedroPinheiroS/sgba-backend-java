package br.com.sgba.repository.RowMapper;

import br.com.sgba.model.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRowMapper implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet resultSet, int i) throws SQLException {

        Usuario usuario = new Usuario();
        usuario.setId(resultSet.getLong("usuario_id"));
        usuario.setContaBloqueada(resultSet.getBoolean("conta_bloqueada"));
        usuario.setSenha(resultSet.getString("senha"));
        usuario.setLogin(resultSet.getString("usuario"));

        return usuario;
    }
}
