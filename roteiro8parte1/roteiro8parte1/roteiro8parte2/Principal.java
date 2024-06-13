package roteiro8parte2;

public class Principal {
    public static void main(String[] args) {


        VeiculoCarga v1 = new VeiculoCarga("22222-BA",2011,5000);
        VeiculoPasseio v2 = new VeiculoPasseio("33333-BA",2012,5);
        VeiculoPequeno v3 =  new VeiculoPequeno("44444-BA",2012,"Moto");

        System.out.println("Pedagio V1: "+v1.calcPedagio());

        System.out.println("Pedagio V2: "+v2.calcPedagio());

        System.out.println("Pedagio V3: "+v3.calcPedagio());
    }
}