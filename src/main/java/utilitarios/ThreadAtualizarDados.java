/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import br.edu.ifba.dashboard.constantes.Constantes;
import br.edu.ifba.dashboard.froteira.TelaConfiguracoes;
import br.edu.ifba.dashboard.froteira.TelaPrincipal;
import br.edu.ifba.dashboard.leitor.ILeitorDados;
import br.edu.ifba.dashboard.leitor.impl.LeitorGraphQL;
import br.edu.ifba.dashboard.modelos.CidadeComMaisOcorrencias;
import br.edu.ifba.dashboard.modelos.DesaparecimentosCriancaAdulto;
import br.edu.ifba.dashboard.modelos.DesaparecimentosTotais;
import br.edu.ifba.dashboard.modelos.UfComMaisOcorrencias;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class ThreadAtualizarDados extends Thread {

    private ILeitorDados leitorGraphQL;
    private TelaPrincipal telaPrincipal;

    public ThreadAtualizarDados(TelaPrincipal telaPrincipal) {
        leitorGraphQL = new LeitorGraphQL();
        this.telaPrincipal = telaPrincipal;
    }

    @Override
    public void run() {
        while (true) {
            try {
                DesaparecimentosTotais desaparecimentosTotais = leitorGraphQL.lerDesaparecimentosTotais();
                if (desaparecimentosTotais != null) {
                    TelaPrincipal.numBrasil.setText(String.valueOf(desaparecimentosTotais.getTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum desaparecimento encontrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, """
                                                    Sem conex\u00e3o com a API de Desaparecimentos!
                                                    Configure o endpoint da API e reinicie o sistema! """,
                        "Erro de conexão!",
                        JOptionPane.ERROR_MESSAGE);
                telaPrincipal.telaConfiguracoes.setarValores();
                telaPrincipal.telaConfiguracoes.setVisible(true);
                return;
            }
            try {
                CidadeComMaisOcorrencias cidadeComMaisOcorrencias = leitorGraphQL.lerCidadeComMaisOcorrencias();
                if (cidadeComMaisOcorrencias != null) {
                    telaPrincipal.nomeCidade.setText(String.valueOf(cidadeComMaisOcorrencias.getNome()));
                    telaPrincipal.numCidade.setText(String.valueOf(cidadeComMaisOcorrencias.getTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma cidade encontrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, """
                                                    Sem conex\u00e3o com a API de Cidades!
                                                    Configure o endpoint da API e reinicie o sistema! """,
                        "Erro de conexão!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                UfComMaisOcorrencias ufComMaisOcorrencias = leitorGraphQL.lerUfComMaisOcorrencias();
                if (ufComMaisOcorrencias != null) {
                    telaPrincipal.nomeEstado.setText(ufComMaisOcorrencias.getNome());
                    telaPrincipal.numEstado.setText(String.valueOf(ufComMaisOcorrencias.getTotal()));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma UF encontrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, """
                                                    Sem conex\u00e3o com a API de Ufs!
                                                    Configure o endpoint da API e reinicie o sistema!""",
                        "Erro de conexão!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                DesaparecimentosCriancaAdulto desaparecimentosCriancaAdulto = leitorGraphQL.lerDesaparecimentosCriancaAdulto();
                if (desaparecimentosCriancaAdulto != null) {
                    telaPrincipal.numCrianca.setText(String.valueOf(desaparecimentosCriancaAdulto.getCrianca()));
                    telaPrincipal.numAdulto.setText(String.valueOf(desaparecimentosCriancaAdulto.getAdulto()));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma desaparecimento encontrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    System.exit(1);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, """
                                                    Sem conex\u00e3o com a API de Desaparecimentos!
                                                    Configure o endpoint da API e reinicie o sistema! """,
                        "Erro de conexão!",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                Thread.sleep(Constantes.SLEEP);
            } catch (InterruptedException ex) {
                System.err.println("Erro de InterruptedException: " + ex.getMessage());
            }
        }
    }

}
