/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 * @author renan
 */
public class ExemploMenu {

    public static void main(String[] args) {
        String resultado = "";
        InterfaceGrafica painel = new InterfaceGrafica();
        int valores;
        long inicio = System.currentTimeMillis();
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;

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
                    inicio = System.currentTimeMillis();

                    vetor = painel.insercao(valores);
                    for (Integer item : vetor) {
                        resultado = resultado + item.toString() + ", ";
                    }

                    fim = System.currentTimeMillis();
                    tempoExecucao = fim - inicio;

                    painel.messager("A ordem do vetor inserção foi de: " + resultado
                            + "\n Tempo Execução: " + tempoExecucao + "milissegundos");
                    break;

                case 2:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista:"));
                    int[] vetorSelecao = new int[valores];
                    inicio = System.currentTimeMillis();
                    vetorSelecao = painel.selecao(valores);
                    for (Integer item : vetorSelecao) {
                        resultado = resultado + item.toString() + ", ";
                    }

                    fim = System.currentTimeMillis();
                    tempoExecucao = fim - inicio;

                    painel.messager("A ordem do vetor Seleção foi de: " + resultado
                            + "\n Tempo Execução: " + tempoExecucao + "milissegundos");
                    break;

                case 3:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista:"));
                    int[] vetorBolha = new int[valores];

                    inicio = System.currentTimeMillis();

                    vetorBolha = painel.bolha(valores);
                    for (Integer item : vetorBolha) {
                        resultado = resultado + item.toString() + ", ";
                    }

                    fim = System.currentTimeMillis();
                    tempoExecucao = fim - inicio;

                    painel.messager("A ordem do vetor bolha foi de: " + resultado
                            + "\n Tempo Exeucação: " + tempoExecucao + "milissegundos");
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



