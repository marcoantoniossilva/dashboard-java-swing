/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.leitor;

import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLDesaparecimentos;
import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLCidades;
import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLPessoas;
import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLUfs;
import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLBairros;
import br.edu.ifba.dashboard.modeladores.ModeladorGraphQLLocais;
import br.edu.ifba.dashboard.modelos.Bairro;
import br.edu.ifba.dashboard.modelos.Pessoa;
import br.edu.ifba.dashboard.modelos.Cidade;
import br.edu.ifba.dashboard.modelos.Local;
import br.edu.ifba.dashboard.modelos.Uf;
import br.edu.ifba.dashboard.modelos.CorpoRequisicaoGraphQL;
import br.edu.ifba.dashboard.modelos.Desaparecimento;
import br.edu.ifba.dashboard.dto.UfsDTO;
import br.edu.ifba.dashboard.dto.PessoasDTO;
import br.edu.ifba.dashboard.dto.DesaparecimentosDTO;
import br.edu.ifba.dashboard.dto.LocaisDTO;
import br.edu.ifba.dashboard.dto.CidadesDTO;
import br.edu.ifba.dashboard.dto.GraphQLDTO;
import br.edu.ifba.dashboard.dto.BairrosDTO;
import br.edu.ifba.dashboard.http.client.ClienteGraphQL;
import br.edu.ifba.dashboard.leitor.impl.ILeitorDados;
import br.edu.ifba.dashboard.constantes.Constantes;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class LeitorGraphQL implements ILeitorDados {

    private final ClienteGraphQL clienteGraphQLUf;
    private final ClienteGraphQL clienteGraphQLCidade;
    private final ClienteGraphQL clienteGraphQLBairro;
    private final ClienteGraphQL clienteGraphQLLocal;
    private final ClienteGraphQL clienteGraphQLPessoa;
    private final ClienteGraphQL clienteGraphQLDesaparecimento;
    private final ModeladorGraphQLUfs modeladorGraphQLUfs;
    private final ModeladorGraphQLCidades modeladorGraphQLCidades;
    private final ModeladorGraphQLBairros modeladorGraphQLBairros;
    private final ModeladorGraphQLLocais modeladorGraphQLLocais;
    private final ModeladorGraphQLPessoas modeladorGraphQLPessoas;
    private final ModeladorGraphQLDesaparecimentos modeladorGraphQLDesaparecimentos;
    private final ObjectMapper objectMapper;

    public LeitorGraphQL() {
        this.clienteGraphQLUf = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_UFS);
        this.clienteGraphQLCidade = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_CIDADES);
        this.clienteGraphQLBairro = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_BAIRROS);
        this.clienteGraphQLLocal = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_LOCAIS);
        this.clienteGraphQLPessoa = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_PESSOAS);
        this.clienteGraphQLDesaparecimento = new ClienteGraphQL(Constantes.URL_SERVIDOR_GRAPHQL_DESAPARECIMENTOS);
        this.modeladorGraphQLUfs = new ModeladorGraphQLUfs();
        this.modeladorGraphQLCidades = new ModeladorGraphQLCidades();
        this.modeladorGraphQLBairros = new ModeladorGraphQLBairros();
        this.modeladorGraphQLLocais = new ModeladorGraphQLLocais();
        this.modeladorGraphQLPessoas = new ModeladorGraphQLPessoas();
        this.modeladorGraphQLDesaparecimentos = new ModeladorGraphQLDesaparecimentos();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<Uf> lerUfs() throws IOException {
        String query = this.modeladorGraphQLUfs.montarQueryDeUfs();
        String respostaApi = this.clienteGraphQLUf.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        UfsDTO ufsDTO = graphQLDTO.getData(UfsDTO.class);
        return ufsDTO.getListaDeUfs();
    }

    @Override
    public List<Cidade> lerCidadesPorUf(Integer cod) throws IOException {
        String query = this.modeladorGraphQLCidades.montarQueryDeCidadesPorUf(cod);
        String respostaApi = this.clienteGraphQLCidade.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        CidadesDTO cidadesDTO = graphQLDTO.getData(CidadesDTO.class);
        return cidadesDTO.getCidades();
    }

    @Override
    public List<Bairro> lerBairrosPorCidade(Integer cod) throws IOException {
        String query = this.modeladorGraphQLBairros.montarQueryDeBairrosPorCidade(cod);
        String respostaApi = this.clienteGraphQLBairro.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        BairrosDTO bairrosDTO = graphQLDTO.getData(BairrosDTO.class);
        return bairrosDTO.getBairros();
    }

    @Override
    public List<Local> lerLocaisPorBairro(Integer cod) throws IOException {
        String query = this.modeladorGraphQLLocais.montarQueryDeLocaisPorBairro(cod);
        String respostaApi = this.clienteGraphQLLocal.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        LocaisDTO locaisDTO = graphQLDTO.getData(LocaisDTO.class);
        return locaisDTO.getLocais();
    }

    @Override
    public List<Desaparecimento> lerDesaparecimentosPorLocal(Integer cod) throws IOException {
        String query = this.modeladorGraphQLDesaparecimentos.montarQueryDeDesaparecimentosPorLocal(cod);
        String respostaApi = this.clienteGraphQLDesaparecimento.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        DesaparecimentosDTO desaparecimentosDTO = graphQLDTO.getData(DesaparecimentosDTO.class);
        return desaparecimentosDTO.getDesaparecimentos();
    }

    @Override
    public Pessoa lerPessoaPorDesaparecimento(Integer cod) throws IOException {
        String query = this.modeladorGraphQLPessoas.montarQueryDePessoaPorDesaparecimento(cod);
        String respostaApi = this.clienteGraphQLPessoa.executar(
                CorpoRequisicaoGraphQL.builder()
                        .query(query)
                        .build()
        );

        GraphQLDTO graphQLDTO = objectMapper.readValue(respostaApi, GraphQLDTO.class);
        PessoasDTO pessoasDTO = graphQLDTO.getData(PessoasDTO.class);
        return pessoasDTO.getPessoa();
    }

}
