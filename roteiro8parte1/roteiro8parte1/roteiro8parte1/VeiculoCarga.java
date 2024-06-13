package roteiro8parte1;

public class VeiculoCarga extends Veiculo {

    private int pesoMax;



    public VeiculoCarga(String placa, int anoFab, int pesoMax){
        super(placa,anoFab);
        this.pesoMax = pesoMax;

    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
}
