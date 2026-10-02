package ejercicio2;

public class Cuadrado extends Figura{

    double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

}
