/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roteiro2parte4;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetornotas = new int[5];

        for (int cont = 0; cont < vetornotas.length; cont++) {
            System.out.println("Informe uma nota");
            int nota = entrada.nextInt();
            vetornotas[cont] = nota;
 
            }
            System.out.println("As notas são: ");
            for (int i =0; i<vetornotas.length; i++){
                   System.out.print(vetornotas[i] + " ");
            }
                 
        }
    }



