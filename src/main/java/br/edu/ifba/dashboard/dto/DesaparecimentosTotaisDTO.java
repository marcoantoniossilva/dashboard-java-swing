/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.DesaparecimentosTotais;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class DesaparecimentosTotaisDTO {

    @JsonProperty("desaparecimentosTotais")
    private DesaparecimentosTotais desaparecimentosTotais;

    public DesaparecimentosTotais getDesaparecimentosTotais() {
        return desaparecimentosTotais;
    }

    public void setDesaparecimentosTotais(DesaparecimentosTotais desaparecimentosTotais) {
        this.desaparecimentosTotais = desaparecimentosTotais;
    }

}
