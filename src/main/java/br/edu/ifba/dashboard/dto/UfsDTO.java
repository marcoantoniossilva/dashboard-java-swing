/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.dto;

import br.edu.ifba.dashboard.modelos.Uf;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author marco
 */
public class UfsDTO {

    @JsonProperty("ufs")
    private List<Uf> listaDeUfs;

    public List<Uf> getListaDeUfs() {
        return listaDeUfs;
    }

    public void setListaDeUfs(List<Uf> listaDeUfs) {
        this.listaDeUfs = listaDeUfs;
    }

}
