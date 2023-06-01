/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class InterfaceGrafica {
    
    public void messager(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public ArrayList<Integer> insercao(int valor){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=0;i<valor;i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i+1) + "]"));
            lista.add(numero);
        }
        return lista;
    }
    
//    public ArrayList<Integer> selecao(int valor){
//        ArrayList<Integer> lista = new ArrayList<>();
//        for(int i=0;i<valor;i++){
//            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da fila: [" + (i+1) + "]"));
//            lista.add(numero);
//        }
//        return lista;
//    }
}
