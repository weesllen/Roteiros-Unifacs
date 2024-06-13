package roteiro5parte3;

import roteiro5parte2.*;
import roteiro5parte1.*;

/**
 *
 * @author wesll
 */
public class Loja {


        private String nomeFantasia;
        private String razaoSocial;
        private String cnpj;
        private double valorFat;
        private double area;
        String nomeProprietario;


        public Loja (String nomeFantasia, String razaoSocial, String cnpj){
            this.nomeFantasia = nomeFantasia;
            this.razaoSocial = razaoSocial;
            this.cnpj =  cnpj;
        }
        public Loja(String nomeFantasia, String cnpj){
           
            this(nomeFantasia,nomeFantasia,cnpj);
            
        }


        public String getNomeFantasia() {
            return nomeFantasia;
        }

        public void setNomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
        }

        public String getRazaoSocial() {
            return razaoSocial;
        }

        public void setRazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public double getValorFat() {
            return valorFat;
        }

        public void setValorFat(double valorFat) {
            this.valorFat = valorFat;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public String getNomeProprietario() {
            return nomeProprietario;
        }

        public void setNomeProprietario(String nomeProprietario) {
            this.nomeProprietario = nomeProprietario;
        }


        public static String compararFat_static(Loja lojaA, Loja lojaB){
            if(lojaA.getValorFat() > lojaB.getValorFat()){
                   return lojaA.getNomeFantasia();
            }
            else{
                   return lojaB.getNomeFantasia();
            }
            
        }
        
         public String compararFat_naostatic(Loja lojaB){
            if(this.getValorFat() > lojaB.getValorFat()){
                     return this.nomeFantasia;
                }
            else{
                    return lojaB.getNomeFantasia();
                }
                
            }
        }
    
