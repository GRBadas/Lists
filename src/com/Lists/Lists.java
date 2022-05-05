package com.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Lists{
    
    public static void main(String[] args) {

        String[] teste = new String[5];
        for (int i = 0; i < teste.length; i++) {
            String adicionarNome = JOptionPane.showInputDialog("digite um nome");
            teste[i] = adicionarNome;
        }
        for (String printar : teste) {
            System.out.println(Arrays.toString(teste));
        }
        

    
    }
}