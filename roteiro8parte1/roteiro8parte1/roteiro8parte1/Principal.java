package roteiro8parte1;

public class Principal {
    public static void main(String[] args) {


        VeiculoCarga v1 = new VeiculoCarga("22222-BA",2011,5000);
        VeiculoPasseio v2 = new VeiculoPasseio("33333-BA",2012,5);
        VeiculoPequeno v3 =  new VeiculoPequeno("44444-BA",2012,"Moto");

        System.out.println("Veiculo 1");
        System.out.print("Placa: "+v1.getPlaca()+ ", Ano de Fabricação: "+v1.getAnoFab()+", Peso Maximo: "+v1.getPesoMax()+"\n");

        System.out.println("Veiculo 2");
        System.out.print("Placa: "+v2.getPlaca()+ ", Ano de Fabricação: "+v2.getAnoFab()+", Passageiros: "+v2.getQtdMaxPassageiros()+"\n");

        System.out.println("Veiculo 3");
        System.out.print("Placa: "+v3.getPlaca()+ ", Ano de Fabricação: "+v3.getAnoFab()+" Peso Maximo: "+v3.getModelo()+"\n");
    }
}