package roteiro5parte1;

/**
 *
 * @author wesll
 */
public class Principal {

    public static void main(String[] args) {
        
         Loja loja01 = new Loja("Lojao da cidade", "lojao do comercio LTDA", "11223344");
         
         System.out.println("Nome Fantasia: "+loja01.getNomeFantasia());
         System.out.println("Razão social: "+loja01.getRazaoSocial());
         System.out.println("CNPJ: "+loja01.getCnpj());
         loja01.getNomeFantasia();
         
         
         Loja loja02 = new Loja( "mercadao do povo", "", "10101010");
         
         System.out.println("============================================");
         System.out.println("Nome Fantasia: "+loja02.getNomeFantasia());
         System.out.println("Razão social: "+loja02.getRazaoSocial());
         System.out.println("CNPJ: "+loja02.getCnpj());  
    }
}
