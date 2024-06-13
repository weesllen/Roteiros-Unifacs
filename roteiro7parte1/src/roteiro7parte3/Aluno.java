package roteiro7parte3;

import java.util.ArrayList;
import roteiro7parte2.*;
import roteiro7parte1.*;

/**
 *
 * @author wesll
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private ArrayList<String> listaDisciplinas;

    
   public Aluno(int pMatricula, String pNome,String pCurso, int pAnoIngresso){
        
        matricula = pMatricula;
        nome = pNome;
        curso = pCurso;
        anoIngresso = pAnoIngresso;        
        this.listaDisciplinas = new ArrayList<>();
       
    }

    public ArrayList<String> getListaDisciplinas() {
        return listaDisciplinas;
    }

    
    
    public void addDisciplinas(String disciplina){
        listaDisciplinas.add(disciplina);
        this.situacao = "Matriculado";
    }
    
  
    
    public int getMatricula() {
        return matricula;
    }

    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        
        this.nome = nome;
    }

   
    public String getCurso() {
        return curso;
    }

    
    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    public int getAnoIngresso() {
        return anoIngresso;
    }

   
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
   
    
    public String getSituacao(){
        return situacao;
    }
     
    }

    

