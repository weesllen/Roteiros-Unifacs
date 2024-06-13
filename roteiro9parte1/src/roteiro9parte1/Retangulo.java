package roteiro9parte1;

public class Retangulo implements FiguraGeometrica {

   private double altura;
   private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }

    @Override
    public double getArea() {
        return this.altura * this.largura;
    }

    @Override
    public double getPerimetro() {
        return (this.altura + this.largura) * 2 ;
    }
}
