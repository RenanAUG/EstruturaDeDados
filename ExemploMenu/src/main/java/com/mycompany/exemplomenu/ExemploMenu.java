/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplomenu;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExemploMenu {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
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
                    painel.messager("Você selecionou: vetor de Inserção");
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    lista = painel.insercao(valores);
                    String resultado = "";
                    for(Integer item : lista){
                        resultado = resultado + item.toString() + ", ";
                    }
                    painel.messager("A ordem de inserção foi de: " + resultado);
                    break;
                case 2:
                    painel.messager("Você selecionou: vetor de Seleção");
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    painel.inserter(valores);
                    break;
                case 3:
                    painel.messager("Você selecionou: vetor de Bolha");
                    valores = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores serão adicionados na lista"));
                    painel.inserter(valores);
                    break;
                default:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
        }
    }
}


