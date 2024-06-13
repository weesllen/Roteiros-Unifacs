package roteiro9parte2;

public class Circulo implements FiguraGeometrica {

    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return this.pi * Math.pow(this.raio,2);
    }

    @Override
    public double getPerimetro() {
        return (2 * this.raio) * pi;
    }
}
