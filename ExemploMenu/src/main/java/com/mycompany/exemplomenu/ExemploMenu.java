/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExemploMenu {

    public static void main(String[] args) {
        String resultado = "";
        InterfaceGrafica painel = new InterfaceGrafica();
        int valores;
        
        int opcao = 99;
        while (!(opcao == 0)){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        "1 - Vetor de Inserção\n" + 
                                        "2 - Vetor de Seleção\n" +
                                        "3 - Vetor de bolha\n" + 
                                        "0 - Sair"));
            switch(opcao){
                case 1:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    int[] vetor = new int[valores];
                    vetor = painel.insercao(valores);
                    for(Integer item : vetor){
                        resultado = resultado + item.toString() + ", ";
                    }
                    painel.messager("A ordem do vetor inserção foi de: " + resultado);
                    break;
                    
                case 2:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    break;
                    
                case 3:
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    int[] vetorBolha = new int[valores];
                    vetorBolha = painel.bolha(valores);
                    for(Integer item : vetorBolha){
                        resultado = resultado + item.toString() + ", ";
                    }
                    painel.messager("A ordem do vetor bolha foi de: " + resultado);                    
                    break;
                    
                default:
                    if(opcao != 0){
                      System.out.println("Opção inválida");
                    }else{
                     System.out.println("Saindo...");   
                    }
                    System.exit(0);
                    break;
            }
        }
    }
}


