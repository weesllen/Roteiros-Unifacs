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
public class Programa05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    
        for (int i = 0; i <5; i++){
        System.out.println("Qual é sua nota: ");
        int nota = entrada.nextInt();
        
        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }       
        
    }
    
}

}