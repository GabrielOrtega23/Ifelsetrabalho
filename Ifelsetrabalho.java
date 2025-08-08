/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelsetrabalho;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Ifelsetrabalho {

     public static void main(String[] args) {
 // Mostra uma caixa de entrada pedindo a idade do usuário
        String idadeInput = JOptionPane.showInputDialog("Digite sua idade: ");
        
        // Converte a String recebida para um número inteiro
        int idade = Integer.parseInt(idadeInput);
        
        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            // Mostra mensagem se for maior de idade
            JOptionPane.showMessageDialog(null, "Você é maior de idade");
        }

        // Verifica se a idade é menor que 18
        if (idade < 18) {
            // Mostra mensagem se for menor de idade
            JOptionPane.showMessageDialog(null, "Você é menor de idade");
        }

        // Mostra uma caixa de entrada pedindo a altura (em centímetros)
        String alturaInput = JOptionPane.showInputDialog("Digite sua altura em cm: ");
        
        // Converte a String recebida para um número decimal (double)
        double altura = Double.parseDouble(alturaInput);
        
        // Verifica se a altura é maior que 170 cm
        if (altura > 170) {
            // Mostra mensagem dizendo que a pessoa é alta
            JOptionPane.showMessageDialog(null, "Você é alto");
        }

        // Verifica se a altura é menor ou igual a 170 cm
        if (altura <= 170) {
            // Mostra mensagem dizendo que a pessoa é baixa
            JOptionPane.showMessageDialog(null, "Você é baixo");
        }

        // Mostra uma caixa de entrada pedindo o século em que a pessoa nasceu
        String seculoInput = JOptionPane.showInputDialog("Digite em que século você nasceu: ");
        
        // Converte a String recebida para número inteiro
        int seculo = Integer.parseInt(seculoInput);

        // Verifica se o século é igual a 21
        if (seculo == 21) {
            // Mostra mensagem dizendo que a pessoa é nova
            JOptionPane.showMessageDialog(null, "Você é novo");
        }

        // Verifica se o século é diferente de 21
        if (seculo != 21) {
            // Mostra mensagem dizendo que a pessoa é velha
            JOptionPane.showMessageDialog(null, "Você é velho");
        }
    }
}
