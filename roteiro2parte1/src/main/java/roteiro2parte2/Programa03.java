/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roteiro2parte2;

import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        System.out.println("Infome seu nome: ");
        String nome = JOptionPane.showInputDialog("infome seu nome:");
        JOptionPane.showMessageDialog(null,"Nome informado: "+ nome);
        
        String strIdade = JOptionPane.showInputDialog("Informe sua idade");
        int idade = Integer.parseInt(strIdade);
        JOptionPane.showMessageDialog(null,"Idade informada: "+ idade);
        
    }
    
}
