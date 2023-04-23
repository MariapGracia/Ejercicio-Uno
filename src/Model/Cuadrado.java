package Model;

/**
 * Esta clae deinfe objetos de tipo Cuadrado con un lado como atributo.
 * @version 1.2/2020
 */

 public class Cuadrado {
    int lado; // Atributo que define el lado de un cuadro

/**
 * Constructor de la clase Cuadrado
 * 
 * @param  lado  Parametro que define la longitud de la base de un
 * cuadrado
 */
public Cuadrado (int lado){
    this.lado = lado;
}

/**
 *  Metodo que calcula y devuleve el area de un cuadrado como el
 * lado elevado al cuadrado 
 * @return Area de un Cuadrado
 */
public double calcularArea(){
    return lado * lado;
}

/**
 *  Metodo que calcula y devuleve el area de un cuadrado como el
 * lado elevado al cuadrado 
 * @return Perimetro de un Cuadrado
 */
public double calcularPerimetro(){
    return (4 * lado);
}
}