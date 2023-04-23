package Model;

/**
 * Esta clase define onjetos de tipo Triangulo Rectangulo con una base y una altura como atributos.
 * @version 1.2/2020
 */

 public class TrianguloRectangulo {
    int base; // Atributo que define la bases de un triangulo rectangulo 
    int altura; // Atributo que define la bases de un triangulo rectangulo 
    /**
     * Constructor de la clase TrianguloRectangulo 
     * 
     * @param base  Parametro que define  base de un trinagulo rectangulo
     * @param altura  Parametro que define la altura de un triangulo rectangulo
     */
    public TrianguloRectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    /**
     * Metodo que calcula y devuelve el area de un triangulo rectangulo
     * como la base multiplicada por la altura sobre 2 
     * 
     * @return Area de un triangulo rectangulo
     */
    public double calcularArea(){
        return (base * altura / 2);
    }
    /**
     * Metodo que calcula y devulve el perimetro de un triangulo 
     * rectangulo como la suma de la base, la altura y la hipotenusa
     * 
     * @return Perimetro de un triangulo rectangulo 
     */
    public double calcularPerimetro (){
        return (base + altura + calcularHipotenusa()); /**Invoca al metodo calcular hipotenusa */
    }
    /**
     * Metodo que calcula y devulve la hipotenusa de un triangulo 
     * rectangulo utilizando el teorema de pitagoras 
     * @return Hipotenusa de un triangulo rectangulo 
     */
    double calcularHipotenusa(){
        return Math.pow(base * base + altura * altura, 0.5);
    }
    /**
     * Metodo que determine si un triangulo es:
     - Equilatero: si sus tres lados son iguales
     -Escaleno: si sus tres lados son todos diferentes 
     - Escaleno: si dos de sus lados son iguales y el tro es diferente de los demas
     */
    public void determinarTipoTriangulo(){
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triangulo equilatero"); /* Todos sus lados son iguales */
        } else if  ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triangulo escaleno"); /* Todos sus lados son diferentes */
        } else {
            System.out.println("Es un triangulo isoceles"); /* De otra manera, es isoceles */
        }
    }
}