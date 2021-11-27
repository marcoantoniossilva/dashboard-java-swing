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
public class DesaparecimentosCriancaAdulto {
    
    @JsonProperty("criancas")
    private Integer criancas;
    @JsonProperty("adultos")
    private Integer adultos;

    public DesaparecimentosCriancaAdulto() {
    }

    public DesaparecimentosCriancaAdulto(Integer criancas, Integer adultos) {
        this.criancas = criancas;
        this.adultos = adultos;
    }

    public Integer getCrianca() {
        return criancas;
    }

    public void setCrianca(Integer criancas) {
        this.criancas = criancas;
    }

    public Integer getAdulto() {
        return adultos;
    }

    public void setAdulto(Integer adultos) {
        this.adultos = adultos;
    }
    
    
    
}
