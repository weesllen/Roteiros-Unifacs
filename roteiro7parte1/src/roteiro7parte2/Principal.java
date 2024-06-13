/*
 */
package roteiro7parte2;

import java.util.ArrayList;
import roteiro7parte1.*;
import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Principal {
    
    public static void main(String[] args) {
       
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

         Aluno aluno01 = new Aluno(111,"Wesllen","Analises e Desenvolvimento de Sistemas",2019,3);
         Aluno aluno02 = new Aluno(222,"Anna","Publicidade",2020,4);
         Aluno aluno03 = new Aluno(333,"Luana","Gastronomia",2021,2);
         
         alunos.add(aluno01);
         alunos.add(aluno02);
         alunos.add(aluno03);
         
 
        System.out.println("Listando os Alunos...");
        System.out.println("**********************");
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("Matricula = "+alunos.get(i).getMatricula());
            System.out.println("Nome = "+alunos.get(i).getNome());
            System.out.println("Curso = "+alunos.get(i).getCurso());
            System.out.println("Ano ingresso = "+alunos.get(i).getAnoIngresso());
            System.out.println("Quantidade de Disciplinas = "+alunos.get(i).getQtdeDisciplinas());
            System.out.println("Situacao = "+alunos.get(i).getSituacao());
            System.out.println("*************************"); 
        }
        
   }
}
