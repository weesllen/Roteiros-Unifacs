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
public class Programa09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        int[] vetornotas = new int[5];

        for (int cont = 0; cont < vetornotas.length; ) {
            System.out.println("Informe uma nota");
            int nota = entrada.nextInt();
           
            if (nota >= 0 && nota <= 10) {
                vetornotas[cont] = nota;
                cont++; 
            } else {
                System.out.println("Nota inválida. Informe uma nota no intervalo de 0 a 10.");
            }
        }

            System.out.println("As notas são: ");
            for (int cont =0; cont<vetornotas.length; cont++){
                   System.out.print(vetornotas[cont] + " ");
            }
            System.out.println("Segunda forma de apresentar: ");
            for (int resu: vetornotas){
                System.out.print(resu + " ");
            }
    }
}
