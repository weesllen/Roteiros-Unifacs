/*
 */
package roteiro7parte1;

import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        
        for (int i = 0; i < alunos.length; i++) {   
        System.out.println("Digite sua matricula: ");
        int matricula = entrada.nextInt(); 
        
        System.out.println("Digite seu nome");
        String nome = entrada.next();
        
        System.out.println("Digite seu curso: ");
        String curso = entrada.next();
        
        System.out.println("Digite seu ano de ingresso");
        int anoI = entrada.nextInt();
        
        System.out.println("Quantidade de disciplinas");
        int qtdDis = entrada.nextInt();
        System.out.println("***************************");
        
        alunos[i] = new Aluno(matricula,nome,curso,anoI,qtdDis);
           
        }
        
        System.out.println("Listando os Alunos...");
        System.out.println("**********************");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Matricula = "+alunos[i].getMatricula());
            System.out.println("Nome = "+alunos[i].getNome());
            System.out.println("Curso = "+alunos[i].getCurso());
            System.out.println("Ano ingresso = "+alunos[i].getAnoIngresso());
            System.out.println("Qauntidade de Disciplinas"+alunos[i].getQtdeDisciplinas());
            System.out.println("Situacao "+alunos[i].getSituacao());            
            System.out.println("*************************");
            
        }
        
   }
}
