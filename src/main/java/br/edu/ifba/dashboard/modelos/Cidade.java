package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cidade {

  @JsonProperty("cod_cidade")
  private Integer codCidade;
  @JsonProperty("nome_cidade")
  private String nomeCidade;
  @JsonProperty("cod_uf")
  private Integer codUf;

  public Integer getCodCidade() {
    return codCidade;
  }

  public Cidade setCodCidade(Integer codCidade) {
    this.codCidade = codCidade;
    return this;
  }

  public String getNomeCidade() {
    return nomeCidade;
  }

  public Cidade setNomeCidade(String nomeCidade) {
    this.nomeCidade = nomeCidade;
    return this;
  }

  public Integer getCodUf() {
    return codUf;
  }

  public Cidade setCodUf(Integer codUf) {
    this.codUf = codUf;
    return this;
  }
}
