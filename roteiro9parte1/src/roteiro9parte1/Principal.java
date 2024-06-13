package roteiro9parte1;

public class Principal {
    public static void main(String[] args) {
        Quadrado q =  new Quadrado(5.0);
        Retangulo r = new Retangulo(7.0,4.0);

        System.out.println(q.getNomeFigura() + " Area: "+ q.getArea() + " Perimetro: "+q.getPerimetro());
        System.out.println(r.getNomeFigura() + " Area: "+ r.getArea() + " Perimetro: "+r.getPerimetro());

    }
}