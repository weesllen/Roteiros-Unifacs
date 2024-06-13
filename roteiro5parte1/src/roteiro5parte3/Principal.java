package roteiro5parte3;

import roteiro5parte2.*;
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
         
          
         
         System.out.println("****** Comparacao com metodo estatico ******");
         String compara = Loja.compararFat_static(loja01, loja02);
         System.out.println("Loja com maior FAT "+compara);
         
         System.out.println("****** Comparacao com metodo nao estatico ******");
         String comp = loja01.compararFat_naostatic(loja02);
         System.out.println("Loja com maior FAT "+comp);
         
         System.out.println("****** Comparacao com metodo nao estatico ******");
         String comp2 = loja02.compararFat_naostatic(loja01);
         System.out.println("Loja com maior FAT "+comp2);
                 
                 }
}
