package roteiro3parte2;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa13 {
    
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
                soma (x, y); 
                break;
            case "-":
                subtracao (x, y);
                break;
            case "*":
                 multiplicacao(x, y);
                break;
            case "/":
                divisao(x, y);
                break;
            default:
                System.out.println("Operação invalida");                       
        }

    }

    public static void soma(double x, double y) {
        System.out.println("O Resultado: "+ (x+y));

    }

    public static void subtracao(double x, double y) {
        System.out.println("O Resultado " + (x-y));

    }

    public static void multiplicacao(double x, double y) {
        System.out.println("O Resultado é: "+ (x*y));
    }

    public static void divisao(double x, double y) {
        System.out.println("O Resultado é: " + (x/y));
    }
}
        
    


