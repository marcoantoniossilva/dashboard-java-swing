package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DesaparecimentosTotais {

    private Integer total;

    public DesaparecimentosTotais() {
    }

    public DesaparecimentosTotais(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
