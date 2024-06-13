package roteiro8parte3;

public class VeiculoPequeno extends Veiculo {

    private String modelo;

    public VeiculoPequeno(String placa, int anoFab, String modelo) {
        super(placa, anoFab);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
