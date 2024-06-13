package roteiro8parte1;

public class VeiculoPasseio extends Veiculo{

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
}
