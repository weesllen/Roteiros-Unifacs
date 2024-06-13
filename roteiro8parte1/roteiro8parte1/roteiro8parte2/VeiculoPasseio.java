package roteiro8parte2;

public class VeiculoPasseio extends Veiculo {

    private int qtdMaxPassageiros;


    public VeiculoPasseio(String placa, int anoFab, int qtdMaxPassageiros) {
        super(placa, anoFab);
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }

    public int getQtdMaxPassageiros() {
        return qtdMaxPassageiros;
    }

    public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }

    @Override
    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio * this.qtdMaxPassageiros;
    }
}
