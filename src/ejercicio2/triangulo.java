package ejercicio2;

public class triangulo extends Figura{

    double base, altura;
    
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return base*altura/2;
    }

}
