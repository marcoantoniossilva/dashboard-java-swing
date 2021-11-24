/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.Pessoa;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class PessoasDTO {

    @JsonProperty("pessoaPorDesaparecimento")
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
