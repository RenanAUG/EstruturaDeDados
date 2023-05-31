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
        int opcao = 99;
        while (!(opcao == 0)){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                                        "1 - Cadastro de ALunos\n" + 
                                        "2 - Cadastro Professores\n" +
                                        "3 - Cadastro de Disciplinas\n" + 
                                        "4 - Cadastro de Turmas\n" +
                                        "0 - Sair"));
        }
    }
}
            

