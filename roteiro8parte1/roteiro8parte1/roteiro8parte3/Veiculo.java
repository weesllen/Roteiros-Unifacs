package roteiro8parte3;

public  abstract class Veiculo {

    private String placa;
    private int anoFab;
    protected  double taxaPedagio = 6.0;


    public Veiculo(String placa, int anoFab){
        this.placa = placa;
        this.anoFab = anoFab;
        this.taxaPedagio = taxaPedagio;

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

    public double getTaxaPedagio() { return taxaPedagio;}

    public void setTaxaPedagio(double taxaPedagio) {this.taxaPedagio = taxaPedagio;}


    public double calcPedagio(){
        return taxaPedagio;
    }
}
