 /*
 */
package roteiro7parte3;

import roteiro7parte2.*;
import java.util.ArrayList;
import roteiro7parte1.*;
import java.util.Scanner;

/**
 *
 * @author wesll
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
      
 
        for (int i = 0; i < 3; i++) {
        System.out.println("Digite sua matricula: ");
        int matricula = entrada.nextInt(); 
            
        System.out.println("Digite seu nome");
        String nome = entrada.next();
        
        System.out.println("Digite seu curso: ");
        String curso = entrada.next();
        
        System.out.println("Digite seu ano de ingresso");
        int anoI = entrada.nextInt();
        
        System.out.println("Quantas diciplinas deseja adicionar?");
        int num =  entrada.nextInt();
        
        Aluno aluno = new Aluno(matricula,nome,curso,anoI);
         
        for(int j = 0; j < num; j++){
        System.out.println("Adicione suas disciplinas "+(j+1) + " : ");
        String disciplinas = entrada.next();
        aluno.addDisciplinas(disciplinas);
        }
               
        listaAlunos.add(aluno);
        }
        
        System.out.println("Listando os Alunos...");
        System.out.println("**********************");
        for(int k = 0; k < listaAlunos.size(); k++){
            System.out.println("Matricula = "+listaAlunos.get(k).getMatricula());
            System.out.println("Nome = "+listaAlunos.get(k).getNome());
            System.out.println("Curso = "+listaAlunos.get(k).getCurso());
            System.out.println("Ano ingresso = "+listaAlunos.get(k).getAnoIngresso());
            System.out.println("Disciplinas = "+listaAlunos.get(k).getListaDisciplinas().size());
            System.out.println("Situacao "+listaAlunos.get(k).getSituacao());
            
            System.out.println("");
        }
     
        }
        
        
   }

