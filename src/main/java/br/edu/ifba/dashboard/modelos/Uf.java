/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class Uf {
   
  @JsonProperty("cod_uf")
  private Integer codUf;
  private String sigla;
  
  public Uf(){
      
  }

  public Uf(Integer codUf, String sigla) {
    this.codUf = codUf;
    this.sigla = sigla;
  }

  public Integer getCodUf() {
    return codUf;
  }

  public Uf setCodUf(Integer codUf) {
    this.codUf = codUf;
    return this;
  }

  public String getSigla() {
    return sigla;
  }

  public Uf setSigla(String sigla) {
    this.sigla = sigla;
    return this;
  }
    
}
