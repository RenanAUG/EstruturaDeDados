package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 * @author renan
 */

public class InterfaceGrafica {
    
    long inicio = System.currentTimeMillis();
    long fim = System.currentTimeMillis();
    long tempoExecucao = fim - inicio;
    
    public void messager(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public void mostrarVetorOriginal(int valor, int[] vet) {
        String original = "";
        for (int i = 0; i < valor; i++) {
            original = original + vet[i] + ", ";
        }
        messager("Seu vetor original é: " + original);
    }
    
     public void mostrarTempoExecucao(String tipo, String ordem) {
        fim = System.currentTimeMillis();
        tempoExecucao = fim - inicio;
        messager("A ordem do vetor de "+ tipo +" foi de: \n" + ordem
        + "\nTempo Execução: " + tempoExecucao + "milissegundos");
    }

    public String pedirPesquisa() {
        String resposta = JOptionPane.showInputDialog("Você deseja efetuar uma pesquisa? (y/n)");
        if (resposta.equalsIgnoreCase("y")) {
            int respostaPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual pesquisa você deseja efetuar?\n[1] - Linear\n[2] - Binaria"));
            if (respostaPesquisa == 1) {
                return "linear";
            } else if (respostaPesquisa == 2) {
                return "binaria";
            }
        }
        return null;
    }

    public void mostraPesquisa(String pesquisa, int[] vetor) {
        if (pesquisa.equals("binaria")) {
            int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser pesquisado"));
            int posicao = pesquisas(chave, vetor, "binaria");
            if (posicao >= 0) {
                messager("O Elemento " + chave + " está localizado na " + "posição: " + posicao);
            } else {
                messager("O Elemento " + chave + " não foi localizado na lista");
            }
        } else if (pesquisa.equals("linear")) {
            int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser pesquisado"));
            int posicao = pesquisas(chave, vetor, "linear");
            if (posicao >= 0) {
                messager("O Elemento " + chave + " está localizado na " + "posição: " + posicao);
            } else {
                messager("O Elemento " + chave + " não foi localizado na lista");
            }
        }
    }

    public int pesquisas(int chave, int[] vet, String tipo) {
        if (tipo.equalsIgnoreCase("binaria")) {

            int esquerda, meio, direita;
            esquerda = 0;
            direita = vet.length - 1;

            while (esquerda <= direita) {
                meio = (esquerda + direita) / 2;
                if (chave == vet[meio]) {
                    return meio;
                }
                if (chave > vet[meio]) {
                    esquerda = meio + 1;
                } else {
                    direita = meio - 1;
                }
            }
        } else if (tipo.equalsIgnoreCase("linear")) {

            for (int i = 0; i < vet.length; i++) {
                if (chave == vet[i]) {
                    return i;
                }
            }
            return -1;

        } else {
            System.out.println("Tipo de pesquisa não encontrado");
        }
        return -1;
    }

    public int[] insercao(int valor) {

        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        mostrarVetorOriginal(valor, vetor);

        for (int i = 1; i < valor; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        
        return vetor;
    }

    public int[] selecao(int valor) {

        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }

        mostrarVetorOriginal(valor, vetor);
        for (int i = 0; i < valor - 1; i++) {
            int posicao = i;

            for (int j = i + 1; j < valor; j++) {
                if (vetor[j] < vetor[posicao]) {
                    posicao = j;
                }
            }

            if (posicao != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posicao];
                vetor[posicao] = aux;
            }
        }
        
        return vetor;
    }

    public int[] bolha(int valor) {

        int[] vetor = new int[valor];
        for (int i = 0; i < valor; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i + 1) + "]"));
            vetor[i] = numero;
        }
        mostrarVetorOriginal(valor, vetor);

        for (int i = 0; i < valor - 1; i++) {
            for (int j = 0; j < valor - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int tp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tp;
                }
            }
        }
        
        return vetor;
    }
}
