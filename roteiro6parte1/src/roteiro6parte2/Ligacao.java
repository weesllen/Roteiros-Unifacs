/*
 */
package roteiro6parte2;

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

    
        public Ligacao(String numOrigem, String numDestino,String localOrigem,String localDestino, Tempo horaInicio){
        
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
        
        }

    @Override
    public String toString() {
        return "Ligacao"+"\nnumOrigem = " + numOrigem + "\nnumDestino =" + numDestino + "\nlocalOrigem = " + localOrigem +
         "\nlocalDestino = " + localDestino + "\nhoraInicio = " + this.getHoraInicio() + "\nhoraFim = " + horaFim + "\nduracao = "+getDuracao() ;
    }
        public String getDuracao(){
            int inicio = horaInicio.TotalSegundos();
            int fim = horaFim.TotalSegundos();
            int segundos = fim - inicio;
            
            int horas = segundos/3600;
            int minutos = (segundos % 3600) /60;
            int segundosres = segundos % 60;
            
            return String.format("%02d",horas) +":"+ String.format("%02d",minutos)+":"+ String.format("%02d",segundosres);
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

        
        }
        


