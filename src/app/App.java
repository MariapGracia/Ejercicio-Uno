package app;

import Model.Circulo;
import Model.Cuadrado;
import Model.Rectangulo;
import Model.TrianguloRectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * 
         */

        Circulo objCirculo = new Circulo(2);

        System.out.println("El área del círculo es  = " + objCirculo.calcularArea());
        System.out.println("El perímetro del círculo es =" + objCirculo.calcularPerimetro());
        System.out.println();

        Rectangulo objCRectangulo = new Rectangulo(2, 2);

        System.out.println("El área del rectángulo es = " + objCRectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + objCRectangulo.calcularPerimetro());
        System.out.println();

        Cuadrado objCuadrado = new Cuadrado(4);
        System.out.println("El área del cuadrado es = " + objCuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es =" + objCuadrado.calcularPerimetro());
        System.out.println();

        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(3, 5);
        System.out.println("El área del triánguloRectangulo es =" + objTrianguloRectangulo.calcularArea());
        System.out.println("El perímetro del triánguloRectangulo es =" + objTrianguloRectangulo.calcularPerimetro());
        objTrianguloRectangulo.determinarTipoTriangulo();

    }
}