/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roteiro2parte4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class ExercicioAdv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int n = 0;
        int numerosecreto = random.nextInt(100) + 1;
        while (n != numerosecreto) {
            System.out.println("Qual é o  seu palpite ?");
            int num = entrada.nextInt();
            n = num;

            if (n == numerosecreto) {
                System.out.println("Acertou!!");
                break;
            }
            if (n > numerosecreto) {
                System.out.println("O palpite indicado é maior do que o sorteado!!");
            } else {
                System.out.println("O Palpite indicado é menor do que o corteado");
            }
        }
    }

}
