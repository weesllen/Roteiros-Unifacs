package roteiro4parte3;

import roteiro4parte2.*;
import roteiro4parte1.*;



/**
 *
 * @author wesll
 */
public class Principal {

        public static void main(String[] args) {
        
            Aluno aluno01 = new Aluno( 111, "Jose", "SI", 2019);
            
            System.out.println("Matricula: "+aluno01.getMatricula());
            System.out.println("Nome: "+aluno01.getNome());
            System.out.println("Curso: "+aluno01.getCurso());
            System.out.println("Ano Ingresso: "+aluno01.getAnoIngresso());
            
           
            System.out.println("====================================");
            aluno01.setMatricula(222);
             
            System.out.println("Matricula: "+aluno01.getMatricula());
            System.out.println("Nome: "+aluno01.getNome());
            System.out.println("Curso: "+aluno01.getCurso());
            System.out.println("Ano Ingresso: "+aluno01.getAnoIngresso());
        
    }
   
}
