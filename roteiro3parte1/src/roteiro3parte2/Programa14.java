package Roteiro3Parte2;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X");
        double x = entrada.nextDouble();
        System.out.println("Informe a operação +, -, *, /");
        String op = entrada.next();
        System.out.println("Informe o valor de Y");
        double y = entrada.nextDouble();

        switch (op) {
            case "+":
                System.out.println("O Resultado é: " + soma (x, y)); 
                break;
            case "-":
                System.out.println("O Resultado da subtração é "+ subtracao(x, y));
                break;
            case "*":
                 System.out.println("O Resultado da multiplicação é" + multiplicacao(x, y));
                break;
            case "/":
                System.out.println("O resultado da divisão é" + divisao(x, y));
                break;
            default:
                System.out.println("Operação invalida");                       
        }

    }

    public static double soma(double x, double y) {
        return x + y;

    }

    public static double subtracao(double x, double y) {
        return x - y;

    }

    public static double multiplicacao(double x, double y) {
        return x * y;
    }

    public static double divisao(double x, double y) {
        return x / y;
    }
}
