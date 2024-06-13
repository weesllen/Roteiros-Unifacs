package roteiro8parte3;

public class Principal {
    public static void main(String[] args) {


        VeiculoCarga v1 = new VeiculoCarga("22222-BA",2011,5000);
        VeiculoPasseio v2 = new VeiculoPasseio("33333-BA",2012,5);
        VeiculoPequeno v3 =  new VeiculoPequeno("44444-BA",2012,"Moto");

       Cliente c = new Cliente("1111","Roberto","Barra","roberto@hotmail.com","9999",v1);
       Cliente c1 = new Cliente("2222","Anna","Pituba","anna@hotmail.com","7777",v2);
       Cliente c2 = new Cliente("3333","Fabio","Ondina","fabio@hotmail.com","6666",v3);

        System.out.println("Cliente "+c.getNome());
        System.out.println("Pedagio "+c.getVeiculo().calcPedagio());

        System.out.println("\nCliente "+c1.getNome());
        System.out.println("Pedagio "+c1.getVeiculo().calcPedagio());

        System.out.println("\nCliente "+c2.getNome());
        System.out.println("Pedagio "+c2.getVeiculo().calcPedagio());
    }
}