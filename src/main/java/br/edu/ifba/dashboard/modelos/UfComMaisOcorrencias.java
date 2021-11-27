/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.modelos;

/**
 *
 * @author marco
 */
public class UfComMaisOcorrencias {

    private String nome;
    private int total;
    
    public UfComMaisOcorrencias() {
    }

    public UfComMaisOcorrencias(String nome, int total) {
        this.nome = nome;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
