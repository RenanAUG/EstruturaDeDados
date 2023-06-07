package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 * @author renan
 */
public class ExemploMenu {

    public static void main(String[] args) {
        String resultado = "";
        String pesquisa = "";
        InterfaceGrafica painel = new InterfaceGrafica();
        int valores;

        int opcao = 99;
        while (!(opcao == 0)) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Vetor de Inserção\n"
                    + "2 - Vetor de Seleção\n"
                    + "3 - Vetor de bolha\n"
                    + "0 - Sair"));
            switch (opcao) {
                case 1:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista:"));
                    int[] vetor = new int[valores];
                    vetor = painel.insercao(valores);
                    
                    pesquisa = painel.pedirPesquisa();
                    painel.mostraPesquisa(pesquisa, vetor);
                    
                    for (Integer item : vetor) {
                        resultado = resultado + item.toString() + ", ";
                    }
                    break;

                case 2:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista:"));
                    int[] vetorSelecao = new int[valores];
                    vetorSelecao = painel.selecao(valores);

                    pesquisa = painel.pedirPesquisa();
                    painel.mostraPesquisa(pesquisa, vetorSelecao);
                    
                    for (Integer item : vetorSelecao) {
                        resultado = resultado + item.toString() + ", ";
                    }
                    break;

                case 3:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista:"));
                    int[] vetorBolha = new int[valores];
                    vetorBolha = painel.selecao(valores);
                    
                    pesquisa = painel.pedirPesquisa();
                    painel.mostraPesquisa(pesquisa, vetorBolha);
                    
                    vetorBolha = painel.bolha(valores);
                    for (Integer item : vetorBolha) {
                        resultado = resultado + item.toString() + ", ";
                    }
                    break;

                default:
                    if (opcao != 0) {
                        System.out.println("Opção inválida");
                    } else {
                        System.out.println("Saindo...");
                    }
                    System.exit(0);
                    break;
            }
        }
    }
}
