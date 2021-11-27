/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.DesaparecimentosCriancaAdulto;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author marco
 */
public class DesaparecimentosCriancaAdultoDTO {
    @JsonProperty("desaparecimentosCriancaAdulto")
    private DesaparecimentosCriancaAdulto desaparecimentosCriancaAdulto;

    public DesaparecimentosCriancaAdulto getDesaparecimentosCriancaAdulto() {
        return desaparecimentosCriancaAdulto;
    }

    public void setDesaparecimentosCriancaAdulto(DesaparecimentosCriancaAdulto desaparecimentosCriancaAdulto) {
        this.desaparecimentosCriancaAdulto = desaparecimentosCriancaAdulto;
    }
}
