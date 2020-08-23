package br.com.sgba.controller;

import br.com.sgba.config.security.TokenService;
import br.com.sgba.controller.resource.FuncionarioResource;
import br.com.sgba.model.Funcionario;
import br.com.sgba.service.impl.FuncionarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController implements FuncionarioResource {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private FuncionarioServiceImpl funcionarioService;

    @Override
    public ResponseEntity novo(@RequestHeader(value = "Authorization") String jwt, @RequestBody Funcionario funcionario) {

        Long id = tokenService.getIdUsuario(jwt.substring(7));

    /* TODO
        O endpoint deve ser responsável pela inclusão de um novo funcionario para o respectivo usuario que está fazendo a requisição.
        De acordo com a estrutura que passei para vocês do banco, o usuário do sistema é a chave principal para tudo praticamente.
        Eu já deixei um exemplo de como a chave ID do usuario é capturada acima.
        Eu montei a estrutura do banco dessa forma para poder ter mais de um usuario, pois caso tivessemos mais de um usuario, não teriamo como dividir o que seria de cada um.
        Todas as chamadas devem ser realizadas através de JWT ( Json Web Token) e nesse token vem a chave do usuario.   *
        Por padrão Rest, é necessário que quando um dado é criado no banco o response status seja 201 e seja retornado o dado que foi criado no banco.
        Já deixei o retorno no modelo correto, basta vocês replicarem para os outros metodos da forma correta.
    */
        funcionario.setIdFuncionario(1L);
        funcionario.setIdUsuario(id);

        // Essa URI deve ser devolvida onde está null quando a implementação do metodo de busca por id estiver pronto.
        /*URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(funcionario.getIdFuncionario()).toUri();*/

        // TODA A IMPLEMENTAÇÃO QUE ESTÁ DETALHADA DEVE SER REALIZADA NA CAMDADA SERVICE.
        // Nome da classe onde devem realizar as implementações: FuncionarioServiceImpl


        return ResponseEntity.created(null).body(funcionario);
    }

    @Override
    public ResponseEntity<Funcionario> buscarPorNome(@RequestHeader(value = "Authorization") String jwt,Integer funcionario) {
        /*
         * TODO
         *  Buscar funcionario pelo id passado, porém o usuario só pode ser retornado caso ele pertença ao usuario que fez a chamada.
         */
        return null;
    }

    @Override
    public ResponseEntity<Void> atualizar(@RequestHeader(value = "Authorization") String jwt, Integer funcionarioId) {
        return null;
    }
}
