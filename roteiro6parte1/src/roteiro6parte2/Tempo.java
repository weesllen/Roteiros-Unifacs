/*
  */
package roteiro6parte2;

/**
 *
 * @author wesll
 */
public class Tempo {
    
        private int horas;
        private int minutos;
        private int segundos;



        public Tempo(int horas, int minutos, int segundos) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }

    @Override
    public String toString() {
        return String.format("%02d",horas) +":"+ String.format("%02d",minutos) +":"+ String.format("%02d",segundos);
    }
        
        

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }

        public int getMinutos() {
            return minutos;
        }

        public void setMinutos(int minutos) {
            this.minutos = minutos;
        }

        public int getSegundos() {
            return segundos;
        }

        public void setSegundos(int segundos) {
            this.segundos = segundos;
        }


        public int TotalSegundos(){
            return horas * 3600 + minutos * 60 + segundos;
        }

    }
