package Roteiro3Parte1;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa12 {
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        double sb,grat,imp,sr;

        System.out.println("Informe seu salario base");
        sb = entrada.nextDouble();
        grat = calculo(sb, 0.05);
        imp =  calculo(sb, 0.07);
        sr = sb + grat - imp;
        System.out.println("Salario a receber com gratificação e impostos: "+sr);
             
    }

    public static double calculo(double sb, double porc){
        return sb*porc;
    }

    

}
