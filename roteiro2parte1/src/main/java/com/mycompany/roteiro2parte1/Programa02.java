package com.mycompany.roteiro2parte1;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Programa02 {
public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe seu nome:");
    String nome = entrada.nextLine();
    System.out.println("Qual seu idade?");
    int idade = entrada.nextInt();
    System.out.format("Nome informado: %s idade: %d",nome,idade);
   
    entrada.close();
        
    }

}
