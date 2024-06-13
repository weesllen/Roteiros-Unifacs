package roteiro4parte4;

import java.util.Scanner;
import roteiro4parte3.*;
import roteiro4parte2.*;
import roteiro4parte1.*;



/**
 *
 * @author wesll
 */
public class Principal {

        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       

            System.out.println("Informe sua matricula: ");
            int m = entrada.nextInt();
            
            System.out.println("Informe seu nome: ");
            String nome = entrada.next();
            
            System.out.println("Informe seu curso");
            String curso = entrada.next();

            System.out.println("Informe o Ano de Ingresso: ");
            int anoI = entrada.nextInt();
            
            System.out.println("Informe a quantidade de disciplinas: ");
            int dis = entrada.nextInt();
           
            
            Aluno aluno01 = new Aluno(m, nome, curso, anoI,dis);
            
            System.out.println("=======================================");
            System.out.println("Matricula: "+ aluno01.getMatricula());
            System.out.println("Nome: "+aluno01.getNome());
            System.out.println("Curso: "+aluno01.getCurso());
            System.out.println("Ano Ingresso: "+aluno01.getAnoIngresso());
            System.out.println("Quantidade  Materias: "+aluno01.getQtdeDisciplinas());
            System.out.println("Situacao: "+aluno01.getSituacao());
            
           
            
    }
   
}
