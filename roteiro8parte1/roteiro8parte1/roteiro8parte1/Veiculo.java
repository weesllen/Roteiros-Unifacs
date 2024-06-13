package roteiro8parte1;

public  abstract class Veiculo {

    private String placa;
    private int anoFab;


    public Veiculo(String placa, int anoFab ){
        this.placa = placa;
        this.anoFab = anoFab;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }
}
