package ejercicio2;

public class Circulo extends Figura{

    double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
       
        return Math.PI*Math.pow(radio, 2);
    }

}
