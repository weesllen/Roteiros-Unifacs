package Roteiro3Parte1;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double sb, grat, imp, sr;

        System.out.println("Informe seu salario base");
        sb = entrada.nextDouble();
        grat = calcGrat(sb);
        imp =  calcImp(sb);
        sr = sb + grat - imp;

        System.out.println("Salario a receber: " + sr);
    }

    public static double calcGrat(double sb) {
        return sb * 5/100;
        
    }

    public static double calcImp(double sb) {
        return sb * 7 / 100;
        
    } 
}
