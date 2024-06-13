package roteiro9parte2;

public class Principal {
    public static void main(String[] args) {
        Quadrado q =  new Quadrado(5.5);
        Retangulo r = new Retangulo(14.0,5.0);
        Circulo c = new Circulo(9.3);

        System.out.println(q.getNomeFigura() + " Area: "+ q.getArea() + " Perimetro: "+q.getPerimetro());
        System.out.println(r.getNomeFigura() + " Area: "+ r.getArea() + " Perimetro: "+r.getPerimetro());
        System.out.println(c.getNomeFigura() + " Area: "+ c.getArea() + " Perimetro: "+c.getPerimetro());

    }
}