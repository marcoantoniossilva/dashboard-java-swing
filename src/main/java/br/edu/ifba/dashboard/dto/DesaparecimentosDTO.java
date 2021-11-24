/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.Desaparecimento;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author marco
 */
public class DesaparecimentosDTO {

    @JsonProperty("desaparecimentosPorLocal")
    private List<Desaparecimento> desaparecimentos;

    public List<Desaparecimento> getDesaparecimentos() {
        return desaparecimentos;
    }

    public void setDesaparecimentos(List<Desaparecimento> desaparecimentos) {
        this.desaparecimentos = desaparecimentos;
    }

}
