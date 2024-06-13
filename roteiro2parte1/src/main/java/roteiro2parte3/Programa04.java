/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roteiro2parte3;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int cont = 0;
       while (cont < 5){
        System.out.println("Infome uma nota:");
        int nota = entrada.nextInt();
        
        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");     
        }
        cont++;
    }
    }
    
}
