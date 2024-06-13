package roteiro5parte2;

import roteiro5parte1.*;

/**
 *
 * @author wesll
 */
public class Principal {

    public static void main(String[] args) {
        
         Loja loja01 = new Loja("Lojao da cidade", "lojao do comercio LTDA", "11223344");
         Loja loja02 = new Loja("mercadao do povo", "10101010");
         Loja loja03 = new Loja("Lojao da cidade","lojao do comercio LTDA","11223344");
         
         loja01.setValorFat(10000);
         loja02.setValorFat(20000);
         loja03.setValorFat(10000);
         
         System.out.println("****** Teste 01 ******");
         if(loja01.getNomeFantasia() == loja03.getNomeFantasia()){
             System.out.println("Lojas iguais");
         }
         else{
             System.out.println("Lojas diferentes");
         }
         
         
         System.out.println("****** Teste 02 ******");
         if(loja01.getNomeFantasia().equals(loja03.getNomeFantasia())){
             System.out.println("Lojas iguais");
         }
         else{
             System.out.println("Lojas diferentes");
         }
         
         
         System.out.println("****** Teste 03 ******");
         if(loja01 == loja03){
             System.out.println("Lojas iguais");
         }
         else{
             System.out.println("Lojas diferentes");
         }
         
         
         System.out.println("****** Teste 04 ******");
         if(loja01.equals(loja03)){
             System.out.println("Lojas iguais");
         }
         else{
             System.out.println("Lojas diferentes");
         }
         
         
         System.out.println("****** Teste 05 ******");
         if(loja01.getValorFat() == loja03.getValorFat()){
             System.out.println("Faturamentos iguais");
         }
         else{
             System.out.println("Faturamentos diferentes");
         }
    }
}
