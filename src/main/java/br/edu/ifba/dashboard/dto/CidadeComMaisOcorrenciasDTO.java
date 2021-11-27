/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.CidadeComMaisOcorrencias;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class CidadeComMaisOcorrenciasDTO {

    @JsonProperty("cidadeComMaisOcorrencias")
    private CidadeComMaisOcorrencias cidadeComMaisOcorrencias;

    public CidadeComMaisOcorrencias getCidadeComMaisOcorrencias() {
        return cidadeComMaisOcorrencias;
    }

    public void setCidadeComMaisOcorrencias(CidadeComMaisOcorrencias cidadeComMaisOcorrencias) {
        this.cidadeComMaisOcorrencias = cidadeComMaisOcorrencias;
    }
}
