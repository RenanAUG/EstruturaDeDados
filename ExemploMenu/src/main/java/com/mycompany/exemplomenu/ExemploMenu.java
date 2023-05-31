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
        
        Messages msg = new Messages();
        
        int opcao = 99;
        while (!(opcao == 0)){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        "1 - Vetor de Inserção\n" + 
                                        "2 - Vetor de Seleção\n" +
                                        "3 - Vetor de bolha\n" + 
                                        "0 - Sair"));
            switch(opcao){
                case 1:
                    msg.messageInsercao();
                    break;
                case 2:
                    msg.messageSelecao();
                    break;
                case 3:
                    msg.messageBolha();
                    break;
                default:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
            }
        }
    }
}


