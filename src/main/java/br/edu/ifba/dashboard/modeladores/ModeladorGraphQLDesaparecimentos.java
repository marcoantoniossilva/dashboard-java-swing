package br.edu.ifba.dashboard.modeladores;

import br.edu.ifba.dashboard.modelos.Desaparecimento;

import java.util.List;

public class ModeladorGraphQLDesaparecimentos {

    private static final String MODELO_DESAPARECIMENTO = """
      {
        codPessoa: COD_PESS
        codLocal: COD_LOC
        dataDesaparecimento: "DATA_DESAP"
        informacoes: "INFO"
        fonte: "FONTE"
        boletimOcorrencia: BOLETIM
        ultimaHoraVista: "ULTIMA_HORA"
      }
      """;

    private static final String MODELO_MUTATION_CRIAR_DESAPARECIMENTOS = """
      mutation {
        criarDesaparecimentos(
          data: [
            DESAPARECIMENTOS
          ]
        ) {
          codDesaparecimento
        }
      }
      """;

    public String montarMutationDeDesaparecimentos(List<Desaparecimento> desaparecimentos) {
        String desaparecimentosFormatados = desaparecimentos.stream()
                .reduce(new StringBuilder(),
                        (modelo, desaparecimento) -> modelo.append(
                                MODELO_DESAPARECIMENTO
                                        .replace("COD_PESS", desaparecimento.getCodPessoa().toString())
                                        .replace("COD_LOC", desaparecimento.getCodLocal().toString())
                                        .replace("DATA_DESAP", desaparecimento.getDataDesaparecimento())
                                        .replace("INFO", desaparecimento.getInformacoes())
                                        .replace("FONTE", desaparecimento.getFonte())
                                        .replace("BOLETIM", String.valueOf(desaparecimento.isBoletimOcorrencia()))
                                        .replace("ULTIMA_HORA", desaparecimento.getUltimaHoraVista())
                        ),
                        StringBuilder::append
                ).toString();

        return MODELO_MUTATION_CRIAR_DESAPARECIMENTOS.replace("DESAPARECIMENTOS", desaparecimentosFormatados);
    }

    public String montarQueryDeDesaparecimentos() {
        return """
        query {
          desaparecimentos {
            boletimOcorrencia
            informacoes
            dataDesaparecimento
            fonte
            ultimaHoraVista
            pessoa{
             nome
              dataNascimento
              imagem
              sexo
              corOlhos
              corPele
              corCabelo
              tipoFisico
              pesoAproximado
              alturaAproximada
              transtornoMental
              marcaCaracteristica
            }
            local{
              latitude
              longitude
              bairro{
                nomeBairro
                cidade{
                  nomeCidade
                  uf{
                    sigla
                  }
                }
              }
            }
          }
        }
        """;
    }

    public String montarQueryDeTotalDeDesaparecimentos() {
        return """
        query {
          desaparecimentosCount {
            total
          }
        }
        """;
    }

    public String montarQueryDeDesaparecimentosPorLocal(int codLocal) {
        return """
        query {
          desaparecimentosPorLocal(cod_local:COD_LOCAL){
                cod_desaparecimento
                cod_pessoa
                cod_local
                data_desaparecimento
                informacoes
                fonte
                boletim_ocorrencia
                ultima_hora_vista
          }
        }
        """.replace("COD_LOCAL", String.valueOf(codLocal));
    }
    
    public String montarQueryDeDesaparecimentosCriancaAdulto() {
        return """
        query{
            desaparecimentosCriancaAdulto{
            criancas
            adultos
          }
        }
        """;
    }
    
    public String montarQueryDeDesaparecimentosTotais() {
        return """
        query{
            desaparecimentosTotais{
            total
          }
        }
        """;
    }

}
