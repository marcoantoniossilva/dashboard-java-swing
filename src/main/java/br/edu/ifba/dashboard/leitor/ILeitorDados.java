/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifba.dashboard.leitor;

/**
 *
 * @author marco
 */
import br.edu.ifba.dashboard.modelos.Bairro;
import br.edu.ifba.dashboard.modelos.Pessoa;
import br.edu.ifba.dashboard.modelos.Cidade;
import br.edu.ifba.dashboard.modelos.CidadeComMaisOcorrencias;
import br.edu.ifba.dashboard.modelos.Local;
import br.edu.ifba.dashboard.modelos.Uf;
import br.edu.ifba.dashboard.modelos.Desaparecimento;
import br.edu.ifba.dashboard.modelos.DesaparecimentosCriancaAdulto;
import br.edu.ifba.dashboard.modelos.DesaparecimentosTotais;
import br.edu.ifba.dashboard.modelos.UfComMaisOcorrencias;
import java.io.IOException;
import java.util.List;

public interface ILeitorDados {

  List<Uf> lerUfs() throws IOException;
  
  List<Cidade> lerCidadesPorUf(Integer codUf) throws IOException;
  
  List<Bairro> lerBairrosPorCidade(Integer codCidade) throws IOException;
  
  List<Local> lerLocaisPorBairro(Integer codBairro) throws IOException;
  
  List<Desaparecimento> lerDesaparecimentosPorLocal(Integer codLocal) throws IOException;
  
  Pessoa lerPessoaPorDesaparecimento(Integer codDesaparecimento) throws IOException;
  
  UfComMaisOcorrencias lerUfComMaisOcorrencias() throws IOException;
  
  CidadeComMaisOcorrencias lerCidadeComMaisOcorrencias() throws IOException;

  DesaparecimentosCriancaAdulto lerDesaparecimentosCriancaAdulto() throws IOException;

  DesaparecimentosTotais lerDesaparecimentosTotais() throws IOException;
}