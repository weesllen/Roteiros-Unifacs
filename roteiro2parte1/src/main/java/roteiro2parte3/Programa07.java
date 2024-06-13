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
public class Programa07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota = 0, cont = 0, somamedia = 0; 
        float media = 0;
        int[] vetornota =  new int[10];
          
        while (nota != 10) {
            System.out.println("Qual é sua nota?");
            nota = entrada.nextInt();
            vetornota[cont] = nota;
            somamedia += nota;
              cont++;
            if (nota == 10) {
                System.out.println("Acertou!!");
            }
            else if(nota >= 7){
                System.out.println("Errou");
                media++;
                
  
            } else {
                System.out.println("Errou");
            }
            
        }
              
              entrada.close();
              
             System.out.println("A media das nota é: "+somamedia/cont);  
             System.out.print("Notas acimas da media");
              for (int i = 0; i < media; i++) {
              if (vetornota[i] > media) {
                System.out.print(vetornota[i] + " ");
              }
              }
                }
    }

           
    

                
    