package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bairro {

  @JsonProperty("cod_bairro")
  private Integer codBairro;
  @JsonProperty("nome_bairro")
  private String nomeBairro;
  @JsonProperty("cod_cidade")
  private Integer codCidade;

  public Integer getCodBairro() {
    return codBairro;
  }

  public Bairro setCodBairro(Integer codBairro) {
    this.codBairro = codBairro;
    return this;
  }

  public String getNomeBairro() {
    return nomeBairro;
  }

  public Bairro setNomeBairro(String nomeBairro) {
    this.nomeBairro = nomeBairro;
    return this;
  }

  public Integer getCodCidade() {
    return codCidade;
  }

  public Bairro setCodCidade(Integer codCidade) {
    this.codCidade = codCidade;
    return this;
  }
}
