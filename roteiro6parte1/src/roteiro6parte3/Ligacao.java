/*
 */
package roteiro6parte3;

import roteiro6parte2.*;
import roteiro6parte1.*;

/**
 *
 * @author wesll
 */
public class Ligacao{
    
    
        private String numOrigem;
        private String numDestino;
        private String localOrigem;
        private String localDestino;
        private Tempo horaInicio;
        private Tempo horaFim;
        private double tarifaSegundo;

    
        public Ligacao(String numOrigem, String numDestino,String localOrigem,String localDestino, Tempo horaInicio){
        
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
        
        this.tarifaSegundo = 1.00/60;
        }
        

    @Override
        public String toString() {
        return "Ligacao"+ "\nNumOrigem = " + numOrigem + "\nNumDestino =" + numDestino + "\nLocalOrigem = " + localOrigem +
         "\nLocalDestino = " + localDestino + "\nHoraInicio = " + this.getHoraInicio() + "\nHoraFim = " + horaFim + "\nDuracao = "+getDuracao() +
         "\nValor da ligacao = "+getValorLigacao() + "\nValor minimo = "+getValorMinimoLigacao();
        }
        
        public String getDuracao(){
            
            int segundos = getDuracaoSegundos();
            
            int horas = segundos/3600;
            int minutos = (segundos % 3600) /60;
            int segundosres = segundos % 60;
            
            return String.format("%02d",horas) +":"+ String.format("%02d",minutos)+":"+ String.format("%02d",segundosres);
        }
        
        public String getVerificador(String num){
            
            if(this.getNumOrigem().equals(num)){
               return "Este numero e a origem da ligacao...";
            }
            else if(this.getLocalDestino().equals(num)){
                return "Este numero  o fim da ligacao...";
            }
            else{
                return "Esse numero não existe nessa ligacao";
            }
    
        }
        
        public double getValorLigacao(){
            int segundos = getDuracaoSegundos();
            
            return segundos *this.tarifaSegundo;
        }
        
        public double getValorMinimoLigacao(){
            int segundos = getDuracaoSegundos();
            if(segundos < 20){
                segundos = 20;
            }
            return segundos * this.tarifaSegundo;
        }
        

        public String getNumOrigem(){
            return numOrigem;
        }
        public void setNumOrigem(String numOrigem){
            this.numOrigem = numOrigem;
        }

        public String getNumDestino() {
            return numDestino;
        }

        public void setNumDestino(String numDestino) {
            this.numDestino = numDestino;
        }

        public String getLocalOrigem() {
            return localOrigem;
        }

        public void setLocalOrigem(String localOrigem) {
            this.localOrigem = localOrigem;
        }

        public String getLocalDestino() {
            return localDestino;
        }

        public void setLocalDestino(String localDestino) {
            this.localDestino = localDestino;
        }

        public Tempo getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(Tempo horaInicio) {
            this.horaInicio = horaInicio;
        }

        public Tempo getHoraFim() {
            return horaFim;
        }

        public void setHoraFim(Tempo horaFim) {
            this.horaFim = horaFim;
        }

        
        private int getDuracaoSegundos(){
            int inicio = horaInicio.TotalSegundos();
            int fim = horaFim.TotalSegundos();
            
            return fim - inicio;
        }
        
        }


