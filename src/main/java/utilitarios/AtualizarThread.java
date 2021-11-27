/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import br.edu.ifba.dashboard.constantes.Constantes;
import br.edu.ifba.dashboard.froteira.TelaPrincipal;
import br.edu.ifba.dashboard.leitor.ILeitorDados;
import br.edu.ifba.dashboard.leitor.impl.LeitorGraphQL;
import br.edu.ifba.dashboard.modelos.CidadeComMaisOcorrencias;
import br.edu.ifba.dashboard.modelos.DesaparecimentosCriancaAdulto;
import br.edu.ifba.dashboard.modelos.DesaparecimentosTotais;
import br.edu.ifba.dashboard.modelos.UfComMaisOcorrencias;
import java.io.IOException;

/**
 *
 * @author marco
 */
public class AtualizarThread extends Thread {

    private final ILeitorDados leitorGraphQL;

    public AtualizarThread() {
        leitorGraphQL = new LeitorGraphQL();
    }

    @Override
    public void run() {
        while (true) {
            try {
                DesaparecimentosTotais desaparecimentosTotais = leitorGraphQL.lerDesaparecimentosTotais();
                TelaPrincipal.numBrasil.setText(String.valueOf(desaparecimentosTotais.getTotal()));
                
                CidadeComMaisOcorrencias cidadeComMaisOcorrencias = leitorGraphQL.lerCidadeComMaisOcorrencias();
                TelaPrincipal.nomeCidade.setText(cidadeComMaisOcorrencias.getNome());
                TelaPrincipal.numCidade.setText(String.valueOf(cidadeComMaisOcorrencias.getTotal()));

                UfComMaisOcorrencias ufComMaisOcorrencias = leitorGraphQL.lerUfComMaisOcorrencias();
                TelaPrincipal.nomeEstado.setText(ufComMaisOcorrencias.getNome());
                TelaPrincipal.numEstado.setText(String.valueOf(ufComMaisOcorrencias.getTotal()));

                DesaparecimentosCriancaAdulto desaparecimentosCriancaAdulto = leitorGraphQL.lerDesaparecimentosCriancaAdulto();
                TelaPrincipal.numCrianca.setText(String.valueOf(desaparecimentosCriancaAdulto.getCrianca()));
                TelaPrincipal.numAdulto.setText(String.valueOf(desaparecimentosCriancaAdulto.getAdulto()));

                Thread.sleep(Constantes.SLEEP);
            } catch (InterruptedException ex) {
                System.err.println("Erro de InterruptedException: " + ex.getMessage());
            } catch (IOException ex) {
                System.err.println("Erro de IOException: " + ex.getMessage());
            }
        }
    }

}
