package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pessoa {

  @JsonProperty("cod_pessoa")
  private Integer codPessoa;
  private String imagem;
  private String sexo;
  @JsonProperty("peso_aproximado")
  private Float pesoAproximado;
  @JsonProperty("cor_pele")
  private String corPele;
  @JsonProperty("cor_olhos")
  private String corOlhos;
  @JsonProperty("data_nascimento")
  private String dataNascimento;
  private String nome;
  @JsonProperty("tipo_fisico")
  private String tipoFisico;
  @JsonProperty("marca_caracteristica")
  private String marcaCaracteristica;
  @JsonProperty("altura_aproximada")
  private Float alturaAproximada;
  @JsonProperty("cor_cabelo")
  private String corCabelo;
  @JsonProperty("transtorno_mental")
  private String transtornoMental;

  public Integer getCodPessoa() {
    return codPessoa;
  }

  public Pessoa setCodPessoa(Integer codPessoa) {
    this.codPessoa = codPessoa;
    return this;
  }

  public String getImagem() {
    return imagem;
  }

  public Pessoa setImagem(String imagem) {
    this.imagem = imagem;
    return this;
  }

  public String getSexo() {
    return sexo;
  }

  public Pessoa setSexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  public Float getPesoAproximado() {
    return pesoAproximado;
  }

  public Pessoa setPesoAproximado(Float pesoAproximado) {
    this.pesoAproximado = pesoAproximado;
    return this;
  }

  public String getCorPele() {
    return corPele;
  }

  public Pessoa setCorPele(String corPele) {
    this.corPele = corPele;
    return this;
  }

  public String getCorOlhos() {
    return corOlhos;
  }

  public Pessoa setCorOlhos(String corOlhos) {
    this.corOlhos = corOlhos;
    return this;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public Pessoa setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  public String getNome() {
    return nome;
  }

  public Pessoa setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public String getTipoFisico() {
    return tipoFisico;
  }

  public Pessoa setTipoFisico(String tipoFisico) {
    this.tipoFisico = tipoFisico;
    return this;
  }

  public String getMarcaCaracteristica() {
    return marcaCaracteristica;
  }

  public Pessoa setMarcaCaracteristica(String marcaCaracteristica) {
    this.marcaCaracteristica = marcaCaracteristica;
    return this;
  }

  public Float getAlturaAproximada() {
    return alturaAproximada;
  }

  public Pessoa setAlturaAproximada(Float alturaAproximada) {
    this.alturaAproximada = alturaAproximada;
    return this;
  }

  public String getCorCabelo() {
    return corCabelo;
  }

  public Pessoa setCorCabelo(String corCabelo) {
    this.corCabelo = corCabelo;
    return this;
  }

  public String getTranstornoMental() {
    return transtornoMental;
  }

  public Pessoa setTranstornoMental(String transtornoMental) {
    this.transtornoMental = transtornoMental;
    return this;
  }
}
