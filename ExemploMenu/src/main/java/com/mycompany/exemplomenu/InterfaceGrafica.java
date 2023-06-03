/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class InterfaceGrafica {

    public void messager(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

//    public int[] vetorOriginal(ArrayList<Integer> lista ){
//        int[] vetorOrg = new int[lista.size()];
//        for(int i =0; i<lista.size();i++){
//            vetorOrg[i] = lista.get(i);
//        }
//        return vetorOrg;
//    }
    public void mostrarVetorOriginal(int valor, int[] vet) {
        String original = "";
        for (int i = 0; i < valor; i++) {
            original = original + vet[i] + ", ";
        }
        messager("Seu vetor original é: " + original);
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
