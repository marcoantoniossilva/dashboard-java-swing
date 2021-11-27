package br.edu.ifba.dashboard.modeladores;

import br.edu.ifba.dashboard.modelos.Uf;

import java.util.List;

public class ModeladorGraphQLUfs {

  private static final String MODELO_UF = "{\n" + "  codUf: COD_UF,\n" + "  sigla: \"SIGLA_UF\"\n" + "}\n";

  private static final String MODELO_MUTATION_CRIAR_UFS = "mutation {\n" + "  criarUfs(\n" + "    data: [\n" + "      UFS\n" + "    ]\n" + "  ) {\n" + "    codUf\n" + "  }\n" + "}\n";

  public String montarMutationDeUfs(List<Uf> ufs) {
    String ufsFormatados = ufs.stream()
        .reduce(new StringBuilder(),
            (modelo, uf) -> modelo.append(
                MODELO_UF
                    .replace("COD_UF", uf.getCodUf().toString())
                    .replace("SIGLA_UF", uf.getSigla())
            ),
            StringBuilder::append
        ).toString();

    return MODELO_MUTATION_CRIAR_UFS.replace("UFS", ufsFormatados);
  }

  public String montarQueryDeUfs() {
    return """
           query {
             ufs {
               cod_uf
               sigla
               }
             }
           """;
  }
  
  public String montarQueryDeUfComMaisOcorrencias() {
    return """
           query {
            ufComMaisOcorrencias{
                nome
                total
            }
           }
           """;
  }

}
