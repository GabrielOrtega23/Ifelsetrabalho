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
String idadeInput = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeInput); // Convertendo a entrada para int
        
        if (idade >= 18) {
           JOptionPane.showMessageDialog(null, "Você é maior de idade");
        }
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Você é menor de idade");
        }
        String alturaInput = JOptionPane.showInputDialog("Digite sua altura em cm: ");
        double altura = Double.parseDouble(alturaInput);
       
        
        if (altura > 170) {
           JOptionPane.showMessageDialog(null, "Você é alto");
        }
        if (altura <= 170) {
           JOptionPane.showMessageDialog(null, "Você é baixo");
        }
        
         String seculoInput = JOptionPane.showInputDialog("Digite em que século você nasceu: ");
        int seculo = Integer.parseInt(seculoInput);
        
        if (seculo == 21) {
            JOptionPane.showMessageDialog(null, "Você é novo");
        }
        if (seculo != 21) {
            JOptionPane.showMessageDialog(null, "Você é velho");
        }
    }
}
