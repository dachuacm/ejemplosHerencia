package ejercicio2;



import java.util.Vector;



public class Resolver {

    public static void pruebaEjercicio2() {

        Vector<Figura> figuras = new Vector<Figura>();
        
        figuras.add(new Circulo(10));
        figuras.add(new Cuadrado(10));
        figuras.add(new triangulo(10, 5));
        for (Figura f: figuras)
            System.out.println("Área: "+f.area());
    }

}
