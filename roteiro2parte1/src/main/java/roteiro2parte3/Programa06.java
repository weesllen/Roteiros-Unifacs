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
public class Programa06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int nota = 0;
       while(nota !=10){
           System.out.println("Qual é sua nota?");
           nota = entrada.nextInt();
           
           if(nota == 10){
               System.out.println("Acertou");
                   
           }
           else{
               System.out.println("Errou");
           }
       }
       
    }
    
}
