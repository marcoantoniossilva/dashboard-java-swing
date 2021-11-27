/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.UfComMaisOcorrencias;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class UfComMaisOcorrenciasDTO {

    @JsonProperty("ufComMaisOcorrencias")
    private UfComMaisOcorrencias ufComMaisOcorrencias;

    public UfComMaisOcorrencias getUfComMaisOcorrencias() {
        return ufComMaisOcorrencias;
    }

    public void setUfComMaisOcorrencias(UfComMaisOcorrencias ufComMaisOcorrencias) {
        this.ufComMaisOcorrencias = ufComMaisOcorrencias;
    }
}
